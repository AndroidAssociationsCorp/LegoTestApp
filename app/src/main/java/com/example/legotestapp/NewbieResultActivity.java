package com.example.legotestapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.logging.Level;

public class NewbieResultActivity extends AppCompatActivity {

    public TextView question_1_textview;
    public TextView question_2_textview;
    public TextView question_3_textview;
    public TextView question_4_textview;
    public TextView question_5_textview;
    public TextView question_6_textview;
    public TextView question_7_textview;
    public TextView question_8_textview;
    public TextView question_9_textview;
    public TextView question_10_textview;
    public TextView question_11_textview;
    public TextView question_12_textview;
    public TextView question_13_textview;
    public TextView question_14_textview;
    public TextView question_15_textview;
    public TextView question_16_textview;
    public TextView question_17_textview;
    public TextView question_18_textview;
    public TextView question_19_textview;
    public TextView question_20_textview;
    public TextView question_21_textview;
    public TextView question_22_textview;
    public TextView question_23_textview;
    public TextView question_24_textview;
    public TextView question_25_textview;
    public TextView question_26_textview;
    public TextView question_27_textview;
    public TextView question_28_textview;
    public Button backToQuestion;
    public Button backToBegin;


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newbie_result_activity);
        Intent putIntent = getIntent();
        boolean q1check = putIntent.getBooleanExtra(Level1.question1_check, false);
        boolean q2check = putIntent.getBooleanExtra(Level1.question2_check, false);
        boolean q3check = putIntent.getBooleanExtra(Level1.question3_check, false);
        boolean q4check = putIntent.getBooleanExtra(Level1.question4_check, false);
        boolean q5check = putIntent.getBooleanExtra(Level1.question5_check, false);
        boolean q6check = putIntent.getBooleanExtra(Level1.question6_check, false);
        boolean q7check = putIntent.getBooleanExtra(Level1.question7_check, false);
        boolean q8check = putIntent.getBooleanExtra(Level1.question8_check, false);
        boolean q9check = putIntent.getBooleanExtra(Level1.question9_check, false);
        boolean q10check = putIntent.getBooleanExtra(Level1.question10_check, false);
        boolean q11check = putIntent.getBooleanExtra(Level1.question11_check, false);
        boolean q12check = putIntent.getBooleanExtra(Level1.question12_check, false);
        boolean q13check = putIntent.getBooleanExtra(Level1.question13_check, false);
        boolean q14check = putIntent.getBooleanExtra(Level1.question14_check, false);
        boolean q15check = putIntent.getBooleanExtra(Level1.question15_check, false);
        boolean q16check = putIntent.getBooleanExtra(Level1.question16_check, false);
        boolean q17check = putIntent.getBooleanExtra(Level1.question17_check, false);
        boolean q18check = putIntent.getBooleanExtra(Level1.question18_check, false);
        boolean q19check = putIntent.getBooleanExtra(Level1.question19_check, false);
        boolean q20check = putIntent.getBooleanExtra(Level1.question20_check, false);
        boolean q21check = putIntent.getBooleanExtra(Level1.question21_check, false);
        boolean q22check = putIntent.getBooleanExtra(Level1.question22_check, false);
        boolean q23check = putIntent.getBooleanExtra(Level1.question23_check, false);
        boolean q24check = putIntent.getBooleanExtra(Level1.question24_check, false);
        boolean q25check = putIntent.getBooleanExtra(Level1.question25_check, false);
        boolean q26check = putIntent.getBooleanExtra(Level1.question26_check, false);
        boolean q27check = putIntent.getBooleanExtra(Level1.question27_check, false);
        boolean q28check = putIntent.getBooleanExtra(Level1.question28_check, false);

        question_1_textview = findViewById(R.id.textView1);
        question_2_textview = findViewById(R.id.textView2);
        question_3_textview = findViewById(R.id.textView3);
        question_4_textview = findViewById(R.id.textView4);
        question_5_textview = findViewById(R.id.textView5);
        question_6_textview = findViewById(R.id.textView6);
        question_7_textview = findViewById(R.id.textView7);
        question_8_textview = findViewById(R.id.textView8);
        question_9_textview = findViewById(R.id.textView9);
        question_10_textview = findViewById(R.id.textView10);
        question_11_textview = findViewById(R.id.textView11);
        question_12_textview = findViewById(R.id.textView12);
        question_13_textview = findViewById(R.id.textView13);
        question_14_textview = findViewById(R.id.textView14);
        question_15_textview = findViewById(R.id.textView15);
        question_16_textview = findViewById(R.id.textView16);
        question_17_textview = findViewById(R.id.textView17);
        question_18_textview = findViewById(R.id.textView18);
        question_19_textview = findViewById(R.id.textView19);
        question_20_textview = findViewById(R.id.textView20);
        question_21_textview = findViewById(R.id.textView21);
        question_22_textview = findViewById(R.id.textView22);
        question_23_textview = findViewById(R.id.textView23);
        question_24_textview = findViewById(R.id.textView24);
        question_25_textview = findViewById(R.id.textView25);
        question_26_textview = findViewById(R.id.textView26);
        question_27_textview = findViewById(R.id.textView27);
        question_28_textview = findViewById(R.id.textView28);

        answered_questions(q1check, q2check, q3check, q4check, q5check, q6check, q7check, q8check, q9check, q10check,
                q11check, q12check, q13check, q14check, q15check, q16check, q17check, q18check, q19check, q20check,
                q21check, q22check, q23check, q24check, q25check, q26check, q27check, q28check);

        backToQuestion = findViewById(R.id.button_backTo_question);
        backToQuestion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        backToBegin = findViewById(R.id.button_backTo_begin);
        backToBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NewbieResultActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void answered_questions(boolean q1check, boolean q2check, boolean q3check, boolean q4check, boolean q5check, boolean q6check, boolean q7check, boolean q8check, boolean q9check, boolean q10check,
                                    boolean q11check, boolean q12check, boolean q13check, boolean q14check, boolean q15check, boolean q16check, boolean q17check, boolean q18check, boolean q19check, boolean q20check,
                                    boolean q21check, boolean q22check, boolean q23check, boolean q24check, boolean q25check, boolean q26check, boolean q27check, boolean q28check) {

        if (q1check == true) {
            question_1_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q2check == true) {
            question_2_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q3check == true) {
            question_3_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q4check == true) {
            question_4_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q5check == true) {
            question_5_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q6check == true) {
            question_6_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q7check == true) {
            question_7_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q8check == true) {
            question_8_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q9check == true) {
            question_9_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q10check == true) {
            question_10_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q11check == true) {
            question_11_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q12check == true) {
            question_12_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q13check == true) {
            question_13_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q14check == true) {
            question_14_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q15check == true) {
            question_15_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q16check == true) {
            question_16_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q17check == true) {
            question_17_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q18check == true) {
            question_18_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q19check == true) {
            question_19_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q20check == true) {
            question_20_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q21check == true) {
            question_21_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q22check == true) {
            question_22_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q23check == true) {
            question_23_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q24check == true) {
            question_24_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q25check == true) {
            question_25_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q26check == true) {
            question_26_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q27check == true) {
            question_27_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q28check == true) {
            question_28_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}

