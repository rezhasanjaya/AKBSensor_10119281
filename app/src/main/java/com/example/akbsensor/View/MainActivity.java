package com.example.akbsensor.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import com.example.akbsensor.Presenter.MapsActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.example.akbsensor.R;

/**
 Rezha Satria SP
 10119281
 IF7
 **/

public class MainActivity extends AppCompatActivity {
    private Button bukamap;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().hide();
        getFragmentPage(new FragmentBase());

        bukamap = (Button)findViewById(R.id.bukamap);
        bukamap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 openmap();
            }
            public void openmap(){
                Intent intent = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(intent);
                String toastMessage = "Tekan Back Untuk Kembali";
                Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT).show();
            }
        });


        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()){
                    case
                            R.id.dashboard:
                        fragment = new FragmentBase();
                        break;
                    case
                            R.id.profile:
                        fragment = new Profile();
                        break;
                }
                return getFragmentPage(fragment) ;

            }
        });
    }

    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}