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

import org.w3c.dom.Text;

import java.util.logging.Level;

public class NewbieActivity extends AppCompatActivity {

    private static final int REQUEST_CODE_QUIZ = 1;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String KEY_HIGHSCORE = "keyHighscore";
    public static final Boolean question1_check = false;

    private TextView textViewHighscore;

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

    public int button_clicked = 0;

    private int highscore;
    private boolean q1check;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newbie_activity);


        textViewHighscore = findViewById(R.id.text_view_highscore);
        loadHighscore();
        //loadCheckedQuestions();
        //answered_questions(q1check);


        Button btn_back = findViewById(R.id.btn_back);

        //start_levels
        //level1_start
        TextView textView1 = findViewById(R.id.textView1);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 1;
                startLevel1();
            }
        });
        //level2_start
        TextView textView2 = findViewById(R.id.textView2);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 2;
                startLevel1();
            }
        });
        //level3_start
        TextView textView3 = findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 3;
                startLevel1();
            }
        });
        //level4_start
        TextView textView4 = findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 4;
                startLevel1();
            }
        });
        //level5_start
        TextView textView5 = findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 5;
                startLevel1();
            }
        });
        //level6_start
        TextView textView6 = findViewById(R.id.textView6);
        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 6;
                startLevel1();
            }
        });
        //level7_start
        TextView textView7 = findViewById(R.id.textView7);
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 7;
                startLevel1();
            }
        });
        //level8_start
        TextView textView8 = findViewById(R.id.textView8);
        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 8;
                startLevel1();
            }
        });
        //level9_start
        TextView textView9 = findViewById(R.id.textView9);
        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 9;
                startLevel1();
            }
        });
        //level10_start
        TextView textView10 = findViewById(R.id.textView10);
        textView10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 10;
                startLevel1();
            }
        });
        //level11_start
        TextView textView11 = findViewById(R.id.textView11);
        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 11;
                startLevel1();
            }
        });
        //level12_start
        TextView textView12 = findViewById(R.id.textView12);
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 12;
                startLevel1();
            }
        });
        //level13_start
        TextView textView13 = findViewById(R.id.textView13);
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 13;
                startLevel1();
            }
        });
        //level14_start
        TextView textView14 = findViewById(R.id.textView14);
        textView14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 14;
                startLevel1();
            }
        });
        //level15_start
        TextView textView15 = findViewById(R.id.textView15);
        textView15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 15;
                startLevel1();
            }
        });
        //level16_start
        TextView textView16 = findViewById(R.id.textView16);
        textView16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 16;
                startLevel1();
            }
        });
        //level17_start
        TextView textView17 = findViewById(R.id.textView17);
        textView17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 17;
                startLevel1();
            }
        });
        //level18_start
        TextView textView18 = findViewById(R.id.textView18);
        textView18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 18;
                startLevel1();
            }
        });
        //level19_start
        TextView textView19 = findViewById(R.id.textView19);
        textView19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 19;
                startLevel1();
            }
        });
        //level20_start
        TextView textView20 = findViewById(R.id.textView20);
        textView20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 20;
                startLevel1();
            }
        });
        //level21_start
        TextView textView21 = findViewById(R.id.textView21);
        textView21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 21;
                startLevel1();
            }
        });
        //level22_start
        TextView textView22 = findViewById(R.id.textView22);
        textView22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 22;
                startLevel1();
            }
        });
        //level23_start
        TextView textView23 = findViewById(R.id.textView23);
        textView23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 23;
                startLevel1();
            }
        });
        //level24_start
        TextView textView24 = findViewById(R.id.textView24);
        textView24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 24;
                startLevel1();
            }
        });
        //level25_start
        TextView textView25 = findViewById(R.id.textView25);
        textView25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 25;
                startLevel1();
            }
        });
        //level26_start
        TextView textView26 = findViewById(R.id.textView26);
        textView26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 26;
                startLevel1();
            }
        });
        //level27_start
        TextView textView27 = findViewById(R.id.textView27);
        textView27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 27;
                startLevel1();
            }
        });
        //level28_start
        TextView textView28 = findViewById(R.id.textView28);
        textView28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button_clicked = 28;
                startLevel1();
            }
        });

        //btn_back
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    finish();
                } catch (Exception e) {
                }
            }
        });
    }

    private void startLevel1() {
        Intent intent = new Intent(NewbieActivity.this, Level1.class);
        intent.putExtra("level_clicked", button_clicked);
        startActivityForResult(intent, REQUEST_CODE_QUIZ);
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == REQUEST_CODE_QUIZ) {
            if (resultCode == RESULT_OK) {
                int score = data.getIntExtra(Level1.EXTRA_SCORE, 0);
                boolean q1check = data.getBooleanExtra(Level1.question1_check, false);
                boolean q2check = data.getBooleanExtra(Level1.question2_check, false);
                boolean q3check = data.getBooleanExtra(Level1.question3_check, false);
                boolean q4check = data.getBooleanExtra(Level1.question4_check, false);
                boolean q5check = data.getBooleanExtra(Level1.question5_check, false);
                boolean q6check = data.getBooleanExtra(Level1.question6_check, false);
                boolean q7check = data.getBooleanExtra(Level1.question7_check, false);
                boolean q8check = data.getBooleanExtra(Level1.question8_check, false);
                boolean q9check = data.getBooleanExtra(Level1.question9_check, false);
                boolean q10check = data.getBooleanExtra(Level1.question10_check, false);
                boolean q11check = data.getBooleanExtra(Level1.question11_check, false);
                boolean q12check = data.getBooleanExtra(Level1.question12_check, false);
                boolean q13check = data.getBooleanExtra(Level1.question13_check, false);
                boolean q14check = data.getBooleanExtra(Level1.question14_check, false);
                boolean q15check = data.getBooleanExtra(Level1.question15_check, false);
                boolean q16check = data.getBooleanExtra(Level1.question16_check, false);
                boolean q17check = data.getBooleanExtra(Level1.question17_check, false);
                boolean q18check = data.getBooleanExtra(Level1.question18_check, false);
                boolean q19check = data.getBooleanExtra(Level1.question19_check, false);
                boolean q20check = data.getBooleanExtra(Level1.question20_check, false);
                boolean q21check = data.getBooleanExtra(Level1.question21_check, false);
                boolean q22check = data.getBooleanExtra(Level1.question22_check, false);
                boolean q23check = data.getBooleanExtra(Level1.question23_check, false);
                boolean q24check = data.getBooleanExtra(Level1.question24_check, false);
                boolean q25check = data.getBooleanExtra(Level1.question25_check, false);
                boolean q26check = data.getBooleanExtra(Level1.question26_check, false);
                boolean q27check = data.getBooleanExtra(Level1.question27_check, false);
                boolean q28check = data.getBooleanExtra(Level1.question28_check, false);
                if (score > highscore) {
                    updateHighscore(score);
                    //updateCheckedQuestions(q1check);
                }
                answered_questions(q1check, q2check, q3check, q4check, q5check, q6check, q7check, q8check, q9check, q10check,
                        q11check, q12check, q13check, q14check, q15check, q16check, q17check, q18check, q19check, q20check,
                        q21check, q22check, q23check, q24check, q25check, q26check, q27check, q28check);
            }
        }
    }

    private void loadHighscore() {
        SharedPreferences preferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        highscore = preferences.getInt(KEY_HIGHSCORE, 0);
        textViewHighscore.setText("Очки: " + highscore);
    }

    private void updateHighscore(int highscoreNew) {
        highscore = highscoreNew;
        textViewHighscore.setText("Очки: " + highscore);
        SharedPreferences preferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(KEY_HIGHSCORE, highscore);
        editor.apply();
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void loadCheckedQuestions() {
        SharedPreferences preferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        q1check = preferences.getBoolean(Level1.question1_check,false);
        question_1_textview = findViewById(R.id.textView1);
        question_1_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
    }

    private void updateCheckedQuestions(boolean q1checked) {
        q1check = q1checked;
        SharedPreferences preferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(String.valueOf(question1_check),false);
        editor.apply();
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void answered_questions(boolean q1check, boolean q2check, boolean q3check, boolean q4check, boolean q5check, boolean q6check, boolean q7check, boolean q8check, boolean q9check, boolean q10check,
                                    boolean q11check, boolean q12check, boolean q13check, boolean q14check, boolean q15check, boolean q16check, boolean q17check, boolean q18check, boolean q19check, boolean q20check,
                                    boolean q21check, boolean q22check, boolean q23check, boolean q24check, boolean q25check, boolean q26check, boolean q27check, boolean q28check) {

        SharedPreferences preferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        /*editor.putBoolean(String.valueOf(q1check), false);
        editor.apply();*/


        if (q1check == true) {
            question_1_textview = findViewById(R.id.textView1);
            question_1_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q2check == true) {
            question_2_textview = findViewById(R.id.textView2);
            question_2_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q3check == true) {
            question_3_textview = findViewById(R.id.textView3);
            question_3_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q4check == true) {
            question_4_textview = findViewById(R.id.textView4);
            question_4_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q5check == true) {
            question_5_textview = findViewById(R.id.textView5);
            question_5_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q6check == true) {
            question_6_textview = findViewById(R.id.textView6);
            question_6_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q7check == true) {
            question_7_textview = findViewById(R.id.textView7);
            question_7_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q8check == true) {
            question_8_textview = findViewById(R.id.textView8);
            question_8_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q9check == true) {
            question_9_textview = findViewById(R.id.textView9);
            question_9_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q10check == true) {
            question_10_textview = findViewById(R.id.textView10);
            question_10_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q11check == true) {
            question_11_textview = findViewById(R.id.textView11);
            question_11_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q12check == true) {
            question_12_textview = findViewById(R.id.textView12);
            question_12_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q13check == true) {
            question_13_textview = findViewById(R.id.textView13);
            question_13_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q14check == true) {
            question_14_textview = findViewById(R.id.textView14);
            question_14_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q15check == true) {
            question_15_textview = findViewById(R.id.textView15);
            question_15_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q16check == true) {
            question_16_textview = findViewById(R.id.textView16);
            question_16_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q17check == true) {
            question_17_textview = findViewById(R.id.textView17);
            question_17_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q18check == true) {
            question_18_textview = findViewById(R.id.textView18);
            question_18_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q19check == true) {
            question_19_textview = findViewById(R.id.textView19);
            question_19_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q20check == true) {
            question_20_textview = findViewById(R.id.textView20);
            question_20_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q21check == true) {
            question_21_textview = findViewById(R.id.textView21);
            question_21_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q22check == true) {
            question_22_textview = findViewById(R.id.textView22);
            question_22_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q23check == true) {
            question_23_textview = findViewById(R.id.textView23);
            question_23_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q24check == true) {
            question_24_textview = findViewById(R.id.textView24);
            question_24_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q25check == true) {
            question_25_textview = findViewById(R.id.textView25);
            question_25_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q26check == true) {
            question_26_textview = findViewById(R.id.textView26);
            question_26_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q27check == true) {
            question_27_textview = findViewById(R.id.textView27);
            question_27_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        if (q28check == true) {
            question_28_textview = findViewById(R.id.textView28);
            question_28_textview.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
        }
        editor.putBoolean(String.valueOf(q1check), false);
        editor.apply();
    }
}
