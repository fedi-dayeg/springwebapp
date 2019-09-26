package fedi.springframework.springwebapp.repositories;

import fedi.springframework.springwebapp.Model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepositories extends CrudRepository<Author, Long> {
}
