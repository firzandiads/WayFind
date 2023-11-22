package com.example.wayfind;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;


public class HomePage extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        buttonNext = findViewById(R.id.buttonNext);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input1 = editText1.getText().toString();
                String input2 = editText2.getText().toString();

                if (input1.equals("Plaza UNY") && input2.equals("Ambarrukmo Plaza")) {
                    Toast.makeText(HomePage.this, "Input valid, lanjut ke halaman selanjutnya", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(HomePage.this, PilihKendaraan.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(HomePage.this, "Input tidak valid", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


