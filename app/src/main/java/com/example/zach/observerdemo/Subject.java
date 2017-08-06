package com.example.zach.observerdemo;

import java.util.ArrayList;

/**
 * Created by zhangwenpurdue on 8/6/2017.
 */

public class Subject {
   private ArrayList<Observer> readers = new ArrayList<>();
    public void Subcrib(Observer observer) {
        readers.add(observer);
    }
    public void Unsubcrib(Observer observer) {
        readers.remove(observer);
    }
    protected void notifyObservers() {
        for (Observer reader : readers) {
            reader.update(this);
        }
    }
}
