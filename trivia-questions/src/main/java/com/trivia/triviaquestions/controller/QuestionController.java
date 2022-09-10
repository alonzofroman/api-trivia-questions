package com.trivia.triviaquestions.controller;

import com.trivia.triviaquestions.model.Question;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @RequestMapping(method= RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Question> getAllQuestions(@RequestParam(required = false) String genre) {
        
    }

}
