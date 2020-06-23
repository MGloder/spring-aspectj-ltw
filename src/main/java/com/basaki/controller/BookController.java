package com.basaki.controller;

import com.basaki.model.BookRequest;
import com.basaki.service.BookService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.awt.print.Book;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 * {@code BookController} exposes book service.
 * <p/>
 *
 * @author Indra Basak
 * @since 11/20/17
 */
@RestController
@Api(value = "Book Service", produces = "application/json", tags = {"1"})
public class BookController {

    private BookService service;

    @Autowired
    public BookController(BookService service) {
        this.service = service;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/books")
    public void create() {
        service.validateRequest();
    }

}
