package com.trivia.triviaquestions.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn
    private Set<Answer> answers = new HashSet<>();

    public Question(Integer id, String prompt, String genre, Set<Answer> answers) {
        this.id = id;
        this.prompt = prompt;
        this.genre = genre;
        this.answers = answers;
    }

    public Question() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", prompt='" + prompt + '\'' +
                ", genre='" + genre + '\'' +
                ", answers=" + answers +
                '}';
    }
}
