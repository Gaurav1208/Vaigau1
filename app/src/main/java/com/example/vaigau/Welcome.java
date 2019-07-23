package com.example.vaigau;

import android.content.DialogInterface;
import android.content.Intent;
import androidx.annotation.NonNull;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;

import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class Welcome extends AppCompatActivity {

    private DrawerLayout dl;
    private ActionBarDrawerToggle abd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        dl=findViewById(R.id.dl);
        abd=new ActionBarDrawerToggle(this,dl,R.string.Open,R.string.Close);
        abd.setDrawerIndicatorEnabled(true);

        dl.addDrawerListener(abd);
        abd.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final NavigationView nav=findViewById(R.id.nav_bar);
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem items) {
               switch (items.getItemId()) {
                   case R.id.home:
                       Intent b = new Intent(Welcome.this,MainActivity.class);
                       startActivity(b);
                       break;
                   case R.id.service:
                       Intent i = new Intent(Welcome.this, services.class);
                       startActivity(i);
                       break;
                   case R.id.appoint:
                       Intent a = new Intent(Welcome.this,appoint.class);
                       startActivity(a);
                       break;
                   case R.id.off:
                       Intent f = new Intent(Welcome.this, offers.class);
                       startActivity(f);
                       break;
                   case R.id.gal:
                       Intent c = new Intent(Welcome.this,gallery.class);
                       startActivity(c);
                       break;
                   case R.id.about:
                       Intent d = new Intent(Welcome.this,about_us.class);
                       startActivity(d);
                       break;
                   case R.id.con:
                       Intent e = new Intent(Welcome.this,contact_us.class);
                       startActivity(e);
                       break;
               }

                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return abd.onOptionsItemSelected(item) || super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        // super.onBackPressed();
        FirebaseAuth.getInstance().signOut();
        new AlertDialog.Builder(Welcome.this).setIcon(R.mipmap.ic_launcher_round)
                .setTitle("VAIGAU")
                .setMessage("DO YOU WANGT TO CLOSE THE APPLICATION ?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        Toast.makeText(Welcome.this,"Logged Out",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("NO",null)
                .show()
        ;
    }


}
