package ru.gb.graduatework;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AboutFeelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_feels);
        init();
    }

    private void init(){
        Intent intent = getIntent();
        int numbersFeels = intent.getIntExtra(ListFeelsActivity.NUMBER_FEELS,-1);

    }
}
