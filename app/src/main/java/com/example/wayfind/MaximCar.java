package com.example.wayfind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MaximCar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maxim_car);
    }
    public void openApp(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.taxsee.taxsee");

        if(launchIntent != null){
            startActivity(launchIntent);
        }else {
            Toast.makeText(MaximCar.this, "Aplikasi Belum Terinstal", Toast.LENGTH_LONG).show();
        }
    }
}