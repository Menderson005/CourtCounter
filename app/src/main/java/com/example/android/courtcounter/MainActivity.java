package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        // Always call the superclass so it can save the view hierarchy state per Android Dev
        super.onSaveInstanceState(outState);

        //Save current info
        outState.putInt("saved_ScoreA", scoreTeamA);
        outState.putInt("saved_ScoreB", scoreTeamB);

    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can save the view hierarchy state per Android Dev
        super.onRestoreInstanceState(savedInstanceState);

        //Restore the scores
        scoreTeamA = savedInstanceState.getInt("saved_ScoreA");
        scoreTeamB = savedInstanceState.getInt("saved_ScoreB");

    }

    /**
     * Add 3 for Team A
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add 3 for Team B
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add 2 for Team A
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add 2 for Team B
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Add 1 for Team A
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add 1 for Team B
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset score to zero when game is over
     */
    public void reset(View v) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Subtract 1 for Team A
     */
    public void minusOneForTeamA(View v) {
        scoreTeamA = scoreTeamA - 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Subtract 1 for Team B
     */
    public void minusOneForTeamB(View v) {
        scoreTeamB = scoreTeamB - 1;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView;
        scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView;
        scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}