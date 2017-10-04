package com.hsarme.shada.shadashoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity
{
    private EditText etEmail, etPassword;
    private Button btnIn, btnUp, btnForget;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        etEmail=(EditText)findViewById(R.id.etEmail);
        etPassword=(EditText)findViewById(R.id.etPassword);
        btnIn=(Button) findViewById(R.id.btnIn);
        btnUp=(Button)findViewById(R.id.btnUp);
        btnForget=(Button)findViewById(R.id.btnForget);
    }
}
