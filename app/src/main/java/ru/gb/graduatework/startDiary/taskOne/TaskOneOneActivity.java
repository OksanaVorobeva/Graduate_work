package ru.gb.graduatework.startDiary.taskOne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ru.gb.graduatework.R;
import ru.gb.graduatework.startDiary.start.StartDiaryActivity;


public class TaskOneOneActivity extends AppCompatActivity {
    Button back_save,continue_save;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti_task_one_one);
        init();
    }

    protected void init(){
        continue_save=findViewById(R.id.task_one_one_next_save);
        continue_save.setOnClickListener(this::oneClickContinueSave);
        back_save=findViewById(R.id.task_one_one_back_save);
        back_save.setOnClickListener(this::oneClickContinueBack);
    }

    public void oneClickContinueSave(View view){
        Intent intent =new Intent(this,TaskOneTwoActivity.class);
        startActivity(intent);
    }

    public void oneClickContinueBack(View view){
        Intent intent =new Intent(this, StartDiaryActivity.class);
        startActivity(intent);
    }
}
