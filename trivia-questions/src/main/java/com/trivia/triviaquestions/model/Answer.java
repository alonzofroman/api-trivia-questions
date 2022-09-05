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

    public Answer(Integer id, Question question, String message, boolean correct) {
        this.id = id;
        this.question = question;
        this.message = message;
        this.correct = correct;
    }

    public Answer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", question=" + question +
                ", message='" + message + '\'' +
                ", correct=" + correct +
                '}';
    }
}
