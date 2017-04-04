package com.example.suchada.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private EditText userEditText ,  passwordEditText;
    private TextView textView;
    private Button button;




    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initial view คือการผูกตัวแปรอยู่ที่ View กับ Activity
        initialView();



    } // Main Method

    private void initialView() {
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        textView = (TextView) findViewById(R.id.txtRegister);
        button = (Button) findViewById(R.id.btnlogin);


    }


} //Main Class คือ คลาสหลัก
