package com.example.vaigau;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class treatment extends AppCompatActivity {
    Spinner sp;
    String treatment[]={"Threading","Forehead","Upper-Lip","Chin-Thread","Face-Thread-Side","Nose Thread","Full-Face-Thread"};
    ArrayAdapter<String> adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_treatment);
        sp = findViewById(R.id.spintreat);
        adp=new ArrayAdapter<String>(treatment.this,android.R.layout.simple_list_item_1,treatment);
        sp.setAdapter(adp);
    }
}
