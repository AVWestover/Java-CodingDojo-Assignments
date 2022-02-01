package com.awestover.pandc.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.awestover.pandc.models.Product;
import com.awestover.pandc.models.Category;

//...
@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{
	
	// this method retrieves all the products from the database
	 List<Product> findAll();
	// retrieves all products that are not categorized to a specific category
	List<Product> findByCategoriesNotContains(Category category);
	// Retrieves a list of all products for a particular category
	List<Product> findAllByCategories( Category product );

}
