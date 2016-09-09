package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    int totalResultTeamA = 0;
    int totalResultTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addThreePointsTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoPointsTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }
    public void freePointsTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addThreePointsTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoPointsTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }
    public void freePointsTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void addFoulTeamA(View view){
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }
    public void addFoulTeamB(View view){
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }
    public void totalTeamA(View view){
        displayScoreTeamA(resultTeamA());
    }
    public void totalTeamB(View view){
        displayScoreTeamB(resultTeamB());
    }
    public void winner(View view){
        if(totalResultTeamA == totalResultTeamB){
            displayWinner("Draw");
        }else if (totalResultTeamA > totalResultTeamB){
            displayWinner("Team A");
        }
        else displayWinner("Team B");
    }

    public void btn_reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        totalResultTeamA = 0;
        totalResultTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
        displayScoreTeamA(totalResultTeamA);
        displayScoreTeamB(totalResultTeamB);
    }

    private int resultTeamA(){
        totalResultTeamA =  scoreTeamA - foulTeamA ;
        return totalResultTeamA;
    }
    private int resultTeamB(){
        totalResultTeamB = scoreTeamB - foulTeamB ;
        return totalResultTeamB;
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Foul for Team A.
     */
    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given Foul for Team B.
     */
    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays total score for team a.
     */
    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.display_TotalTeamA);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays total score for team b.
     */
    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.display_TotalTeamB);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays winner.
     */
    public void displayWinner(String team) {
        TextView scoreView = (TextView) findViewById(R.id.winner_name);
        scoreView.setText(String.valueOf(team));
    }

}
