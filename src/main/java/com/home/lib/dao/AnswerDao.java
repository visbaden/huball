package com.home.lib.dao;

import com.home.lib.domains.Answer;
import org.springframework.data.repository.CrudRepository;

public interface AnswerDao extends CrudRepository<Answer, Long> {
}
