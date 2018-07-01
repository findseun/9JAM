package com.example.android.a9jamz;


import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // Media Player in global scope
    MediaPlayer questionMusic1 = new MediaPlayer();
    MediaPlayer questionMusic2 = new MediaPlayer();
    MediaPlayer questionMusic3 = new MediaPlayer();
    MediaPlayer questionMusic6 = new MediaPlayer();


    //String variables with global scope to store the answers given
    String answerQuestion1 = "no answer",
            answerQuestion2 = "no answer",
            answerQuestion3 = "no answer",
            answerQuestion4 = "no answer",
            righOrWrongAnswerQ5 = "",
            answerQuestion6 = "no answer";

    //Boolean for Question 5
    Boolean answerQuestion5a, answerQuestion5b, answerQuestion5c, answerQuestion5d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String appIntroText;
        appIntroText = "Welcome to Nigeria's #1 Music Quiz App\n\n";
        appIntroText = appIntroText + "There are 4 Questions listed below to test your knowledge\n\n";
        appIntroText = appIntroText + "Click the Submit Answers Button at the bottom when you are done \n\n";
        appIntroText = appIntroText + "Know your Naija Artists and Music? \n\n";
        appIntroText = appIntroText + "Fancy yourself as an expert?.... Well, let's see! \n\n";
        appIntroText = appIntroText + "Good Luck!... \n";

        TextView appIntro = findViewById(R.id.intro_text);

        appIntro.setText(appIntroText);


    }


    // Stop Button
    public void stopButton(View v) {

        TextView status1 = findViewById(R.id.question_one_play_status);
        TextView status2 = findViewById(R.id.question_two_play_status);
        TextView status3 = findViewById(R.id.question_three_play_status);
        TextView status6 = findViewById(R.id.question_six_play_status);

        // play music based on the button clicked
        switch (v.getId()) {


            case (R.id.question_one_stop_button):


                if (questionMusic1.isPlaying()) {

                    questionMusic1.stop();
                    status1.setText("play/stop");

                }


            case (R.id.question_two_stop_button):


                if (questionMusic2.isPlaying()) {

                    questionMusic2.stop();
                    status2.setText("play/stop");
                }


            case (R.id.question_three_stop_button):


                if (questionMusic3.isPlaying()) {

                    questionMusic3.stop();
                    status3.setText("play/stop");


                }


            case (R.id.question_six_stop_button):


                if (questionMusic6.isPlaying()) {

                    questionMusic6.stop();
                    status6.setText("play/stop");

                }


        }


    }

    /**
     * THis method is called when the Play Button is clicked for any Question
     *
     * @param v is the Button view that is passed in for the PLay music button on the question
     */

    public void playButton(View v) {

        TextView status1 = findViewById(R.id.question_one_play_status);
        TextView status2 = findViewById(R.id.question_two_play_status);
        TextView status3 = findViewById(R.id.question_three_play_status);
        TextView status6 = findViewById(R.id.question_six_play_status);

        // play music based on the button clicked
        switch (v.getId()) {


            case (R.id.question_one_play_button):


                if (!questionMusic1.isPlaying()) {
                    questionMusic2.stop();
                    questionMusic3.stop();
                    questionMusic6.stop();


                    status2.setText("play/stop");
                    status3.setText("play/stop");
                    status6.setText("play/stop");
                    status1.setText("...Now Playing");

                    questionMusic1 = MediaPlayer.create(MainActivity.this, R.raw.question1);

                    questionMusic1.start();

                }

                break;

            case (R.id.question_two_play_button):


                if (!questionMusic2.isPlaying()) {

                    questionMusic1.stop();
                    questionMusic3.stop();
                    questionMusic6.stop();

                    status1.setText("play/stop");
                    status3.setText("play/stop");
                    status6.setText("play/stop");
                    status2.setText("...Now Playing");

                    questionMusic2 = MediaPlayer.create(MainActivity.this, R.raw.question2);

                    questionMusic2.start();

                }

                break;

            case (R.id.question_three_play_button):


                if (!questionMusic3.isPlaying()) {

                    questionMusic1.stop();
                    questionMusic2.stop();
                    questionMusic6.stop();

                    status1.setText("play/stop");
                    status2.setText("play/stop");
                    status6.setText("play/stop");
                    status3.setText("...Now Playing");

                    questionMusic3 = MediaPlayer.create(MainActivity.this, R.raw.question3);

                    questionMusic3.start();

                }


                break;

            case (R.id.question_six_play_button):


                if (!questionMusic6.isPlaying()) {
                    questionMusic1.stop();
                    questionMusic2.stop();
                    questionMusic3.stop();

                    status1.setText("play/stop");
                    status2.setText("play/stop");
                    status3.setText("play/stop");
                    status6.setText("...Now Playing");

                    questionMusic6 = MediaPlayer.create(MainActivity.this, R.raw.question6);

                    questionMusic6.start();

                }


                break;

        }


    }


    /**
     * THis method is called when Question 1 is answered
     *
     * @param view is the radio button selected for question 1
     */

    public void submitQuestion1Answer(View view) {

        //Declare Radio Button Objects for Question 1 Answer Options

        RadioButton option1Q1 = findViewById(R.id.beautiful_nubia_1);
        RadioButton option2Q1 = findViewById(R.id.beautiful_nubia_2);
        RadioButton option3Q1 = findViewById(R.id.beautiful_nubia_3);
        RadioButton option4Q1 = findViewById(R.id.beautiful_nubia_4);

        //Conditional block for answer selected
        if (option1Q1.isChecked()) {
            answerQuestion1 = option1Q1.getText().toString(); // global variable answerQuestion1 assigned text value of answer selected

        } else if (option2Q1.isChecked()) {
            answerQuestion1 = option2Q1.getText().toString(); // global variable answerQuestion1 assigned text value of answer selected

        } else if (option3Q1.isChecked()) {
            answerQuestion1 = option3Q1.getText().toString(); // global variable answerQuestion1 assigned text value of answer selected

        } else if (option4Q1.isChecked()) {
            answerQuestion1 = option4Q1.getText().toString(); // global variable answerQuestion1 assigned text value of answer selected
        }

    }


    /**
     * This method is called when Question 2 is answered
     *
     * @param view is the radio button selected for question 2
     */

    public void submitQuestion2Answer(View view) {

        //Declare Radio Button Objects for Question 2 Answer Options

        RadioButton option1Q2 = findViewById(R.id.sound_sultan_1);
        RadioButton option2Q2 = findViewById(R.id.sound_sultan_2);
        RadioButton option3Q2 = findViewById(R.id.sound_sultan_3);
        RadioButton option4Q2 = findViewById(R.id.sound_sultan_4);

        //Conditional block for answer selected
        if (option1Q2.isChecked()) {
            answerQuestion2 = option1Q2.getText().toString(); // global variable answerQuestion2 assigned text value of answer selected

        } else if (option2Q2.isChecked()) {
            answerQuestion2 = option2Q2.getText().toString(); // global variable answerQuestion2 assigned text value of answer selected

        } else if (option3Q2.isChecked()) {
            answerQuestion2 = option3Q2.getText().toString(); // global variable answerQuestion2 assigned text value of answer selected

        } else if (option4Q2.isChecked()) {
            answerQuestion2 = option4Q2.getText().toString(); // global variable answerQuestion2 assigned text value of answer selected
        }

    }

    /**
     * This method is called when Question 3 is answered
     *
     * @param view is the radio button selected for question 3
     */

    public void submitQuestion3Answer(View view) {

        //Declare Radio Button Objects for Question 3 Answer Options

        RadioButton option1Q3 = findViewById(R.id.music3Option1);
        RadioButton option2Q3 = findViewById(R.id.music3Option2);
        RadioButton option3Q3 = findViewById(R.id.music3Option3);
        RadioButton option4Q3 = findViewById(R.id.music3Option4);

        if (option1Q3.isChecked()) {
            answerQuestion3 = option1Q3.getText().toString();

        } else if (option2Q3.isChecked()) {
            answerQuestion3 = option2Q3.getText().toString();

        } else if (option3Q3.isChecked()) {
            answerQuestion3 = option3Q3.getText().toString();

        } else if (option4Q3.isChecked()) {
            answerQuestion3 = option4Q3.getText().toString();
        }

    }


    private void setEditTextAnswers() {


        //Create EditText Objects for Questions 4
        EditText answerQ4 = findViewById(R.id.question_four_answer);


        //get the text entered for questions 4
        answerQuestion4 = answerQ4.getText().toString().toLowerCase();
    }

    /**
     * Question 5 CheckBoxes
     */

    private void setCheckBoxAnswers() {

        //Question 5 Answer Options CheckBoxes

        CheckBox Q5option1 = findViewById(R.id.music5Option1);
        CheckBox Q5option2 = findViewById(R.id.music5Option2);
        CheckBox Q5option3 = findViewById(R.id.music5Option3);
        CheckBox Q5option4 = findViewById(R.id.music5Option4);


        answerQuestion5a = Q5option1.isChecked();

        answerQuestion5b = Q5option2.isChecked();

        answerQuestion5c = Q5option3.isChecked();

        answerQuestion5d = Q5option4.isChecked();


    }

    /**
     * This method is called when Question 6 is answered
     */

    public void submitQuestion6Answer(View view) {

        //Declare Radio Button Objects for Question 6 Answer Options

        RadioButton option1Q4 = findViewById(R.id.music6Option1);
        RadioButton option2Q4 = findViewById(R.id.music6Option2);
        RadioButton option3Q4 = findViewById(R.id.music6Option3);
        RadioButton option4Q4 = findViewById(R.id.music6Option4);

        //Conditional block for answer selected
        if (option1Q4.isChecked()) {
            answerQuestion4 = option1Q4.getText().toString();

        } else if (option2Q4.isChecked()) {
            answerQuestion4 = option2Q4.getText().toString();

        } else if (option3Q4.isChecked()) {
            answerQuestion4 = option3Q4.getText().toString();

        } else if (option4Q4.isChecked()) {
            answerQuestion4 = option4Q4.getText().toString();
        }

    }

    /**
     * This method calculates the number of correct answers
     */

    public int calculateCorrectAnswers() {

        int numberOfCorrectAnswers = 0;

        if (answerQuestion1.equals("Beautiful Nubia ; Segun Akinlolu")) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        } else answerQuestion1 = "Incorrect Answer Provided";


        if (answerQuestion2.equals("Sound Sultan")) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        } else answerQuestion2 = "Incorrect Answer Provided";

        if (answerQuestion3.equals("Ojuelegba")) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        } else answerQuestion3 = "Incorrect Answer Provided";

        if (answerQuestion4.equals("holla at your boy")) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        } else answerQuestion4 = "Incorrect Answer Provided";

        if (answerQuestion5a & answerQuestion5b & answerQuestion5c & !answerQuestion5d) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
            righOrWrongAnswerQ5 = "Kiss Daniel and Simi";

        } else righOrWrongAnswerQ5 = "Incorrect Answer Provided";

        if (answerQuestion6.equals("Falz")) {

            numberOfCorrectAnswers = numberOfCorrectAnswers + 1;
        } else answerQuestion6 = "Incorrect Answer Provided";

        return numberOfCorrectAnswers;

    }

    // Go to Result Activity
    public void submitAllAnswers(View v) {

        setEditTextAnswers();
        setCheckBoxAnswers();

        Intent result = new Intent(getApplicationContext(), ResultActivity.class);

        EditText user = findViewById(R.id.username);
        String getName = user.getText().toString();

        EditText emailAdd = findViewById(R.id.email);
        String getMail = emailAdd.getText().toString();


        int correctAnswerTally = calculateCorrectAnswers();

        result.putExtra("yourName", getName);
        result.putExtra("eMail", getMail);
        result.putExtra("score", correctAnswerTally);

        startActivity(result);


    }
}
