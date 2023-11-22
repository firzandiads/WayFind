package com.example.wayfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class GrabBike extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grab_bike);
    }

    public void openApp(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.grabtaxi.passenger");

        if(launchIntent != null){
            startActivity(launchIntent);
        }else {
            Toast.makeText(GrabBike.this, "Aplikasi Belum Terinstal", Toast.LENGTH_LONG).show();
        }
    }
}