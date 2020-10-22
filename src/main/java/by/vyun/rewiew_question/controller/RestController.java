package by.vyun.rewiew_question.controller;


import by.vyun.rewiew_question.entity.TemplateReviewQuestion;
import by.vyun.rewiew_question.service.TemplateReviewQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    TemplateReviewQuestionService questionService;


    @GetMapping("/question")
    public List<TemplateReviewQuestion> questionList() {
        return questionService.getQuestionList();
    }

    @GetMapping("/question_filter")
    public List<TemplateReviewQuestion> questionListFilter(String text, String type,
                                                           @RequestParam(defaultValue = "true", required = false) boolean active) {
        return questionService.getQuestionListFilter(text, type, active);
    }

    @PostMapping("/question")
    public ResponseEntity addQuestion(String description, String type) {
        questionService.addQuestion(description, type);
        return new ResponseEntity("Question created", HttpStatus.CREATED);

    }

    @PutMapping("/question")
    public ResponseEntity updateQuestion(Long id, String description, String type, boolean active) {
        questionService.updateQuestion(id, description, type, active);
        return new ResponseEntity("Question updated", HttpStatus.ACCEPTED);


    }


}
