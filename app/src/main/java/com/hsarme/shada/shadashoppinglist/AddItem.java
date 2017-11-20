package com.hsarme.shada.shadashoppinglist;

import android.media.Image;
import android.renderscript.Double2;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hsarme.shada.shadashoppinglist.Data.Product;

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

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataHandler();
            }
        });
    }
    public void dataHandler(){
        //1. get data from the feilds
        String stName=etName.getText().toString();
        String stUnits=etUnits.getText().toString();
        String stAmount=etAmount.getText().toString();
        String stPrice=etPrice.getText().toString();
        //2. todo vlaidate feilds input
        //isOk=true;...

        //3. data manipulation
        double amount= Double.parseDouble(stAmount);
        double price=Double.parseDouble(stPrice);

        //4. building data object
        Product p=new Product();
        p.setName(stName);
        p.setAmount(amount);
        p.setPrice(price);
        p.setCompleted(false);

        //5. to get user email... user info
        FirebaseAuth auth=FirebaseAuth.getInstance();
        FirebaseUser user=auth.getCurrentUser();
        String email=user.getEmail();
        email=email.replace('.','*');

        //6. building data reference = data path = data address
        DatabaseReference reference;
        //todo לקבלת קישור למסד הנתונים שלנו
        //todo  קישור הינו לשורש של המסד הנתונים
        reference= FirebaseDatabase.getInstance().getReference();
        //7. saving data on the firebase database
        reference.child(email).child("mylist").push().setValue(p)
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful())
                        {
                            Toast.makeText(AddItem.this, "Add Product Succeful", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(AddItem.this, "Add Product faild", Toast.LENGTH_SHORT).show();
                        }
                    }
                });



       //// TODO: 20/11/2017 testing
        // reference.child("list").setValue(stName);

    }
}
