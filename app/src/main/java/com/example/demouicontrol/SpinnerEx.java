package com.example.demouicontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerEx extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    String[] array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_ex);
        spinner = findViewById(R.id.spinner);
        array = getResources().getStringArray(R.array.cards);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, array);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    boolean isFirstTime = true;

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        if (!isFirstTime)
            Toast.makeText(this, ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
        else
            isFirstTime = false;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        Toast.makeText(this, "很抱歉，你要的資料不存在", Toast.LENGTH_SHORT).show();
    }
}
