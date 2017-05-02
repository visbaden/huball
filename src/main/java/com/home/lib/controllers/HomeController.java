package com.home.lib.controllers;

import com.home.lib.domains.Answer;
import com.home.lib.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    private AnswerService answerService;

    @RequestMapping(method = RequestMethod.GET)
    public Answer getAnswer(@PathVariable Long id){
        return new Answer(); //TODO
    }
}
