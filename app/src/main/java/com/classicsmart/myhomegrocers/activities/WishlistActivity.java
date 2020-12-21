package com.classicsmart.myhomegrocers.activities;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.adapters.WishlistAdapter;
import com.classicsmart.myhomegrocers.models.cart.Product;
import com.classicsmart.myhomegrocers.models.wishlist.GetWishListResponse;
import com.classicsmart.myhomegrocers.models.wishlist.WishListData;
import com.classicsmart.myhomegrocers.models.wishlist.WishListResponse;
import com.classicsmart.myhomegrocers.network.ApiConstants;
import com.classicsmart.myhomegrocers.presenters.ApiCallBack;
import com.classicsmart.myhomegrocers.presenters.CartPresenter;
import com.classicsmart.myhomegrocers.presenters.WishListPresenter;
import com.classicsmart.myhomegrocers.utils.DataHelper;

import retrofit2.Response;

public class WishlistActivity extends BaseActivity implements ApiCallBack, WishlistAdapter.WishListClickListener {
    WishlistAdapter wishlistAdapter;
    WishListPresenter wishListPresenter;
    CartPresenter cartPresenter;
    RecyclerView recyWishlist;
    ImageView wishlistback;
    TextView txtEmpty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);
        recyWishlist = findViewById(R.id.rv_getwhislist);
        txtEmpty = findViewById(R.id.txt_empty);
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
        getWishList();
    }

    private void getWishList() {
        showDialog();
        String authorization = DataHelper.getAuthToken(this);
        wishListPresenter.getWishList(authorization, ApiConstants.Constants.API_GET_WISHLIST);

    }

    @Override
    public void onSuccessResponse(Response response, int requestType) {
        dismissDialog();
        switch (requestType) {
            case ApiConstants.Constants.API_GET_WISHLIST:
                GetWishListResponse addressResponse = (GetWishListResponse) response.body();
                if (addressResponse.getStatus().getCode() == 1 && addressResponse.getData() != null) {
                    txtEmpty.setVisibility(View.GONE);
                    recyWishlist.setVisibility(View.VISIBLE);
                    wishlistAdapter = new WishlistAdapter(this, addressResponse.getData(), this);
                    recyWishlist.setAdapter(wishlistAdapter);
                    wishlistAdapter.notifyDataSetChanged();
                    Toast.makeText(this, addressResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, addressResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    txtEmpty.setVisibility(View.VISIBLE);
                    recyWishlist.setVisibility(View.GONE);
                }
                break;
            case ApiConstants.Constants.API_DELETE_WISHLIST:
                WishListResponse deleteWishListResponse = (WishListResponse) response.body();
                if (deleteWishListResponse.getStatus().getCode() == 1) {
                    getWishList();
                    Toast.makeText(this, deleteWishListResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(this, deleteWishListResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();

                }
                break;
            case ApiConstants.Constants.API_ADD_CART:
                WishListResponse wishListResponse = (WishListResponse) response.body();
                if (wishListResponse != null && wishListResponse.getStatus() != null && !wishListResponse.getStatus().getMessage().isEmpty()) {
                    Toast.makeText(this, Html.fromHtml(wishListResponse.getStatus().getMessage()).toString(), Toast.LENGTH_SHORT).show();
                }
                break;
        }


    }

    @Override
    public void onErrorResponse(String message, int requestType) {
        dismissDialog();

    }

    @Override
    public void wishListDeleteClick(View view, WishListData product) {
        showDialog();
        String authorization = DataHelper.getAuthToken(this);
        wishListPresenter.deleteWishList(authorization, product.getProductId(), ApiConstants.Constants.API_DELETE_WISHLIST);
    }

    @Override
    public void wishListAddCartClick(View view, WishListData item) {
        Product product = new Product();
        product.setProductId(item.getProductId());
        product.setQuantity(1 + "");
        cartPresenter.addProductToCart(DataHelper.getAuthToken(this), product, ApiConstants.Constants.API_ADD_CART);
    }
}