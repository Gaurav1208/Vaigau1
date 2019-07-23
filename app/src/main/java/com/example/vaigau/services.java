package com.example.vaigau;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;

public class services extends AppCompatActivity {
GridView lv;
ImageView im;
String services[]={"SKIN","HAIR","MAKE-UP","HANDS&FEET"};
Integer image[]={R.drawable.skincare,R.drawable.hair,R.drawable.makeup,R.drawable.handf};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
        im = findViewById(R.id.image);
        im.post(new Runnable() {
            @Override
            public void run() {
                ((AnimationDrawable) im.getBackground()).start();
            }
        });
        lv=findViewById(R.id.grid);
        Custom cs = new Custom(services.this,services,image);
        lv.setAdapter(cs);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position)
                {
                    case 0:
                        Intent i = new Intent(services.this,hair.class);
                        startActivity(i);

                        break;
                    case 1:
                        Intent a = new Intent(services.this,skin.class);
                        startActivity(a);

                        break;
                    case 2:
                        Intent b = new Intent(services.this,makeup.class);
                        startActivity(b);

                        break;
                    case 3:
                        Intent c = new Intent(services.this,handsfeet.class);
                        startActivity(c);

                        break;
                }
            }
        });

    }

}
