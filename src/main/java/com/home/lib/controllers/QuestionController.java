package com.home.lib.controllers;

import com.home.lib.domains.Picture;
import com.home.lib.domains.Question;
import com.home.lib.service.AnswerService;
import com.home.lib.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.TreeSet;

@RestController
@RequestMapping("/q")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping("/{id}")
    public Question getQuestion(@PathVariable Long id){
        return new Question();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/{id}")
    public void updateQuestion(@ModelAttribute Question question){

        System.out.println(question);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/create")
    public void createQuestion(){}
}
