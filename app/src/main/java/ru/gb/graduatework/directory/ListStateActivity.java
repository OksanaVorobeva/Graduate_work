package ru.gb.graduatework.directory;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import ru.gb.graduatework.R;

public class ListStateActivity extends AppCompatActivity {

    public static final String NUMBER_STATE="number state";
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_state);
        String [] state = getResources().getStringArray(R.array.list_state);
        listView=findViewById(R.id.list_state_list_view);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,state);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent=new Intent(ListStateActivity.this,AboutStateActivity.class);
                intent.putExtra(NUMBER_STATE,i);
                startActivity(intent);
            }
        });




    }
}
