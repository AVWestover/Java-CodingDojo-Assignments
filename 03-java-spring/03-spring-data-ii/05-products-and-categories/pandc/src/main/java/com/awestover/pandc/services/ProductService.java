package com.awestover.pandc.services;

//...

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.awestover.pandc.models.Product;
import com.awestover.pandc.repositories.ProductRepository;
import com.awestover.pandc.models.Category;
import com.awestover.pandc.repositories.CategoryRepository;

@Service
public class ProductService {
	// adding the product repository as a dependency
	private final ProductRepository productRepository;
	private final CategoryRepository categoryRepository;

	public ProductService(ProductRepository productRepository, CategoryRepository categoryRepository) {
	   this.productRepository = productRepository;
	   this.categoryRepository = categoryRepository;
	}
	// returns all the products
	public List<Product> allProducts() {
	   return productRepository.findAll();
	}
	// creates a product
	public Product createProduct(Product b) {
	   return productRepository.save(b);
	}
	// retrieves a product
	public Product getProductById(Long id) {
	   Optional<Product> optionalProduct = productRepository.findById(id);
	   if(optionalProduct.isPresent()) {
	       return optionalProduct.get();
	   } else {
	       return null;
	   }
	}
	// deletes a product
	public void deleteProduct( Long id ) {
		productRepository.deleteById( id );
	}
	//updates a product
	public Product updateProduct(Product updatedProduct) {
		return this.productRepository.save(updatedProduct);
	}
		
	public Product updateProduct(Long id, String name, String description, float price) {
		Product updatedProduct = this.productRepository.findById(id).orElse(null);
			
		if (updatedProduct != null) {
			updatedProduct.setName(name);
			updatedProduct.setDescription(description);
			updatedProduct.setPrice(price);
		}
		return this.productRepository.save(updatedProduct);
	}
	
	// Retrieves all products that are not categorized to a specific category
		public List<Category> allNonCategories( Product p ) { return categoryRepository.findByProductsNotContains( p ); }
	
	//
	public List<Category> allCategories( Product p ) { return categoryRepository.findAllByProducts( p ); }
	
	// Add new Category to a Product
	public void addCategoryToProduct(Product product, Category category) {
		// get Category list from the Product
		List<Category> categories = product.getCategories();
		// Add selected Category to Product
		categories.add(category);
		// Update DB
		this.productRepository.save(product);
	}
	
}

