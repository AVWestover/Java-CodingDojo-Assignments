package com.awestover.updateanddelete.services;

//...

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import com.awestover.updateanddelete.models.Book;
import com.awestover.updateanddelete.repositories.BookRepository;
@Service
public class BookService {
 // adding the book repository as a dependency
 private final BookRepository bookRepository;
 
 public BookService(BookRepository bookRepository) {
     this.bookRepository = bookRepository;
 }
 // returns all the books
 public List<Book> allBooks() {
     return bookRepository.findAll();
 }
 // creates a book
 public Book createBook(Book b) {
     return bookRepository.save(b);
 }
 // retrieves a book
 public Book findBook(Long id) {
     Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
         return optionalBook.get();
     } else {
         return null;
     }
 }
 // deletes a book
 public void deleteBook( Long id ) {
 	bookRepository.deleteById( id );
 }
 //updates a book
// public Book updateBook(Book b) {
// 	return bookRepository.save(b);
// }
 //
 public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
	 Optional<Book> optionalBook = bookRepository.findById(id);
     if(optionalBook.isPresent()) {
         Book a = optionalBook.get();
         return bookRepository.save(a);
         
     } else {
         return null;
	 
     }
 }
}
