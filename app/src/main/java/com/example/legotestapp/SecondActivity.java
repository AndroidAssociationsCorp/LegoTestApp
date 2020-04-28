package com.example.legotestapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;



public class SecondActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_activity);

    }


    public void onClick(View v) {
        switch (v.getId()){

            case R.id.button_1:
                Intent intent1 = new Intent(this, NewbieActivity.class);
                startActivity(intent1);
                break;

            case R.id.button_2:
                Intent intent2 = new Intent(SecondActivity.this, ProffActivity.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}
