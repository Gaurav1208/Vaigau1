package com.example.vaigau;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class skincare extends AppCompatActivity {
    Spinner sc;
    String skincleanser[]={"Face-Bleech","Body-Bleech","Neck-Bleech","Arm's-Bleech","Full-Body-Bleech"};
    ArrayAdapter<String> adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skincare);
        sc = findViewById(R.id.skink);
        adp = new ArrayAdapter<>(skincare.this,android.R.layout.simple_list_item_1,skincleanser);
        sc.setAdapter(adp);
    }
}
