package com.hsarme.shada.shadashoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogIn extends AppCompatActivity implements View.OnClickListener
{
    private EditText etEmail, etPassword;
    private Button btnIn, btnUp, btnForget;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnIn = (Button) findViewById(R.id.btnIn);
        btnUp = (Button) findViewById(R.id.btnUp);
        btnIn.setOnClickListener(this);
        btnUp.setOnClickListener(this);
        btnForget = (Button) findViewById(R.id.btnForget);

    }

    @Override
    public void onClick(View view) {
        if (btnIn == view) {
            Intent i = new Intent(getBaseContext(), MainListActivity.class);
            startActivity(i);
        }
        if (btnUp == view) {
            Intent i = new Intent(getBaseContext(), SignUp.class);
            startActivity(i);
        }
    }
}

