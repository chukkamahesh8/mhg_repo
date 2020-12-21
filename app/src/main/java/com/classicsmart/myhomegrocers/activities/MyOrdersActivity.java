package com.classicsmart.myhomegrocers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.adapters.MyOrdersAdapter;
import com.classicsmart.myhomegrocers.models.myOrders.GetMyOrdersResponse;
import com.classicsmart.myhomegrocers.network.ApiConstants;
import com.classicsmart.myhomegrocers.presenters.ApiCallBack;
import com.classicsmart.myhomegrocers.presenters.MyOrdersPresenter;
import com.classicsmart.myhomegrocers.utils.DataHelper;

import retrofit2.Response;


public class MyOrdersActivity extends BaseActivity implements ApiCallBack {

    MyOrdersAdapter myOrderAdapter;
    MyOrdersPresenter myOrderPresenter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);
        recyclerView= findViewById(R.id.rvmyOrders);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
       // addressData();
        initPresenter();
    }

    private void initPresenter() {
        myOrderPresenter=new MyOrdersPresenter(this);
        showDialog();
        String authorization = DataHelper.getAuthToken(this);
        myOrderPresenter.getMYOrders(authorization,1, ApiConstants.Constants.API_GET_ORDERS);

    }


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
            case ApiConstants.Constants.API_GET_ORDERS:
                GetMyOrdersResponse addressResponse=(GetMyOrdersResponse) response.body();
                if (addressResponse.getStatus().getCode()==1){
                    myOrderAdapter = new MyOrdersAdapter(this,addressResponse.getData().getOrders());
                    recyclerView.setAdapter(myOrderAdapter);
                    myOrderAdapter.notifyDataSetChanged();
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
