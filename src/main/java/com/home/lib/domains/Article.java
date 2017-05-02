package com.home.lib.domains;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Article extends AbstractEntity {
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
