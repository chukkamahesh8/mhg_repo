package com.classicsmart.myhomegrocers.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.databinding.NotificationsFragmentBinding;
import com.classicsmart.myhomegrocers.databinding.SpecialOffersFragmentBinding;

public class SpecialOffersFragment extends Fragment {
    public static final String mTitle = "Special Offers";
    private SpecialOffersFragmentBinding specialOffersFragmentBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        specialOffersFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.special_offers_fragment, container, false);
        return specialOffersFragmentBinding.getRoot();
    }

}
