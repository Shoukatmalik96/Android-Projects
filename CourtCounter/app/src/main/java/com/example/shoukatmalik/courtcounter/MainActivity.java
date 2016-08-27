package com.example.shoukatmalik.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


        int TemAScore = 0;
        int TemBScore = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }

        /*
        * Team A Code Started
        * */
        public void TeamAOneScore(View view) {

            TemAScore = TemAScore + 1;
            displayForTeamA(TemAScore);
        }

        public void TeamAScoreTwo(View view) {
            TemAScore = TemAScore + 2;
            displayForTeamA(TemAScore);
        }

        public void TeamAScoreThree(View view) {
            TemAScore = TemAScore + 3;
            displayForTeamA(TemAScore);
        }

        private void displayForTeamA(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_A_Score);
            scoreView.setText("" + score);
        }
/*
* Team A Code finish
* */

        /*
        * Team B Code Started
        * */
        public void TeamBOneScore(View view) {
            TemBScore =TemBScore + 1;
            displayForTeamB(TemBScore);
        }

        public void TeamBScoreTwo(View view) {
            TemBScore= TemBScore + 2;
            displayForTeamB(TemBScore);
        }

        public void TeamBScoreThree(View view) {
            TemBScore = TemBScore + 3;
            displayForTeamB(TemBScore);
        }

        private void displayForTeamB(int score) {
            TextView scoreView = (TextView) findViewById(R.id.team_B_Score);
            scoreView.setText(String.valueOf(score));
        }
     /*
    * Team B Code finish
    * */

        //Reset button code
        public void ResetScore(View view) {
            TemAScore = 0;
            TemBScore= 0;
            displayForTeamA(0);
            displayForTeamB(0);

        }
    }
