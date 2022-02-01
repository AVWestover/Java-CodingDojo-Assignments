package com.awestover.overflow.services;

//...
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

import com.awestover.overflow.models.Question;
import com.awestover.overflow.repositories.QuestionRepository;
import com.awestover.overflow.models.Tag;
import com.awestover.overflow.repositories.TagRepository;
import com.awestover.overflow.models.Answer;
import com.awestover.overflow.repositories.AnswerRepository;

@Service
public class AppService {

	// adding the repositories as a dependencies
	private final QuestionRepository qRepository;
	private final AnswerRepository aRepository;
	private final TagRepository tRepository;

	public AppService(QuestionRepository qRepository, AnswerRepository aRepository, TagRepository tRepository) {
		this.qRepository = qRepository;
		this.aRepository = aRepository;
		this.tRepository = tRepository;
	}
	
	// creates a question
	public Question createQuestion(Question newQ) {
		//adding the tags
		List<Tag> questionTags = new ArrayList<Tag>();
		for (String subject : newQ.splitTags()) {
			//check if tag exists already
			Tag tagToBeAdded = this.tRepository.findBySubject(subject).orElse(null);
			//creates new tag if it was found not to exist
			if (tagToBeAdded == null) {
				tagToBeAdded = new Tag(subject);
				this.tRepository.save(tagToBeAdded);
				}
			//adds new tags to question tags array list
			if(!questionTags.contains(tagToBeAdded)) {
				questionTags.add(tagToBeAdded);
			}	
		}
		//adds the tag array list to the question
		newQ.setTags(questionTags);
		//saves
		return this.qRepository.save(newQ);
		
	}
	
	//creates new answer
	public Answer createAnswer(Answer b) {
		   return aRepository.save(b);
		}
	
	// returns all the questions
	public List<Question> getAllQuestions() {
	   return qRepository.findAll();
	}
	
	//retrieves a question
	public Question getQuestionById(Long id) {
		return this.qRepository.findById(id).orElse(null);
	}
		
	//retrieves an answer
	public Answer getAnswerById(Long id) {
		return this.aRepository.findById(id).orElse(null);
	}
	
	//
	
	
}
