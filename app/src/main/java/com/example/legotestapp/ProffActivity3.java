package com.example.legotestapp;


import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class ProffActivity3 extends AppCompatActivity {
 String right_Ans;
 String q_count;

 static Integer[] completed = new Integer[10];

    SharedPreferences sPref;

    void loadArray(){
        sPref = getSharedPreferences("array",MODE_PRIVATE);
        for(int i = 0; i < completed.length;i++){
            if(sPref.contains("completed_"+i))
                completed[i] = sPref.getInt("completed_"+i,0);
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

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.proff_activity_3);

        TextView textView1 = findViewById(R.id.p_result_count);
        right_Ans = getIntent().getStringExtra("right_Ans");
        textView1.setText(right_Ans);
        TextView textView2 = findViewById(R.id.p_q_count);
        q_count = getIntent().getStringExtra("q_count");
        textView2.setText(q_count);
        for(int i = 0; i < 10; i++){
            completed[i] = 0;
        }
        loadArray();
        checkArray();
    }

    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button_p_to_q:
                finish();
                break;
            case R.id.button_p_to_m:
                ProffActivity.close_p = 'y';
                finish();
                break;
        }
    }
}
