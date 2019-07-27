package com.example.vaigau;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class skinbasic extends AppCompatActivity {
    Spinner sb;
    String skinbasics[]={"Threading","Forehead","Upper-Lip","Chin-Thread","Face-Thread-Side","Nose Thread","Full-Face-Thread"};
    ArrayAdapter<String> adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skinbasic);
        sb = findViewById(R.id.sb);
        adp=new ArrayAdapter<String>(skinbasic.this,android.R.layout.simple_list_item_1,skinbasics);
        sb.setAdapter(adp);
    }
}
