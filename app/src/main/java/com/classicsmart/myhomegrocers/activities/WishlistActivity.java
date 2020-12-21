package com.classicsmart.myhomegrocers.activities;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.adapters.WishlistAdapter;
import com.classicsmart.myhomegrocers.models.wishlist.GetWishListResponse;
import com.classicsmart.myhomegrocers.network.ApiConstants;
import com.classicsmart.myhomegrocers.presenters.ApiCallBack;
import com.classicsmart.myhomegrocers.presenters.WishListPresenter;
import com.classicsmart.myhomegrocers.utils.DataHelper;

import retrofit2.Response;

public class WishlistActivity extends BaseActivity implements ApiCallBack {
    WishlistAdapter wishlistAdapter;
    WishListPresenter wishListPresenter;
    RecyclerView recyWishlist;
    ImageView wishlistback;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);
        recyWishlist = findViewById(R.id.rv_getwhislist);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyWishlist.setLayoutManager(layoutManager);
        initPresenter();
        wishlistback = findViewById(R.id.wishlistBackPress);
        wishlistback.setOnClickListener(view -> {
            finish();

        });

    }

    private void initPresenter() {
        wishListPresenter = new WishListPresenter(this);
        showDialog();

        String authorization =DataHelper.getAuthToken(this);
        wishListPresenter.getWishList(authorization, ApiConstants.Constants.API_GET_WISHLIST);
    }

    @Override
    public void onSuccessResponse(Response response, int requestType) {
        dismissDialog();
        switch (requestType) {
            case ApiConstants.Constants.API_GET_WISHLIST:
                GetWishListResponse addressResponse = (GetWishListResponse) response.body();
                if (addressResponse.getStatus().getCode() == 1 && addressResponse.getData() != null) {
                    wishlistAdapter = new WishlistAdapter(this, addressResponse.getData());
                    recyWishlist.setAdapter(wishlistAdapter);
                    wishlistAdapter.notifyDataSetChanged();
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