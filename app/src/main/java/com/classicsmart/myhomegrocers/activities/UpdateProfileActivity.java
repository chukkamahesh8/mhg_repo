package com.classicsmart.myhomegrocers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.classicsmart.myhomegrocers.R;


public class UpdateProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update__profile);
    }

    public void changePassword(View view) {
        Intent intent = new Intent(this,ChangePasswordActivity.class);
        startActivity(intent);
    }

    public void profileNavigation(View view) {
        Intent intent = new Intent(this,RighttopNavigationActivity.class);
        finish();

    }
}
