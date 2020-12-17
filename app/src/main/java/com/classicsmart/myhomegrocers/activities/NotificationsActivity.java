package com.classicsmart.myhomegrocers.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.adapters.OfferAdapter;
import com.classicsmart.myhomegrocers.databinding.ActivityLoginBinding;
import com.classicsmart.myhomegrocers.databinding.ActivityNotificationsBinding;

import java.util.ArrayList;
import java.util.List;

import static com.classicsmart.myhomegrocers.R.color.colorOrange;

public class NotificationsActivity extends AppCompatActivity  {
    TextView textView;
    ActivityNotificationsBinding activityNotificationsBinding;
    RecyclerView offerrecycler;
    OfferAdapter offerAdapter;
    Button btnupdate;
    private List<OffersPojo>offersPojoList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityNotificationsBinding = DataBindingUtil.setContentView(this, R.layout.activity_notifications);
        offerrecycler=findViewById(R.id.offerrecycler);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        offerrecycler.setLayoutManager(layoutManager);
        offerAdapter= new OfferAdapter(offersPojoList);
        offerrecycler.setAdapter(offerAdapter);
        offersData();
        btnupdate=findViewById(R.id.btn_updates);
        btnupdate.setSelected(true);
    }

    private void offersData() {
        OffersPojo offersPojo= new OffersPojo("MyHomeGrocers Biggest Grocers Sale",
                "Live Now | 30%-40% | Extra cash back","10:25");
        offersPojoList.add(offersPojo);

        offersPojo= new OffersPojo("MyHomeGrocers Top Savers.",
                "Lowest price guaranteed ","May 20th 2020 at 12:50");
        offersPojoList.add(offersPojo);


        offersPojo= new OffersPojo("You looked for Almond.",
                "Now it's time to shop your faves from the range of brands","May 18th 2020 at 09:15");
        offersPojoList.add(offersPojo);


        offerAdapter.notifyDataSetChanged();


    }

    public void updates(View view) {
        activityNotificationsBinding.llListupdates.setVisibility(View.VISIBLE);
        activityNotificationsBinding.offerrecycler.setVisibility(View.GONE);
        activityNotificationsBinding.btnUpdates.setSelected(true);
        activityNotificationsBinding.btnOffers.setSelected(false);
    }
    public void offers(View view) {
        activityNotificationsBinding.llListupdates.setVisibility(View.GONE);
        activityNotificationsBinding.offerrecycler.setVisibility(View.VISIBLE);
        activityNotificationsBinding.btnUpdates.setSelected(false);
        activityNotificationsBinding.btnOffers.setSelected(true);

    }

    public void notificationBack(View view) {
        finish();
    }
}