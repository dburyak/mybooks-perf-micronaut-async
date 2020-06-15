package com.dburyak.mybooks.perf.micronaut.async;

import com.dburyak.mybooks.perf.micronaut.async.domain.Author;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;
import lombok.extern.log4j.Log4j2;

import javax.annotation.security.PermitAll;

@Controller("/authors")
@PermitAll
@Log4j2
public class AuthorController {

    @Get("/")
    public Flowable<Author> index() {
        return Flowable.just(
                new Author("John", "Smith"),
                new Author("Jane", "Doe")
        );
    }
}
