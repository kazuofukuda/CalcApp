package com.example.fukuda.calcapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcApp extends AppCompatActivity implements View.OnClickListener {

    TextView mTextView;
    EditText mEditText1;
    EditText mEditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_app);

        //足し算
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        //引き算
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        //掛け算
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        //割り算
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        mEditText1 = (EditText) findViewById(R.id.editText1);
        mEditText2 = (EditText) findViewById(R.id.editText2);

    }

      @Override
        public void onClick(View v) {
          Intent intent = new Intent(this, SecondActivity.class);
          String str1 = mEditText1.getText().toString();
          int i = Integer.parseInt(str1);

          String str2 = mEditText2.getText().toString();
          int j = Integer.parseInt(str2);

           if (v.getId() == R.id.button1) {
                intent.putExtra("VALUE", i + j);
            } else if (v.getId() == R.id.button2) {
                intent.putExtra("VALUE", i - j);
            } else if (v.getId() == R.id.button3) {
                intent.putExtra("VALUE", i * j);
            } else if (v.getId() == R.id.button4) {
                intent.putExtra("VALUE", i / j);
            }
            startActivity(intent);
        }

}
