package com.example.thenamequizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exploreDatabase(View View) {
        Intent i = new Intent(this, DatabaseActivity.class);

        startActivity(i);
    }

    public void startQuiz(View View) {
        Intent i = new Intent(this, QuizActivity.class);

        startActivity(i);
    }
}