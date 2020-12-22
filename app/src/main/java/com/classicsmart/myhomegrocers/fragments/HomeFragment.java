package com.classicsmart.myhomegrocers.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.activities.CartActivity;
import com.classicsmart.myhomegrocers.activities.DashBoardActivity;
import com.classicsmart.myhomegrocers.activities.DeliveryAddressActivity;
import com.classicsmart.myhomegrocers.activities.LoginActivity;
import com.classicsmart.myhomegrocers.activities.NotificationsActivity;
import com.classicsmart.myhomegrocers.activities.RighttopNavigationActivity;
import com.classicsmart.myhomegrocers.adapters.CategoriesAdapter;
import com.classicsmart.myhomegrocers.adapters.ProductsAdapter;
import com.classicsmart.myhomegrocers.adapters.ViewPagerAdapter;
import com.classicsmart.myhomegrocers.databinding.FragmentHomeBinding;
import com.classicsmart.myhomegrocers.interfaces.DashboardApiCommunicator;
import com.classicsmart.myhomegrocers.models.cart.AddCartResponse;
import com.classicsmart.myhomegrocers.models.cart.Product;
import com.classicsmart.myhomegrocers.models.dashboard.Category;
import com.classicsmart.myhomegrocers.models.dashboard.Data;
import com.classicsmart.myhomegrocers.models.dashboard.PreviouslyOrderedProduct;
import com.classicsmart.myhomegrocers.models.wishlist.WishListResponse;
import com.classicsmart.myhomegrocers.network.ApiConstants;
import com.classicsmart.myhomegrocers.presenters.ApiCallBack;
import com.classicsmart.myhomegrocers.presenters.CartPresenter;
import com.classicsmart.myhomegrocers.presenters.WishListPresenter;
import com.classicsmart.myhomegrocers.utils.DataHelper;

import java.util.ArrayList;

import retrofit2.Response;

public class HomeFragment extends Fragment implements CategoriesAdapter.CategoryItemClickListener, ProductsAdapter.ProductClickListener, ApiCallBack {
    public static final String mTitle = "Home";
    private FragmentHomeBinding homeBinding;
    private View viewTopMore;
    private DashboardApiCommunicator apiCommunicator;
    private CategoriesAdapter categoriesAdapter;
    private ProductsAdapter productsAdapter;
    private ViewPagerAdapter viewPagerAdapter;
    private CartPresenter cartPresenter;
    private WishListPresenter wishListPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        homeBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false);
        initViews();
        initApi();
        return homeBinding.getRoot();

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        apiCommunicator = (DashboardApiCommunicator) context;
    }

    public void initApi() {
        apiCommunicator.getHomeDataApi();
        cartPresenter = new CartPresenter(this);
        wishListPresenter = new WishListPresenter(this);
    }

    private void initViews() {
        homeBinding.rvCategories.setLayoutManager(new GridLayoutManager(getContext(), 3));
        categoriesAdapter = new CategoriesAdapter(getContext(), new ArrayList<Category>(), this);
        homeBinding.rvCategories.setAdapter(categoriesAdapter);
        //Products
        homeBinding.rvProducts.setLayoutManager(new GridLayoutManager(getContext(), 2));
        productsAdapter = new ProductsAdapter(getContext(), new ArrayList<PreviouslyOrderedProduct>(), this);
        homeBinding.rvProducts.setAdapter(productsAdapter);
        viewTopMore = homeBinding.viewMore.rlPanel;
        homeBinding.viewMore.rlPanel.setOnClickListener(v -> {
            //No need to do anything here
        });
        homeBinding.menuButton.setOnClickListener(v -> {
            if (viewTopMore.getVisibility() == View.VISIBLE) {
                viewTopMore.setVisibility(View.GONE);
            } else {
                viewTopMore.setVisibility(View.VISIBLE);
            }
        });
        homeBinding.viewMore.menuClose.setOnClickListener(v -> {
            closeTopMenu();
        });
        homeBinding.llProfile.setOnClickListener(v -> {
            closeTopMenu();
            homeProfile();
        });

        homeBinding.viewMore.tvNotification.setOnClickListener(view -> {
            closeTopMenu();
            Intent intent = new Intent(getContext(), NotificationsActivity.class);
            startActivity(intent);
        });

        homeBinding.viewMore.tvCart.setOnClickListener(view -> {
            closeTopMenu();
            Intent intent = new Intent(getContext(), CartActivity.class);
            startActivity(intent);
        });
        homeBinding.viewMore.tvLogout.setOnClickListener(view -> {
            DataHelper.clearData(getContext());
            Intent intent = new Intent(getContext(), LoginActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
        });
        homeBinding.tvLocation.setOnClickListener(v -> {
            navigateToHomeDelivery();
        });
    }

    public void homeProfile() {
        Intent intent = new Intent(requireActivity(), RighttopNavigationActivity.class);
        startActivity(intent);
    }

    public void closeTopMenu() {
        viewTopMore.setVisibility(View.GONE);
    }

    public void navigateToHomeDelivery() {
        Intent intent = new Intent(getContext(), DeliveryAddressActivity.class);
        startActivity(intent);
    }

   /* public void navigateToCart(){
        Intent
    }*/

    public void updateData(Data data) {
        if (data != null) {
            if (categoriesAdapter != null) {
                categoriesAdapter.setList(data.getCategories());
            }
            if (!data.getPreviouslyOrderedProducts().isEmpty()) {
                homeBinding.llPreviouslyOrderd.setVisibility(View.VISIBLE);
                if (productsAdapter != null) {
                    productsAdapter.setList(data.getPreviouslyOrderedProducts());
                }
            } else {
                homeBinding.llPreviouslyOrderd.setVisibility(View.GONE);
            }
            viewPagerAdapter = new ViewPagerAdapter(getActivity(), data.getBanner());
            homeBinding.tabDots.setupWithViewPager(homeBinding.viewPager, true);
            homeBinding.viewPager.setAdapter(viewPagerAdapter);
        }
    }

    @Override
    public void onCategorySelected(Category item) {

    }

    @Override
    public void onProductItemClicked(View view, PreviouslyOrderedProduct item) {
        switch (view.getId()) {
            case R.id.btn_rl_share:

                break;
            case R.id.btn_rl_fave:
                ((DashBoardActivity) getActivity()).showDialog();
                wishListPresenter.addProductToWishList(DataHelper.getAuthToken(getContext()), item.getId(), ApiConstants.Constants.API_ADD_WISHLIST);
                break;
            case R.id.txt_goto_cart:
                ((DashBoardActivity) getActivity()).showDialog();
                Product product = new Product();
                product.setProductId(item.getId());
                product.setQuantity(1 + "");
                cartPresenter.addProductToCart(DataHelper.getAuthToken(getContext()), product, ApiConstants.Constants.API_ADD_CART);
                break;
        }
    }

    @Override
    public void onSuccessResponse(Response response, int requestType) {
        ((DashBoardActivity) getActivity()).dismissDialog();
        switch (requestType) {
            case ApiConstants.Constants.API_ADD_CART:
                AddCartResponse cart = (AddCartResponse) response.body();
                if (cart != null && cart.getStatus() != null && !cart.getStatus().getMessage().isEmpty()) {
                    Toast.makeText(getContext(), Html.fromHtml(cart.getStatus().getMessage()).toString(), Toast.LENGTH_SHORT).show();
                }
                break;
                case ApiConstants.Constants.API_ADD_WISHLIST:
                WishListResponse wishListResponse = (WishListResponse) response.body();
                if (wishListResponse != null && wishListResponse.getStatus() != null && !wishListResponse.getStatus().getMessage().isEmpty()) {
                    Toast.makeText(getContext(), Html.fromHtml(wishListResponse.getStatus().getMessage()).toString(), Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }

    @Override
    public void onErrorResponse(String message, int requestType) {
        ((DashBoardActivity) getActivity()).dismissDialog();

    }
}
