package com.hxw.inputdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hxw.input.InputView;

public class MainActivity extends AppCompatActivity {

    InputView inputView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputView1 = (InputView) findViewById(R.id.input1);
    }
}
