package com.example.legotestapp;



import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


public class ProffActivity2 extends AppCompatActivity {
    Integer number = 0;
    Integer check_1_a = 0;
    Integer check_1_b = 0;
    Integer check_1_c = 0;
    Integer check_2_a = 0;
    Integer check_2_b = 0;
    Integer check_2_c = 0;
    Integer check_3 = 0;
    Integer check_9 = 0;
    Integer right_Ans = 0;
    Integer q_count = 0;
    String right_Ans_s;
    String q_count_s;
    Character check_q_1 = 'n';
    Character check_q_2 = 'n';
    Character check_q_3 = 'n';
    Character check_q_4 = 'n';
    Character check_q_5 = 'n';
    Character check_q_6 = 'n';
    Character check_q_7 = 'n';
    Character check_q_8 = 'n';
    Character check_q_9 = 'n';
    Character check_q_10 = 'n';
    Character right_Ans_1 = 'n';
    Character right_Ans_2 = 'n';
    Character right_Ans_3 = 'n';
    Character right_Ans_4 = 'n';
    Character right_Ans_5 = 'n';
    Character right_Ans_6 = 'n';
    Character right_Ans_7 = 'n';
    Character right_Ans_8 = 'n';
    Character right_Ans_9 = 'n';
    Character right_Ans_10 = 'n';

    final int MAX_STREAMS = 2;

    SharedPreferences sPref;

    SoundPool sp;
    int soundIdRight;
    int soundIdWrong;

    int streamIdRight;
    int streamIdWrong;


    private void showQuestion(){
        TextView textView = findViewById(R.id.textProff);
        TextView current_question = findViewById(R.id.current_question);
        LinearLayout q_1 = findViewById(R.id.q_1);
        ScrollView q_2 = findViewById(R.id.q_2);
        LinearLayout q_3 = findViewById(R.id.q_3);
        LinearLayout q_4 = findViewById(R.id.q_4);
        LinearLayout q_5 = findViewById(R.id.q_5);
        LinearLayout q_6 = findViewById(R.id.q_6);
        LinearLayout q_7 = findViewById(R.id.q_7);
        LinearLayout q_8 = findViewById(R.id.q_8);
        LinearLayout q_9 = findViewById(R.id.q_9);
        LinearLayout q_10 = findViewById(R.id.q_10);
        switch (number) {
            case 1:
                textView.setText(R.string.proff_q_1);
                current_question.setText(R.string.number1);
                q_1.setVisibility(View.VISIBLE);
                q_2.setVisibility(View.INVISIBLE);
                q_3.setVisibility(View.INVISIBLE);
                q_4.setVisibility(View.INVISIBLE);
                q_5.setVisibility(View.INVISIBLE);
                q_6.setVisibility(View.INVISIBLE);
                q_7.setVisibility(View.INVISIBLE);
                q_8.setVisibility(View.INVISIBLE);
                q_9.setVisibility(View.INVISIBLE);
                q_10.setVisibility(View.INVISIBLE);
                break;
            case 2:
                textView.setText(R.string.proff_q_2);
                current_question.setText(R.string.number2);
                q_1.setVisibility(View.INVISIBLE);
                q_2.setVisibility(View.VISIBLE);
                q_3.setVisibility(View.INVISIBLE);
                q_4.setVisibility(View.INVISIBLE);
                q_5.setVisibility(View.INVISIBLE);
                q_6.setVisibility(View.INVISIBLE);
                q_7.setVisibility(View.INVISIBLE);
                q_8.setVisibility(View.INVISIBLE);
                q_9.setVisibility(View.INVISIBLE);
                q_10.setVisibility(View.INVISIBLE);
                break;
            case 3:
                textView.setText(R.string.proff_q_3);
                current_question.setText(R.string.number3);
                q_1.setVisibility(View.INVISIBLE);
                q_2.setVisibility(View.INVISIBLE);
                q_3.setVisibility(View.VISIBLE);
                q_4.setVisibility(View.INVISIBLE);
                q_5.setVisibility(View.INVISIBLE);
                q_6.setVisibility(View.INVISIBLE);
                q_7.setVisibility(View.INVISIBLE);
                q_8.setVisibility(View.INVISIBLE);
                q_9.setVisibility(View.INVISIBLE);
                q_10.setVisibility(View.INVISIBLE);
                break;
            case 4:
                textView.setText(R.string.proff_q_4);
                current_question.setText(R.string.number4);
                q_1.setVisibility(View.INVISIBLE);
                q_2.setVisibility(View.INVISIBLE);
                q_3.setVisibility(View.INVISIBLE);
                q_4.setVisibility(View.VISIBLE);
                q_5.setVisibility(View.INVISIBLE);
                q_6.setVisibility(View.INVISIBLE);
                q_7.setVisibility(View.INVISIBLE);
                q_8.setVisibility(View.INVISIBLE);
                q_9.setVisibility(View.INVISIBLE);
                q_10.setVisibility(View.INVISIBLE);
                break;
            case 5:
                textView.setText(R.string.proff_q_5);
                current_question.setText(R.string.number5);
                q_1.setVisibility(View.INVISIBLE);
                q_2.setVisibility(View.INVISIBLE);
                q_3.setVisibility(View.INVISIBLE);
                q_4.setVisibility(View.INVISIBLE);
                q_5.setVisibility(View.VISIBLE);
                q_6.setVisibility(View.INVISIBLE);
                q_7.setVisibility(View.INVISIBLE);
                q_8.setVisibility(View.INVISIBLE);
                q_9.setVisibility(View.INVISIBLE);
                q_10.setVisibility(View.INVISIBLE);
                break;
            case 6:
                textView.setText(R.string.proff_q_6);
                current_question.setText(R.string.number6);
                q_1.setVisibility(View.INVISIBLE);
                q_2.setVisibility(View.INVISIBLE);
                q_3.setVisibility(View.INVISIBLE);
                q_4.setVisibility(View.INVISIBLE);
                q_5.setVisibility(View.INVISIBLE);
                q_6.setVisibility(View.VISIBLE);
                q_7.setVisibility(View.INVISIBLE);
                q_8.setVisibility(View.INVISIBLE);
                q_9.setVisibility(View.INVISIBLE);
                q_10.setVisibility(View.INVISIBLE);
                break;
            case 7:
                textView.setText(R.string.proff_q_7);
                current_question.setText(R.string.number7);
                q_1.setVisibility(View.INVISIBLE);
                q_2.setVisibility(View.INVISIBLE);
                q_3.setVisibility(View.INVISIBLE);
                q_4.setVisibility(View.INVISIBLE);
                q_5.setVisibility(View.INVISIBLE);
                q_6.setVisibility(View.INVISIBLE);
                q_7.setVisibility(View.VISIBLE);
                q_8.setVisibility(View.INVISIBLE);
                q_9.setVisibility(View.INVISIBLE);
                q_10.setVisibility(View.INVISIBLE);
                break;
            case 8:
                textView.setText(R.string.proff_q_8);
                current_question.setText(R.string.number8);
                q_1.setVisibility(View.INVISIBLE);
                q_2.setVisibility(View.INVISIBLE);
                q_3.setVisibility(View.INVISIBLE);
                q_4.setVisibility(View.INVISIBLE);
                q_5.setVisibility(View.INVISIBLE);
                q_6.setVisibility(View.INVISIBLE);
                q_7.setVisibility(View.INVISIBLE);
                q_8.setVisibility(View.VISIBLE);
                q_9.setVisibility(View.INVISIBLE);
                q_10.setVisibility(View.INVISIBLE);
                break;
            case 9:
                textView.setText(R.string.proff_q_9);
                current_question.setText(R.string.number9);
                q_1.setVisibility(View.INVISIBLE);
                q_2.setVisibility(View.INVISIBLE);
                q_3.setVisibility(View.INVISIBLE);
                q_4.setVisibility(View.INVISIBLE);
                q_5.setVisibility(View.INVISIBLE);
                q_6.setVisibility(View.INVISIBLE);
                q_7.setVisibility(View.INVISIBLE);
                q_8.setVisibility(View.INVISIBLE);
                q_9.setVisibility(View.VISIBLE);
                q_10.setVisibility(View.INVISIBLE);
                break;
            case 10:
                textView.setText(R.string.proff_q_10);
                current_question.setText(R.string.number10);
                q_1.setVisibility(View.INVISIBLE);
                q_2.setVisibility(View.INVISIBLE);
                q_3.setVisibility(View.INVISIBLE);
                q_4.setVisibility(View.INVISIBLE);
                q_5.setVisibility(View.INVISIBLE);
                q_6.setVisibility(View.INVISIBLE);
                q_7.setVisibility(View.INVISIBLE);
                q_8.setVisibility(View.INVISIBLE);
                q_9.setVisibility(View.INVISIBLE);
                q_10.setVisibility(View.VISIBLE);
                break;
            default:
                break;
        }
    }

    void saveArray(){
        sPref = getSharedPreferences("array",MODE_PRIVATE);
        SharedPreferences.Editor ed = sPref.edit();
        for(int i = 0; i < ProffActivity.completed.length;i++){
            ed.putInt("completed_"+i, ProffActivity.completed[i]);
            ed.apply();
        }
    }

    Integer checkQuestion(){
        int _tmp = 0;
        switch (number){
            case 1:
                if(check_1_a == 0 || check_1_b==0 || check_1_c==0) {
                    _tmp=0;
                }
                else{
                    _tmp=1;
                }
                if(_tmp==1) {
                    if (check_q_1 != 'y') {
                        q_count++;
                        check_q_1 = 'y';
                    }
                    if (check_1_a == 2 && check_1_b == 2 &&
                            check_1_c == 2) {
                        if (right_Ans_1 != 'y') {
                            ProffActivity.completed[0] = 1;
                            right_Ans_1 = 'y';
                            right_Ans++;
                            sp.play(soundIdRight, 1, 1, 0, 0,1);
                        }
                    } else {
                        if (right_Ans_1 == 'y') {
                            ProffActivity.completed[0] = 0;
                            right_Ans--;
                            right_Ans_1 = 'n';
                        } else {
                            ProffActivity.completed[0] = 0;
                            sp.play(soundIdWrong, 1, 1, 0, 0,1);
                        }
                    }
                }
                break;
            case 2:
                if(check_2_a == 0 || check_2_b==0 || check_2_c==0) {
                    _tmp=0;
                }
                else{
                    _tmp=1;
                }
                if(_tmp==1) {
                    if (check_q_2 != 'y') {
                        q_count++;
                        check_q_2 = 'y';
                    }
                    if (check_2_a == 2 && check_2_b == 2 &&
                            check_2_c == 2) {
                        if (right_Ans_2 != 'y') {
                            ProffActivity.completed[1] = 1;
                            right_Ans_2 = 'y';
                            right_Ans++;
                            sp.play(soundIdRight, 1, 1, 0, 0,1);
                        }
                    } else {
                        if (right_Ans_2 == 'y') {
                            ProffActivity.completed[1] = 0;
                            right_Ans_2 = 'n';
                            right_Ans--;
                        } else {
                            ProffActivity.completed[1] = 0;
                            sp.play(soundIdWrong, 1, 1, 0, 0,1);
                        }
                    }
                }
                break;
            case 3:
                if(check_3 == 0) {
                    _tmp=0;
                }
                else{
                    _tmp=1;
                }
                if(_tmp==1) {
                    if (check_q_3 != 'y') {
                        q_count++;
                        check_q_3 = 'y';
                    }
                    if (check_3 == 2) {
                        if (right_Ans_3 != 'y') {
                            ProffActivity.completed[2] = 1;
                            right_Ans_3 = 'y';
                            right_Ans++;
                            sp.play(soundIdRight, 1, 1, 0, 0,1);
                        }
                    } else {
                        if (right_Ans_3 == 'y') {
                            ProffActivity.completed[2] = 0;
                            right_Ans_3 = 'n';
                            right_Ans--;
                        } else {
                            ProffActivity.completed[2] = 0;
                            sp.play(soundIdWrong, 1, 1, 0, 0,1);
                        }
                    }
                }
                break;
            case 4:
                RadioButton rb_4_1 = findViewById(R.id.radioButton_p_q_4_1);
                RadioButton rb_4_2 = findViewById(R.id.radioButton_p_q_4_2);
                RadioButton rb_4_3 = findViewById(R.id.radioButton_p_q_4_3);
                RadioButton rb_4_4 = findViewById(R.id.radioButton_p_q_4_4);
                if(!rb_4_1.isChecked() & !rb_4_2.isChecked() & !rb_4_3.isChecked() & !rb_4_4.isChecked()){
                    _tmp=0;
                }
                else {
                    _tmp=1;
                }
                if(_tmp==1) {
                    if (check_q_4 != 'y') {
                        q_count++;
                        check_q_4 = 'y';
                    }
                    if (rb_4_3.isChecked()) {
                        if (right_Ans_4 != 'y') {
                            ProffActivity.completed[3] = 1;
                            right_Ans_4 = 'y';
                            right_Ans++;
                            sp.play(soundIdRight, 1, 1, 0, 0,1);
                        }
                    } else {
                        if (right_Ans_4 == 'y') {
                            ProffActivity.completed[3] = 0;
                            right_Ans_4 = 'n';
                            right_Ans--;
                        } else {
                            ProffActivity.completed[3] = 0;
                            sp.play(soundIdWrong, 1, 1, 0, 0,1);
                        }
                    }
                }
                break;
            case 5:
                RadioButton rb_5_1 = findViewById(R.id.radioButton_p_q_5_1);
                RadioButton rb_5_2 = findViewById(R.id.radioButton_p_q_5_2);
                RadioButton rb_5_3 = findViewById(R.id.radioButton_p_q_5_3);
                RadioButton rb_5_4 = findViewById(R.id.radioButton_p_q_5_4);
                if(!rb_5_1.isChecked() & !rb_5_2.isChecked() & !rb_5_3.isChecked() & !rb_5_4.isChecked()){
                    _tmp=0;
                }
                else {
                    _tmp=1;
                }
                if(_tmp==1) {
                    if (check_q_5 != 'y') {
                        q_count++;
                        check_q_5 = 'y';
                    }
                    if (rb_5_3.isChecked()) {
                        if (right_Ans_5 != 'y') {
                            ProffActivity.completed[4] = 1;
                            right_Ans_5 = 'y';
                            right_Ans++;
                            sp.play(soundIdRight, 1, 1, 0, 0,1);
                        }
                    } else {
                        if (right_Ans_5 == 'y') {
                            ProffActivity.completed[4] = 0;
                            right_Ans_5 = 'n';
                            right_Ans--;
                        } else {
                            ProffActivity.completed[4] = 0;
                            sp.play(soundIdWrong, 1, 1, 0, 0,1);
                        }
                    }
                }
                break;
            case 6:
                RadioButton rb_6_1 = findViewById(R.id.radioButton_p_q_6_1);
                RadioButton rb_6_2 = findViewById(R.id.radioButton_p_q_6_2);
                RadioButton rb_6_3 = findViewById(R.id.radioButton_p_q_6_3);
                RadioButton rb_6_4 = findViewById(R.id.radioButton_p_q_6_4);
                if(!rb_6_1.isChecked() & !rb_6_2.isChecked() & !rb_6_3.isChecked() & !rb_6_4.isChecked()){
                    _tmp=0;
                }
                else {
                    _tmp=1;
                }
                if(_tmp==1) {
                    if (check_q_6 != 'y') {
                        q_count++;
                        check_q_6 = 'y';
                    }
                    if (rb_6_1.isChecked()) {
                        if (right_Ans_6 != 'y') {
                            ProffActivity.completed[5] = 1;
                            right_Ans_6 = 'y';
                            right_Ans++;
                            sp.play(soundIdRight, 1, 1, 0, 0,1);
                        }
                    } else {
                        if (right_Ans_6 == 'y') {
                            ProffActivity.completed[5] = 0;
                            right_Ans_6 = 'n';
                            right_Ans--;
                        } else {
                            ProffActivity.completed[5] = 0;
                            sp.play(soundIdWrong, 1, 1, 0, 0,1);
                        }
                    }
                }
                break;
            case 7:
                RadioButton rb_7_1 = findViewById(R.id.radioButton_p_q_7_1);
                RadioButton rb_7_2 = findViewById(R.id.radioButton_p_q_7_2);
                RadioButton rb_7_3 = findViewById(R.id.radioButton_p_q_7_3);
                RadioButton rb_7_4 = findViewById(R.id.radioButton_p_q_7_4);
                if(!rb_7_1.isChecked() & !rb_7_2.isChecked() & !rb_7_3.isChecked() & !rb_7_4.isChecked()){
                    _tmp=0;
                }
                else {
                    _tmp=1;
                }
                if(_tmp==1) {
                    if (check_q_7 != 'y') {
                        q_count++;
                        check_q_7 = 'y';
                    }
                    if (rb_7_2.isChecked()) {
                        if (right_Ans_7 != 'y') {
                            ProffActivity.completed[6] = 1;
                            right_Ans_7 = 'y';
                            right_Ans++;
                            sp.play(soundIdRight, 1, 1, 0, 0,1);
                        }
                    } else {
                        if (right_Ans_7 == 'y') {
                            ProffActivity.completed[6] = 0;
                            right_Ans_7 = 'n';
                            right_Ans--;
                        } else {
                            ProffActivity.completed[6] = 0;
                            sp.play(soundIdWrong, 1, 1, 0, 0,1);
                        }
                    }
                }
                break;
            case 8:
                RadioButton rb_8_1 = findViewById(R.id.radioButton_p_q_8_1);
                RadioButton rb_8_2 = findViewById(R.id.radioButton_p_q_8_2);
                RadioButton rb_8_3 = findViewById(R.id.radioButton_p_q_8_3);
                RadioButton rb_8_4 = findViewById(R.id.radioButton_p_q_8_4);
                if(!rb_8_1.isChecked() & !rb_8_2.isChecked() & !rb_8_3.isChecked() & !rb_8_4.isChecked()){
                    _tmp=0;
                }
                else {
                    _tmp=1;
                }
                if(_tmp==1) {
                    if (check_q_8 != 'y') {
                        q_count++;
                        check_q_8 = 'y';
                    }
                    if (rb_8_4.isChecked()) {
                        if (right_Ans_8 != 'y') {
                            ProffActivity.completed[7] = 1;
                            right_Ans_8 = 'y';
                            right_Ans++;
                            sp.play(soundIdRight, 1, 1, 0, 0,1);
                        }
                    } else {
                        if (right_Ans_8 == 'y') {
                            ProffActivity.completed[7] = 0;
                            right_Ans_8 = 'n';
                            right_Ans--;
                        } else {
                            ProffActivity.completed[7] = 0;
                            sp.play(soundIdWrong, 1, 1, 0, 0,1);
                        }
                    }
                }
                break;
            case 9:
                if(check_9 == 0) {
                    _tmp=0;
                }
                else{
                    _tmp=1;
                }
                if(_tmp==1) {
                    if (check_q_9 != 'y') {
                        q_count++;
                        check_q_9 = 'y';
                    }
                    if (check_9 == 2) {
                        if (right_Ans_9 != 'y') {
                            ProffActivity.completed[8] = 1;
                            right_Ans_9 = 'y';
                            right_Ans++;
                            sp.play(soundIdRight, 1, 1, 0, 0,1);
                        }
                    } else {
                        if (right_Ans_9 == 'y') {
                            ProffActivity.completed[8] = 0;
                            right_Ans_9 = 'n';
                            right_Ans--;
                        } else {
                            ProffActivity.completed[8] = 0;
                            sp.play(soundIdWrong, 1, 1, 0, 0,1);
                        }
                    }
                }
                break;
            case 10:
                RadioButton rb_10_1 = findViewById(R.id.radioButton_p_q_10_1);
                RadioButton rb_10_2 = findViewById(R.id.radioButton_p_q_10_2);
                RadioButton rb_10_3 = findViewById(R.id.radioButton_p_q_10_3);
                RadioButton rb_10_4 = findViewById(R.id.radioButton_p_q_10_4);
                if(!rb_10_1.isChecked() & !rb_10_2.isChecked() & !rb_10_3.isChecked() & !rb_10_4.isChecked()){
                    _tmp=0;
                }
                else {
                    _tmp=1;
                }
                if(_tmp==1) {
                    if (check_q_10 != 'y') {
                        q_count++;
                        check_q_10 = 'y';
                    }
                    if (rb_10_2.isChecked()) {
                        if (right_Ans_10 != 'y') {
                            ProffActivity.completed[9] = 1;
                            right_Ans_10 = 'y';
                            right_Ans++;
                            sp.play(soundIdRight, 1, 1, 0, 0,1);
                        }
                    } else {
                        if (right_Ans_10 == 'y') {
                            ProffActivity.completed[9] = 0;
                            right_Ans_10 = 'n';
                            right_Ans--;
                        } else {
                            ProffActivity.completed[9] = 0;
                            sp.play(soundIdWrong, 1, 1, 0, 0,1);
                        }
                    }
                }
                break;
        }
        return _tmp;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    void showAnswers(){
        ImageView i_1_a_1 = findViewById(R.id.i_1_a_1);
        ImageView i_1_a_2 = findViewById(R.id.i_1_a_2);
        ImageView i_1_a_3 = findViewById(R.id.i_1_a_3);
        ImageView i_1_a_4 = findViewById(R.id.i_1_a_4);
        ImageView i_1_b_1 = findViewById(R.id.i_1_b_1);
        ImageView i_1_b_2 = findViewById(R.id.i_1_b_2);
        ImageView i_1_b_3 = findViewById(R.id.i_1_b_3);
        ImageView i_1_b_4 = findViewById(R.id.i_1_b_4);
        ImageView i_1_c_1 = findViewById(R.id.i_1_c_1);
        ImageView i_1_c_2 = findViewById(R.id.i_1_c_2);
        ImageView i_1_c_3 = findViewById(R.id.i_1_c_3);
        ImageView i_1_c_4 = findViewById(R.id.i_1_c_4);
        ImageView i_2_a_1 = findViewById(R.id.i_2_a_1);
        ImageView i_2_a_2 = findViewById(R.id.i_2_a_2);
        ImageView i_2_a_3 = findViewById(R.id.i_2_a_3);
        ImageView i_2_a_4 = findViewById(R.id.i_2_a_4);
        ImageView i_2_b_1 = findViewById(R.id.i_2_b_1);
        ImageView i_2_b_2 = findViewById(R.id.i_2_b_2);
        ImageView i_2_b_3 = findViewById(R.id.i_2_b_3);
        ImageView i_2_b_4 = findViewById(R.id.i_2_b_4);
        ImageView i_2_c_1 = findViewById(R.id.i_2_c_1);
        ImageView i_2_c_2 = findViewById(R.id.i_2_c_2);
        ImageView i_2_c_3 = findViewById(R.id.i_2_c_3);
        ImageView i_2_c_4 = findViewById(R.id.i_2_c_4);
        ImageView i_3_1 = findViewById(R.id.i_3_1);
        ImageView i_3_2 = findViewById(R.id.i_3_2);
        ImageView i_3_3 = findViewById(R.id.i_3_3);
        ImageView i_3_4 = findViewById(R.id.i_3_4);
        ImageView i_3_5 = findViewById(R.id.i_3_5);
        RadioButton rb_4_1 = findViewById(R.id.radioButton_p_q_4_1);
        RadioButton rb_4_2 = findViewById(R.id.radioButton_p_q_4_2);
        RadioButton rb_4_3 = findViewById(R.id.radioButton_p_q_4_3);
        RadioButton rb_4_4 = findViewById(R.id.radioButton_p_q_4_4);
        RadioButton rb_5_1 = findViewById(R.id.radioButton_p_q_5_1);
        RadioButton rb_5_2 = findViewById(R.id.radioButton_p_q_5_2);
        RadioButton rb_5_3 = findViewById(R.id.radioButton_p_q_5_3);
        RadioButton rb_5_4 = findViewById(R.id.radioButton_p_q_5_4);
        RadioButton rb_6_1 = findViewById(R.id.radioButton_p_q_6_1);
        RadioButton rb_6_2 = findViewById(R.id.radioButton_p_q_6_2);
        RadioButton rb_6_3 = findViewById(R.id.radioButton_p_q_6_3);
        RadioButton rb_6_4 = findViewById(R.id.radioButton_p_q_6_4);
        RadioButton rb_7_1 = findViewById(R.id.radioButton_p_q_7_1);
        RadioButton rb_7_2 = findViewById(R.id.radioButton_p_q_7_2);
        RadioButton rb_7_3 = findViewById(R.id.radioButton_p_q_7_3);
        RadioButton rb_7_4 = findViewById(R.id.radioButton_p_q_7_4);
        RadioButton rb_8_1 = findViewById(R.id.radioButton_p_q_8_1);
        RadioButton rb_8_2 = findViewById(R.id.radioButton_p_q_8_2);
        RadioButton rb_8_3 = findViewById(R.id.radioButton_p_q_8_3);
        RadioButton rb_8_4 = findViewById(R.id.radioButton_p_q_8_4);
        ImageView i_9_1 = findViewById(R.id.i_9_1);
        ImageView i_9_2 = findViewById(R.id.i_9_2);
        ImageView i_9_3 = findViewById(R.id.i_9_3);
        ImageView i_9_4 = findViewById(R.id.i_9_4);
        RadioButton rb_10_1 = findViewById(R.id.radioButton_p_q_10_1);
        RadioButton rb_10_2 = findViewById(R.id.radioButton_p_q_10_2);
        RadioButton rb_10_3 = findViewById(R.id.radioButton_p_q_10_3);
        RadioButton rb_10_4 = findViewById(R.id.radioButton_p_q_10_4);
        switch (number){
            case 1:
                if(!(i_1_a_1.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_1_a_1.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_1_a_2.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_1_a_2.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_1_a_3.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_1_a_3.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_1_a_4.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_1_a_4.setBackground(getResources().getDrawable(R.drawable.green_border));
                }

                if(!(i_1_b_1.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_1_b_1.setBackground(getResources().getDrawable(R.drawable.green_border));
                }
                if(!(i_1_b_2.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_1_b_2.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_1_b_3.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_1_b_3.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_1_b_4.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_1_b_4.setBackground(getResources().getDrawable(R.drawable.red_border));
                }

                if(!(i_1_c_1.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_1_c_1.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_1_c_2.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_1_c_2.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_1_c_3.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_1_c_3.setBackground(getResources().getDrawable(R.drawable.green_border));
                }
                if(!(i_1_c_4.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_1_c_4.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                break;

            case 2:
                if(!(i_2_a_1.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_2_a_1.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_2_a_2.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_2_a_2.setBackground(getResources().getDrawable(R.drawable.green_border));
                }
                if(!(i_2_a_3.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_2_a_3.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_2_a_4.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_2_a_4.setBackground(getResources().getDrawable(R.drawable.red_border));
                }

                if(!(i_2_b_1.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_2_b_1.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_2_b_2.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_2_b_2.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_2_b_3.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_2_b_3.setBackground(getResources().getDrawable(R.drawable.green_border));
                }
                if(!(i_2_b_4.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_2_b_4.setBackground(getResources().getDrawable(R.drawable.red_border));
                }

                if(!(i_2_c_1.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_2_c_1.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_2_c_2.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_2_c_2.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_2_c_3.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_2_c_3.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_2_c_4.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_2_c_4.setBackground(getResources().getDrawable(R.drawable.green_border));
                }
                break;

            case 3:
                if(!(i_3_1.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_3_1.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_3_2.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_3_2.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_3_3.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_3_3.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_3_4.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_3_4.setBackground(getResources().getDrawable(R.drawable.green_border));
                }
                if(!(i_3_5.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_3_5.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                break;

            case 4:
                if(!rb_4_1.isChecked()){
                    rb_4_1.setTextColor(getColor(R.color.red));
                }
                if(!rb_4_2.isChecked()){
                    rb_4_2.setTextColor(getColor(R.color.red));
                }
                if(!rb_4_3.isChecked()){
                    rb_4_3.setTextColor(getColor(R.color.green));
                }
                if(!rb_4_4.isChecked()){
                    rb_4_4.setTextColor(getColor(R.color.red));
                }
                break;

            case 5:
                if(!rb_5_1.isChecked()){
                    rb_5_1.setTextColor(getColor(R.color.red));
                }
                if(!rb_5_2.isChecked()){
                    rb_5_2.setTextColor(getColor(R.color.red));
                }
                if(!rb_5_3.isChecked()){
                    rb_5_3.setTextColor(getColor(R.color.green));
                }
                if(!rb_5_4.isChecked()){
                    rb_5_4.setTextColor(getColor(R.color.red));
                }
                break;

            case 6:
                if(!rb_6_1.isChecked()){
                    rb_6_1.setTextColor(getColor(R.color.green));
                }
                if(!rb_6_2.isChecked()){
                    rb_6_2.setTextColor(getColor(R.color.red));
                }
                if(!rb_6_3.isChecked()){
                    rb_6_3.setTextColor(getColor(R.color.red));
                }
                if(!rb_6_4.isChecked()){
                    rb_6_4.setTextColor(getColor(R.color.red));
                }
                break;

            case 7:
                if(!rb_7_1.isChecked()){
                    rb_7_1.setTextColor(getColor(R.color.red));
                }
                if(!rb_7_2.isChecked()){
                    rb_7_2.setTextColor(getColor(R.color.green));
                }
                if(!rb_7_3.isChecked()){
                    rb_7_3.setTextColor(getColor(R.color.red));
                }
                if(!rb_7_4.isChecked()){
                    rb_7_4.setTextColor(getColor(R.color.red));
                }
                break;

            case 8:
                if(!rb_8_1.isChecked()){
                    rb_8_1.setTextColor(getColor(R.color.red));
                }
                if(!rb_8_2.isChecked()){
                    rb_8_2.setTextColor(getColor(R.color.red));
                }
                if(!rb_8_3.isChecked()){
                    rb_8_3.setTextColor(getColor(R.color.red));
                }
                if(!rb_8_4.isChecked()){
                    rb_8_4.setTextColor(getColor(R.color.green));
                }
                break;

            case 9:
                if(!(i_9_1.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_9_1.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_9_2.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_9_2.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                if(!(i_9_3.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_9_3.setBackground(getResources().getDrawable(R.drawable.green_border));
                }
                if(!(i_9_4.getBackground() == getResources().getDrawable(R.drawable.yellow_border))) {
                    i_9_4.setBackground(getResources().getDrawable(R.drawable.red_border));
                }
                break;

            case 10:
                if(!rb_10_1.isChecked()){
                    rb_10_1.setTextColor(getColor(R.color.red));
                }
                if(!rb_10_2.isChecked()){
                    rb_10_2.setTextColor(getColor(R.color.green));
                }
                if(!rb_10_3.isChecked()){
                    rb_10_3.setTextColor(getColor(R.color.red));
                }
                if(!rb_10_4.isChecked()){
                    rb_10_4.setTextColor(getColor(R.color.red));
                }
                break;

            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.proff_activity_2);

        number = getIntent().getIntExtra("number",0);
        showQuestion();

        sp = new SoundPool(MAX_STREAMS, AudioManager.STREAM_MUSIC, 0);

        soundIdRight = sp.load(this,R.raw.right,1);
        soundIdWrong = sp.load(this,R.raw.wrong,1);
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    public void onClick(View view) {
        TextView points = findViewById(R.id.textView30);
        Button next = findViewById(R.id.proff_btn_next);
        Button commit = findViewById(R.id.proff_btn_commit);
        switch (view.getId()) {

            case R.id.proff_btn_next:
                if(number != 10) {
                    points.setText(String.valueOf(right_Ans));
                    number++;
                    showQuestion();
                    commit.setVisibility(View.VISIBLE);
                    next.setVisibility(View.INVISIBLE);
                }
                else{
                    points.setText(String.valueOf(right_Ans));
                    right_Ans_s = right_Ans.toString();
                    q_count_s = q_count.toString();
                    Intent proffIntent3 = new Intent(ProffActivity2.this, ProffActivity3.class);
                    proffIntent3.putExtra("right_Ans", right_Ans_s);
                    proffIntent3.putExtra("q_count",q_count_s);
                    startActivity(proffIntent3);
                    saveArray();
                    finish();
                }
                break;
/*
            case R.id.proff_btn_back:
                if (number == getIntent().getIntExtra("number",0)) {
                    finish();
                }
                else{
                    number--;
                    showQuestion();
                    break;
                }
                break;
*/
            case R.id.proff_btn_commit:
                if(checkQuestion()==1) {
                    commit.setVisibility(View.INVISIBLE);
                    next.setVisibility(View.VISIBLE);
                    showAnswers();
                }
                else
                    Toast.makeText(ProffActivity2.this, "Перед тем как продолжить, выберите ответ.", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void onClick_1(View view) {
        ImageView i_1_a_1 = findViewById(R.id.i_1_a_1);
        ImageView i_1_a_2 = findViewById(R.id.i_1_a_2);
        ImageView i_1_a_3 = findViewById(R.id.i_1_a_3);
        ImageView i_1_a_4 = findViewById(R.id.i_1_a_4);
        ImageView i_1_b_1 = findViewById(R.id.i_1_b_1);
        ImageView i_1_b_2 = findViewById(R.id.i_1_b_2);
        ImageView i_1_b_3 = findViewById(R.id.i_1_b_3);
        ImageView i_1_b_4 = findViewById(R.id.i_1_b_4);
        ImageView i_1_c_1 = findViewById(R.id.i_1_c_1);
        ImageView i_1_c_2 = findViewById(R.id.i_1_c_2);
        ImageView i_1_c_3 = findViewById(R.id.i_1_c_3);
        ImageView i_1_c_4 = findViewById(R.id.i_1_c_4);
        switch (view.getId()){
            case R.id.i_1_a_1:
                i_1_a_1.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_a_2.setBackground(null);
                i_1_a_3.setBackground(null);
                i_1_a_4.setBackground(null);
                check_1_a = 1;
                break;
            case R.id.i_1_a_2:
                i_1_a_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_a_1.setBackground(null);
                i_1_a_3.setBackground(null);
                i_1_a_4.setBackground(null);
                check_1_a = 1;
                break;
            case R.id.i_1_a_3:
                i_1_a_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_a_2.setBackground(null);
                i_1_a_1.setBackground(null);
                i_1_a_4.setBackground(null);
                check_1_a = 1;
                break;
            case R.id.i_1_a_4:
                i_1_a_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_a_2.setBackground(null);
                i_1_a_3.setBackground(null);
                i_1_a_1.setBackground(null);
                check_1_a = 2;
                break;
            case R.id.i_1_b_1:
                i_1_b_1.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_b_2.setBackground(null);
                i_1_b_3.setBackground(null);
                i_1_b_4.setBackground(null);
                check_1_b = 2;
                break;
            case R.id.i_1_b_2:
                i_1_b_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_b_1.setBackground(null);
                i_1_b_3.setBackground(null);
                i_1_b_4.setBackground(null);
                check_1_b = 1;
                break;
            case R.id.i_1_b_3:
                i_1_b_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_b_2.setBackground(null);
                i_1_b_1.setBackground(null);
                i_1_b_4.setBackground(null);
                check_1_b = 1;
                break;
            case R.id.i_1_b_4:
                i_1_b_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_b_2.setBackground(null);
                i_1_b_3.setBackground(null);
                i_1_b_1.setBackground(null);
                check_1_b = 1;
                break;
            case R.id.i_1_c_1:
                i_1_c_1.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_c_2.setBackground(null);
                i_1_c_3.setBackground(null);
                i_1_c_4.setBackground(null);
                check_1_c = 1;
                break;
            case R.id.i_1_c_2:
                i_1_c_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_c_1.setBackground(null);
                i_1_c_3.setBackground(null);
                i_1_c_4.setBackground(null);
                check_1_c = 1;
                break;
            case R.id.i_1_c_3:
                i_1_c_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_c_2.setBackground(null);
                i_1_c_1.setBackground(null);
                i_1_c_4.setBackground(null);
                check_1_c = 2;
                break;
            case R.id.i_1_c_4:
                i_1_c_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_c_2.setBackground(null);
                i_1_c_3.setBackground(null);
                i_1_c_1.setBackground(null);
                check_1_c = 1;
                break;
            default:
                break;
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void onClick_2(View view) {
        ImageView i_2_a_1 = findViewById(R.id.i_2_a_1);
        ImageView i_2_a_2 = findViewById(R.id.i_2_a_2);
        ImageView i_2_a_3 = findViewById(R.id.i_2_a_3);
        ImageView i_2_a_4 = findViewById(R.id.i_2_a_4);
        ImageView i_2_b_1 = findViewById(R.id.i_2_b_1);
        ImageView i_2_b_2 = findViewById(R.id.i_2_b_2);
        ImageView i_2_b_3 = findViewById(R.id.i_2_b_3);
        ImageView i_2_b_4 = findViewById(R.id.i_2_b_4);
        ImageView i_2_c_1 = findViewById(R.id.i_2_c_1);
        ImageView i_2_c_2 = findViewById(R.id.i_2_c_2);
        ImageView i_2_c_3 = findViewById(R.id.i_2_c_3);
        ImageView i_2_c_4 = findViewById(R.id.i_2_c_4);
        switch (view.getId()){
            case R.id.i_2_a_1:
                i_2_a_1.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_a_2.setBackground(null);
                i_2_a_3.setBackground(null);
                i_2_a_4.setBackground(null);
                check_2_a = 1;
                break;
            case R.id.i_2_a_2:
                i_2_a_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_a_1.setBackground(null);
                i_2_a_3.setBackground(null);
                i_2_a_4.setBackground(null);
                check_2_a = 2;
                break;
            case R.id.i_2_a_3:
                i_2_a_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_a_2.setBackground(null);
                i_2_a_1.setBackground(null);
                i_2_a_4.setBackground(null);
                check_2_a = 1;
                break;
            case R.id.i_2_a_4:
                i_2_a_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_a_2.setBackground(null);
                i_2_a_3.setBackground(null);
                i_2_a_1.setBackground(null);
                check_2_a = 1;
                break;
            case R.id.i_2_b_1:
                i_2_b_1.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_b_2.setBackground(null);
                i_2_b_3.setBackground(null);
                i_2_b_4.setBackground(null);
                check_2_b = 1;
                break;
            case R.id.i_2_b_2:
                i_2_b_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_b_1.setBackground(null);
                i_2_b_3.setBackground(null);
                i_2_b_4.setBackground(null);
                check_2_b = 1;
                break;
            case R.id.i_2_b_3:
                i_2_b_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_b_2.setBackground(null);
                i_2_b_1.setBackground(null);
                i_2_b_4.setBackground(null);
                check_2_b = 2;
                break;
            case R.id.i_2_b_4:
                i_2_b_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_b_2.setBackground(null);
                i_2_b_3.setBackground(null);
                i_2_b_1.setBackground(null);
                check_2_b = 1;
                break;
            case R.id.i_2_c_1:
                i_2_c_1.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_c_2.setBackground(null);
                i_2_c_3.setBackground(null);
                i_2_c_4.setBackground(null);
                check_2_c = 1;
                break;
            case R.id.i_2_c_2:
                i_2_c_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_c_1.setBackground(null);
                i_2_c_3.setBackground(null);
                i_2_c_4.setBackground(null);
                check_2_c = 1;
                break;
            case R.id.i_2_c_3:
                i_2_c_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_c_2.setBackground(null);
                i_2_c_1.setBackground(null);
                i_2_c_4.setBackground(null);
                check_2_c = 1;
                break;
            case R.id.i_2_c_4:
                i_2_c_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_c_2.setBackground(null);
                i_2_c_3.setBackground(null);
                i_2_c_1.setBackground(null);
                check_2_c = 2;
                break;
            default:
                break;
    }

}

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void onClick_3(View view) {
        ImageView i_3_1 = findViewById(R.id.i_3_1);
        ImageView i_3_2 = findViewById(R.id.i_3_2);
        ImageView i_3_3 = findViewById(R.id.i_3_3);
        ImageView i_3_4 = findViewById(R.id.i_3_4);
        ImageView i_3_5 = findViewById(R.id.i_3_5);
        switch (view.getId()){
            case R.id.i_3_1:
                i_3_1.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_3_2.setBackground(null);
                i_3_3.setBackground(null);
                i_3_4.setBackground(null);
                i_3_5.setBackground(null);
                check_3 = 1;
                break;
            case R.id.i_3_2:
                i_3_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_3_1.setBackground(null);
                i_3_3.setBackground(null);
                i_3_4.setBackground(null);
                i_3_5.setBackground(null);
                check_3 = 1;
                break;
            case R.id.i_3_3:
                i_3_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_3_2.setBackground(null);
                i_3_1.setBackground(null);
                i_3_4.setBackground(null);
                i_3_5.setBackground(null);
                check_3 = 1;
                break;
            case R.id.i_3_4:
                i_3_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_3_2.setBackground(null);
                i_3_3.setBackground(null);
                i_3_1.setBackground(null);
                i_3_5.setBackground(null);
                check_3 = 2;
                break;
            case R.id.i_3_5:
                i_3_5.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_3_2.setBackground(null);
                i_3_3.setBackground(null);
                i_3_4.setBackground(null);
                i_3_1.setBackground(null);
                check_3 = 1;
                break;
            default:
                break;
        }

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void onClick_9(View view) {
        ImageView i_9_1 = findViewById(R.id.i_9_1);
        ImageView i_9_2 = findViewById(R.id.i_9_2);
        ImageView i_9_3 = findViewById(R.id.i_9_3);
        ImageView i_9_4 = findViewById(R.id.i_9_4);
        switch (view.getId()){
            case R.id.i_9_1:
                i_9_1.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_9_2.setBackground(null);
                i_9_3.setBackground(null);
                i_9_4.setBackground(null);
                check_9 = 1;
                break;
            case R.id.i_9_2:
                i_9_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_9_1.setBackground(null);
                i_9_3.setBackground(null);
                i_9_4.setBackground(null);
                check_9 = 1;
                break;
            case R.id.i_9_3:
                i_9_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_9_2.setBackground(null);
                i_9_1.setBackground(null);
                i_9_4.setBackground(null);
                check_9 = 2;
                break;
            case R.id.i_9_4:
                i_9_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_9_2.setBackground(null);
                i_9_3.setBackground(null);
                i_9_1.setBackground(null);
                check_9 = 1;
                break;
            default:
                break;
        }

    }

    public void onClick_land(View view){
        RadioButton rb_q_4_1 = findViewById(R.id.radioButton_p_q_4_1);
        RadioButton rb_q_4_2 = findViewById(R.id.radioButton_p_q_4_2);
        RadioButton rb_q_4_3 = findViewById(R.id.radioButton_p_q_4_3);
        RadioButton rb_q_4_4 = findViewById(R.id.radioButton_p_q_4_4);
        RadioButton rb_q_5_1 = findViewById(R.id.radioButton_p_q_5_1);
        RadioButton rb_q_5_2 = findViewById(R.id.radioButton_p_q_5_2);
        RadioButton rb_q_5_3 = findViewById(R.id.radioButton_p_q_5_3);
        RadioButton rb_q_5_4 = findViewById(R.id.radioButton_p_q_5_4);
        RadioButton rb_q_6_1 = findViewById(R.id.radioButton_p_q_6_1);
        RadioButton rb_q_6_2 = findViewById(R.id.radioButton_p_q_6_2);
        RadioButton rb_q_6_3 = findViewById(R.id.radioButton_p_q_6_3);
        RadioButton rb_q_6_4 = findViewById(R.id.radioButton_p_q_6_4);
        RadioButton rb_q_7_1 = findViewById(R.id.radioButton_p_q_7_1);
        RadioButton rb_q_7_2 = findViewById(R.id.radioButton_p_q_7_2);
        RadioButton rb_q_7_3 = findViewById(R.id.radioButton_p_q_7_3);
        RadioButton rb_q_7_4 = findViewById(R.id.radioButton_p_q_7_4);
        RadioButton rb_q_8_1 = findViewById(R.id.radioButton_p_q_8_1);
        RadioButton rb_q_8_2 = findViewById(R.id.radioButton_p_q_8_2);
        RadioButton rb_q_8_3 = findViewById(R.id.radioButton_p_q_8_3);
        RadioButton rb_q_8_4 = findViewById(R.id.radioButton_p_q_8_4);
        RadioButton rb_q_10_1 = findViewById(R.id.radioButton_p_q_10_1);
        RadioButton rb_q_10_2 = findViewById(R.id.radioButton_p_q_10_2);
        RadioButton rb_q_10_3 = findViewById(R.id.radioButton_p_q_10_3);
        RadioButton rb_q_10_4 = findViewById(R.id.radioButton_p_q_10_4);
        switch (view.getId()){
            case R.id.radioButton_p_q_4_1:
                rb_q_4_1.setChecked(true);
                rb_q_4_2.setChecked(false);
                rb_q_4_3.setChecked(false);
                rb_q_4_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_4_2:
                rb_q_4_1.setChecked(false);
                rb_q_4_2.setChecked(true);
                rb_q_4_3.setChecked(false);
                rb_q_4_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_4_3:
                rb_q_4_1.setChecked(false);
                rb_q_4_2.setChecked(false);
                rb_q_4_3.setChecked(true);
                rb_q_4_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_4_4:
                rb_q_4_1.setChecked(false);
                rb_q_4_2.setChecked(false);
                rb_q_4_3.setChecked(false);
                rb_q_4_4.setChecked(true);
                break;
            case R.id.radioButton_p_q_5_1:
                rb_q_5_1.setChecked(true);
                rb_q_5_2.setChecked(false);
                rb_q_4_3.setChecked(false);
                rb_q_4_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_5_2:
                rb_q_5_1.setChecked(false);
                rb_q_5_2.setChecked(true);
                rb_q_5_3.setChecked(false);
                rb_q_5_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_5_3:
                rb_q_5_1.setChecked(false);
                rb_q_5_2.setChecked(false);
                rb_q_5_3.setChecked(true);
                rb_q_5_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_5_4:
                rb_q_5_1.setChecked(false);
                rb_q_5_2.setChecked(false);
                rb_q_5_3.setChecked(false);
                rb_q_5_4.setChecked(true);
                break;
            case R.id.radioButton_p_q_6_1:
                rb_q_6_1.setChecked(true);
                rb_q_6_2.setChecked(false);
                rb_q_6_3.setChecked(false);
                rb_q_6_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_6_2:
                rb_q_6_1.setChecked(false);
                rb_q_6_2.setChecked(true);
                rb_q_6_3.setChecked(false);
                rb_q_6_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_6_3:
                rb_q_6_1.setChecked(false);
                rb_q_6_2.setChecked(false);
                rb_q_6_3.setChecked(true);
                rb_q_6_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_6_4:
                rb_q_6_1.setChecked(false);
                rb_q_6_2.setChecked(false);
                rb_q_6_3.setChecked(false);
                rb_q_6_4.setChecked(true);
                break;
            case R.id.radioButton_p_q_7_1:
                rb_q_7_1.setChecked(true);
                rb_q_7_2.setChecked(false);
                rb_q_7_3.setChecked(false);
                rb_q_7_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_7_2:
                rb_q_7_1.setChecked(false);
                rb_q_7_2.setChecked(true);
                rb_q_7_3.setChecked(false);
                rb_q_7_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_7_3:
                rb_q_7_1.setChecked(false);
                rb_q_7_2.setChecked(false);
                rb_q_7_3.setChecked(true);
                rb_q_7_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_7_4:
                rb_q_7_1.setChecked(false);
                rb_q_7_2.setChecked(false);
                rb_q_7_3.setChecked(false);
                rb_q_7_4.setChecked(true);
                break;
            case R.id.radioButton_p_q_8_1:
                rb_q_8_1.setChecked(true);
                rb_q_8_2.setChecked(false);
                rb_q_8_3.setChecked(false);
                rb_q_8_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_8_2:
                rb_q_8_1.setChecked(false);
                rb_q_8_2.setChecked(true);
                rb_q_8_3.setChecked(false);
                rb_q_8_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_8_3:
                rb_q_8_1.setChecked(false);
                rb_q_8_2.setChecked(false);
                rb_q_8_3.setChecked(true);
                rb_q_8_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_8_4:
                rb_q_8_1.setChecked(false);
                rb_q_8_2.setChecked(false);
                rb_q_8_3.setChecked(false);
                rb_q_8_4.setChecked(true);
                break;
            case R.id.radioButton_p_q_10_1:
                rb_q_10_1.setChecked(true);
                rb_q_10_2.setChecked(false);
                rb_q_10_3.setChecked(false);
                rb_q_10_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_10_2:
                rb_q_10_1.setChecked(false);
                rb_q_10_2.setChecked(true);
                rb_q_10_3.setChecked(false);
                rb_q_10_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_10_3:
                rb_q_10_1.setChecked(false);
                rb_q_10_2.setChecked(false);
                rb_q_10_3.setChecked(true);
                rb_q_10_4.setChecked(false);
                break;
            case R.id.radioButton_p_q_10_4:
                rb_q_10_1.setChecked(false);
                rb_q_10_2.setChecked(false);
                rb_q_10_3.setChecked(false);
                rb_q_10_4.setChecked(true);
                break;
        }
    }

}
