package com.example.android.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by krzysztof on 03.02.2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mColorResourceId;

    public WordAdapter(Context context, ArrayList<Word> resource, int colorResourceId) {
        super(context, 0, resource);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        // first check to see if the view is null. if so, we have to inflate it.
        // to inflate it basically means to render, or show, the view.
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_layout, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentAndroidWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.word_one);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentAndroidWord.getMiwokWord());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.word_two);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentAndroidWord.getEnglishWord());

//        TextView threeTextView = (TextView) listItemView.findViewById(R.id.word_three);
//        if(currentAndroidWord.hasSpanish()) {
//            Log.v("log","jest hiszpanski");
//            threeTextView.setText(currentAndroidWord.getSpanishWord());
//            threeTextView.setVisibility(View.VISIBLE);
//            nameTextView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.grid_color_1));
//            numberTextView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.grid_color_2));
//            threeTextView.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.grid_color_3));
//        }
//        else {
//            Log.v("log","nie ma hiszpanskiego");
//            threeTextView.setVisibility(View.GONE);
//        }

        ImageView imagesrc = (ImageView) listItemView.findViewById(R.id.image);

        if(currentAndroidWord.hasImage()) {
            imagesrc.setImageResource(currentAndroidWord.getmImageResourceId());
            imagesrc.setVisibility(View.VISIBLE);
        }
        else {
            imagesrc.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

//        return super.getView(position, convertView, parent);
    }
}
