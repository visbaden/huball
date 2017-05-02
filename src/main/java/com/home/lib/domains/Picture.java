package com.home.lib.domains;

import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class Picture extends AbstractEntity {

    @Lob
    private byte[] picture;
    private String desc;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}
