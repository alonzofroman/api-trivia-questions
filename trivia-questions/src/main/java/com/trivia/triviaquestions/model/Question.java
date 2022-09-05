package com.trivia.triviaquestions.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="question")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Question {

    @Id
    @GeneratedValue
    @Column
    private Integer id;

    @NotNull(message = "The question must have a prompt.")
    private String prompt;
}
