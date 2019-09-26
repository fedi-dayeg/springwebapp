package fedi.springframework.springwebapp.repositories;

import fedi.springframework.springwebapp.Model.Book;
import org.springframework.data.repository.CrudRepository;



public interface BookRepositories extends CrudRepository<Book, Long> {
}
