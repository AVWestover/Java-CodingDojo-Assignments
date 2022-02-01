package com.awestover.overflow.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.awestover.overflow.models.Question;

//...
@Repository
public interface QuestionRepository extends CrudRepository<Question, Long>{
	// this method retrieves all the questions from the database
	List<Question> findAll();

}
