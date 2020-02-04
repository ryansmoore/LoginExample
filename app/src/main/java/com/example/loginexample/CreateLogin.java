package com.example.loginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CreateLogin extends AppCompatActivity {

    DatabaseHelper db;
    private EditText email, password, cpassword;
    //private Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_login);

        Button buttton;

        email = (EditText)findViewById(R.id.EmailText);
        password = (EditText)findViewById(R.id.PasswordText);
        cpassword = (EditText)findViewById(R.id.CPasswordText);
        buttton = (Button)findViewById(R.id.MakeButton);

/*        buttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = email.getText().toString();
                String s2 = password.getText().toString();
                String s3 = cpassword.getText().toString();

                if(s1.equals("") || s2.equals("") || s3.equals("")) {
                    Toast.makeText(getApplicationContext(), "Fields are empty", Toast.LENGTH_SHORT).show();
                } else {
                    if(s2.equals(s3)) {
                        Boolean checkemail = db.checkemail(s1);
                        if(checkemail == true) {
                            Boolean insert = db.insert(s1,s2);
                            if(insert = true) {
                                Toast.makeText(getApplicationContext(), "Register Sucessful", Toast.LENGTH_SHORT).show();
                            }
                        } else{
                            Toast.makeText(getApplicationContext(), "Email Already Exist", Toast.LENGTH_SHORT).show();
                        }
                    } else{
                        Toast.makeText(getApplicationContext(), "Password Dont Match", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });*/

        buttton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = email.getText().toString();
                String s2 = password.getText().toString();
                String s3 = cpassword.getText().toString();

                if(s1.equals("") || s2.equals("") || s3.equals("")) {
                    Toast.makeText(getApplicationContext(), "Fields are empty", Toast.LENGTH_SHORT).show();
                } else {
                    if(s2.equals(s3)) {
                        Boolean checkemail = db.checkemail(s1);
                        if(checkemail == true) {
                            Boolean insert = db.insert(s1,s2);
                            if(insert = true) {
                                Toast.makeText(getApplicationContext(), "Register Sucessful", Toast.LENGTH_SHORT).show();
                            }
                        } else{
                            Toast.makeText(getApplicationContext(), "Email Already Exist", Toast.LENGTH_SHORT).show();
                        }
                    } else{
                        Toast.makeText(getApplicationContext(), "Password Dont Match", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}
