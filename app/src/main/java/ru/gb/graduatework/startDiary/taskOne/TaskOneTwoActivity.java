package ru.gb.graduatework.startDiary.taskOne;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ru.gb.graduatework.R;
import ru.gb.graduatework.startDiary.taskTwo.TaskTwoActivity;

public class TaskOneTwoActivity extends AppCompatActivity {

    Button back_save, continue_save;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti_task_one_two);
        init();
    }

    public void init() {
        continue_save = findViewById(R.id.task_one_two_next_save);
        continue_save.setOnClickListener(this::oneClickContinueSave);
        back_save = findViewById(R.id.task_one_two_back_save);
        back_save.setOnClickListener(this::oneClickBackSave);
    }

    public void oneClickContinueSave(View view) {
        Intent intent = new Intent(this, TaskTwoActivity.class);
        startActivity(intent);
    }

    public void oneClickBackSave(View view) {
        Intent intent = new Intent(this, TaskOneOneActivity.class);
        startActivity(intent);

    }

}
