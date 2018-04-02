package com.example.test.quizapp;
// This file is created by Yash Soni 

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // This method checks all the answers.
    public void submitAnswer(View view) {

        RadioButton rightAnswer = findViewById(R.id.radioButtonq1);
        if (rightAnswer.isChecked()) {
            score += 1;
        }

        RadioButton rightAnswer3 = findViewById(R.id.radioButton4q3);
        if (rightAnswer3.isChecked()) {
            score += 1;
        }

        RadioButton rightAnswer6 = findViewById(R.id.radioButtonq6);
        if (rightAnswer6.isChecked()) {
            score += 1;
        }

        EditText answerQuestionTwo = findViewById(R.id.q2userans);
        String answerOfQuestionTwo = answerQuestionTwo.getText().toString();
        if ("Visual Basic".equals(answerOfQuestionTwo)) {
            score += 1;
        }

        EditText answerQuestionfive = findViewById(R.id.q5userans);
        String answerOfQuestionfive = answerQuestionfive.getText().toString();
        if ("Extends".equals(answerOfQuestionfive)) {
            score += 1;
        }

        EditText answerQuestionSeven = findViewById(R.id.q7userans);
        String answerOfQuestionSeven = answerQuestionSeven.getText().toString();
        if ("32 Bit".equals(answerOfQuestionSeven)) {
            score += 1;
        }

        EditText answerQuestionTen = findViewById(R.id.q10userans);
        String answerOfQuestionTen = answerQuestionTen.getText().toString();
        if ("JetBrains".equals(answerOfQuestionTen)) {
            score += 1;
        }

        CheckBox checkbox1q4 = findViewById(R.id.checkbox1q4);
        CheckBox checkbox2q4 = findViewById(R.id.checkbox2q4);
        CheckBox checkbox3q4 = findViewById(R.id.checkbox3q4);

        if (checkbox1q4.isChecked() && checkbox2q4.isChecked() && checkbox3q4.isChecked()) {
            score += 1;
        }


        CheckBox checkbox1q8 = findViewById(R.id.checkbox1q8);
        CheckBox checkbox2q8 = findViewById(R.id.checkbox2q8);
        CheckBox checkbox3q8 = findViewById(R.id.checkbox3q8);

        if (checkbox1q8.isChecked() && checkbox2q8.isChecked() && checkbox3q8.isChecked()) {
            score += 1;
        }


        CheckBox checkbox1q9 = findViewById(R.id.checkbox1q9);
        CheckBox checkbox2q9 = findViewById(R.id.checkbox2q9);
        CheckBox checkbox3q9 = findViewById(R.id.checkbox3q9);

        if (checkbox1q9.isChecked() && checkbox2q9.isChecked() && checkbox3q9.isChecked()) {
            score += 1;
        }
        String message="Hey your Score is "+score+" out of 10";
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

    }
}
