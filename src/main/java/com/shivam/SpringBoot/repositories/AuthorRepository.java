package com.shivam.SpringBoot.repositories;

import com.shivam.SpringBoot.models.Author;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {

    List<Author> findByNamedQuery(@Param("ageFromParams") int ageFromParams);
    // select * from author where first_name = ""
    List<Author> findAllByFirstName(String f_name);
    List<Author> findAllByFirstNameIgnoreCase(String f_name);

    // It search all matches in the string
    // select * from author where first_name like = "%al%"
                       // Property //Condition/Clause //refinement
    List<Author> findAllByFirstNameContainingIgnoreCase(String f_name);

    // It search all the matches that starts with ...
    // select * from author where first_name like = "al%"
    List<Author> findAllByFirstNameStartsWithIgnoreCase(String f_name);

    // It search all the matches that ends with ...
    // select * from author where first_name like = "%al"
    List<Author> findAllByFirstNameEndsWithIgnoreCase(String f_name);

    // It search all the matches that only have specific values ...
    // select * from author where first_name in ('shivam', 'shraddha')
    List<Author> findAllByFirstNameInIgnoreCase(List<String> first_names);

    @Modifying
    @Transactional
    @Query("update Author a set a.age = :age where a.id=:id")
    int updateAuthor(int age, int id);
}
