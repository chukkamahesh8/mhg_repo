package com.classicsmart.myhomegrocers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.classicsmart.myhomegrocers.R;


public class ChangePasswordActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change__password);
       // getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void changePasswordArrow(View view) {
        Intent intent = new Intent(this,UpdateProfileActivity.class);
        finish();
    }
}
