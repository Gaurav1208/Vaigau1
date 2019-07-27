package com.example.vaigau;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.cardview.widget.CardView;


public class skin extends AppCompatActivity  {
    private CardView treat1, body1, clean1, basic1, wax1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);
        treat1 = findViewById(R.id.treat);
        treat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(skin.this,treatment.class);
                startActivity(a);
            }
        });
        body1 = findViewById(R.id.body);
        body1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(skin.this,bodycare.class);
                startActivity(b);
            }
        });
        clean1 = findViewById(R.id.clean);
        clean1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(skin.this,skincare.class);
                startActivity(c);
            }
        });
        basic1 = findViewById(R.id.basic);
        basic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(skin.this,skinbasic.class);
                startActivity(d);
            }
        });
        wax1 = findViewById(R.id.wax);
        wax1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(skin.this,skindepletion.class);
                startActivity(e);
            }
        });
    }
}

