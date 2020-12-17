// Generated by data binding compiler. Do not edit!
package com.classicsmart.myhomegrocers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.classicsmart.myhomegrocers.R;
import com.denzcoskun.imageslider.ImageSlider;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityHomeBinding extends ViewDataBinding {
  @NonNull
  public final EditText edSearchpanel;

  @NonNull
  public final ImageSlider imageSlider;

  @NonNull
  public final LinearLayout llProfile;

  @NonNull
  public final Button menuButton;

  @NonNull
  public final RecyclerView rvCategories;

  @NonNull
  public final RecyclerView rvProducts;

  @NonNull
  public final LinearLayout toolbar;

  @NonNull
  public final TextView tvLocation;

  @NonNull
  public final ViewSidepanelBinding viewProfile;

  protected ActivityHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      EditText edSearchpanel, ImageSlider imageSlider, LinearLayout llProfile, Button menuButton,
      RecyclerView rvCategories, RecyclerView rvProducts, LinearLayout toolbar, TextView tvLocation,
      ViewSidepanelBinding viewProfile) {
    super(_bindingComponent, _root, _localFieldCount);
    this.edSearchpanel = edSearchpanel;
    this.imageSlider = imageSlider;
    this.llProfile = llProfile;
    this.menuButton = menuButton;
    this.rvCategories = rvCategories;
    this.rvProducts = rvProducts;
    this.toolbar = toolbar;
    this.tvLocation = tvLocation;
    this.viewProfile = viewProfile;
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityHomeBinding>inflateInternal(inflater, R.layout.activity_home, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityHomeBinding>inflateInternal(inflater, R.layout.activity_home, null, false, component);
  }

  public static ActivityHomeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityHomeBinding)bind(component, view, R.layout.activity_home);
  }
}
