package com.navid.clock;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonCountdown;
    private Button buttonStopwatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCountdown = (Button) findViewById(R.id.countdownButton);
        buttonStopwatch = (Button) findViewById(R.id.stopwatchButton);

        buttonCountdown.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openCountdownActivity();
            }
        });

        buttonStopwatch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openStopwatchActivity();
            }
        });
    }
    public void openCountdownActivity(){
        Intent intent = new Intent(this, Countdown.class);
        startActivity(intent);
    }

    public void openStopwatchActivity(){
        Intent intent = new Intent(this, Stopwatch.class);
        startActivity(intent);
    }
}