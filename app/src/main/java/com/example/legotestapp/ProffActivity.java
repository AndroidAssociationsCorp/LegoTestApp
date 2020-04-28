package com.example.legotestapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProffActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proff_activity);

        Button btn_back = findViewById(R.id.btn_back);

        //btn_back
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(ProffActivity.this, SecondActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {

                }
            }
        });
    }
}
