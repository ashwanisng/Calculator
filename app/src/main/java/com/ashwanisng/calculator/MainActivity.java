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
    private Button power;
    private Button clear;
    private Button reset;
    private Button equal;
    private TextView tvInput;
    private TextView tvOutput;
    boolean ADDITION,SUBTRACTION, MULTIPLICATION, DIVISION, POWER;
//    private final char ADDITION = '+';
//    private final char SUBTRACTION = '-';
//    private final char MULTIPLICATION = '*';
//    private final char DIVISION = '/';
//    private final char POWER = '^';
//    private final char EQUAL = '0';
//    double result = 0.0;


//    declaring two variable

    private double value1;
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
        add = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        power = findViewById(R.id.power);
        equal = findViewById(R.id.equal);
        reset = findViewById(R.id.reset);
        clear = findViewById(R.id.clear);
        tvInput = findViewById(R.id.infoTextView);
        tvOutput = findViewById(R.id.editText);

//        calling setOn clickListenerView

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString() + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString() + "2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString() + "3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString() + "4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString() + "5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString() + "6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString() + "7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString() + "8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString()+ "9");

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText(tvInput.getText().toString() + ".");

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText(null);
                tvInput.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() > 0) {
                    CharSequence name = tvInput.getText();
                    tvInput.setText(name.subSequence(0, name.length() - 1));
                } else {
                    tvInput.setText("");
                    tvOutput.setText("");
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput == null){
                    tvInput.setText("");
                }
                else {
                    value1 = Double.parseDouble(tvInput.getText().toString() + "");
                    ADDITION= true;
                    tvInput.setText(null);
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (tvInput == null){
                   tvInput.setText("");
               }else {
                   value1 = Double.parseDouble(tvInput.getText().toString() + "");
                   SUBTRACTION = true;
                   tvInput.setText(null);
               }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (tvInput == null){
                   tvInput.setText("");
               }
               else {
                   value1 = Double.parseDouble(tvInput.getText().toString() + " ");
                   MULTIPLICATION = true;
                   tvInput.setText(null);
               }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput == null){
                    tvInput.setText("");
                }
                else {
                    value1 = Double.parseDouble(tvInput.getText().toString() + "");
                    DIVISION = true;
                    tvInput.setText(null);
                }
            }
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput == null){
                    tvInput.setText("");
                }
                else {
                    value1 = Double.parseDouble(tvInput.getText().toString() + " ");
                    POWER = true;
                    tvInput.setText(null);
                }

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Double.parseDouble(tvInput.getText().toString() + "");

                if (ADDITION == true) {
                    tvOutput.setText(value1 + value2 + "");
                    ADDITION =false;
                }
                if (SUBTRACTION == true) {
                    tvOutput.setText(value1 - value2 + "");
                    SUBTRACTION =false;
                }
                if (MULTIPLICATION == true) {
                    tvOutput.setText(value1 * value2 + "");
                    MULTIPLICATION =false;
                }
                if (DIVISION == true) {
                    tvOutput.setText(value1 / value2 + "");
                    DIVISION = false;
                }
                if (POWER == true) {
                    tvOutput.setText(Math.pow(value1, value2) + "");
                    POWER =false;
                }
            }
            });
        }
}


