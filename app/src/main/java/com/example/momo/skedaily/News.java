package com.example.momo.skedaily;

import java.io.Serializable;

/**
 * Created by Momo on 22/9/2559.
 */
public class News implements Serializable{
    private String name;
    private String date;
    private String text;
    private String img;

    public News(String name,String date,String text,String img) {
        this.name = name;
        this.date = date;
        this.text = text;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public String getImg() {
        return img;
    }
}
