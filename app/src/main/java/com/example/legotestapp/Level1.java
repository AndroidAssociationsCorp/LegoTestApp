package com.example.legotestapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class Level1 extends AppCompatActivity {
    public static final String EXTRA_SCORE = "extraScore";
    private static final long COUNTDOWN_IN_MILLIS = 30000;


    private NewbieArray newbieArray = new NewbieArray();
    private ImageView img_question;
    private RadioGroup rbGroup;
    private RadioButton rb1;
    private RadioButton rb2;
    private RadioButton rb3;
    private RadioButton rb4;
    private RadioButton rb5;
    private Button buttonConfirmNext;
    private TextView textViewScore;
    private TextView textViewQuestionCount;
    private TextView textViewQuestion;
    private TextView textViewRightAnswer;
    private TextView textViewCountDown;

    private ColorStateList textColorDefaultRb;
    private ColorStateList textColorDefaultCd;

    private CountDownTimer countDownTimer;
    private long timeLeftInMillis;

    private List<Question> questionList;
    private int questionCounter;
    private int questionCountTotal;
    private Question currentQuestion;

    private int score;
    private boolean answered;

    private long backPressedTime;



    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.universal);


        ImageView img_question = findViewById(R.id.img_question);
        //img_question.setClipToOutline(true);


        textViewQuestion= findViewById(R.id.text_view_question);
        textViewRightAnswer = findViewById(R.id.text_view_right_answer);
        textViewScore = findViewById(R.id.text_view_score);
        textViewQuestionCount = findViewById(R.id.text_view_question_count);
        textViewCountDown = findViewById(R.id.text_view_countdown);
        rbGroup = findViewById(R.id.radio_group);
        rb1 = findViewById(R.id.radio_button1);
        rb2 = findViewById(R.id.radio_button2);
        rb3 = findViewById(R.id.radio_button3);
        rb4 = findViewById(R.id.radio_button4);
        rb5 = findViewById(R.id.radio_button5);
        buttonConfirmNext = findViewById(R.id.button_confirm_next);

        textColorDefaultRb = rb1.getTextColors();
        textColorDefaultCd = textViewCountDown.getTextColors();

        QuizDbHelper dbHelper = new QuizDbHelper(this);
        questionList = dbHelper.getAllQuestion();
        questionCountTotal = questionList.size();
        Collections.shuffle(questionList);


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

        //dialog
        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);


        //btn_back
        Button btn_back = (Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Level1.this, NewbieActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e)
                {
                }
            }
        });

    }

    private void showNextQuestion() {
        rb1.setTextColor(textColorDefaultRb);
        rb2.setTextColor(textColorDefaultRb);
        rb3.setTextColor(textColorDefaultRb);
        rb4.setTextColor(textColorDefaultRb);
        rb5.setTextColor(textColorDefaultRb);
        rbGroup.clearCheck();

        if (questionCounter < questionCountTotal) {
            currentQuestion = questionList.get(questionCounter);

            //textViewQuestion.setText(currentQuestion.getQuestion());
            /*rb1.setText(currentQuestion.getOption1());
            rb2.setText(currentQuestion.getOption2());
            rb3.setText(currentQuestion.getOption3());
            rb4.setText(currentQuestion.getOption4());
            rb5.setText(currentQuestion.getOption5());*/
            questionImageTextShow();

            questionCounter++;
            textViewQuestionCount.setText("Вопрос: " + questionCounter + "/" + questionCountTotal);
            answered = false;
            buttonConfirmNext.setText("Подтвердить выбор ответа");

            timeLeftInMillis = COUNTDOWN_IN_MILLIS;
            startCountDown();
        } else {
            finishQuiz();
        }

    }

    private void questionImageTextShow() {
        currentQuestion = questionList.get(questionCounter);
        img_question = findViewById(R.id.img_question);
        switch (currentQuestion.getQuestion()) {
            case 1:
                img_question.setImageResource(newbieArray.newbie_question_images[0]);
                rb1.setText(newbieArray.newbie_question_1_text[0]);
                rb2.setText(newbieArray.newbie_question_1_text[1]);
                rb3.setText(newbieArray.newbie_question_1_text[2]);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 2:
                img_question.setImageResource(R.drawable.newbie_question_2);
                rb1.setText(newbieArray.newbie_question_2_text[0]);
                rb2.setText(newbieArray.newbie_question_2_text[1]);
                rb3.setText(newbieArray.newbie_question_2_text[2]);
                rb4.setText(newbieArray.newbie_question_2_text[3]);
                rb5.setText(newbieArray.newbie_question_2_text[4]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.VISIBLE);
                break;
            case 3:
                img_question.setImageResource(R.drawable.newbie_question_3);
                rb1.setText(newbieArray.newbie_question_3_text[0]);
                rb2.setText(newbieArray.newbie_question_3_text[1]);
                rb3.setText(newbieArray.newbie_question_3_text[2]);
                rb4.setText(newbieArray.newbie_question_3_text[3]);
                rb5.setText(newbieArray.newbie_question_3_text[4]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.VISIBLE);
                break;
            case 4:
                img_question.setImageResource(R.drawable.newbie_question_4);
                rb1.setText(newbieArray.newbie_question_4_text[0]);
                rb2.setText(newbieArray.newbie_question_4_text[1]);
                rb3.setText(newbieArray.newbie_question_4_text[2]);
                rb4.setText(newbieArray.newbie_question_4_text[3]);
                rb5.setText(newbieArray.newbie_question_4_text[4]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.VISIBLE);
                break;
            case 5:
                img_question.setImageResource(R.drawable.newbie_question_5);
                rb1.setText(newbieArray.newbie_question_5_text[0]);
                rb2.setText(newbieArray.newbie_question_5_text[1]);
                rb3.setText(newbieArray.newbie_question_5_text[2]);
                rb4.setText(newbieArray.newbie_question_5_text[3]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                img_question.setImageResource(R.drawable.newbie_question_6);
                rb1.setText(newbieArray.newbie_question_6_text[0]);
                rb2.setText(newbieArray.newbie_question_6_text[1]);
                rb3.setText(newbieArray.newbie_question_6_text[2]);
                rb4.setText(newbieArray.newbie_question_6_text[3]);
                rb5.setText(newbieArray.newbie_question_6_text[4]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.VISIBLE);
                break;
            case 7:
                img_question.setImageResource(R.drawable.newbie_question_7);
                rb1.setText(newbieArray.newbie_question_7_text[0]);
                rb2.setText(newbieArray.newbie_question_7_text[1]);
                rb3.setText(newbieArray.newbie_question_7_text[2]);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 8:
                img_question.setImageResource(R.drawable.newbie_question_8);
                rb1.setText(newbieArray.newbie_question_8_text[0]);
                rb2.setText(newbieArray.newbie_question_8_text[1]);
                rb3.setText(newbieArray.newbie_question_8_text[2]);
                rb4.setText(newbieArray.newbie_question_8_text[3]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 9:
                img_question.setImageResource(R.drawable.newbie_question_9);
                rb1.setText(newbieArray.newbie_question_9_text[0]);
                rb2.setText(newbieArray.newbie_question_9_text[1]);
                rb3.setText(newbieArray.newbie_question_9_text[2]);
                rb4.setText(newbieArray.newbie_question_9_text[3]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 10:
                img_question.setImageResource(R.drawable.newbie_question_10);
                rb1.setText(newbieArray.newbie_question_10_text[0]);
                rb2.setText(newbieArray.newbie_question_10_text[1]);
                rb3.setText(newbieArray.newbie_question_10_text[2]);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 11:
                img_question.setImageResource(R.drawable.newbie_question_11);
                rb1.setText(newbieArray.newbie_question_11_text[0]);
                rb2.setText(newbieArray.newbie_question_11_text[1]);
                rb3.setText(newbieArray.newbie_question_11_text[2]);
                rb4.setText(newbieArray.newbie_question_11_text[3]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 12:
                img_question.setImageResource(R.drawable.newbie_question_12);
                rb1.setText(newbieArray.newbie_question_12_text[0]);
                rb2.setText(newbieArray.newbie_question_12_text[1]);
                rb3.setText(newbieArray.newbie_question_12_text[2]);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 13:
                img_question.setImageResource(R.drawable.newbie_question_13);
                rb1.setText(newbieArray.newbie_question_13_text[0]);
                rb2.setText(newbieArray.newbie_question_13_text[1]);
                rb3.setText(newbieArray.newbie_question_13_text[2]);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 14:
                img_question.setImageResource(R.drawable.newbie_question_14);
                rb1.setText(newbieArray.newbie_question_14_text[0]);
                rb2.setText(newbieArray.newbie_question_14_text[1]);
                rb3.setText(newbieArray.newbie_question_14_text[2]);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 15:
                img_question.setImageResource(R.drawable.newbie_question_15);
                rb1.setText(newbieArray.newbie_question_15_text[0]);
                rb2.setText(newbieArray.newbie_question_15_text[1]);
                rb3.setText(newbieArray.newbie_question_15_text[2]);
                rb4.setText(newbieArray.newbie_question_15_text[3]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 16:
                img_question.setImageResource(R.drawable.newbie_question_16);
                rb1.setText(newbieArray.newbie_question_16_text[0]);
                rb2.setText(newbieArray.newbie_question_16_text[1]);
                rb3.setText(newbieArray.newbie_question_16_text[2]);
                rb4.setText(newbieArray.newbie_question_16_text[3]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 17:
                img_question.setImageResource(R.drawable.newbie_question_17);
                rb1.setText(newbieArray.newbie_question_17_text[0]);
                rb2.setText(newbieArray.newbie_question_17_text[1]);
                rb3.setText(newbieArray.newbie_question_17_text[2]);
                rb4.setText(newbieArray.newbie_question_17_text[3]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 18:
                img_question.setImageResource(R.drawable.newbie_question_18);
                rb1.setText(newbieArray.newbie_question_18_text[0]);
                rb2.setText(newbieArray.newbie_question_18_text[1]);
                rb3.setText(newbieArray.newbie_question_18_text[2]);
                rb4.setText(newbieArray.newbie_question_18_text[3]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 19:
                img_question.setImageResource(R.drawable.newbie_question_19);
                rb1.setText(newbieArray.newbie_question_19_text[0]);
                rb2.setText(newbieArray.newbie_question_19_text[1]);
                rb3.setText(newbieArray.newbie_question_19_text[2]);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 20:
                img_question.setImageResource(R.drawable.newbie_question_20);
                rb1.setText(newbieArray.newbie_question_20_text[0]);
                rb2.setText(newbieArray.newbie_question_20_text[1]);
                rb3.setText(newbieArray.newbie_question_20_text[2]);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 21:
                img_question.setImageResource(R.drawable.newbie_question_21);
                rb1.setText(newbieArray.newbie_question_21_text[0]);
                rb2.setText(newbieArray.newbie_question_21_text[1]);
                rb3.setText(newbieArray.newbie_question_21_text[2]);
                rb4.setText(newbieArray.newbie_question_21_text[3]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 22:
                img_question.setImageResource(R.drawable.newbie_question_22);
                rb1.setText(newbieArray.newbie_question_22_text[0]);
                rb2.setText(newbieArray.newbie_question_22_text[1]);
                rb3.setText(newbieArray.newbie_question_22_text[2]);
                rb4.setText(newbieArray.newbie_question_22_text[3]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 23:
                img_question.setImageResource(R.drawable.newbie_question_23);
                rb1.setText(newbieArray.newbie_question_23_text[0]);
                rb2.setText(newbieArray.newbie_question_23_text[1]);
                rb3.setText(newbieArray.newbie_question_23_text[2]);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 24:
                img_question.setImageResource(R.drawable.newbie_question_24);
                rb1.setText(newbieArray.newbie_question_24_text[0]);
                rb2.setText(newbieArray.newbie_question_24_text[1]);
                rb3.setText(newbieArray.newbie_question_24_text[2]);
                rb4.setText(newbieArray.newbie_question_24_text[3]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 25:
                img_question.setImageResource(R.drawable.newbie_question_25);
                rb1.setText(newbieArray.newbie_question_25_text[0]);
                rb2.setText(newbieArray.newbie_question_25_text[1]);
                rb3.setText(newbieArray.newbie_question_25_text[2]);
                rb4.setText(newbieArray.newbie_question_25_text[3]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 26:
                img_question.setImageResource(R.drawable.newbie_question_26);
                rb1.setText(newbieArray.newbie_question_26_text[0]);
                rb2.setText(newbieArray.newbie_question_26_text[1]);
                rb3.setText(newbieArray.newbie_question_26_text[2]);
                rb4.setVisibility(View.INVISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 27:
                img_question.setImageResource(R.drawable.newbie_question_27);
                rb1.setText(newbieArray.newbie_question_27_text[0]);
                rb2.setText(newbieArray.newbie_question_27_text[1]);
                rb3.setText(newbieArray.newbie_question_27_text[2]);
                rb4.setText(newbieArray.newbie_question_27_text[3]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.INVISIBLE);
                break;
            case 28:
                img_question.setImageResource(R.drawable.newbie_question_28);
                rb1.setText(newbieArray.newbie_question_28_text[0]);
                rb2.setText(newbieArray.newbie_question_28_text[1]);
                rb3.setText(newbieArray.newbie_question_28_text[2]);
                rb4.setText(newbieArray.newbie_question_28_text[3]);
                rb5.setText(newbieArray.newbie_question_28_text[4]);
                rb4.setVisibility(View.VISIBLE);
                rb5.setVisibility(View.VISIBLE);
                break;

        }


    }


    private void startCountDown() {
        countDownTimer = new CountDownTimer(timeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeftInMillis = millisUntilFinished;
                updateCountDownText();
            }

            @Override
            public void onFinish() {
                timeLeftInMillis = 0;
                updateCountDownText();
                checkAnswer();
            }
        }.start();
    }

    private void updateCountDownText() {
        int minutes = (int) (timeLeftInMillis / 1000) / 60;
        int seconds = (int) (timeLeftInMillis / 1000) % 60;

        String timeFormatted = String .format(Locale.getDefault(), "%02d:%02d", minutes, seconds);

        textViewCountDown.setText(timeFormatted);

        if (timeLeftInMillis < 10000) {
            textViewCountDown.setTextColor(Color.RED);
        } else {
            textViewCountDown.setTextColor(textColorDefaultCd);
        }
    }

    private void checkAnswer() {
        answered = true;

        countDownTimer.cancel();

        RadioButton rbSelected = findViewById(rbGroup.getCheckedRadioButtonId());
        int answerNr = rbGroup.indexOfChild(rbSelected) + 1;

        if (answerNr == currentQuestion.getAnswerN()) {
            score++;
            textViewScore.setText("Очки: " + score);
        }
        showSolution();
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
                textViewRightAnswer.setText("Ответ 1");
                break;
            case 2:
                rb2.setTextColor(Color.GREEN);
                textViewRightAnswer.setText("Ответ 2");
                break;
            case 3:
                rb3.setTextColor(Color.GREEN);
                textViewRightAnswer.setText("Ответ 3");
                break;
            case 4:
                rb4.setTextColor(Color.GREEN);
                textViewRightAnswer.setText("Ответ 4");
                break;
            case 5:
                rb5.setTextColor(Color.GREEN);
                textViewRightAnswer.setText("Ответ 5");
                break;
        }

        if (questionCounter < questionCountTotal) {
            buttonConfirmNext.setText("Следующий вопрос");
        } else {
            buttonConfirmNext.setText("Завершить");
        }
    }

    private void finishQuiz() {
        Intent resultIntent = new Intent();
        resultIntent.putExtra(EXTRA_SCORE, score);
        setResult(RESULT_OK, resultIntent);
        finish();
    }

    //system_back
    @Override
    public void onBackPressed () {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            finishQuiz();
        } else {
            Toast.makeText(this, "Нажмите назад ещё раз, чтобы завершить", Toast.LENGTH_SHORT).show();
        }
        backPressedTime = System.currentTimeMillis();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (countDownTimer !=null) {
            countDownTimer.cancel();
        }
    }
}




