package com.trivia.triviaquestions.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="question")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Question implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="question_id")
    private Integer id;

    @NotNull(message = "The question must have a prompt.")
    @Column(name="prompt")
    private String prompt;

    @NotNull(message = "The question must have a genre.")
    @Column(name="genre")
    private String genre;

}
