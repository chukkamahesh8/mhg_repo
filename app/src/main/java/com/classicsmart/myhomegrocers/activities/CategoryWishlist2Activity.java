package com.classicsmart.myhomegrocers.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.databinding.ActivityCategoryWishlist2Binding;
import com.classicsmart.myhomegrocers.network.ApiConstants;
import com.classicsmart.myhomegrocers.presenters.ApiCallBack;
import com.classicsmart.myhomegrocers.presenters.WishListPresenter;
import com.classicsmart.myhomegrocers.utils.DataHelper;

import retrofit2.Response;

public class CategoryWishlist2Activity extends BaseActivity implements ApiCallBack {
    WishListPresenter wishListPresenter;
    RecyclerView rvaddCart,rvCount;
    GridLayoutManager gmaddCart,gmCount;
    ActivityCategoryWishlist2Binding activityCategoryWishlist2Binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityCategoryWishlist2Binding= DataBindingUtil.setContentView(this,R.layout.activity_category_wishlist2);
        initPresenter();
        rvaddCart=findViewById(R.id.rv_addCart);
        gmaddCart= new GridLayoutManager(this,2);
        rvaddCart.setLayoutManager(gmaddCart);
        rvCount=findViewById(R.id.rv_Count);
        gmCount= new GridLayoutManager(this,2);
        rvaddCart.setLayoutManager(gmCount);
        activityCategoryWishlist2Binding.itemNewproduct.addToCart.setOnClickListener(view -> {
            activityCategoryWishlist2Binding.viewNewproduct.setVisibility(view.GONE);
            activityCategoryWishlist2Binding.viewCount.setVisibility(view.VISIBLE);
        });

        activityCategoryWishlist2Binding.itemNewproduct1.addToCart.setOnClickListener(view -> {
            activityCategoryWishlist2Binding.viewNewproduct.setVisibility(view.GONE);
            activityCategoryWishlist2Binding.viewCount.setVisibility(view.VISIBLE);
        });
        activityCategoryWishlist2Binding.itemNewproduct2.addToCart.setOnClickListener(view -> {
            activityCategoryWishlist2Binding.viewNewproduct.setVisibility(view.GONE);
            activityCategoryWishlist2Binding.viewCount.setVisibility(view.VISIBLE);
        });
        activityCategoryWishlist2Binding.itemNewproduct3.addToCart.setOnClickListener(view -> {
            activityCategoryWishlist2Binding.viewNewproduct.setVisibility(view.GONE);
            activityCategoryWishlist2Binding.viewCount.setVisibility(view.VISIBLE);
        });

        activityCategoryWishlist2Binding.backImgview.setOnClickListener(view -> {
            finish();
            activityCategoryWishlist2Binding.viewNewproduct.setVisibility(view.GONE);
            activityCategoryWishlist2Binding.viewCount.setVisibility(view.VISIBLE);
        });


    }

    private void initPresenter() {
        wishListPresenter= new WishListPresenter(this);
        showDialog();
        String authorization = "Bearer " + DataHelper.getAuthToken(this);
        wishListPresenter.getWishList(authorization, ApiConstants.Constants.API_GET_WISHLIST);

    }


    @Override
    public void onSuccessResponse(Response response, int requestType) {
        dismissDialog();


    }

    @Override
    public void onErrorResponse(String message, int requestType) {
        dismissDialog();

    }
}