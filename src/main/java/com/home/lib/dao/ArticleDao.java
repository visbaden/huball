package com.home.lib.dao;

import com.home.lib.domains.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleDao extends CrudRepository<Article, Long> {
}
