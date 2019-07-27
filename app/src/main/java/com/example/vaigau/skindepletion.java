package com.example.vaigau;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class skindepletion extends AppCompatActivity {
    Spinner ab;
    String Skindepletion[]={"WAX(Rica-Sleek)","Arm's Wax","Leg's Wax","Back-Full-Wax","Back+Tummy Wax","Full-Body","Under-Arm's","Upper-Lip-Wax","Chin-Wax"};
    ArrayAdapter<String> adp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skindepletion);
        ab = findViewById(R.id.sd);
        adp=new ArrayAdapter<String>(skindepletion.this,android.R.layout.simple_list_item_1,Skindepletion);
        ab.setAdapter(adp);
    }
}
