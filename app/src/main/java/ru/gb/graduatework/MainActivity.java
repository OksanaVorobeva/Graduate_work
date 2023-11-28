package ru.gb.graduatework;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonDirectoryFeelings,buttonStartDiary,buttonMyDiary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        buttonDirectoryFeelings=findViewById(R.id.button_directory_of_feelings);
        buttonDirectoryFeelings.setOnClickListener(this::onClickDirectory);
        buttonStartDiary=findViewById(R.id.button_start_a_diary);
        buttonStartDiary.setOnClickListener(this::onClickBeganDirectory);
        buttonMyDiary=findViewById(R.id.button_my_diary);
        buttonMyDiary.setOnClickListener(this::onClickMyDirectory);
    }

    private void onClickDirectory(View view){
        Intent intent = new Intent(this,DirectoryFeelingActivity.class);
        startActivity(intent);
    }

    private void onClickBeganDirectory(View view){
        Intent intent = new Intent(this,StartDiaryActivity.class);
        startActivity(intent);
    }

    private void onClickMyDirectory(View view){
        Intent intent = new Intent(this,MyDiaryActivity.class);
        startActivity(intent);
    }
}