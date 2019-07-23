package com.example.vaigau;

import androidx.fragment.app.FragmentManager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
Button f,g;
FragmentManager fm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        f=findViewById(R.id.f1);
        g=findViewById(R.id.f2);
        fm=getSupportFragmentManager();

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fm.beginTransaction().replace(R.id.frame,Login.getInstance()).commit();
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             fm.beginTransaction().replace(R.id.frame,SignUp.getInstance()).commit();
            }
        });
    }
}
