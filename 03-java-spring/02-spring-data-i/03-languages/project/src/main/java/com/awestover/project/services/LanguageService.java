package com.awestover.project.services;

//...

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.awestover.project.models.Language;
import com.awestover.project.repositories.LanguageRepository;
@Service
public class LanguageService {
// adding the language repository as a dependency
private final LanguageRepository languageRepository;

public LanguageService(LanguageRepository languageRepository) {
   this.languageRepository = languageRepository;
}
// returns all the languages
public List<Language> allLanguages() {
   return languageRepository.findAll();
}
// creates a language
public Language createLanguage(Language b) {
   return languageRepository.save(b);
}
// retrieves a language
public Language getLanguageById(Long id) {
   Optional<Language> optionalLanguage = languageRepository.findById(id);
   if(optionalLanguage.isPresent()) {
       return optionalLanguage.get();
   } else {
       return null;
   }
}
// deletes a language
public void deleteLanguage( Long id ) {
	languageRepository.deleteById( id );
}
//updates a language
public Language updateLanguage(Language updatedLanguaged) {
	return this.languageRepository.save(updatedLanguaged);
}
	
public Language updateLanguage(Long id, String name, String creator, String version) {
	Language updatedLanguage = this.languageRepository.findById(id).orElse(null);
		
	if (updatedLanguage != null) {
		updatedLanguage.setName(name);
		updatedLanguage.setCreator(creator);
		updatedLanguage.setVersion(version);
	}
	return this.languageRepository.save(updatedLanguage);
}
}
