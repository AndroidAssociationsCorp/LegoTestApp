package com.example.legotestapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class NewbieActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newbie_activity);

        Button btn_back = findViewById(R.id.btn_back);



        //level1
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(NewbieActivity.this, Level1.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e){

                }
            }
        });

        //btn_back
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(NewbieActivity.this, SecondActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e) {}
            }
        });
    }
}
