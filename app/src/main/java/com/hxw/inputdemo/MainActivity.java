package com.hxw.inputdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.hxw.input.InputView;

public class MainActivity extends AppCompatActivity {

    InputView inputView1;
    InputView inputView2;

    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputView1 = findViewById(R.id.input1);
        inputView2 = findViewById(R.id.input2);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView1.setMaxLength(8);
                inputView2.setMaxLength(8);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputView1.setMaxLength(6);
                inputView2.setMaxLength(6);
            }
        });
    }
}
