package com.example.legotestapp;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class ProffActivity3 extends AppCompatActivity {
 String right_Ans;
 String q_count;
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
