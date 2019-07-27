package com.example.vaigau;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class bodycare extends AppCompatActivity {
    Spinner bc;
    String bodycare[]={"Back-Massage","Body-Massage","Body-Spa","Arm's-D-Tan","Full-Body-D-Tan","Body-Polishing"};
    ArrayAdapter<String> adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodycare);
        bc = findViewById(R.id.spine);
        adp=new ArrayAdapter<String>(bodycare.this,android.R.layout.simple_list_item_1,bodycare);
        bc.setAdapter(adp);
    }
}
