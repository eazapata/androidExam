package com.example.exam;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    private float textSize;
    private int red;
    private int green;
    private int blue;
    private String usertext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void updateText(String text, float size) {

        usertext = text;
        this.textSize = size;
        updateView();

    }
    public void updateColor(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        updateView();
    }
    public void updateView (){
        FragmentManager fm = getSupportFragmentManager();
        MiddleFragment middleFragment = (MiddleFragment) fm.findFragmentById(R.id.middleFragment);
        middleFragment.editText(red,green,blue,textSize,usertext);
    }
}