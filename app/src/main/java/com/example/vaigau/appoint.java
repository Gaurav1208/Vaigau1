package com.example.vaigau;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class appoint extends AppCompatActivity {
    String cat[] = {"CATEGORIES","SKIN", "HAIR", "MAKE-UP", "HANDS&FEET"};
    ArrayAdapter<String> adp;
    private Bundle savedInstanceState;

    private  Button b,c;
    private  TextView t1,t2;

    DatePicker date;
    TimePicker timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appoint);
        t1=findViewById(R.id.text1);
        b=findViewById(R.id.set);
        c=findViewById(R.id.ts);
        date=findViewById(R.id.dp);
        timer=findViewById(R.id.time);
        t2=findViewById(R.id.text2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int month=date.getMonth();
                int year=date.getYear();
                int day=date.getDayOfMonth();

                String dat=day+"/"+month+"/"+year;

                t1.setText(dat);




            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hour=timer.getCurrentHour();
                int minutes=timer.getCurrentMinute();

                String time=hour+"-"+minutes;
                t2.setText(time);

            }
        });
    }




    }