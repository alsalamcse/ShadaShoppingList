package com.hsarme.shada.shadashoppinglist;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity
{
    private EditText etName, etEmail2, etPassword2, etRePassword, etPhone;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etName=(EditText)findViewById(R.id.etName);
        etEmail2=(EditText)findViewById(R.id.etEmail2);
        etPassword2=(EditText)findViewById(R.id.etPassword);
        etRePassword=(EditText)findViewById(R.id.etRePassword);
        etPhone=(EditText)findViewById(R.id.etPhone);
        btnSave=(Button)findViewById(R.id.btnSave);

    }
}
