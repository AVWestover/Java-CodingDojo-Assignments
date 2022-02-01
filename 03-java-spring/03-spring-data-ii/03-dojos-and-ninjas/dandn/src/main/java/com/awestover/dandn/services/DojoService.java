package com.awestover.dandn.services;

//...

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.awestover.dandn.models.Dojo;
import com.awestover.dandn.repositories.DojoRepository;
@Service
public class DojoService {
// adding the dojo repository as a dependency
private final DojoRepository dojoRepository;

public DojoService(DojoRepository dojoRepository) {
   this.dojoRepository = dojoRepository;
}
// returns all the dojos
public List<Dojo> allDojos() {
   return dojoRepository.findAll();
}
// creates a dojo
public Dojo createDojo(Dojo b) {
   return dojoRepository.save(b);
}
// retrieves a dojo
public Dojo getDojoById(Long id) {
   Optional<Dojo> optionalDojo = dojoRepository.findById(id);
   if(optionalDojo.isPresent()) {
       return optionalDojo.get();
   } else {
       return null;
   }
}
// deletes a language
public void deleteDojo( Long id ) {
	dojoRepository.deleteById( id );
}
//updates a language
public Dojo updateDojo(Dojo updatedDojo) {
	return this.dojoRepository.save(updatedDojo);
}
	
public Dojo updateDojo(Long id, String name) {
	Dojo updatedDojo = this.dojoRepository.findById(id).orElse(null);
		
	if (updatedDojo != null) {
		updatedDojo.setName(name);
	}
	return this.dojoRepository.save(updatedDojo);
}
}
