package com.home.lib.domains;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Article extends AbstractEntity {
    @OneToMany
    private List<Picture> pics;
    private String text;

    public List<Picture> getPics() {
        return pics;
    }

    public void setPics(List<Picture> pics) {
        this.pics = pics;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean addPicture(Picture picture){
        return this.pics.add(picture);
    }

}
