package com.classicsmart.myhomegrocers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.models.userAuth.UserDetails;
import com.classicsmart.myhomegrocers.utils.DataHelper;

import java.util.Objects;


public class UpdateProfileActivity extends AppCompatActivity {

    EditText ed_firstname,ed_lastname,ed_email,ed_mobilenumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update__profile);
        ed_firstname=findViewById(R.id.txtFirstName);
        ed_lastname=findViewById(R.id.txtLastName);
        ed_email=findViewById(R.id.txtEmail);
        ed_mobilenumber=findViewById(R.id.txtTelephone);
        if (DataHelper.getUserData(this)!=null){
            setData(Objects.requireNonNull(DataHelper.getUserData(this)));
        }
    }

    public void changePassword(View view) {
        Intent intent = new Intent(this,ChangePasswordActivity.class);
        startActivity(intent);
    }

    public void profileNavigation(View view) {
        Intent intent = new Intent(this,RighttopNavigationActivity.class);
        finish();

    }
    private void setData(UserDetails userDetails){
        ed_firstname.setText(userDetails.getFirstname());
        ed_lastname.setText(userDetails.getLastname());
        ed_email.setText(userDetails.getEmail());
        ed_mobilenumber.setText(userDetails.getTelephone());
    }
}
