package com.home.lib.domains;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Question extends AbstractEntity {
    private String question;
    private String code;
    private Picture pic;

    @Enumerated(EnumType.STRING)
    private Difficulty difficulty;

    @OneToMany
    private Set<Answer> answers;

    public boolean addAnswer(Answer answer){
        return answers.add(answer);
    }

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

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Picture getPic() {
        return pic;
    }

    public void setPic(Picture pic) {
        this.pic = pic;
    }

    public Set<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(Set<Answer> answers) {
        this.answers = answers;
    }

    enum Difficulty {
        EASY, MIDDLE, HARD
    }
}