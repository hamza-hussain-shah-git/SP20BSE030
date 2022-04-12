package com.example.sp20_bse_030_assi_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Add = findViewById(R.id.addrec);
        Button Search = findViewById(R.id.searchrec);
        FragmentManager fragmentManager= getSupportFragmentManager();
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, add.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("")
                        .commit();
            }
        });
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, add.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("")
                        .commit();
            }
        });


    }



}