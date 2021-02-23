package com.example.flashcard2;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView question = findViewById(R.id.question);
        TextView answer = findViewById(R.id.answer);

        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question.setVisibility(View.INVISIBLE);
                answer.setVisibility(View.VISIBLE);
            }
        });
    }
}