package com.ashwanisng.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


//    assigning variable to each of the widgets

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button dot;
    private Button add;
    private Button minus;
    private Button divide;
    private Button multiply;
    private Button percentage;
    private Button clear;
    private Button reset;
    private Button equal;
    private EditText edit;
    private TextView info;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char PERCENTAGE = '%';
    private final char EQUAL = '0';

    private char ACTION;

//    declaring two variable

    private double value1 = Double.NaN;
    private double value2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        setup UI
        setUpView();

//        calling setOn clickListenerView

        zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText().toString() + "0");

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText().toString() + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText().toString() + "2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText().toString() + "3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText().toString() + "4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText().toString() + "5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText().toString() + "6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText().toString() + "7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText().toString() + "8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                edit.setText(edit.getText().toString() + "9");

            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                edit.setText(String.valueOf(value1) + "+");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                info.setText(String.valueOf(value1) + "+");
                edit.setText(null);
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                info.setText(String.valueOf(value1) + "-");
                edit.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLICATION;
                info.setText(String.valueOf(value1) + "*");
                edit.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                info.setText(String.valueOf(value1) + "/");
                edit.setText(null);
            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                compute();
                ACTION = PERCENTAGE;
                info.setText(String.valueOf(value1) + "%");
                edit.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                compute();
                ACTION = EQUAL;
                info.setText(info.getText().toString() + String.valueOf(value2) + "=" + String.valueOf(value1));
                edit.setText(null);

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit.getText().length()> 0){
                    CharSequence name = edit.getText().toString();
                    edit.setText(name.subSequence(0, name.length()-1));
                }
                else {
                    value1 = Double.NaN;
                    value2 = Double.NaN;
                    edit.setText(null);
                    info.setText(null);
                }
            }
        });

    }

    private void setUpView(){

        zero = (Button) findViewById(R.id.zero);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        dot = (Button) findViewById(R.id.point);
        add = (Button) findViewById(R.id.add);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        percentage = (Button) findViewById(R.id.percent);
        equal = (Button) findViewById(R.id.equal);

    }

    private void compute(){

        if (!Double.isNaN(value1)){
            value2 = Double.parseDouble(edit.getText().toString());

            switch (ACTION){

                case ADDITION:
                    value1 = value1 + value2;
                    break;

                case SUBTRACTION:
                    value1 = value1 - value2;
                    break;

                case MULTIPLICATION:
                    value1 = value1 * value2;
                    break;

                case DIVISION:
                    value1 = value1 / value2;
                    break;

                case PERCENTAGE:
                    value1 = value1 /100;
                    break;

                case EQUAL:
                    break;
            }

        }else {
            value1 = Double.parseDouble(edit.getText().toString());
        }

    }

}

