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
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char POWER = '^';
    private final char EQUAL = '0';

    private char ACTION;

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
            @SuppressLint("SetTextI18n")
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
                tvInput.setText(tvInput.getText().toString() + "9");

            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tvInput.getText().length() > 0) {
                    CharSequence name = tvInput.getText().toString();
                    tvInput.setText(name.subSequence(0, name.length() - 1));
                } else {
                    value1 = Double.NaN;
                    value2 = Double.NaN;
                    tvInput.setText("");
                    tvOutput.setText("");
                }
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
                tvOutput.setText("");
                tvInput.setText("");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = ADDITION;
                tvOutput.setText(String.valueOf(value1) + "+");
                tvInput.setText(null);


            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION =SUBTRACTION;
                tvOutput.setText(String.valueOf(value1) + "-");
                tvInput.setText(null);


            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = MULTIPLICATION;
                tvOutput.setText(String.valueOf(value1) + "x");
                tvInput.setText(null);


            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = DIVISION;
                tvOutput.setText(String.valueOf(value1) + "/");
                tvInput.setText(null);


            }
        });

        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = POWER;
                tvOutput.setText(String.valueOf(value1) + "^");
                tvInput.setText(null);

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION =EQUAL;
                tvOutput.setText(tvOutput.getText().toString() + String.valueOf(value2) + " = " + String.valueOf(value1));
                tvInput.setText(null);

            }
        });
    }


        private void compute () {
            if (!Double.isNaN(value1)) {
                value2 = Double.parseDouble(tvInput.getText().toString());

                switch (ACTION) {

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

                    case POWER:
                        value1 =  Math.pow(value1,value2);
                        break;

                    case EQUAL:
                        break;
                }

            } else {
                try {
                    value1 = Double.parseDouble(tvInput.getText().toString());
                } catch (Exception e) {
                }
            }

        }
}





