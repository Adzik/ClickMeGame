package com.example.clickmegame;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private int score;
    final int min = 20;
    final int max = 900;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onStartClick(View view){

        View hit = findViewById(R.id.hitme);
        hit.setVisibility(View.VISIBLE);

        CountDownTimer timer = new CountDownTimer(30000, 1000) {

            TextView timerField = findViewById(R.id.timer);
            View hit = findViewById(R.id.hitme);
            View again  = findViewById(R.id.again);
            public void onTick(long timeUntilFinished) {
                timerField.setText("Time: " + timeUntilFinished / 1000);
            }

            public void onFinish() {
                timerField.setText("Time's Up! Play Again!");
                hit.setVisibility(View.GONE);
                again.setVisibility(View.VISIBLE);
            }
        }.start();

        View st = findViewById(R.id.start);
        st.setVisibility(View.GONE);

        Random r = new Random();

        int x = r.nextInt((max - min) + 1) + min;
        int y = r.nextInt((max - min) + 1) + min;

        hit.setX(x);
        hit.setY(y);

    }
    public void onAgainClick(View view){
        score =0;

        TextView sc =(findViewById(R.id.score));
        sc.setText("Score "+ score);

        View hit = findViewById(R.id.hitme);
        hit.setVisibility(View.VISIBLE);

        CountDownTimer timer = new CountDownTimer(30000, 1000) {

            TextView timerField = findViewById(R.id.timer);
            View hit = findViewById(R.id.hitme);
            View again = findViewById(R.id.again);
            public void onTick(long timeUntilFinished) {
                timerField.setText("Time: " + timeUntilFinished / 1000);
            }

            public void onFinish() {
                timerField.setText("Time's Up! Play Again!");
                hit.setVisibility(View.GONE);
                again.setVisibility(View.VISIBLE);
            }
        }.start();

        View again = findViewById(R.id.again);
        again.setVisibility(View.GONE);

        Random r = new Random();

        int x = r.nextInt((max - min) + 1) + min;
        int y = r.nextInt((max - min) + 1) + min;


        hit.setX(x);
        hit.setY(y);

    }


    public void onTapClick(View view){
        View hit = findViewById(R.id.hitme);

        score++;
        TextView sc = (findViewById(R.id.score));
        sc.setText("Score: "+ score);

        Random r = new Random();
        final int min = 20;
        final int max = 900;

        int x = r.nextInt((max - min) + 1) + min;
        int y = r.nextInt((max - min) + 1) + min;

        hit.setX(x);
        hit.setY(y);

    }
}
