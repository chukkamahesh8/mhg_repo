package com.classicsmart.myhomegrocers.activities;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.fragments.CartFragment;
import com.classicsmart.myhomegrocers.fragments.HomeFragment;
import com.classicsmart.myhomegrocers.fragments.NotificationsFragment;
import com.classicsmart.myhomegrocers.fragments.OrdersFragment;
import com.classicsmart.myhomegrocers.fragments.SpecialOffersFragment;
import com.classicsmart.myhomegrocers.interfaces.DashboardApiCommunicator;
import com.classicsmart.myhomegrocers.models.cart.GetCartResponse;
import com.classicsmart.myhomegrocers.models.dashboard.DashboardResponse;
import com.classicsmart.myhomegrocers.network.ApiConstants;
import com.classicsmart.myhomegrocers.presenters.ApiCallBack;
import com.classicsmart.myhomegrocers.presenters.CartPresenter;
import com.classicsmart.myhomegrocers.presenters.DashBoardPresenter;
import com.classicsmart.myhomegrocers.utils.DataHelper;

import retrofit2.Response;

public class DashBoardActivity extends BaseActivity implements View.OnClickListener, ApiCallBack, DashboardApiCommunicator {

    /*variable declaration*/
    private TextView mTvTitle;
    private HomeFragment mHomeFragmentNewest = new HomeFragment();
    private OrdersFragment mOrdersFragment = new OrdersFragment();
    private NotificationsFragment mNotificationsFragment = new NotificationsFragment();
    private SpecialOffersFragment mSpecialOffersFragment = new SpecialOffersFragment();
    private CartFragment mCartFragment = new CartFragment();
    private Toolbar toolbar;
    private LinearLayout mLlHome, mllNotifications, mllSOffers, mllCart, mllOrders;
    private ImageView mIvHome, mIvOrders, mIvNotifications, mIvSpecialOffers, mIvCart;
    private DashBoardPresenter dashBoardPresenter;
    private CartPresenter cartPresenter;

    public static void start(Context context) {
        Intent intent = new Intent(context, DashBoardActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        initLayouts();
        initializeListeners();
        loadFragment(mHomeFragmentNewest);
        initPresenters();

    }

    private void initPresenters() {
        dashBoardPresenter = new DashBoardPresenter(this);
        cartPresenter = new CartPresenter(this);
    }

    /* init layout */
    @SuppressLint("ClickableViewAccessibility")
    public void initLayouts() {
        // mTvTitle = findViewById(R.id.tvTitle);
        mllOrders = findViewById(R.id.ll_orders);
        mLlHome = findViewById(R.id.llHome);
        mllNotifications = findViewById(R.id.ll_notifications);
        mllSOffers = findViewById(R.id.ll_special_offers);
        mllCart = findViewById(R.id.ll_cart);
        mIvHome = findViewById(R.id.ivHome);
        mIvCart = findViewById(R.id.iv_cart);
        mIvOrders = findViewById(R.id.iv_orders);
        mIvNotifications = findViewById(R.id.iv_notifications);
        mIvSpecialOffers = findViewById(R.id.iv_special_offers);
        toolbar = findViewById(R.id.toolbar);


      /*  ivBack = findViewById(R.id.ivBack);
        ivBack.setOnClickListener(v -> {
            finish();
        });*/
    }

    /* initialize listener */
    public void initializeListeners() {
    }
    /*
     *//* set selected item in bottom navigation *//*
    private void setSelected(ImageView mBarImg) {
        mBarImg.setBackground(getResources().getDrawable(R.drawable.bg_tint_icon));

    }*/

    /* onBack press */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    /* onClick listener */
    /* onClick listener */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.llHome:
                if (!mHomeFragmentNewest.isVisible()) {
                    toolbar.setTitle(HomeFragment.mTitle);
                    loadFragment(mHomeFragmentNewest);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        mIvHome.setImageResource(R.drawable.ic_active_mhg_logo);
                        mIvOrders.setImageResource(R.drawable.ic_myorders_inactive);
                        mIvNotifications.setImageResource(R.drawable.ic_bell_inactive);
                        mIvSpecialOffers.setImageResource(R.drawable.ic_special_offers_inactive);
                        mIvCart.setImageResource(R.drawable.ic_cart_inactive);
                    }
                }
                break;
            case R.id.ll_orders:
                if (!mOrdersFragment.isVisible()) {
                    toolbar.setTitle(OrdersFragment.mTitle);
                    loadFragment(mOrdersFragment);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        mIvHome.setImageResource(R.drawable.ic_mhg_logo_inactive);
                        mIvOrders.setImageResource(R.drawable.ic__active_myorders);
                        mIvNotifications.setImageResource(R.drawable.ic_bell_inactive);
                        mIvSpecialOffers.setImageResource(R.drawable.ic_special_offers_inactive);
                        mIvCart.setImageResource(R.drawable.ic_cart_inactive);
                    }
                }
                break;

            case R.id.ll_special_offers:
                if (!mSpecialOffersFragment.isVisible()) {
                    toolbar.setTitle(SpecialOffersFragment.mTitle);
                    loadFragment(mSpecialOffersFragment);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        mIvHome.setImageResource(R.drawable.ic_mhg_logo_inactive);
                        mIvOrders.setImageResource(R.drawable.ic_myorders_inactive);
                        mIvNotifications.setImageResource(R.drawable.ic_bell_inactive);
                        mIvSpecialOffers.setImageResource(R.drawable.ic_active_special_offers);
                        mIvCart.setImageResource(R.drawable.ic_cart_inactive);
                    }
                }
                break;
            case R.id.ll_notifications:
                if (!mNotificationsFragment.isVisible()) {
                    toolbar.setTitle(NotificationsFragment.mTitle);
                    loadFragment(mNotificationsFragment);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        mIvHome.setImageResource(R.drawable.ic_mhg_logo_inactive);
                        mIvOrders.setImageResource(R.drawable.ic_myorders_inactive);
                        mIvNotifications.setImageResource(R.drawable.ic__active_bell);
                        mIvSpecialOffers.setImageResource(R.drawable.ic_special_offers_inactive);
                        mIvCart.setImageResource(R.drawable.ic_cart_inactive);
                    }
                }
                break;
            case R.id.ll_cart:
                if (!mCartFragment.isVisible()) {
                    toolbar.setTitle(CartFragment.mTitle);
                    loadFragment(mCartFragment);
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                        mIvHome.setImageResource(R.drawable.ic_mhg_logo_inactive);
                        mIvOrders.setImageResource(R.drawable.ic_myorders_inactive);
                        mIvNotifications.setImageResource(R.drawable.ic_bell_inactive);
                        mIvSpecialOffers.setImageResource(R.drawable.ic_special_offers_inactive);
                        mIvCart.setImageResource(R.drawable.ic_active_cart);

                    }
                }
                break;
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    public void onSuccessResponse(Response response, int requestType) {
        switch (requestType) {
            case ApiConstants.Constants.API_DASHBOARD_HOME:
                if (mHomeFragmentNewest.isAdded()) {

                    DashboardResponse dashboardResponse = (DashboardResponse) response.body();
                    if (dashboardResponse.getStatus().getCode() == 1) {
                        mHomeFragmentNewest.updateData(dashboardResponse.getData());
                    }
                }
            case ApiConstants.Constants.API_GET_CART:
                if (mCartFragment.isAdded()) {
                    GetCartResponse getCartResponse = (GetCartResponse) response.body();
                    if (getCartResponse.getStatus().getCode() == 1) {
                        mCartFragment.updateData(getCartResponse);
                    }
                }
                break;
        }
        dismissDialog();
    }

    @Override
    public void onErrorResponse(String message, int requestType) {
        dismissDialog();
    }

    @Override
    public void getHomeDataApi() {
        showDialog();
        String authorization = "Bearer " + DataHelper.getAuthToken(this);
        dashBoardPresenter.getHomeDashBoardApi(authorization, ApiConstants.Constants.API_DASHBOARD_HOME);
    }

    @Override
    public void getCartDataApi() {
        showDialog();
        //String authorization = "Bearer " + DataHelper.getAuthToken(this);
        String authorization = "Bearer " + "ee09036008df251726b734c3808b3fd19f8d38ae";
        cartPresenter.getCartList(authorization, ApiConstants.Constants.API_GET_CART);

    }
}
