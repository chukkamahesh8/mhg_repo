package com.classicsmart.myhomegrocers.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.adapters.ViewPagerAdapter;
import com.classicsmart.myhomegrocers.models.dashboard.Banner;
import com.classicsmart.myhomegrocers.utils.DataHelper;
import com.classicsmart.myhomegrocers.utils.Utills;
import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.facebook.appevents.ml.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    RecyclerView rvCategories, rvProducts;
    GridLayoutManager gmCategories, gmProducts;
    Button menuButton;
    TextView categoryLevel, notificaton, tvLogout,cart;
    View viewMenu;
    ScrollView scrollView;
    ViewPager viewPager;
    private ArrayList<Banner>banners=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        viewPager=(ViewPager)findViewById(R.id.view_pager);
        Type journeyDetailsType = new TypeToken<ArrayList<Banner>>() {
        }.getType();
        banners = new Gson().fromJson(Utills.getJsonFromAssets(this, "banners.json"), journeyDetailsType);
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(this,banners);
        viewPager.setAdapter(viewPagerAdapter);
        rvCategories = findViewById(R.id.rv_categories);
        rvProducts = findViewById(R.id.rv_products);
        gmCategories = new GridLayoutManager(this, 3);
        rvCategories.setLayoutManager(gmCategories);
        gmProducts = new GridLayoutManager(this, 2);
        rvProducts.setLayoutManager(gmProducts);
        ImageSlider imageSlider = findViewById(R.id.image_slider);
        List<SlideModel> slideModelList = new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.ic_fruits_vegetables, ""));
        slideModelList.add(new SlideModel(R.drawable.ic_fruits_vegetables, ""));
        slideModelList.add(new SlideModel(R.drawable.ic_fruits_vegetables, ""));
        slideModelList.add(new SlideModel(R.drawable.ic_fruits_vegetables, ""));
        imageSlider.setImageList(slideModelList);

        TextView tv = (TextView) findViewById(R.id.tv_Location);
        Spannable wordtoSpan = new SpannableString("Deliver to Customer Name - Location Pincode");
        wordtoSpan.setSpan(new StyleSpan(Typeface.BOLD), 11, 42, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv.setText(wordtoSpan);


        menuButton = findViewById(R.id.menuButton);
        viewMenu = findViewById(R.id.view_profile);
        tvLogout = findViewById(R.id.tv_logout);
        menuButton.setOnClickListener(v -> {
            if (viewMenu.getVisibility() == View.VISIBLE) {
                viewMenu.setVisibility(View.GONE);
            } else {
                viewMenu.setVisibility(View.VISIBLE);
            }
        });
       // categoryLevel = findViewById(R.id.tv_CategoryLevel);
        categoryLevel.setOnClickListener(view -> {
            Intent intent = new Intent(this, CategoryWishlist2Activity.class);
            startActivity(intent);
        });
        notificaton = findViewById(R.id.tv_Notification);
        notificaton.setOnClickListener(view -> {
            Intent intent = new Intent(this, NotificationsActivity.class);
            startActivity(intent);
        });


        tvLogout.setOnClickListener(view -> {
            DataHelper.clearData(this);
            Intent intent = new Intent(HomeActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });


    }
    public void homeProfile(View view) {
        Intent intent = new Intent(this, RighttopNavigationActivity.class);
        startActivity(intent);
    }

/*    public void view(View view) {
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }*/

    public void close(View view) {
        viewMenu.setVisibility(View.GONE);
    }
/*
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_profilesidepanel, menu);
        return super.onCreateOptionsMenu(menu);
    }*/

    public void homeDeliveryAdd(View view) {
        Intent intent = new Intent(this, DeliveryAddressActivity.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}