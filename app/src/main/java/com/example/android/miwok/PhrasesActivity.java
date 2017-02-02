package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.numbers;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);

        GridView gridView = (GridView) findViewById(R.id.activity_phrases);

        ArrayList<String> phrases = new ArrayList<String>();
        for (String number : DataSource.arrayNumbers) {
            phrases.add(number);
            phrases.add(number);
            phrases.add(number);
        }

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,phrases);
        gridView.setAdapter(itemsAdapter);
    }
}
