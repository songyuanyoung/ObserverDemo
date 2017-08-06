package com.example.zach.observerdemo;

import java.util.Observable;

/**
 * Created by zhangwenpurdue on 8/6/2017.
 */

public class Newspaper extends Observable {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        this.setChanged();
        notifyObservers();
    }
}
