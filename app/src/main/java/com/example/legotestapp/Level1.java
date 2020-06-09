package com.example.legotestapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;
import java.util.logging.Level;

public class Level1 extends AppCompatActivity {

    public static final String EXTRA_SCORE = "extraScore";
    public static final String question1_check = "question1checked";
    public static final String question2_check = "question2checked";
    public static final String question3_check = "question3checked";
    public static final String question4_check = "question4checked";
    public static final String question5_check = "question5checked";
    public static final String question6_check = "question6checked";
    public static final String question7_check = "question7checked";
    public static final String question8_check = "question8checked";
    public static final String question9_check = "question9checked";
    public static final String question10_check = "question10checked";
    public static final String question11_check = "question11checked";
    public static final String question12_check = "question12checked";
    public static final String question13_check = "question13checked";
    public static final String question14_check = "question14checked";
    public static final String question15_check = "question15checked";
    public static final String question16_check = "question16checked";
    public static final String question17_check = "question17checked";
    public static final String question18_check = "question18checked";
    public static final String question19_check = "question19checked";
    public static final String question20_check = "question20checked";
    public static final String question21_check = "question21checked";
    public static final String question22_check = "question22checked";
    public static final String question23_check = "question23checked";
    public static final String question24_check = "question24checked";
    public static final String question25_check = "question25checked";
    public static final String question26_check = "question26checked";
    public static final String question27_check = "question27checked";
    public static final String question28_check = "question28checked";

    private NewbieArray newbieArray = new NewbieArray();
    private RadioGroup rbGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private RadioButton rb5;
    private Button buttonConfirmNext;
    private TextView textViewScore;
    private TextView textViewQuestionCount;

    private ColorStateList textColorDefaultRb;

    private List<Question> questionList;
    private int questionCounter;
    private int questionCountTotal;
    private Question currentQuestion;

    private int score;
    private boolean answered;
    private boolean q1check;
    private boolean q2check;
    private boolean q3check;
    private boolean q4check;
    private boolean q5check;
    private boolean q6check;
    private boolean q7check;
    private boolean q8check;
    private boolean q9check;
    private boolean q10check;
    private boolean q11check;
    private boolean q12check;
    private boolean q13check;
    private boolean q14check;
    private boolean q15check;
    private boolean q16check;
    private boolean q17check;
    private boolean q18check;
    private boolean q19check;
    private boolean q20check;
    private boolean q21check;
    private boolean q22check;
    private boolean q23check;
    private boolean q24check;
    private boolean q25check;
    private boolean q26check;
    private boolean q27check;
    private boolean q28check;

    public int button_clicked;

    private long backPressedTime;


    final int MAX_STREAMS = 1;
    SoundPool soundPool;
    int soundIdRight;
    int soundIdWrong;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);

        textViewScore = findViewById(R.id.text_view_score);
        textViewQuestionCount = findViewById(R.id.text_view_question_count);
        rbGroup = findViewById(R.id.radio_group);
        rb1 = findViewById(R.id.radio_button1);
        rb2 = findViewById(R.id.radio_button2);
        rb3 = findViewById(R.id.radio_button3);
        rb4 = findViewById(R.id.radio_button4);
        rb5 = findViewById(R.id.radio_button5);
        buttonConfirmNext = findViewById(R.id.button_confirm_next);

        textColorDefaultRb = rb1.getTextColors();

        QuizDbHelper dbHelper = new QuizDbHelper(this);
        questionList = dbHelper.getAllQuestion();
        questionCountTotal = questionList.size();

        button_clicked = getIntent().getIntExtra("level_clicked", button_clicked);
        showNextQuestion();

        buttonConfirmNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!answered) {
                    if (rb1.isChecked() || rb2.isChecked() || rb3.isChecked() || rb4.isChecked() || rb5.isChecked()) {
                        checkAnswer();
                    } else {
                        Toast.makeText(Level1.this, "Перед тем как продожить, выберите ответ.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    showNextQuestion();
                }
            }
        });

        soundPool = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);
        soundIdRight = soundPool.load(this, R.raw.right, 1);
        soundIdWrong = soundPool.load(this, R.raw.wrong, 1);

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

    }

    private void showNextQuestion() {
        rb1.setTextColor(textColorDefaultRb);
        rb2.setTextColor(textColorDefaultRb);
        rb3.setTextColor(textColorDefaultRb);
        rb4.setTextColor(textColorDefaultRb);
        rb5.setTextColor(textColorDefaultRb);
        rbGroup.clearCheck();

        if (questionCounter < 27) {
            currentQuestion = questionList.get(questionCounter);

            questionImageTextShow();
            button_clicked++;
            //questionCounter++;
            //textViewQuestionCount.setText("Вопрос: " + questionCounter + "/" + 27);
            answered = false;
            buttonConfirmNext.setText("Подтвердить");

        } else {
            finishQuiz();
        }

    }

    private void questionImageTextShow() {
        currentQuestion = questionList.get(questionCounter);
        ImageView img_question = findViewById(R.id.img_question);
        switch (currentQuestion.getQuestion()) {
            case 1:
                if (button_clicked == 1) {
                    img_question.setImageResource(newbieArray.newbie_question_images[0]);
                    rb1.setText(newbieArray.newbie_question_1_text[0]);
                    rb2.setText(newbieArray.newbie_question_1_text[1]);
                    rb3.setText(newbieArray.newbie_question_1_text[2]);
                    rb4.setVisibility(View.INVISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 0;
                    textViewQuestionCount.setText("Вопрос: 1/28");
                }
            case 2:
                if (button_clicked == 2) {
                    img_question.setImageResource(R.drawable.newbie_question_2);
                    rb1.setText(newbieArray.newbie_question_2_text[0]);
                    rb2.setText(newbieArray.newbie_question_2_text[1]);
                    rb3.setText(newbieArray.newbie_question_2_text[2]);
                    rb4.setText(newbieArray.newbie_question_2_text[3]);
                    rb5.setText(newbieArray.newbie_question_2_text[4]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.VISIBLE);
                    questionCounter = 1;
                    textViewQuestionCount.setText("Вопрос: 2/28");
                }
            case 3:
                if (button_clicked == 3) {
                    img_question.setImageResource(R.drawable.newbie_question_3);
                    rb1.setText(newbieArray.newbie_question_3_text[0]);
                    rb2.setText(newbieArray.newbie_question_3_text[1]);
                    rb3.setText(newbieArray.newbie_question_3_text[2]);
                    rb4.setText(newbieArray.newbie_question_3_text[3]);
                    rb5.setText(newbieArray.newbie_question_3_text[4]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.VISIBLE);
                    questionCounter = 2;
                    textViewQuestionCount.setText("Вопрос: 3/28");
                }
            case 4:
                if (button_clicked == 4) {
                    img_question.setImageResource(R.drawable.newbie_question_4);
                    rb1.setText(newbieArray.newbie_question_4_text[0]);
                    rb2.setText(newbieArray.newbie_question_4_text[1]);
                    rb3.setText(newbieArray.newbie_question_4_text[2]);
                    rb4.setText(newbieArray.newbie_question_4_text[3]);
                    rb5.setText(newbieArray.newbie_question_4_text[4]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.VISIBLE);
                    questionCounter = 3;
                    textViewQuestionCount.setText("Вопрос: 4/28");
                }
            case 5:
                if (button_clicked == 5) {
                    img_question.setImageResource(R.drawable.newbie_question_5);
                    rb1.setText(newbieArray.newbie_question_5_text[0]);
                    rb2.setText(newbieArray.newbie_question_5_text[1]);
                    rb3.setText(newbieArray.newbie_question_5_text[2]);
                    rb4.setText(newbieArray.newbie_question_5_text[3]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 4;
                    textViewQuestionCount.setText("Вопрос: 5/28");
                }
            case 6:
                if (button_clicked == 6) {
                    img_question.setImageResource(R.drawable.newbie_question_6);
                    rb1.setText(newbieArray.newbie_question_6_text[0]);
                    rb2.setText(newbieArray.newbie_question_6_text[1]);
                    rb3.setText(newbieArray.newbie_question_6_text[2]);
                    rb4.setText(newbieArray.newbie_question_6_text[3]);
                    rb5.setText(newbieArray.newbie_question_6_text[4]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.VISIBLE);
                    questionCounter = 5;
                    textViewQuestionCount.setText("Вопрос: 6/28");
                }
            case 7:
                if (button_clicked == 7) {
                    img_question.setImageResource(R.drawable.newbie_question_7);
                    rb1.setText(newbieArray.newbie_question_7_text[0]);
                    rb2.setText(newbieArray.newbie_question_7_text[1]);
                    rb3.setText(newbieArray.newbie_question_7_text[2]);
                    rb4.setVisibility(View.INVISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 6;
                    textViewQuestionCount.setText("Вопрос: 7/28");
                }
            case 8:
                if (button_clicked == 8) {
                    img_question.setImageResource(R.drawable.newbie_question_8);
                    rb1.setText(newbieArray.newbie_question_8_text[0]);
                    rb2.setText(newbieArray.newbie_question_8_text[1]);
                    rb3.setText(newbieArray.newbie_question_8_text[2]);
                    rb4.setText(newbieArray.newbie_question_8_text[3]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 7;
                    textViewQuestionCount.setText("Вопрос: 8/28");
                }
            case 9:
                if (button_clicked == 9) {
                    img_question.setImageResource(R.drawable.newbie_question_9);
                    rb1.setText(newbieArray.newbie_question_9_text[0]);
                    rb2.setText(newbieArray.newbie_question_9_text[1]);
                    rb3.setText(newbieArray.newbie_question_9_text[2]);
                    rb4.setText(newbieArray.newbie_question_9_text[3]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 8;
                    textViewQuestionCount.setText("Вопрос: 9/28");
                }
            case 10:
                if (button_clicked == 10) {
                    img_question.setImageResource(R.drawable.newbie_question_10);
                    rb1.setText(newbieArray.newbie_question_10_text[0]);
                    rb2.setText(newbieArray.newbie_question_10_text[1]);
                    rb3.setText(newbieArray.newbie_question_10_text[2]);
                    rb4.setVisibility(View.INVISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 9;
                    textViewQuestionCount.setText("Вопрос: 10/28");
                }
            case 11:
                if (button_clicked == 11) {
                    img_question.setImageResource(R.drawable.newbie_question_11);
                    rb1.setText(newbieArray.newbie_question_11_text[0]);
                    rb2.setText(newbieArray.newbie_question_11_text[1]);
                    rb3.setText(newbieArray.newbie_question_11_text[2]);
                    rb4.setText(newbieArray.newbie_question_11_text[3]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 10;
                    textViewQuestionCount.setText("Вопрос: 11/28");
                }
            case 12:
                if (button_clicked == 12) {
                    img_question.setImageResource(R.drawable.newbie_question_12);
                    rb1.setText(newbieArray.newbie_question_12_text[0]);
                    rb2.setText(newbieArray.newbie_question_12_text[1]);
                    rb3.setText(newbieArray.newbie_question_12_text[2]);
                    rb4.setVisibility(View.INVISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 11;
                    textViewQuestionCount.setText("Вопрос: 12/28");
                }
            case 13:
                if (button_clicked == 13) {
                    img_question.setImageResource(R.drawable.newbie_question_13);
                    rb1.setText(newbieArray.newbie_question_13_text[0]);
                    rb2.setText(newbieArray.newbie_question_13_text[1]);
                    rb3.setText(newbieArray.newbie_question_13_text[2]);
                    rb4.setVisibility(View.INVISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 12;
                    textViewQuestionCount.setText("Вопрос: 13/28");
                }
            case 14:
                if (button_clicked == 14) {
                    img_question.setImageResource(R.drawable.newbie_question_14);
                    rb1.setText(newbieArray.newbie_question_14_text[0]);
                    rb2.setText(newbieArray.newbie_question_14_text[1]);
                    rb3.setText(newbieArray.newbie_question_14_text[2]);
                    rb4.setVisibility(View.INVISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 13;
                    textViewQuestionCount.setText("Вопрос: 14/28");
                }
            case 15:
                if (button_clicked == 15) {
                    img_question.setImageResource(R.drawable.newbie_question_15);
                    rb1.setText(newbieArray.newbie_question_15_text[0]);
                    rb2.setText(newbieArray.newbie_question_15_text[1]);
                    rb3.setText(newbieArray.newbie_question_15_text[2]);
                    rb4.setText(newbieArray.newbie_question_15_text[3]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 14;
                    textViewQuestionCount.setText("Вопрос: 15/28");
                }
            case 16:
                if (button_clicked == 16) {
                    img_question.setImageResource(R.drawable.newbie_question_16);
                    rb1.setText(newbieArray.newbie_question_16_text[0]);
                    rb2.setText(newbieArray.newbie_question_16_text[1]);
                    rb3.setText(newbieArray.newbie_question_16_text[2]);
                    rb4.setText(newbieArray.newbie_question_16_text[3]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 15;
                    textViewQuestionCount.setText("Вопрос: 16/28");
                }
            case 17:
                if (button_clicked == 17) {
                    img_question.setImageResource(R.drawable.newbie_question_17);
                    rb1.setText(newbieArray.newbie_question_17_text[0]);
                    rb2.setText(newbieArray.newbie_question_17_text[1]);
                    rb3.setText(newbieArray.newbie_question_17_text[2]);
                    rb4.setText(newbieArray.newbie_question_17_text[3]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 16;
                    textViewQuestionCount.setText("Вопрос: 17/28");
                }
            case 18:
                if (button_clicked == 18) {
                    img_question.setImageResource(R.drawable.newbie_question_18);
                    rb1.setText(newbieArray.newbie_question_18_text[0]);
                    rb2.setText(newbieArray.newbie_question_18_text[1]);
                    rb3.setText(newbieArray.newbie_question_18_text[2]);
                    rb4.setText(newbieArray.newbie_question_18_text[3]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 17;
                    textViewQuestionCount.setText("Вопрос: 18/28");
                }
            case 19:
                if (button_clicked == 19) {
                    img_question.setImageResource(R.drawable.newbie_question_19);
                    rb1.setText(newbieArray.newbie_question_19_text[0]);
                    rb2.setText(newbieArray.newbie_question_19_text[1]);
                    rb3.setText(newbieArray.newbie_question_19_text[2]);
                    rb4.setVisibility(View.INVISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 18;
                    textViewQuestionCount.setText("Вопрос: 19/28");
                }
            case 20:
                if (button_clicked == 20) {
                    img_question.setImageResource(R.drawable.newbie_question_20);
                    rb1.setText(newbieArray.newbie_question_20_text[0]);
                    rb2.setText(newbieArray.newbie_question_20_text[1]);
                    rb3.setText(newbieArray.newbie_question_20_text[2]);
                    rb4.setVisibility(View.INVISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 19;
                    textViewQuestionCount.setText("Вопрос: 20/28");
                }
            case 21:
                if (button_clicked == 21) {
                    img_question.setImageResource(R.drawable.newbie_question_21);
                    rb1.setText(newbieArray.newbie_question_21_text[0]);
                    rb2.setText(newbieArray.newbie_question_21_text[1]);
                    rb3.setText(newbieArray.newbie_question_21_text[2]);
                    rb4.setText(newbieArray.newbie_question_21_text[3]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 20;
                    textViewQuestionCount.setText("Вопрос: 21/28");
                }
            case 22:
                if (button_clicked == 22) {
                    img_question.setImageResource(R.drawable.newbie_question_22);
                    rb1.setText(newbieArray.newbie_question_22_text[0]);
                    rb2.setText(newbieArray.newbie_question_22_text[1]);
                    rb3.setText(newbieArray.newbie_question_22_text[2]);
                    rb4.setText(newbieArray.newbie_question_22_text[3]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 21;
                    textViewQuestionCount.setText("Вопрос: 22/28");
                }
            case 23:
                if (button_clicked == 23) {
                    img_question.setImageResource(R.drawable.newbie_question_23);
                    rb1.setText(newbieArray.newbie_question_23_text[0]);
                    rb2.setText(newbieArray.newbie_question_23_text[1]);
                    rb3.setText(newbieArray.newbie_question_23_text[2]);
                    rb4.setVisibility(View.INVISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 22;
                    textViewQuestionCount.setText("Вопрос: 23/28");
                }
            case 24:
                if (button_clicked == 24) {
                    img_question.setImageResource(R.drawable.newbie_question_24);
                    rb1.setText(newbieArray.newbie_question_24_text[0]);
                    rb2.setText(newbieArray.newbie_question_24_text[1]);
                    rb3.setText(newbieArray.newbie_question_24_text[2]);
                    rb4.setText(newbieArray.newbie_question_24_text[3]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 23;
                    textViewQuestionCount.setText("Вопрос: 24/28");
                }
            case 25:
                if (button_clicked == 25) {
                    img_question.setImageResource(R.drawable.newbie_question_25);
                    rb1.setText(newbieArray.newbie_question_25_text[0]);
                    rb2.setText(newbieArray.newbie_question_25_text[1]);
                    rb3.setText(newbieArray.newbie_question_25_text[2]);
                    rb4.setText(newbieArray.newbie_question_25_text[3]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 24;
                    textViewQuestionCount.setText("Вопрос: 25/28");
                }
            case 26:
                if (button_clicked == 26) {
                    img_question.setImageResource(R.drawable.newbie_question_26);
                    rb1.setText(newbieArray.newbie_question_26_text[0]);
                    rb2.setText(newbieArray.newbie_question_26_text[1]);
                    rb3.setText(newbieArray.newbie_question_26_text[2]);
                    rb4.setVisibility(View.INVISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 25;
                    textViewQuestionCount.setText("Вопрос: 26/28");
                }
            case 27:
                if (button_clicked == 27) {
                    img_question.setImageResource(R.drawable.newbie_question_27);
                    rb1.setText(newbieArray.newbie_question_27_text[0]);
                    rb2.setText(newbieArray.newbie_question_27_text[1]);
                    rb3.setText(newbieArray.newbie_question_27_text[2]);
                    rb4.setText(newbieArray.newbie_question_27_text[3]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.INVISIBLE);
                    questionCounter = 26;
                    textViewQuestionCount.setText("Вопрос: 27/28");
                }
            case 28:
                if (button_clicked == 28) {
                    img_question.setImageResource(R.drawable.newbie_question_28);
                    rb1.setText(newbieArray.newbie_question_28_text[0]);
                    rb2.setText(newbieArray.newbie_question_28_text[1]);
                    rb3.setText(newbieArray.newbie_question_28_text[2]);
                    rb4.setText(newbieArray.newbie_question_28_text[3]);
                    rb5.setText(newbieArray.newbie_question_28_text[4]);
                    rb4.setVisibility(View.VISIBLE);
                    rb5.setVisibility(View.VISIBLE);
                    questionCounter = 27;
                    textViewQuestionCount.setText("Вопрос: 28/28");
                }
        }


    }

    private void checkAnswer() {
        answered = true;
        RadioButton rbSelected = findViewById(rbGroup.getCheckedRadioButtonId());
        int answerNr = rbGroup.indexOfChild(rbSelected) + 1;
        currentQuestion = questionList.get(questionCounter);
        if (answerNr == currentQuestion.getAnswerN()) {
            soundPool.play(soundIdRight, 0.08f, 0.08f, 0, 0, 1.5f);
            score++;
            textViewScore.setText("Очки: " + score);
            checkAnswerAndPutScore();
        } else {
            soundPool.play(soundIdWrong, 0.08f, 0.08f, 0, 0, 1.5f);
        }
        showSolution();
    }

    private void checkAnswerAndPutScore() {
        answered = true;
        RadioButton rbSelected = findViewById(rbGroup.getCheckedRadioButtonId());
        int answerNr = rbGroup.indexOfChild(rbSelected) + 1;
        switch (currentQuestion.getQuestion()) {
            case 1: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q1check = true;
                    break;
                }
            }
            case 2: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q2check = true;
                    break;
                }
            }
            case 3: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q3check = true;
                    break;
                }
            }
            case 4: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q4check = true;
                    break;
                }
            }
            case 5: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q5check = true;
                    break;
                }
            }
            case 6: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q6check = true;
                    break;
                }
            }
            case 7: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q7check = true;
                    break;
                }
            }
            case 8: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q8check = true;
                    break;
                }
            }
            case 9: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q9check = true;
                    break;
                }
            }
            case 10: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q10check = true;
                    break;
                }
            }
            case 11: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q11check = true;
                    break;
                }
            }
            case 12: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q12check = true;
                    break;
                }
            }
            case 13: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q13check = true;
                    break;
                }
            }
            case 14: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q14check = true;
                    break;
                }
            }
            case 15: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q15check = true;
                    break;
                }
            }
            case 16: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q16check = true;
                    break;
                }
            }
            case 17: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q17check = true;
                    break;
                }
            }
            case 18: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q18check = true;
                    break;
                }
            }
            case 19: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q19check = true;
                    break;
                }
            }
            case 20: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q20check = true;
                    break;
                }
            }
            case 21: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q21check = true;
                    break;
                }
            }
            case 22: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q22check = true;
                    break;
                }
            }
            case 23: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q23check = true;
                    break;
                }
            }
            case 24: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q24check = true;
                    break;
                }
            }
            case 25: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q25check = true;
                    break;
                }
            }
            case 26: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q26check = true;
                    break;
                }
            }
            case 27: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q27check = true;
                    break;
                }
            }
            case 28: {
                if (answerNr == currentQuestion.getAnswerN()) {
                    q28check = true;
                    break;
                }
            }
        }
    }

    private void showSolution() {
        rb1.setTextColor(Color.RED);
        rb2.setTextColor(Color.RED);
        rb3.setTextColor(Color.RED);
        rb4.setTextColor(Color.RED);
        rb5.setTextColor(Color.RED);

        switch (currentQuestion.getAnswerN()) {
            case 1:
                rb1.setTextColor(Color.GREEN);
                break;
            case 2:
                rb2.setTextColor(Color.GREEN);
                break;
            case 3:
                rb3.setTextColor(Color.GREEN);
                break;
            case 4:
                rb4.setTextColor(Color.GREEN);
                break;
            case 5:
                rb5.setTextColor(Color.GREEN);
                break;
        }

        if (questionCounter < 27) {
            buttonConfirmNext.setText("Далее");
        } else {
            buttonConfirmNext.setText("Завершить");
        }
    }

    private void finishQuiz() {
        Intent resultIntent = new Intent();
        resultIntent.putExtra(EXTRA_SCORE, score);
        resultIntent.putExtra(question1_check, q1check);
        resultIntent.putExtra(question2_check, q2check);
        resultIntent.putExtra(question3_check, q3check);
        resultIntent.putExtra(question4_check, q4check);
        resultIntent.putExtra(question5_check, q5check);
        resultIntent.putExtra(question6_check, q6check);
        resultIntent.putExtra(question7_check, q7check);
        resultIntent.putExtra(question8_check, q8check);
        resultIntent.putExtra(question9_check, q9check);
        resultIntent.putExtra(question10_check, q10check);
        resultIntent.putExtra(question11_check, q11check);
        resultIntent.putExtra(question12_check, q12check);
        resultIntent.putExtra(question13_check, q13check);
        resultIntent.putExtra(question14_check, q14check);
        resultIntent.putExtra(question15_check, q15check);
        resultIntent.putExtra(question16_check, q16check);
        resultIntent.putExtra(question17_check, q17check);
        resultIntent.putExtra(question18_check, q18check);
        resultIntent.putExtra(question19_check, q19check);
        resultIntent.putExtra(question20_check, q20check);
        resultIntent.putExtra(question21_check, q21check);
        resultIntent.putExtra(question22_check, q22check);
        resultIntent.putExtra(question23_check, q23check);
        resultIntent.putExtra(question24_check, q24check);
        resultIntent.putExtra(question25_check, q25check);
        resultIntent.putExtra(question26_check, q26check);
        resultIntent.putExtra(question27_check, q27check);
        resultIntent.putExtra(question28_check, q28check);
        setResult(RESULT_OK, resultIntent);

        Intent putIntent = new Intent(this, NewbieResultActivity.class);
        putIntent.putExtra(question1_check, q1check);
        putIntent.putExtra(question2_check, q2check);
        putIntent.putExtra(question3_check, q3check);
        putIntent.putExtra(question4_check, q4check);
        putIntent.putExtra(question5_check, q5check);
        putIntent.putExtra(question6_check, q6check);
        putIntent.putExtra(question7_check, q7check);
        putIntent.putExtra(question8_check, q8check);
        putIntent.putExtra(question9_check, q9check);
        putIntent.putExtra(question10_check, q10check);
        putIntent.putExtra(question11_check, q11check);
        putIntent.putExtra(question12_check, q12check);
        putIntent.putExtra(question13_check, q13check);
        putIntent.putExtra(question14_check, q14check);
        putIntent.putExtra(question15_check, q15check);
        putIntent.putExtra(question16_check, q16check);
        putIntent.putExtra(question17_check, q17check);
        putIntent.putExtra(question18_check, q18check);
        putIntent.putExtra(question19_check, q19check);
        putIntent.putExtra(question20_check, q20check);
        putIntent.putExtra(question21_check, q21check);
        putIntent.putExtra(question22_check, q22check);
        putIntent.putExtra(question23_check, q23check);
        putIntent.putExtra(question24_check, q24check);
        putIntent.putExtra(question25_check, q25check);
        putIntent.putExtra(question26_check, q26check);
        putIntent.putExtra(question27_check, q27check);
        putIntent.putExtra(question28_check, q28check);
        startActivity(putIntent);

        /*Intent intent = new Intent(Level1.this, NewbieResultActivity.class);
        startActivity(intent);*/
        finish();
    }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            finishQuiz();
        } else {
            Toast.makeText(this, "Нажмите назад ещё раз, чтобы завершить", Toast.LENGTH_SHORT).show();
        }
        backPressedTime = System.currentTimeMillis();

    }

}