package com.classicsmart.myhomegrocers.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.databinding.FragmentHomeBinding;
import com.classicsmart.myhomegrocers.databinding.MyOrdersFragmentBinding;

public class OrdersFragment extends Fragment {
    public static final String mTitle = "My Orders";
    private MyOrdersFragmentBinding ordersFragmentBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ordersFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.my_orders_fragment, container, false);
        return ordersFragmentBinding.getRoot();
    }
}
