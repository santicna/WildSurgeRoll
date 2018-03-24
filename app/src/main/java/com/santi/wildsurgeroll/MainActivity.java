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

    private Button mResetButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign views to variables.
        mRollResult = findViewById(R.id.roll_result);
        mRollEffect = findViewById(R.id.roll_effect);
        mRollButton = findViewById(R.id.roll_button);
        mResetButton = findViewById(R.id.reset_button);


        mRollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Hide the roll Button
                mRollButton.setVisibility(View.INVISIBLE);
                //Roll de the dice
                int result = Roll.rollDice();
                //Get the effect for the number rolled
                String effect = Roll.getEffect(result);
                //Show the number rolled
                mRollResult.setText(String.valueOf(result));
                mRollResult.setVisibility(View.VISIBLE);
                //Show the effect rolled
                mRollEffect.setText(effect);
                mRollEffect.setVisibility(View.VISIBLE);
                //Show reset button
                mResetButton.setVisibility(View.VISIBLE);
            }
        });

    }



}
