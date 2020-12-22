package com.classicsmart.myhomegrocers.activities;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.adapters.CartAdapter;
import com.classicsmart.myhomegrocers.models.DeleteCartPayLoad;
import com.classicsmart.myhomegrocers.models.cart.DeleteCartData;
import com.classicsmart.myhomegrocers.models.cart.DeleteCartResponse;
import com.classicsmart.myhomegrocers.models.cart.GetCartResponse;
import com.classicsmart.myhomegrocers.models.cart.Product;
import com.classicsmart.myhomegrocers.network.ApiConstants;
import com.classicsmart.myhomegrocers.presenters.ApiCallBack;
import com.classicsmart.myhomegrocers.presenters.CartPresenter;
import com.classicsmart.myhomegrocers.utils.DataHelper;

import java.text.DecimalFormat;

import retrofit2.Response;

public class CartActivity extends BaseActivity implements ApiCallBack, CartAdapter.CartItemClickListener, View.OnClickListener {
    CartAdapter cartAdapter;
    CartPresenter cartPresenter;
    RecyclerView recyclerView;
    private static final int _counter = 0;
    TextView tvToatlCartPrice, tvPrice;
    TextView productCount;
    private String _stringVal;
    ImageView cartBackPress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        recyclerView = findViewById(R.id.rv_getcart);
        tvToatlCartPrice = findViewById(R.id.tv_total_cart_price);
        tvPrice = findViewById(R.id.tv_price);
        tvPrice.setPaintFlags(tvPrice.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        // addressData();
        initPresenter();
        productCount = findViewById(R.id.tv_productcount);
        cartBackPress=findViewById(R.id.Imgview);
        cartBackPress.setOnClickListener(this);

    }

    private void initPresenter() {
        cartPresenter=new CartPresenter(this);
        showDialog();
        String authorization = DataHelper.getAuthToken(this);
        cartPresenter.getCartList(authorization, ApiConstants.Constants.API_GET_ORDERS);

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
                GetCartResponse cartResponse = (GetCartResponse) response.body();
                try {
                    tvToatlCartPrice.setText("$" + new DecimalFormat("##.##").format(cartResponse.getData().getTotalRaw().getValue()));
                    cartAdapter = new CartAdapter(this, cartResponse.getData().getProducts(), this);
                    recyclerView.setAdapter(cartAdapter);
                    cartAdapter.notifyDataSetChanged();
                    Toast.makeText(this, cartResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();

                }catch (Exception e){

                }
                break;
                case ApiConstants.Constants.API_DELETE_CART:
                    DeleteCartResponse deleteCartResponse = (DeleteCartResponse) response.body();
                try {
                    cartPresenter.getCartList(DataHelper.getAuthToken(this),ApiConstants.Constants.API_GET_ORDERS);
                    Toast.makeText(this, deleteCartResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();

                }catch (Exception e){

                }
                break;
        }

    }

    @Override
    public void onErrorResponse(String message, int requestType) {
        dismissDialog();
    }

    @Override
    public void cartItemClick(View view, Product product) {
        switch (view.getId()) {
            case R.id.btn_rl_cart_delete:
                showDialog();
                DeleteCartPayLoad deleteCartPayLoad=new DeleteCartPayLoad();
                deleteCartPayLoad.setKey(product.getProductId());
                String authorization = DataHelper.getAuthToken(this);
                cartPresenter.deleteCartItem(authorization,deleteCartPayLoad,ApiConstants.Constants.API_DELETE_CART);
                break;
            case R.id.tvminus:
                break;
            case R.id.tv_plus:
                break;
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Imgview:
                finish();
                break;
        }

    }
}