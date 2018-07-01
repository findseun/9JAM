package com.example.android.a9jamz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private int score;
    private String yourName;
    private String eMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //Get Intent that started this activity
        Bundle extras = getIntent().getExtras();

        if(extras != null) {
            yourName = extras.getString("yourName");
            eMail = extras.getString("eMail");
            score = extras.getInt("score");
        }

        String yourResultText;
        yourResultText = "Hey, " + yourName + " Congratulations on Completing the Quiz\n\n";
        yourResultText = yourResultText + "You score: " + score + " / 4 correct answers\n\n";
        yourResultText = yourResultText + "We're expecting feedback in a mail from You@ " + eMail + " \n\n";

        TextView yourResult = findViewById(R.id.result);
        yourResult.setText(yourResultText);

    }
}


