package ru.gb.graduatework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class StartDiaryActivity extends AppCompatActivity {

    Button continueTaskOne;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_diary);
        init();
    }

    private void init(){
        continueTaskOne = findViewById(R.id.button_continue_Task1);
        continueTaskOne.setOnClickListener(this::onClickContinueTaskOne);


    }

    private void onClickContinueTaskOne(View view){
        Intent intent = new Intent(this,TaskOneOneActivity.class);
        startActivity(intent);
    }

}
