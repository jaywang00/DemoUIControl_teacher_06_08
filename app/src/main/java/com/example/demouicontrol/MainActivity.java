package com.example.demouicontrol;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listView;
    String[] array = {"SeekBarEx", "VideoViewEx", "DatePickerEx","SpinnerEx"};
    Class<?>[] activities = {SeekBarEx.class,VideoViewEx.class,DatePickerEx.class,SpinnerEx.class};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, array);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent intent = new Intent();
        intent.setClass(MainActivity.this,activities[position]);
        startActivity(intent);
    }
}
