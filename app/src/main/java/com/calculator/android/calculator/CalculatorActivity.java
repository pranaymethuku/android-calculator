package com.calculator.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalculatorActivity extends AppCompatActivity {

    private Button mAddButton;
    private Button mSubButton;
    private Button mMulButton;
    private Button mDivButton;
    private Button mDotButton;
    private Button mEqualsButton;
    private Button[] mNumButtons;
    private final int[] mNumButtonIds = {
            R.id.button0,
            R.id.button1, R.id.button2, R.id.button3,
            R.id.button4, R.id.button5, R.id.button6,
            R.id.button7, R.id.button8, R.id.button9,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        mAddButton = (Button) findViewById(R.id.button_add);
        mSubButton = (Button) findViewById(R.id.button_sub);
        mMulButton = (Button) findViewById(R.id.button_mul);
        mAddButton = (Button) findViewById(R.id.button_div);
        mDotButton = (Button) findViewById(R.id.button_dot);
        mEqualsButton = (Button) findViewById(R.id.button_equals);
        mNumButtons = new Button[mNumButtonIds.length];
        for (int i = 0; i < mNumButtons.length; i++) {
            mNumButtons[i] = (Button) findViewById(mNumButtonIds[i]);
            mNumButtons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }
    }
}
