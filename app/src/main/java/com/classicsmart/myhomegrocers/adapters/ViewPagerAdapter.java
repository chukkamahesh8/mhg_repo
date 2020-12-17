package com.classicsmart.myhomegrocers.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.models.dashboard.Banner;

import java.util.List;

public class ViewPagerAdapter extends PagerAdapter {
    private Context mContext;
    private LayoutInflater layoutInflater;
    private List<Banner> bannermodels;

    public ViewPagerAdapter(Context context, List<Banner> bannermodels) {
        this.bannermodels = bannermodels;
        this.mContext = context;

    }

    public void setList(List<Banner> sourcesList) {
        this.bannermodels = sourcesList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return bannermodels.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_image_layout, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.custom_image);
        Glide.with(mContext).load(bannermodels.get(position).getImage()).placeholder(R.drawable.ic_fruits_vegetables).into(imageView);
        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);
    }
}
