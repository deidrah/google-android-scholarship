package com.example.android.chapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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

    /**
     *
     * Checks the score
     *
     */

    public void checkScore(View view) {

        RadioButton trueOne = (RadioButton) findViewById(R.id.true_one);
        Boolean isOneTrue = trueOne.isChecked();
        if (isOneTrue) {
            score ++;
        }

        RadioButton trueTwo = (RadioButton) findViewById(R.id.true_two);
        Boolean isSecondTrue = trueTwo.isChecked();
        if (isSecondTrue) {
            score ++;
        }

        CheckBox trueThreeA = (CheckBox) findViewById(R.id.true_three_a);
        Boolean isThirdATrue = trueThreeA.isChecked();
        CheckBox trueThreeB = (CheckBox) findViewById(R.id.true_three_b);
        Boolean isThreeBTrue = trueThreeB.isChecked();
        CheckBox falseThreeA = (CheckBox) findViewById(R.id.false_three_a);
        Boolean isThreeAFalse = falseThreeA.isChecked();
        CheckBox falseThreeB = (CheckBox) findViewById(R.id.false_three_b);
        Boolean isThreeBFalse = falseThreeB.isChecked();
        if (isThreeBTrue && isThirdATrue && !isThreeAFalse && !isThreeBFalse) {
            score ++;
        }

        EditText trueFour = (EditText) findViewById(R.id.true_four);
        String isFourTrue = trueFour.getText().toString();
        if (isFourTrue.equals("IBM")) {
            score ++;
        }

        RadioButton trueFive = (RadioButton) findViewById(R.id.true_five);
        Boolean isFiveTrue = trueFive.isChecked();
        if (isFiveTrue) {
            score ++;
        }

        RadioButton trueSix = (RadioButton) findViewById(R.id.true_six);
        Boolean isSixTrue = trueSix.isChecked();
        if (isSixTrue) {
            score ++;
        }

        /**
        * Creates toast message with the number of points gained
         */

        if (score == 6) {
            Toast.makeText(this, "Congrats! You gained " + score + " points, which means you won!", Toast.LENGTH_LONG).show();
        }
        Toast.makeText(this, "You gained " + score + " points for 6, try again maybe? ;)", Toast.LENGTH_LONG).show();

        score = 0;
    }

}
