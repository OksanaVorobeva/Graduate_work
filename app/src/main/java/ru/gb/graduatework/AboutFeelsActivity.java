package ru.gb.graduatework;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

public class AboutFeelsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_feels);
        init();
    }

    private void init(){
        Intent intent = getIntent();
        String nameFeels = intent.getStringExtra(ListFeelsActivity.NAME_FEELS);
        parseJson(nameFeels);
    }

    private void parseJson(String nameFeels) {
        try {
            JSONObject jsonObject = new JSONObject(getResources().getString(R.string.about_feels));
            JSONObject fullInfoForFeels = jsonObject.getJSONObject(nameFeels);

            TextView name = findViewById(R.id.about_feels_name);
            TextView example = findViewById(R.id.about_feels_example);
            TextView sensations = findViewById(R.id.about_feels_sensations);
            TextView thoughts = findViewById(R.id.about_feels_thoughts);
            TextView behavior = findViewById(R.id.about_feels_behavior);

            name.setText(fullInfoForFeels.getString("name"));
            example.setText(fullInfoForFeels.getString("example"));
            sensations.setText(fullInfoForFeels.getString("sensations"));
            thoughts.setText(fullInfoForFeels.getString("thoughts"));
            behavior.setText(fullInfoForFeels.getString("behavior"));
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }
}
