package com.classicsmart.myhomegrocers.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.databinding.FragmentHomeBinding;
import com.classicsmart.myhomegrocers.databinding.NotificationsFragmentBinding;

public class NotificationsFragment extends Fragment {
    public static final String mTitle = "Notifications";
    private NotificationsFragmentBinding notificationsFragmentBinding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        notificationsFragmentBinding = DataBindingUtil.inflate(inflater, R.layout.notifications_fragment, container, false);
        return notificationsFragmentBinding.getRoot();
    }
}
