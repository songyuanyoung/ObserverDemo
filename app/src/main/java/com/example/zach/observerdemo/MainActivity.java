package com.example.zach.observerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //创建一个报纸，作为被观察者
        Newspaper subject = new Newspaper();
        //创建阅读者，也就是观察者
        Reader reader1 = new Reader();
        reader1.setName("Zach");

        Reader reader2 = new Reader();
        reader2.setName("John");

        Reader reader3 = new Reader();
        reader3.setName("Ken");

        //注册阅读者
        subject.addObserver(reader1);
        subject.addObserver(reader2);
        subject.addObserver(reader3);



        //要出报纸啦
        subject.setContent("Observer Pattern");

        subject.setContent("Observer Pattern 2");

    }
}
