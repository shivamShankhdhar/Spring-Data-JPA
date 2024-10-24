package com.shivam.SpringBoot.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDateTime;

@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue
    private Integer id;

    private LocalDateTime createAt;
    private LocalDateTime lastModifiedAt;

    private String createdBy;
    private String lastModifiedBy;
}
