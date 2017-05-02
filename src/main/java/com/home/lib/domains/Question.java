package com.home.lib.domains;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Question extends AbstractEntity {
    private String question;
    private String code;
    @OneToOne
    private Picture pic;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    @OneToMany
    private Set<Answer> answers;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Picture getPic() {
        return pic;
    }

    public void setPic(Picture pic) {
        this.pic = pic;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    public enum Difficulty {
        EASY, MIDDLE, HARD
    }
}