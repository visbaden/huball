package com.home.lib.dao;

import com.home.lib.domains.Question;
import org.springframework.data.repository.CrudRepository;

public interface QuestionDao extends CrudRepository<Question, Long> {
}
