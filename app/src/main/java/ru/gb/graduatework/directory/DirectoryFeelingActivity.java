package ru.gb.graduatework.directory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ru.gb.graduatework.R;

public class DirectoryFeelingActivity extends AppCompatActivity {

    Button buttonListFeeling,buttonListState;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directory_feeling);
        init();
    }

    private void init(){
        buttonListFeeling=findViewById(R.id.button_list_of_feeling);
        buttonListFeeling.setOnClickListener(this::onClickListFeeling);
        buttonListState=findViewById(R.id.button_list_state);
        buttonListState.setOnClickListener(this::onClickListState);
    }

    private void onClickListFeeling(View view){
        Intent intent = new Intent(this,ListFeelsActivity.class);
        startActivity(intent);
    }

    private void onClickListState(View view){
        Intent intent = new Intent(this,ListStateActivity.class);
        startActivity(intent);
    }
}
