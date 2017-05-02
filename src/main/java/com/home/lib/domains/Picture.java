package com.home.lib.domains;

import javax.persistence.Entity;

@Entity
public class Picture extends AbstractEntity {
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
