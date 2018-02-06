package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }

    public void quizResults(View view) {
        int score = 0;
        RadioButton Goshcoin = (RadioButton) findViewById(R.id.Goshcoin);
        boolean checked = Goshcoin.isChecked();
        if (Goshcoin.isChecked()) {
            score = score + 1;
        }

        EditText Blockchain = (EditText) findViewById(R.id.Blockchain);
        String answerBlockchain = Blockchain.getText().toString().toLowerCase().trim();
        if (answerBlockchain.equals("blockchain")) {
            score = score + 1;
        }

        CheckBox wedgeCheckbox = (CheckBox) findViewById(R.id.Wedge);
        boolean AnswerIsWedge = wedgeCheckbox.isChecked();
        CheckBox CupAndHandleCheckBox = (CheckBox) findViewById(R.id.CupAndHandle);
        boolean answerIsCupAndHandle = CupAndHandleCheckBox.isChecked();
        CheckBox potCheckbox = (CheckBox) findViewById(R.id.Pot);
        CheckBox TrippleBottomCheckBox = (CheckBox) findViewById(R.id.TrippleBottom);
        if (wedgeCheckbox.isChecked() && CupAndHandleCheckBox.isChecked() && !TrippleBottomCheckBox.isChecked() && !potCheckbox.isChecked()) {
            score = score + 1;
        }

        EditText Bitcoin = (EditText) findViewById(R.id.Bitcoin);
        String answerBitcoin = Bitcoin.getText().toString().toLowerCase().trim();
        if (answerBitcoin.equals("bitcoin") || answerBitcoin.equals("btc")) {
            score = score + 1;
        }


        CheckBox etherumCheckbox = (CheckBox) findViewById(R.id.EtherumLogo);
        CheckBox vergeCheckbox = (CheckBox) findViewById(R.id.Verge);
        CheckBox nemCheckbox = (CheckBox) findViewById(R.id.Nem);
        CheckBox siaCheckbox = (CheckBox) findViewById(R.id.Sia);
        if (etherumCheckbox.isChecked() && !vergeCheckbox.isChecked() && !nemCheckbox.isChecked() && !siaCheckbox.isChecked()) {
            score = score + 1;
        }

        RadioButton Marketcap = (RadioButton) findViewById(R.id.marketCap);
        boolean Billion = Goshcoin.isChecked();
        if (Marketcap.isChecked()) {
            score = score + 1;
        }

        displayScore(score);
    }

    private void displayScore(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.score);
        scoreTextView.setText("" + number);
        Context context = getApplicationContext();
        CharSequence text = "Your score is: " + number + " out of 6!";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        //displayScore(score);

    }


}
