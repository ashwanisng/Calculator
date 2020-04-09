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
    private TextView edit;
    private TextView info;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char PERCENTAGE = '%';
    private final char EQUAL = '0';

    private char ACTION;
    String process;

//    declaring two variable

    private double value1 = Double.NaN;
    private double value2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        dot = findViewById(R.id.point);
        add = findViewById(R.id.add);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        percentage = findViewById(R.id.percent);
        equal = findViewById(R.id.equal);
        reset = findViewById(R.id.reset);
        info = findViewById(R.id.infoTextView);
        edit = findViewById(R.id.editText);

//        calling setOn clickListenerView

        zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = edit.getText().toString();
                edit.setText(process + "0");

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                process = edit.getText().toString();
                edit.setText(process + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = edit.getText().toString();
                edit.setText(process + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = edit.getText().toString();
                edit.setText(process + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = edit.getText().toString();
                edit.setText(process + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = edit.getText().toString();
                edit.setText(process + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = edit.getText().toString();
                edit.setText(process + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = edit.getText().toString();
                edit.setText(process + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = edit.getText().toString();
                edit.setText(process + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = edit.getText().toString();
                edit.setText(process + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                process = edit.getText().toString();
                edit.setText(process + "+");
                edit.setText(null);
            }
        });


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = SUBTRACTION;
                process = edit.getText().toString();
                edit.setText(process + "-");
                edit.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLICATION;
                process = edit.getText().toString();
                edit.setText(process + "x");
                edit.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                process = edit.getText().toString();
                edit.setText(process + "/");
                edit.setText(null);
            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = PERCENTAGE;
                process = edit.getText().toString();
                edit.setText(process + "%");
                edit.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
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
                    edit.setText("");
                    info.setText("");
                }
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process = edit.getText().toString();
                edit.setText(process + ".");            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 =Double.NaN;
                value2 = Double.NaN;
                edit.setText("");
                info.setText("");
            }
        });

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
            try {
                value1 = Double.parseDouble(edit.getText().toString());
            }
            catch (Exception e){}
        }

    }

}

