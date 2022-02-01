package com.awestover.overflow.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.awestover.overflow.models.Tag;

//...
@Repository
public interface TagRepository extends CrudRepository<Tag, Long>{
	// this method retrieves all the tags from the database
	List<Tag> findAll();
    // retrieves a tag from database which match a given subject
    public Optional <Tag> findBySubject(String subject);

}
