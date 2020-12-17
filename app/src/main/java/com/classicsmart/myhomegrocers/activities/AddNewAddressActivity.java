package com.classicsmart.myhomegrocers.activities;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.models.address.AddAddressResponse;
import com.classicsmart.myhomegrocers.models.address.AddressPayLoad;
import com.classicsmart.myhomegrocers.models.dashboard.DashboardResponse;
import com.classicsmart.myhomegrocers.network.ApiConstants;
import com.classicsmart.myhomegrocers.presenters.AddressPresenter;
import com.classicsmart.myhomegrocers.presenters.ApiCallBack;
import com.classicsmart.myhomegrocers.utils.DataHelper;

import retrofit2.Response;


public class AddNewAddressActivity extends BaseActivity implements ApiCallBack {
    AddressPresenter addressPresenter;
    EditText etAddress,etAppartment,etCity,etState,etZipCode,etLandMark,etAltMobileNumber;
    LinearLayout btnLocation;
    Button btnSaveAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_newaddress);
        initViews();
        initPresenter();
        btnLocation=findViewById(R.id.btn_location);
        etAddress=findViewById(R.id.edtxtaddressline1);
        etAppartment=findViewById(R.id.edtxtApartment);
        etCity=findViewById(R.id.ed_city);
        etState=findViewById(R.id.ed_state);
        etZipCode=findViewById(R.id.edtxtZipcode);
        etLandMark=findViewById(R.id.edtxtLandmark);
        etAltMobileNumber=findViewById(R.id.edtxtAlternatePhoneNumber);
        btnSaveAddress=findViewById(R.id.btnSaveAddress);

        btnSaveAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etAddress.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), etAddress.getHint().toString(), Toast.LENGTH_SHORT).show();
                }else if (etAppartment.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), etAppartment.getHint().toString(), Toast.LENGTH_SHORT).show();
                }else if (etCity.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), etCity.getHint().toString(), Toast.LENGTH_SHORT).show();
                }else if (etState.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), etState.getHint().toString(), Toast.LENGTH_SHORT).show();
                }else if (etZipCode.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), etZipCode.getHint().toString(), Toast.LENGTH_SHORT).show();
                }else if (etAltMobileNumber.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), etAltMobileNumber.getHint().toString(), Toast.LENGTH_SHORT).show();
                }else {
                    prepareAddAddressObject();
                }
            }
        });
    }



    private void initPresenter() {
        addressPresenter=new AddressPresenter(this);

    }

    private void initViews() {
        findViewById(R.id.ImgAddressBackArrow).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //calling this method to show our android custom alert dialog
                showCustomDialog();
            }
        });
    }

    public void prepareAddAddressObject(){
        AddressPayLoad addressPayLoad=new AddressPayLoad();
        addressPayLoad.setFirstname("Sai");
        addressPayLoad.setLastname("Penta");
        addressPayLoad.setCompany("ABC");
        addressPayLoad.setAddress1(etAddress.getText().toString());
        addressPayLoad.setAddress2(etAddress.getText().toString());
        addressPayLoad.setCity(etCity.getText().toString());
        addressPayLoad.setPostcode(etZipCode.getText().toString());
        addressPayLoad.setCountryId("223");
        addressPayLoad.setZoneId("3636");
        addressPayLoad.setDefault("1");
        showDialog();
        String authorization = "Bearer " + DataHelper.getAuthToken(this);
        addressPresenter.addAddressApi(authorization,addressPayLoad, ApiConstants.Constants.API_ADD_NEW_ADDRESS);


    }

    AlertDialog alertDialog;

    private void showCustomDialog() {
        ViewGroup viewGroup = findViewById(android.R.id.content);
        View dialogView = LayoutInflater.from(this).inflate(R.layout.view_confirmaddress, viewGroup, false);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(dialogView);
        alertDialog = builder.create();
        if (!alertDialog.isShowing())
            alertDialog.show();
    }


    public void stay(View view) {
        alertDialog.hide();
    }

    public void leave(View view) {
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override
    public void onSuccessResponse(Response response, int requestType) {
        dismissDialog();
        switch (requestType) {
            case ApiConstants.Constants.API_ADD_NEW_ADDRESS:
                AddAddressResponse addAddressResponse=(AddAddressResponse)response.body();
                if (addAddressResponse.getStatus().getCode()==1){
                    finish();
                    Toast.makeText(this, addAddressResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }

    @Override
    public void onErrorResponse(String message, int requestType) {
        dismissDialog();
    }

}
