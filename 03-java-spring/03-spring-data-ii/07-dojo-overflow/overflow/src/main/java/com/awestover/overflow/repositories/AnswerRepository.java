package com.awestover.overflow.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.awestover.overflow.models.Answer;

//...
@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long>{
	// this method retrieves all the tags from the database
	List<Answer> findAll();

}
