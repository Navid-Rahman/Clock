package com.navid.clock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Countdown extends AppCompatActivity {
    private Button button;
    private static final long START_TIME_IN_MILLIS = 60000;

    private TextView TV;
    private Button BT_startButton;
    private Button BT_pauseButton;
    private Button BT_resetButton;

    private CountDownTimer countDownTimer;
    private boolean TimeRunning;
    private long TimeLeftInMillis = START_TIME_IN_MILLIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown);

        TV = findViewById(R.id.countdown_textview);
        BT_startButton = findViewById(R.id.startButton);
        BT_pauseButton = findViewById(R.id.pauseButton);
        BT_resetButton = findViewById(R.id.resetButton);

        BT_startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TimeRunning == false){
                    startTimer();
                }
            }
        });

        BT_pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TimeRunning == true){
                    pauseTimer();
                }
            }
        });

        BT_resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetTimer();
            }
        });


        button = (Button) findViewById(R.id.backCountdown);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openGoBackActivity();
            }
        });
    }

    public void openGoBackActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}