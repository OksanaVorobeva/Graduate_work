package ru.gb.graduatework;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ListFeelsActivity extends AppCompatActivity {
    public static final String NAME_FEELS="name feels";
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_feels);
        String[] feels = getResources().getStringArray(R.array.list_feels);
        listView=findViewById(R.id.list_feels_list_view);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,feels);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListFeelsActivity.this,AboutFeelsActivity.class);
                String feels = ((TextView) view).getText().toString();
                intent.putExtra(NAME_FEELS, feels);
                startActivity(intent);
            }
        });
    }
}
