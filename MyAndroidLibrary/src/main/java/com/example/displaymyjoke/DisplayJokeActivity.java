package com.example.displaymyjoke;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        TextView jokeDisplay = findViewById(R.id.joke_display);
        Intent intent = getIntent();
        if (intent.hasExtra("randomJoke")) {
            jokeDisplay.setText(intent.getStringExtra("randomJoke"));
        }
    }
}