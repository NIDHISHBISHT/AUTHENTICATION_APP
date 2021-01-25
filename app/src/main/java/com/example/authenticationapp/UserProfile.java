package com.example.authenticationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class UserProfile extends AppCompatActivity {

    TextInputLayout fullname,phonenumber,password,email;
    TextView fullname_label,username_label;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
         fullname = findViewById(R.id.full_name_profile);
         phonenumber = findViewById(R.id.phone_number_profile);
         password = findViewById(R.id.password_profile);
         email = findViewById(R.id.email_profile);
         fullname_label = findViewById(R.id.full_name_label);
         username_label = findViewById(R.id.user_name_label);
        ShowAllUserData();
    }

    private void ShowAllUserData() {
        Intent intent = getIntent();
        String user_fullname = intent.getStringExtra("fullname");
        String user_username = intent.getStringExtra("username");
        String user_email = intent.getStringExtra("email");
        String user_phonenumber = intent.getStringExtra("phonenumber");
        String user_password = intent.getStringExtra("password");

        fullname_label.setText(user_fullname);
        username_label.setText(user_username);
        fullname.getEditText().setText(user_fullname);
        email.getEditText().setText(user_email);
        phonenumber.getEditText().setText(user_phonenumber);
        password.getEditText().setText(user_password);

    }
}