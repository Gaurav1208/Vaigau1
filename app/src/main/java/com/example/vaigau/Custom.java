package com.example.vaigau;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Custom extends ArrayAdapter {
    Activity c;
    String names[];
    Integer images[];
    public Custom(Context context, String[] resource, Integer[] textViewResourceId) {
        super(context, R.layout.activity_skin,resource);
        c=(Activity)context;
        names=resource;
        images=textViewResourceId;
    }

    @Override
    public View getView(int position,View v,ViewGroup parent) {
        LayoutInflater abcd = c.getLayoutInflater();
        v=abcd.inflate(R.layout.simple,null);
        TextView tv = v.findViewById(R.id.text1);
        ImageView im= v.findViewById(R.id.image1);
        tv.setText(names[position]);
        im.setImageResource(images[position]);
        return v;
    }
}
