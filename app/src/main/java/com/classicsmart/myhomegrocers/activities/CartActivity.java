package com.classicsmart.myhomegrocers.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.adapters.CartAdapter;
import com.classicsmart.myhomegrocers.adapters.MyOrdersAdapter;
import com.classicsmart.myhomegrocers.models.cart.GetCartResponse;
import com.classicsmart.myhomegrocers.models.cart.Total;
import com.classicsmart.myhomegrocers.models.myOrders.GetMyOrdersResponse;
import com.classicsmart.myhomegrocers.network.ApiConstants;
import com.classicsmart.myhomegrocers.presenters.ApiCallBack;
import com.classicsmart.myhomegrocers.presenters.CartPresenter;
import com.classicsmart.myhomegrocers.presenters.MyOrdersPresenter;

import java.text.DecimalFormat;

import retrofit2.Response;

public class CartActivity extends BaseActivity implements ApiCallBack {
    CartAdapter cartAdapter;
    CartPresenter cartPresenter;
    RecyclerView recyclerView;
    TextView tvToatlCartPrice,tvPrice;
    TextView tvMinus,tvPlus,productCount;
    private static int _counter = 0;
    private String _stringVal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        recyclerView= findViewById(R.id.rv_getcart);
        tvToatlCartPrice = findViewById(R.id.tv_total_cart_price);
        tvPrice=findViewById(R.id.tv_price);
        tvPrice.setPaintFlags(tvPrice.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        // addressData();
        initPresenter();
        productCount=findViewById(R.id.tv_productcount);

    }
    private void initPresenter() {
        cartPresenter=new CartPresenter(this);
        showDialog();
        String authorization = "Bearer " + "ee09036008df251726b734c3808b3fd19f8d38ae";
        cartPresenter.getCartList(authorization, ApiConstants.Constants.API_GET_ORDERS);

    }


    public void cartBackPress(View view) {
        Intent intent= new Intent(this,RighttopNavigationActivity.class);
        startActivity(intent);
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
            case ApiConstants.Constants.API_GET_ORDERS:
                GetCartResponse addressResponse=(GetCartResponse) response.body();
                if (addressResponse.getStatus().getCode()==1){
                    tvToatlCartPrice.setText("$"+ new DecimalFormat("##.##").format(addressResponse.getData().getTotalRaw().getValue()));
                    cartAdapter = new CartAdapter(this,addressResponse.getData().getProducts());
                    recyclerView.setAdapter(cartAdapter);
                    cartAdapter.notifyDataSetChanged();
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