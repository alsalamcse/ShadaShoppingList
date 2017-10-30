package com.hsarme.shada.shadashoppinglist;

import android.media.Image;
import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class AddItem extends AppCompatActivity {
    private EditText etName, etUnits, etAmount,etPrice;
    private ImageButton iBtnImage;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        etName=(EditText)findViewById(R.id.etName);
        etUnits=(EditText)findViewById(R.id.etUnits);
        etAmount=(EditText)findViewById(R.id.etAmount);
        etPrice=(EditText)findViewById(R.id.etPrice);
        iBtnImage=(ImageButton) findViewById(R.id.iBtnImage);
        btnSave=(Button) findViewById(R.id.btnSave);
    }
    public void dataHandler(){
        String stName=etName.getText().toString();
        String stUnits=etUnits.getText().toString();
        String stAmount=etAmount.getText().toString();
        String stPrice=etPrice.getText().toString();
        double amount= Double.parseDouble(stAmount);
        double price=Double.parseDouble(stPrice);

    }
}
