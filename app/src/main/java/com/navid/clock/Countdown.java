package com.navid.clock;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Countdown extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countdown);

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