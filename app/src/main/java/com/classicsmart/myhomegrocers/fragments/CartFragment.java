package com.classicsmart.myhomegrocers.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.adapters.CartAdapter;
import com.classicsmart.myhomegrocers.databinding.CartFragmentBinding;
import com.classicsmart.myhomegrocers.databinding.NotificationsFragmentBinding;
import com.classicsmart.myhomegrocers.interfaces.DashboardApiCommunicator;
import com.classicsmart.myhomegrocers.models.cart.CartData;
import com.classicsmart.myhomegrocers.models.cart.GetCartResponse;
import com.classicsmart.myhomegrocers.models.cart.Product;
import com.classicsmart.myhomegrocers.network.ApiConstants;
import com.classicsmart.myhomegrocers.presenters.ApiCallBack;
import com.classicsmart.myhomegrocers.presenters.CartPresenter;

import java.util.ArrayList;

import retrofit2.Response;

public class CartFragment extends Fragment {
    public static final String mTitle = "Cart";
    private CartFragmentBinding cartFragmentBinding;
    CartPresenter cartPresenter;
    DashboardApiCommunicator apiCommunicator;
    RecyclerView rv_getCart;
    private CartAdapter cartAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        cartFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.cart_fragment, container, false);
        initViews();
        initApi();
        return cartFragmentBinding.getRoot();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        apiCommunicator = (DashboardApiCommunicator) context;
    }

    private void initApi() {
        apiCommunicator.getCartDataApi();
    }

    private void initViews() {
        cartFragmentBinding.rvGetcart.setLayoutManager(new GridLayoutManager(getContext(),1));
    }




    public void updateData(GetCartResponse data) {
        if (data!=null){
            cartFragmentBinding.tvEmpty.setVisibility(View.GONE);
                cartAdapter=new CartAdapter(getActivity(),data.getData().getProducts());
                cartFragmentBinding.rvGetcart.setAdapter(cartAdapter);
                cartAdapter.notifyDataSetChanged();
        }else {
            cartFragmentBinding.tvEmpty.setVisibility(View.VISIBLE);
        }
    }

}
