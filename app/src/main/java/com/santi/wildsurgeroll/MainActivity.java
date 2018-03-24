package com.santi.wildsurgeroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    }



}
