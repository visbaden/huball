package com.home.lib.service;

import com.home.lib.dao.AnswerDao;
import com.home.lib.domains.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService extends AbstractService<Answer, Long> {

    @Autowired
    private AnswerDao repository;

    public AnswerService(AnswerDao repository) {
        super(repository);
        this.repository = repository;
    }
}
