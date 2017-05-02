package com.home.lib.domains;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Answer extends AbstractEntity{

    @ManyToOne
    private Question question;
    private String answer;
    private boolean isCorrect;


}
