package com.classicsmart.myhomegrocers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.adapters.DelAddressAdapter;
import com.classicsmart.myhomegrocers.models.address.AddAddressResponse;
import com.classicsmart.myhomegrocers.models.address.AddressResponse;
import com.classicsmart.myhomegrocers.network.ApiConstants;
import com.classicsmart.myhomegrocers.presenters.AddressPresenter;
import com.classicsmart.myhomegrocers.presenters.ApiCallBack;
import com.classicsmart.myhomegrocers.utils.DataHelper;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Response;


public class DeliveryAddressActivity extends BaseActivity implements ApiCallBack {

    private List<DeliveryAddressPojo>deliveryAddressPojoList = new ArrayList<>();
    DelAddressAdapter delAddressAdapter;
    AddressPresenter addressPresenter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_address);
        recyclerView= findViewById(R.id.delAddrecyclerview);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
       // addressData();
        initPresenter();
    }

    private void initPresenter() {
        addressPresenter=new AddressPresenter(this);
        showDialog();
        String authorization = "Bearer " + "ee09036008df251726b734c3808b3fd19f8d38ae";
        addressPresenter.getAddressApi(authorization, ApiConstants.Constants.API_LIST_ADDRESS);


    }

/*
    private void addressData() {
    DeliveryAddressPojo deliveryAddressPojo=new DeliveryAddressPojo("Home","Text1","10/12","Ramnagar",
            "Jailroad","Vizag","530002","9748170928");
    deliveryAddressPojoList.add(deliveryAddressPojo);

    deliveryAddressPojo=new DeliveryAddressPojo("Others","Text2","10/13","Ramnagar",
                "Jailroad","Hyderbad","530002","9876543210");
    deliveryAddressPojoList.add(deliveryAddressPojo);


    }
*/

    public void deliveryAddress(View view) {
        Intent intent= new Intent(this,RighttopNavigationActivity.class);
        startActivity(intent);
        finish();

    }

    public void addNew(View view) {
        Intent intent= new Intent(this,AddNewAddressActivity.class);
        startActivity(intent);


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
            case ApiConstants.Constants.API_LIST_ADDRESS:
                AddressResponse addressResponse=(AddressResponse) response.body();
                if (addressResponse.getStatus().getCode()==1){
                    delAddressAdapter = new DelAddressAdapter(addressResponse.getData().getAddresses());
                    recyclerView.setAdapter(delAddressAdapter);
                    delAddressAdapter.notifyDataSetChanged();
                    Toast.makeText(this, addressResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }

    @Override
    public void onErrorResponse(String message, int requestType) {
dismissDialog();
    }
}
