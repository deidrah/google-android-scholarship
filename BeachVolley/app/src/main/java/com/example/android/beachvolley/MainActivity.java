package com.example.android.beachvolley;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int FirstTeamScore = 0;
    int SecondTeamScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreFirstTeam(FirstTeamScore);
        displayScoreSecondTeam(SecondTeamScore);
    }

    public void reset(View v) {
        FirstTeamScore = 0;
        SecondTeamScore = 0;
        displayScoreFirstTeam(FirstTeamScore);
        displayScoreSecondTeam(SecondTeamScore);
    }


    public void addOneFoulPointForSecondTeam(View v) {
        SecondTeamScore = SecondTeamScore + 1;
        displayScoreSecondTeam(SecondTeamScore);
    }

    public void addOnePointForFirstTeam(View v) {
        FirstTeamScore = FirstTeamScore + 1;
        displayScoreFirstTeam(FirstTeamScore);
    }

    public void addOneFoulPointForFirstTeam(View v) {
        FirstTeamScore = FirstTeamScore + 1;
        displayScoreFirstTeam(FirstTeamScore);
    }

    public void addOnePointForSecondTeam(View v) {
        SecondTeamScore = SecondTeamScore + 1;
        displayScoreSecondTeam(SecondTeamScore);
    }

    /**
     * Displays the given score for the First Team.
     */
    public void displayScoreFirstTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.first_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for the Second Team.
     */
    public void displayScoreSecondTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.second_team_score);
        scoreView.setText(String.valueOf(score));
    }

}