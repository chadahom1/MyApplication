package com.example.suchada.myapplication;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit ประกาศตัวแปร
    private EditText userEditText, passwordEditText;
    private TextView textView;
    private Button button;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initial view คือการผูกตัวแปรอยู่ที่ View กับ Activity
        initialView();

        //Create Controller
        contoller();


    } // Main Method

    private void contoller() {
        textView.setOnClickListener(MainActivity.this);
        button.setOnClickListener(MainActivity.this);

    }

    private void initialView() {
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        textView = (TextView) findViewById(R.id.txtRegister);
        button = (Button) findViewById(R.id.btnlogin);


    }


    @Override
    public void onClick(View view) {
        String tag = "SriwattanaV1";

        //For TextView
        if (view== textView) {
            Log.d(tag,"You Click TextView");

        }
        // For Button
        if (view == button) {
            Log.d(tag, "You Click Button");
        }

    } // on click


} //Main Class คือ คลาสหลัก
