package com.awestover.dandn.services;

//...

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.awestover.dandn.models.Ninja;
import com.awestover.dandn.repositories.NinjaRepository;
@Service
public class NinjaService {
// adding the language repository as a dependency
private final NinjaRepository ninjaRepository;

public NinjaService(NinjaRepository ninjaRepository) {
   this.ninjaRepository = ninjaRepository;
}
// returns all the languages
public List<Ninja> allNinjas() {
   return ninjaRepository.findAll();
}
// creates a language
public Ninja createNinja(Ninja b) {
   return ninjaRepository.save(b);
}
// retrieves a language
public Ninja getNinjaById(Long id) {
   Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
   if(optionalNinja.isPresent()) {
       return optionalNinja.get();
   } else {
       return null;
   }
}
// deletes a language
public void deleteNinja( Long id ) {
	ninjaRepository.deleteById( id );
}
//updates a language
public Ninja updateNinja(Ninja updatedNinja) {
	return this.ninjaRepository.save(updatedNinja);
}
	
public Ninja updateNinja(Long id, String firstName, String lastName, int age) {
	Ninja updatedNinja = this.ninjaRepository.findById(id).orElse(null);
		
	if (updatedNinja != null) {
		updatedNinja.setFirstName(firstName);
		updatedNinja.setLastName(lastName);
		updatedNinja.setAge(age);
	}
	return this.ninjaRepository.save(updatedNinja);
}
}
