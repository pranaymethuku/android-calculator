package com.calculator.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CalculatorActivity extends AppCompatActivity {

    private Button mAddButton;
    private Button mSubButton;
    private Button mMulButton;
    private Button mDivButton;
    private Button mDotButton;
    private Button mEqualsButton;
    private Button mClearButton;
    private Button[] mNumButtons = new Button[10];
    private final int[] mNumButtonIds = {
            R.id.button0,
            R.id.button1, R.id.button2, R.id.button3,
            R.id.button4, R.id.button5, R.id.button6,
            R.id.button7, R.id.button8, R.id.button9,
    };

    private double[] numProcess = new double[3]; //Contains the numbers which are to be operated on; the final element determines whether the number to be added to the array goes in the first or second position
    private String operator; //Contains the operator
    private double memory; //Contains the answer obtained from the previous calculation in case the user wishes to do further operations on the answer

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Initializes buttons for the operators and the numbers from 0-9
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        mAddButton = (Button) findViewById(R.id.button_add);
        mAddButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operator = "+";
            }
        });

        mSubButton = (Button) findViewById(R.id.button_sub);
        mSubButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operator = "-";
            }
        });

        mMulButton = (Button) findViewById(R.id.button_mul);
        mMulButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operator = "*";
            }
        });

        mDivButton = (Button) findViewById(R.id.button_div);
        mDivButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                operator = "/";
            }
        });

        mClearButton = (Button) findViewById(R.id.button_clear);
        mClearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numProcess[0] = 0;
                numProcess[1] = 0;
                numProcess[2] = 0;
                Toast.makeText(CalculatorActivity.this, "Cleared!", Toast.LENGTH_SHORT).show();
            }
        });

        //mDotButton = (Button) findViewById(R.id.button_dot);

        mEqualsButton = (Button) findViewById(R.id.button_equals);
        mEqualsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                double answer = CalculatorProcessor.checkOperation(numProcess[0], numProcess[1], operator);
                Toast.makeText(CalculatorActivity.this, "The answer is " + answer, Toast.LENGTH_SHORT).show();
                memory = answer;

                numProcess = new double[3];
                numProcess[2] = 1;
                numProcess[0] = memory;
                operator = null;
            }
        });
        mNumButtons = new Button[mNumButtonIds.length];
        numProcess[2] = 0;
        for (int i = 0; i < mNumButtons.length; i++) {
            mNumButtons[i] = (Button) findViewById(mNumButtonIds[i]);
            mNumButtons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String buttonValue = ((Button) v).getText().toString();
                        if (numProcess[2] == 1) {
                            numProcess[1] = Integer.parseInt(buttonValue);
                            numProcess[2] = 0;
                        } else if (numProcess[2] == 0) {
                            numProcess[0] = Integer.parseInt(buttonValue);
                            numProcess[2] = 1;
                        }
                        Toast.makeText(CalculatorActivity.this, "Clicked " + buttonValue, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        }

    }
