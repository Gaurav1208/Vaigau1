package com.example.vaigau;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class hair extends AppCompatActivity {
    ListView lv;
    String hair[]={"FORMS","HAIR-CARE","COLOUR","STYLING","HAIR-CUT"};
    Integer image[]={R.drawable.hairform,R.drawable.carehair,R.drawable.colorhair,R.drawable.hairstyling,R.drawable.haircut};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hair);
        lv=findViewById(R.id.list);
        Custom cs = new Custom(hair.this,hair,image);
        lv.setAdapter(cs);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                         Intent i = new Intent(hair.this,forms.class);
                         startActivity(i);
                         break;
                    case 1:
                        Intent a = new Intent(hair.this,care.class);
                        startActivity(a);
                        break;
                    case 2:
                        Intent b = new Intent(hair.this,colour.class);
                        startActivity(b);
                        break;
                    case 3:
                        Intent c = new Intent(hair.this,styling.class);
                        startActivity(c);
                        break;
                    case 4:
                        Intent d = new Intent(hair.this,haircut.class);
                        startActivity(d);
                        break;
                }
            }
        });

    }
}
