package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> numbers = new ArrayList<String>();
        String[] arrayNumbers = {"one","two","three","four","five","six","seven","eight","nine","ten"};
//        LinearLayout rootView = (LinearLayout)findViewById(R.id.activity_numbers);

        for (String number : arrayNumbers) {
            numbers.add(number);
            numbers.add(number);
            numbers.add(number);
            numbers.add(number);
//            TextView wordView = new TextView(this);
//            wordView.setTextSize(20);
//            wordView.setText(number);
//            rootView.addView(wordView);
        }

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,numbers);

        ListView listView = (ListView) findViewById(R.id.activity_numbers);
        listView.setAdapter(itemsAdapter);
    }
}
