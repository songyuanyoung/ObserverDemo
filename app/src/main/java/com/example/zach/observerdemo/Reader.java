package com.example.zach.observerdemo;

import android.widget.Toast;

import java.util.*;

/**
 * Created by zhangwenpurdue on 8/6/2017.
 */

public class Reader implements java.util.Observer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public void update(Observable observable, Object o) {
        System.out.println(name+"收到报纸了，阅读先。目标推过来的内容是==="+((Newspaper)observable).getContent());
        //System.out.println(name+"收到报纸了，阅读先。内容是==="+((Newspaper)o).getContent());
    }
}
