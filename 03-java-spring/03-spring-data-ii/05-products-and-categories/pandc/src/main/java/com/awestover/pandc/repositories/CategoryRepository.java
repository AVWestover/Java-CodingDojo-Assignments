package com.awestover.pandc.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.awestover.pandc.models.Category;
import com.awestover.pandc.models.Product;

//...
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
	
	// this method retrieves all the categories from the database
	List<Category> findAll();
	// retrieves all categories that a specific product has not been categorized yet
	List<Category> findByProductsNotContains(Product product);
	List<Category> findAllByProducts(Product product);
}
