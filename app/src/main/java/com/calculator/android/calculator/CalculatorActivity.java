package com.calculator.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class CalculatorActivity extends AppCompatActivity {

    private Button mAddButton;
    private Button mSubButton;
    private Button mMulButton;
    private Button mDivButton;
    private Button mDotButton;
    private Button mEqualsButton;
    private Button[] mNumButtons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        mAddButton = (Button) findViewById(R.id.button_add);
        mSubButton = (Button) findViewById(R.id.button_sub);
        mAddButton = (Button) findViewById(R.id.button_mul);
        mAddButton = (Button) findViewById(R.id.button_div);
        mAddButton = (Button) findViewById(R.id.button_dot);
        mAddButton = (Button) findViewById(R.id.button_equals);
        mAddButton = (Button) findViewById(R.id.button1);
        mAddButton = (Button) findViewById(R.id.button2);
        mAddButton = (Button) findViewById(R.id.button3);
        mAddButton = (Button) findViewById(R.id.button4);
        mAddButton = (Button) findViewById(R.id.button5);
        mAddButton = (Button) findViewById(R.id.button6);
        mAddButton = (Button) findViewById(R.id.button7);
        mAddButton = (Button) findViewById(R.id.button8);
        mAddButton = (Button) findViewById(R.id.button9);
        mAddButton = (Button) findViewById(R.id.button0);
    }
}
