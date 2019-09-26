package fedi.springframework.springwebapp.bootstrap;

import fedi.springframework.springwebapp.Model.Author;
import fedi.springframework.springwebapp.Model.Book;
import fedi.springframework.springwebapp.repositories.AuthorRepositories;
import fedi.springframework.springwebapp.repositories.BookRepositories;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepositories authorRepositories;
    private BookRepositories bookRepositories;

    public DevBootstrap(AuthorRepositories authorRepositories, BookRepositories bookRepositories) {
        this.authorRepositories = authorRepositories;
        this.bookRepositories = bookRepositories;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
            initData();
    }

    private void initData(){
        Author eric = new Author("eric","Evans");
        Book ddd = new Book("J2EE devlopement ","1234","Harper Colin");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);
        authorRepositories.save(eric);
        bookRepositories.save(ddd);

        Author  rod = new Author("Rod","jhonson");
        Book noEjb = new Book("J2EE devloppement ","23444","worx");
        rod.getBooks().add(noEjb);
        authorRepositories.save(rod);
        bookRepositories.save(noEjb);
    }
}
