package com.example.vaigau;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.cardview.widget.CardView;


public class skin extends AppCompatActivity  {
    private CardView treat1, body1, clean1, basic1, wax1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skin);
        /* *//* treat1 = findViewById(R.id.treat);
            body1 = findViewById(R.id.body);
            clean1 = findViewById(R.id.clean);
            basic1 = findViewById(R.id.basic);
            wax1 = findViewById(R.id.wax);*//*
            treat1.setOnClickListener(this);
            body1.setOnClickListener(this);
            clean1.setOnClickListener(this);
            basic1.setOnClickListener(this);
            wax1.setOnClickListener(this);
*/
    }

   /* @Override
    public void onClick(View v) {
            Intent i;

            switch (v.getId()){
                case R.id.treat: i= new Intent(this,treatment.class);startActivity(i);break;
                case R.id.body: i= new Intent(this,bodycare.class);startActivity(i);break;
                case R.id.clean: i=new Intent(this,skincare.class);startActivity(i);break;
                case R.id.basic: i=new Intent(this,skinbasic.class);startActivity(i);break;
                case R.id.wax: i=new Intent(this,skindepletion.class);startActivity(i);break;
                default:break;
            }*/
//}
}

