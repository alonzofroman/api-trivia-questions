package com.trivia.triviaquestions.repository;

import com.trivia.triviaquestions.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository  extends JpaRepository<Question, Integer> {
}
