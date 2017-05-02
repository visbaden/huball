package com.home.lib.service;

import com.home.lib.dao.QuestionDao;
import com.home.lib.domains.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService extends AbstractService<Question, Long> {

    @Autowired
    private QuestionDao repository;

    public QuestionService(QuestionDao repository) {
        super(repository);
        this.repository = repository;
    }
}
