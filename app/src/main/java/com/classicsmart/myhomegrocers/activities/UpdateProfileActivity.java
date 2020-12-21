package com.classicsmart.myhomegrocers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.models.userAuth.UserDetails;
import com.classicsmart.myhomegrocers.utils.DataHelper;

import java.util.Objects;


public class UpdateProfileActivity extends AppCompatActivity {

    EditText edFirstName,edLastName,edEmail,edMobileNumber;
    Button btnNotNow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update__profile);
        edFirstName=findViewById(R.id.txtFirstName);
        edLastName=findViewById(R.id.txtLastName);
        edEmail=findViewById(R.id.txtEmail);
        edMobileNumber=findViewById(R.id.txtTelephone);
        btnNotNow=findViewById(R.id.btn_notnow);
        btnNotNow.setOnClickListener(view -> {
            finish();
        });
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
        edFirstName.setText(userDetails.getFirstname());
        edLastName.setText(userDetails.getLastname());
        edEmail.setText(userDetails.getEmail());
        edMobileNumber.setText(userDetails.getTelephone());
    }
}
