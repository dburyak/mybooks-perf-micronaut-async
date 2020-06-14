package com.dburyak.mybooks.perf.micronaut.async;

import io.micronaut.runtime.Micronaut;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.info.*;
import lombok.extern.log4j.Log4j2;

@OpenAPIDefinition(
    info = @Info(
            title = "mybooks-perf-micronaut-async",
            version = "0.1"
    )
)
@Log4j2
public class Application {

    public static void main(String[] args) {
        log.info("starting application");
        Micronaut.run(Application.class);
    }
}
