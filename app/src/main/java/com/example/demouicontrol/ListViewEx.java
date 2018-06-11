package com.example.demouicontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;

public class ListViewEx extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] array = {"葷食", "素食", "兩者皆可"};
    boolean[] checkeds = {false, false, false};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_ex1);
        listView = findViewById(R.id.listView);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, array);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override  //view = CheckedTextView物件
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        CheckedTextView ctv = (CheckedTextView) view;
        if (ctv.isChecked())
            checkeds[position] = true;
        else
            checkeds[position] = false;

        String choice = "";
        for (int i = 0; i < array.length; i++) {
            if (checkeds[i])
                choice += array[i] + " ";
        }

        Toast.makeText(this, choice, Toast.LENGTH_SHORT).show();
    }
}
