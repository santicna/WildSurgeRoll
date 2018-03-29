package com.santi.wildsurgeroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mRollResult;

    private TextView mRollEffect;

    private Button mRollButton;

    private Button mRollAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign views to variables.
        mRollResult = findViewById(R.id.roll_result);
        mRollEffect = findViewById(R.id.roll_effect);
        mRollButton = findViewById(R.id.roll_button);
        mRollAgainButton = findViewById(R.id.roll_again);


        mRollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                haveASurge();
                //Hide the roll Button
                mRollButton.setVisibility(View.INVISIBLE);
                //Show the result
                mRollResult.setVisibility(View.VISIBLE);
                //Show the effect rolled
                mRollEffect.setVisibility(View.VISIBLE);
                //Show rollAgain button
                mRollAgainButton.setVisibility(View.VISIBLE);
            }
        });

        mRollAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                haveASurge();
            }
        });

    }


    @Override
    public void onBackPressed() {
        if (mRollButton.getVisibility()==View.VISIBLE){
            super.onBackPressed();
        }
        else {
            //Go back to the "main screen"
            mRollResult.setVisibility(View.INVISIBLE);
            mRollEffect.setVisibility(View.INVISIBLE);
            mRollAgainButton.setVisibility(View.INVISIBLE);
            mRollButton.setVisibility(View.VISIBLE);
        }
    }

    private void haveASurge(){
        //Roll de the dice
        int result = Roll.rollDice();
        //Get the effect for the number rolled
        int effect = Roll.getEffect(result);
        //Show the number rolled
        mRollResult.setText(String.valueOf(result));
        //Show the effect rolled
        mRollEffect.setText(getResources().getString(effect));
    }

}
