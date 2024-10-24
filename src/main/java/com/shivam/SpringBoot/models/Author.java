package com.shivam.SpringBoot.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity
@NamedQuery(
        name="Author.findByNamedQuery",
        query = "select a from Author a where a.age>= :ageFromParams"
)
public class Author extends BaseEntity{

    private String firstName;

    private String lastName;

    private String email;

    private int age;

//    author is the inverse of the relationship
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
