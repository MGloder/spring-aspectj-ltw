package com.basaki.service;

import com.basaki.annotation.CustomAnnotation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * {@code BookService} provides CRUD functioanality on book.
 * <p/>
 *
 * @author Indra Basak
 * @since 11/20/17
 */
@Service
public class BookService {

    private static final Logger
            log = LoggerFactory.getLogger(BookService.class);

    @CustomAnnotation(description = "Validates book request.")
    public void exampleBookServiceMethod() {
        exampleBookServiceMethod2();
        log.info("Validating book request!");
    }

    @CustomAnnotation(description = "Validates book request.")
    public void exampleBookServiceMethod2() {
        log.info("Validating book request!");
    }
}