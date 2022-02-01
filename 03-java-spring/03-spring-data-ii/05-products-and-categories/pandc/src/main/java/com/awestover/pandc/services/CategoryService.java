package com.awestover.pandc.services;

//...

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.awestover.pandc.models.Product;
import com.awestover.pandc.repositories.CategoryRepository;
import com.awestover.pandc.models.Category;
import com.awestover.pandc.repositories.ProductRepository;

@Service
public class CategoryService {
	// adding the product repository as a dependency
	private final CategoryRepository categoryRepository;
	private final ProductRepository productRepository;

	public CategoryService(CategoryRepository categoryRepository, ProductRepository productRepository) {
	   this.categoryRepository = categoryRepository;
	   this.productRepository = productRepository;
	}
	// returns all the categories
	public List<Category> allCategories() {
	   return categoryRepository.findAll();
	}
	// creates a category
	public Category createCategory(Category b) {
	   return categoryRepository.save(b);
	}
	// retrieves a category
	public Category getCategoryById(Long id) {
	   Optional<Category> optionalCategory = categoryRepository.findById(id);
	   if(optionalCategory.isPresent()) {
	       return optionalCategory.get();
	   } else {
	       return null;
	   }
	}
	// deletes a category
	public void deleteCategory( Long id ) {
		categoryRepository.deleteById( id );
	}
	//updates a category
	public Category updateCategory(Category updatedCategory) {
		return this.categoryRepository.save(updatedCategory);
	}
		
	public Category updateCategory(Long id, String name) {
		Category updatedCategory = this.categoryRepository.findById(id).orElse(null);
			
		if (updatedCategory != null) {
			updatedCategory.setName(name);
		}
		return this.categoryRepository.save(updatedCategory);
	}
	
	// Retrieves all categories that a specific product has not been categorized yet
	public List<Category> findCategoriesNotInProduct(Product product) {
		return this.categoryRepository.findByProductsNotContains(product);
	}
	
	// Add new Product to a Category
	public void addProductToCategory(Category category, Product product) {
		// get Product list from the Category
		List<Product> products = category.getProducts();
		// Add selected Category to Product
		products.add(product);
		// Update DB
		this.categoryRepository.save(category);
	}
	// Retrieves all products that are not categorized to a specific category
	public List<Product> allNonProducts( Category c ) { return productRepository.findByCategoriesNotContains( c ); }

	//
	public List<Product> allProducts( Category c ) { return productRepository.findAllByCategories( c ); }
	
}
