package com.trivia.triviaquestions.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table(name="answer")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Answer implements Serializable{

    @Id
    @GeneratedValue
    @Column(name="answer_id")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "questionId")
    private Question question;

    @NotNull(message = "Answer must have a message.")
    @Column(name="message")
    private String message;

    @NotNull(message = "Answer must have a correct or incorrect value.")
    @Column(name="correct")
    private boolean correct;
}
