package com.dburyak.mybooks.perf.micronaut.async;

import com.dburyak.mybooks.perf.micronaut.async.domain.Book;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.reactivex.Flowable;

import javax.annotation.security.RolesAllowed;

@Controller("/books")
@RolesAllowed({ "admin" })
public class BookController {

    @Get("/")
    public Flowable<Book> index() {
        return Flowable.just(
                new Book("Book1", null),
                new Book("Book2", null)
        );
    }
}
