package ru.gb.graduatework.startDiary.three;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ru.gb.graduatework.R;

public class TaskThreeOneActivity extends AppCompatActivity {

    Button back_save, continue_save;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiti_task_three_one);
        init();
    }

    public void init() {
        continue_save = findViewById(R.id.task_three_one_next_save);
        continue_save.setOnClickListener(this::oneClickContinueSave);
        back_save = findViewById(R.id.task_three_one_back_save);
        back_save.setOnClickListener(this::oneClickBackSave);

    }

    public void oneClickContinueSave(View view) {
        Intent intent = new Intent(this, TaskThreeTwoActivity.class);
        startActivity(intent);
    }

    public void oneClickBackSave(View view) {
        Intent intent = new Intent(this, TaskThreeActivity.class);
        startActivity(intent);
    }
}
