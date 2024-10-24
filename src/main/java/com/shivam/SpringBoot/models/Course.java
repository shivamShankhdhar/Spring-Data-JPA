package com.shivam.SpringBoot.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course extends BaseEntity{

    private String name;

    private String description;

//    courses is the owner of the relationship
    @ManyToMany
    @JoinTable(
            name="authors_courses",
            joinColumns = {
                    @JoinColumn(name="course_id") // owner of the primary id --> courses
            },
            inverseJoinColumns = {
                    @JoinColumn(name="author_id")
            }
    )
    private List<Author> authors;

    @OneToMany(mappedBy = "course")
    private List<Section> sections;
}
