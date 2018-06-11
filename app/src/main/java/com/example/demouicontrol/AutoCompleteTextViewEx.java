package com.example.demouicontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class AutoCompleteTextViewEx extends AppCompatActivity implements TextView.OnEditorActionListener{

    AutoCompleteTextView atv;
    String[] cities;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view_ex);
        atv = findViewById(R.id.autoCompleteTextView);
        cities = getResources().getStringArray(R.array.cities);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,cities);
        atv.setOnEditorActionListener(this);
        atv.setAdapter(adapter);
    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        Toast.makeText(this,((TextView)v).getText(),Toast.LENGTH_SHORT).show();
        return false;
    }
}
