package com.example.vaigau;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class treatment extends AppCompatActivity {
    Spinner sp;
    TextView tv;
    Button b;
    String treatment[]={"Threading","Forehead","Upper-Lip","Chin-Thread","Face-Thread-Side","Nose Thread","Full-Face-Thread"};
    String price[]={"20","15","36","76","65","76","76","98"};
    ArrayAdapter<String> adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment);
        sp = findViewById(R.id.spintreat);
        adp=new ArrayAdapter<String>(treatment.this,android.R.layout.simple_list_item_1,treatment);
        sp.setAdapter(adp);
        b= findViewById(R.id.bt);
        tv = findViewById(R.id.tv);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                abc(price[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                int n=sp.getSelectedItemPosition();
//                abc(price[n]);
            }
        });
    }
    public void abc(String s){
        tv.setText(s);

    }
}
