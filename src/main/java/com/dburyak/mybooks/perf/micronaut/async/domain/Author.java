package com.dburyak.mybooks.perf.micronaut.async.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private String firstName;
    private String lastName;
}
