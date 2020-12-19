package com.classicsmart.myhomegrocers.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.databinding.RightTopNavigationBinding;
import com.classicsmart.myhomegrocers.models.userAuth.UserDetails;
import com.classicsmart.myhomegrocers.utils.DataHelper;

import java.util.Objects;

public class RighttopNavigationActivity extends AppCompatActivity  {
    RightTopNavigationBinding rightTopNavigationBinding;
    Button edit_profile;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rightTopNavigationBinding = DataBindingUtil.setContentView(this, R.layout.right_top_navigation);

        /*SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(rightTopNavigationBinding.tvDeliverCustomerName.getText());
        spannableStringBuilder.setSpan(new StyleSpan(Typeface.BOLD), 11, 41, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        rightTopNavigationBinding.tvDeliverCustomerName.setText(spannableStringBuilder);
*/
        if (DataHelper.getUserData(this)!= null){
            setData(Objects.requireNonNull(DataHelper.getUserData(this)));
        }else {
            Spannable wordtoSpan = new SpannableString("Deliver to Customer Name - Location PinCode");
            wordtoSpan.setSpan(new StyleSpan(Typeface.BOLD), 11, wordtoSpan.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            rightTopNavigationBinding.tvDeliverCustomerName.setText(wordtoSpan);
        }
    }

    private void setData(UserDetails userData) {
        String userAddress = userData.getFirstname();
        Spannable wordtoSpan = new SpannableString("Deliver to "+ userAddress);
        wordtoSpan.setSpan(new StyleSpan(Typeface.BOLD), 11, wordtoSpan.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        rightTopNavigationBinding.tvDeliverCustomerName.setText(wordtoSpan);
        rightTopNavigationBinding.txtCustomerName.setText(userData.getFirstname() + " " + userData.getLastname());
        rightTopNavigationBinding.tvEmailId.setText(userData.getEmail());
        rightTopNavigationBinding.txtMobileNmuber.setText(userData.getTelephone());


    }


    public void rightBackArrow(View view) {
        finish();
    }

    public void updateProfile(View view) {
        Intent intent= new Intent(this,UpdateProfileActivity.class);
        startActivity(intent);

    }

    public void deliveryAddress(View view) {
        Intent intent= new Intent(this,DeliveryAddressActivity.class);
        startActivity(intent);
        finish();
    }

    public void addressDetails(View view) {
        Intent intent= new Intent(this,DeliveryAddressActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    public void myOrders(View view) {
        Intent intent= new Intent(this,MyOrdersActivity.class);
        startActivity(intent);
        finish();
    }
    public void myWishlist(View view) {
        Intent intent= new Intent(this,WishlistActivity.class);
        startActivity(intent);
        finish();
    }

    public void updateProfileEdit(View view) {
        Intent intent= new Intent(this,UpdateProfileActivity.class);
        startActivity(intent);
        
    }
}
