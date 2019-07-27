package com.example.vaigau;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class hair extends AppCompatActivity {
    //String hair[]={"FORMS","HAIR-CARE","COLOUR","STYLING","HAIR-CUT"};
    //Integer image[]={R.drawable.hairform,R.drawable.carehair,R.drawable.colorhair,R.drawable.hairstyling,R.drawable.haircut};
    private CardView hfa,hca,hcoa,hsa,hcua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair);
        hfa = findViewById(R.id.hf);
        hfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(hair.this,hairforms.class);
                startActivity(i);
            }
        });
        hca = findViewById(R.id.hc);
        hca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(hair.this,haircare.class);
                startActivity(a);
            }
        });
        hcoa = findViewById(R.id.hco);
        hcoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(hair.this,haircolor.class);
                startActivity(b);
            }
        });
        hsa = findViewById(R.id.hs);
        hsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent c = new Intent(hair.this,hairstyling.class);
                startActivity(c);
            }
        });
        hcua = findViewById(R.id.hcu);
        hcua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent d = new Intent(hair.this,cutting.class);
                startActivity(d);
            }
        });

    }
}
