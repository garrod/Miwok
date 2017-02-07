package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class NumbersActivity extends AppCompatActivity {

    public MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        WordAdapter itemsAdapter = new WordAdapter(this, DataSource.getNumberList(), R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        Log.v("log","wchodzi tutaj");

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(NumbersActivity.this, "List item click", Toast.LENGTH_SHORT).show();

                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_one);
                mMediaPlayer.start();
            }
        });

//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_one);
//                mMediaPlayer.start();
//                Toast.makeText(NumbersActivity.this, "List item click", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
