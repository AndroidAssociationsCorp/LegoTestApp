package com.example.legotestapp;



import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;


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

    SharedPreferences sPref;


    private void showQuestion(){
        TextView textView = findViewById(R.id.textProff);
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

    void checkQuestion(){
        switch (number){
            case 1:
                if(check_q_1 != 'y'){
                    q_count++;
                    check_q_1 = 'y';
                }
                if(check_1_a == 1 && check_1_b == 1 &&
                        check_1_c == 1)
                {
                    if(right_Ans_1 != 'y') {
                        ProffActivity.completed[0] = 1;
                        right_Ans_1 = 'y';
                        right_Ans++;
                    }
                }
                else {
                    if(right_Ans_1 == 'y' ) {
                        ProffActivity.completed[0] = 0;
                        right_Ans--;
                        right_Ans_1 = 'n';
                    }
                    else{
                        ProffActivity.completed[0] = 0;
                    }
                }
                break;
            case 2:
                if(check_q_2 != 'y'){
                    q_count++;
                    check_q_2 = 'y';
                }
                if(check_2_a == 1 && check_2_b == 1 &&
                        check_2_c == 1)
                {
                    if(right_Ans_2 != 'y') {
                        ProffActivity.completed[1] = 1;
                        right_Ans_2 = 'y';
                        right_Ans++;
                    }
                }
                else {
                    if(right_Ans_2 == 'y') {
                        ProffActivity.completed[1] = 0;
                        right_Ans_2 = 'n';
                        right_Ans--;
                    }
                    else{
                        ProffActivity.completed[1] = 0;
                    }
                }
                break;
            case 3:
                if(check_q_3 != 'y'){
                    q_count++;
                    check_q_3 = 'y';
                }
                if(check_3 == 1)
                {
                    if(right_Ans_3 != 'y') {
                        ProffActivity.completed[2] = 1;
                        right_Ans_3 = 'y';
                        right_Ans++;
                    }
                }
                else {
                    if(right_Ans_3 == 'y') {
                        ProffActivity.completed[2] = 0;
                        right_Ans_3 = 'n';
                        right_Ans--;
                    }
                    else{
                        ProffActivity.completed[2] = 0;
                    }
                }
                break;
            case 4:
                if(check_q_4 != 'y'){
                    q_count++;
                    check_q_4 = 'y';
                }
                RadioButton rb_4 = findViewById(R.id.radioButton_p_q_4_3);
                if(rb_4.isChecked()){
                    if(right_Ans_4 != 'y') {
                        ProffActivity.completed[3] = 1;
                        right_Ans_4 = 'y';
                        right_Ans++;
                    }
                }
                else {
                    if(right_Ans_4 == 'y') {
                        ProffActivity.completed[3] = 0;
                        right_Ans_4 = 'n';
                        right_Ans--;
                    }
                    else{
                        ProffActivity.completed[3] = 0;
                    }
                }
                break;
            case 5:
                if(check_q_5 != 'y'){
                    q_count++;
                    check_q_5 = 'y';
                }
                RadioButton rb_5 = findViewById(R.id.radioButton_p_q_5_3);
                if(rb_5.isChecked()){
                    if(right_Ans_5 != 'y') {
                        ProffActivity.completed[4] = 1;
                        right_Ans_5 = 'y';
                        right_Ans++;
                    }
                }
                else {
                    if(right_Ans_5 == 'y') {
                        ProffActivity.completed[4] = 0;
                        right_Ans_5 = 'n';
                        right_Ans--;
                    }
                    else{
                        ProffActivity.completed[4] = 0;
                    }
                }
                break;
            case 6:
                if(check_q_6 != 'y'){
                    q_count++;
                    check_q_6 = 'y';
                }
                RadioButton rb_6 = findViewById(R.id.radioButton_p_q_6_1);
                if(rb_6.isChecked()){
                    if(right_Ans_6 != 'y') {
                        ProffActivity.completed[5] = 1;
                        right_Ans_6 = 'y';
                        right_Ans++;
                    }
                }
                else {
                    if(right_Ans_6 == 'y') {
                        ProffActivity.completed[5] = 0;
                        right_Ans_6 = 'n';
                        right_Ans--;
                    }
                    else{
                        ProffActivity.completed[5] = 0;
                    }
                }
                break;
            case 7:
                if(check_q_7 != 'y'){
                    q_count++;
                    check_q_7 = 'y';
                }
                RadioButton rb_7 = findViewById(R.id.radioButton_p_q_7_2);
                if(rb_7.isChecked()){
                    if(right_Ans_7 != 'y') {
                        ProffActivity.completed[6] = 1;
                        right_Ans_7 = 'y';
                        right_Ans++;
                    }
                }
                else {
                    if(right_Ans_7 == 'y') {
                        ProffActivity.completed[6] = 0;
                        right_Ans_7 = 'n';
                        right_Ans--;
                    }
                    else{
                            ProffActivity.completed[6] = 0;
                    }
                }
                break;
            case 8:
                if(check_q_8 != 'y'){
                    q_count++;
                    check_q_8 = 'y';
                }
                RadioButton rb_8 = findViewById(R.id.radioButton_p_q_8_4);
                if(rb_8.isChecked()){
                    if(right_Ans_8 != 'y') {
                        ProffActivity.completed[7] = 1;
                        right_Ans_8 = 'y';
                        right_Ans++;
                    }
                }
                else {
                    if(right_Ans_8 == 'y') {
                        ProffActivity.completed[7] = 0;
                        right_Ans_8 = 'n';
                        right_Ans--;
                    }
                    else{
                        ProffActivity.completed[7] = 0;
                    }
                }
                break;
            case 9:
                if(check_q_9 != 'y'){
                    q_count++;
                    check_q_9 = 'y';
                }
                if(check_9 == 1)
                {
                    if(right_Ans_9 != 'y') {
                        ProffActivity.completed[8] = 1;
                        right_Ans_9 = 'y';
                        right_Ans++;
                    }
                }
                else {
                    if(right_Ans_9 == 'y') {
                        ProffActivity.completed[8] = 0;
                        right_Ans_9 = 'n';
                        right_Ans--;
                    }
                    else{
                        ProffActivity.completed[8] = 0;
                    }
                }
                break;
            case 10:
                RadioButton rb_10 = findViewById(R.id.radioButton_p_q_10_2);
                if(check_q_10 != 'y'){
                    q_count++;
                    check_q_10 = 'y';
                }
                if(rb_10.isChecked()){
                    if(right_Ans_10 != 'y') {
                        ProffActivity.completed[9] = 1;
                        right_Ans_10 = 'y';
                        right_Ans++;
                    }
                }
                else {
                    if(right_Ans_10 == 'y') {
                        ProffActivity.completed[9] = 0;
                        right_Ans_10 = 'n';
                        right_Ans--;
                    }
                    else{
                        ProffActivity.completed[9] = 0;
                    }
                }
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.proff_activity_2);

        number = getIntent().getIntExtra("number",0);
        showQuestion();
    }

    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.proff_btn_next:
                if(number != 10) {
                    checkQuestion();
                    number++;
                    showQuestion();
                }
                else{
                    checkQuestion();
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
                check_1_a = 0;
                break;
            case R.id.i_1_a_2:
                i_1_a_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_a_1.setBackground(null);
                i_1_a_3.setBackground(null);
                i_1_a_4.setBackground(null);
                check_1_a = 0;
                break;
            case R.id.i_1_a_3:
                i_1_a_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_a_2.setBackground(null);
                i_1_a_1.setBackground(null);
                i_1_a_4.setBackground(null);
                check_1_a = 0;
                break;
            case R.id.i_1_a_4:
                i_1_a_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_a_2.setBackground(null);
                i_1_a_3.setBackground(null);
                i_1_a_1.setBackground(null);
                check_1_a = 1;
                break;
            case R.id.i_1_b_1:
                i_1_b_1.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_b_2.setBackground(null);
                i_1_b_3.setBackground(null);
                i_1_b_4.setBackground(null);
                check_1_b = 1;
                break;
            case R.id.i_1_b_2:
                i_1_b_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_b_1.setBackground(null);
                i_1_b_3.setBackground(null);
                i_1_b_4.setBackground(null);
                check_1_b = 0;
                break;
            case R.id.i_1_b_3:
                i_1_b_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_b_2.setBackground(null);
                i_1_b_1.setBackground(null);
                i_1_b_4.setBackground(null);
                check_1_b = 0;
                break;
            case R.id.i_1_b_4:
                i_1_b_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_b_2.setBackground(null);
                i_1_b_3.setBackground(null);
                i_1_b_1.setBackground(null);
                check_1_b = 0;
                break;
            case R.id.i_1_c_1:
                i_1_c_1.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_c_2.setBackground(null);
                i_1_c_3.setBackground(null);
                i_1_c_4.setBackground(null);
                check_1_c = 0;
                break;
            case R.id.i_1_c_2:
                i_1_c_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_c_1.setBackground(null);
                i_1_c_3.setBackground(null);
                i_1_c_4.setBackground(null);
                check_1_c = 0;
                break;
            case R.id.i_1_c_3:
                i_1_c_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_c_2.setBackground(null);
                i_1_c_1.setBackground(null);
                i_1_c_4.setBackground(null);
                check_1_c = 1;
                break;
            case R.id.i_1_c_4:
                i_1_c_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_1_c_2.setBackground(null);
                i_1_c_3.setBackground(null);
                i_1_c_1.setBackground(null);
                check_1_c = 0;
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
                check_2_a = 0;
                break;
            case R.id.i_2_a_2:
                i_2_a_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_a_1.setBackground(null);
                i_2_a_3.setBackground(null);
                i_2_a_4.setBackground(null);
                check_2_a = 1;
                break;
            case R.id.i_2_a_3:
                i_2_a_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_a_2.setBackground(null);
                i_2_a_1.setBackground(null);
                i_2_a_4.setBackground(null);
                check_2_a = 0;
                break;
            case R.id.i_2_a_4:
                i_2_a_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_a_2.setBackground(null);
                i_2_a_3.setBackground(null);
                i_2_a_1.setBackground(null);
                check_2_a = 0;
                break;
            case R.id.i_2_b_1:
                i_2_b_1.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_b_2.setBackground(null);
                i_2_b_3.setBackground(null);
                i_2_b_4.setBackground(null);
                check_2_b = 0;
                break;
            case R.id.i_2_b_2:
                i_2_b_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_b_1.setBackground(null);
                i_2_b_3.setBackground(null);
                i_2_b_4.setBackground(null);
                check_2_b = 0;
                break;
            case R.id.i_2_b_3:
                i_2_b_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_b_2.setBackground(null);
                i_2_b_1.setBackground(null);
                i_2_b_4.setBackground(null);
                check_2_b = 1;
                break;
            case R.id.i_2_b_4:
                i_2_b_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_b_2.setBackground(null);
                i_2_b_3.setBackground(null);
                i_2_b_1.setBackground(null);
                check_2_b = 0;
                break;
            case R.id.i_2_c_1:
                i_2_c_1.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_c_2.setBackground(null);
                i_2_c_3.setBackground(null);
                i_2_c_4.setBackground(null);
                check_2_c = 0;
                break;
            case R.id.i_2_c_2:
                i_2_c_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_c_1.setBackground(null);
                i_2_c_3.setBackground(null);
                i_2_c_4.setBackground(null);
                check_2_c = 0;
                break;
            case R.id.i_2_c_3:
                i_2_c_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_c_2.setBackground(null);
                i_2_c_1.setBackground(null);
                i_2_c_4.setBackground(null);
                check_2_c = 0;
                break;
            case R.id.i_2_c_4:
                i_2_c_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_2_c_2.setBackground(null);
                i_2_c_3.setBackground(null);
                i_2_c_1.setBackground(null);
                check_2_c = 1;
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
                check_3 = 0;
                break;
            case R.id.i_3_2:
                i_3_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_3_1.setBackground(null);
                i_3_3.setBackground(null);
                i_3_4.setBackground(null);
                i_3_5.setBackground(null);
                check_3 = 0;
                break;
            case R.id.i_3_3:
                i_3_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_3_2.setBackground(null);
                i_3_1.setBackground(null);
                i_3_4.setBackground(null);
                i_3_5.setBackground(null);
                check_3 = 0;
                break;
            case R.id.i_3_4:
                i_3_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_3_2.setBackground(null);
                i_3_3.setBackground(null);
                i_3_1.setBackground(null);
                i_3_5.setBackground(null);
                check_3 = 1;
                break;
            case R.id.i_3_5:
                i_3_5.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_3_2.setBackground(null);
                i_3_3.setBackground(null);
                i_3_4.setBackground(null);
                i_3_1.setBackground(null);
                check_3 = 0;
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
                check_9 = 0;
                break;
            case R.id.i_9_2:
                i_9_2.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_9_1.setBackground(null);
                i_9_3.setBackground(null);
                i_9_4.setBackground(null);
                check_9 = 0;
                break;
            case R.id.i_9_3:
                i_9_3.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_9_2.setBackground(null);
                i_9_1.setBackground(null);
                i_9_4.setBackground(null);
                check_9 = 1;
                break;
            case R.id.i_9_4:
                i_9_4.setBackground(getResources().getDrawable(R.drawable.yellow_border));
                i_9_2.setBackground(null);
                i_9_3.setBackground(null);
                i_9_1.setBackground(null);
                check_9 = 0;
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
