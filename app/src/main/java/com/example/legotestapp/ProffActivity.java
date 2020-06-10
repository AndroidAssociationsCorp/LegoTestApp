package com.example.legotestapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class ProffActivity extends AppCompatActivity {

    static Character close_p = 'n';
    static Integer[] completed = new Integer[10];
    Integer right_Ans = 0;

    SharedPreferences sPref;

    void loadArray(){
        sPref = getSharedPreferences("array",MODE_PRIVATE);
       /* for(int i = 0; i < completed.length;i++){
            if(sPref.contains("completed_"+i))
            completed[i] = sPref.getInt("completed_"+i,0);
        }*/
        right_Ans = sPref.getInt("points",0);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.proff_activity);
        for(int i = 0; i < 10; i++){
            completed[i] = 0;
        }
        loadArray();
    }


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onStart() {
        super.onStart();
        loadArray();
        checkArray();
        if(close_p == 'y') {
            SecondActivity.close_s = 'y';
            finish();
            close_p = 'n';
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    void checkArray(){
        TextView n1 = findViewById(R.id.textView1);
        TextView n2 = findViewById(R.id.textView2);
        TextView n3 = findViewById(R.id.textView3);
        TextView n4 = findViewById(R.id.textView4);
        TextView n5 = findViewById(R.id.textView5);
        TextView n6 = findViewById(R.id.textView6);
        TextView n7 = findViewById(R.id.textView7);
        TextView n8 = findViewById(R.id.textView8);
        TextView n9 = findViewById(R.id.textView9);
        TextView n10 = findViewById(R.id.textView10);
        TextView points = findViewById(R.id.textView38);
        points.setText(String.valueOf(right_Ans));
        for(int i = 0; i < 10; i++){
            switch (i){
                case 0:
                    if(ProffActivity.completed[i] == 1)
                        n1.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
                    else
                        n1.setBackground(getResources().getDrawable(R.drawable.btn_press));
                    break;
                case 1:
                    if(ProffActivity.completed[i] == 1)
                        n2.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
                    else
                        n2.setBackground(getResources().getDrawable(R.drawable.btn_press));
                    break;
                case 2:
                    if(ProffActivity.completed[i] == 1)
                        n3.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
                    else
                        n3.setBackground(getResources().getDrawable(R.drawable.btn_press));
                    break;
                case 3:
                    if(ProffActivity.completed[i] == 1)
                        n4.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
                    else
                        n4.setBackground(getResources().getDrawable(R.drawable.btn_press));
                    break;
                case 4:
                    if(ProffActivity.completed[i] == 1)
                        n5.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
                    else
                        n5.setBackground(getResources().getDrawable(R.drawable.btn_press));
                    break;
                case 5:
                    if(ProffActivity.completed[i] == 1)
                        n6.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
                    else
                        n6.setBackground(getResources().getDrawable(R.drawable.btn_press));
                    break;
                case 6:
                    if(ProffActivity.completed[i] == 1)
                        n7.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
                    else
                        n7.setBackground(getResources().getDrawable(R.drawable.btn_press));
                    break;
                case 7:
                    if(ProffActivity.completed[i] == 1)
                        n8.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
                    else
                        n8.setBackground(getResources().getDrawable(R.drawable.btn_press));
                    break;
                case 8:
                    if(ProffActivity.completed[i] == 1)
                        n9.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
                    else
                        n9.setBackground(getResources().getDrawable(R.drawable.btn_press));
                    break;
                case 9:
                    if(ProffActivity.completed[i] == 1)
                        n10.setBackground(getResources().getDrawable(R.drawable.btn_press_success));
                    else
                        n10.setBackground(getResources().getDrawable(R.drawable.btn_press));
                    break;
                default:
                    break;
            }
        }
    }

    private Integer number = 0;
    public void onClick2(View view) {
        switch (view.getId()) {
            case R.id.textView1:
                number=1;
                openIntent();
                break;
            case R.id.textView2:
                number=2;
                openIntent();
                break;
            case R.id.textView3:
                number=3;
                openIntent();
                break;
            case R.id.textView4:
                number=4;
                openIntent();
                break;
            case R.id.textView5:
                number=5;
                openIntent();
                break;
            case R.id.textView6:
                number=6;
                openIntent();
                break;
            case R.id.textView7:
                number=7;
                openIntent();
                break;
            case R.id.textView8:
                number=8;
                openIntent();
                break;
            case R.id.textView9:
                number=9;
                openIntent();
                break;
            case R.id.textView10:
                number=10;
                openIntent();
                break;
            case R.id.btn_back:
                finish();
                break;
            case R.id.btn_reset:
                AlertDialog.Builder ad;
                Context context;
                context = ProffActivity.this;
                ad = new AlertDialog.Builder(context);
                ad.setTitle("Сброс");
                ad.setMessage("Вы точно хотите сбросить ответы?");
                ad.setPositiveButton("Да",new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int arg1) {
                        sPref = getSharedPreferences("array",MODE_PRIVATE);
                        SharedPreferences.Editor ed = sPref.edit();
                        for(int i = 0; i < completed.length;i++){
                            ed.putInt("completed_"+i, 0);
                            ed.apply();
                        }
                        finish();
                    }
                });
                ad.setNegativeButton("Нет", new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                ad.show();
                break;
            default:
                break;
        }
    }

    void openIntent(){
        Intent proffIntent2 = new Intent(ProffActivity.this, ProffActivity2.class);
        proffIntent2.putExtra("number", number);
        startActivity(proffIntent2);
    }
}

