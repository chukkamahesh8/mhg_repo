// Generated by data binding compiler. Do not edit!
package com.classicsmart.myhomegrocers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.classicsmart.myhomegrocers.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemEnterforgotpasswordBinding extends ViewDataBinding {
  @NonNull
  public final ImageView Imgview;

  @NonNull
  public final Button btnchangemail;

  @NonNull
  public final LinearLayout cardView2;

  @NonNull
  public final EditText edtxtpassword;

  @NonNull
  public final LinearLayout llTitle;

  @NonNull
  public final RelativeLayout rlOtppassword;

  @NonNull
  public final ImageView tick;

  @NonNull
  public final TextView tvForgotPassword;

  @NonNull
  public final TextView tvForgotYourPassword;

  @NonNull
  public final TextView tvLoginviaotp;

  @NonNull
  public final TextView tvPleaseupdatetocontinue;

  @NonNull
  public final View viewShade;

  protected ItemEnterforgotpasswordBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ImageView Imgview, Button btnchangemail, LinearLayout cardView2,
      EditText edtxtpassword, LinearLayout llTitle, RelativeLayout rlOtppassword, ImageView tick,
      TextView tvForgotPassword, TextView tvForgotYourPassword, TextView tvLoginviaotp,
      TextView tvPleaseupdatetocontinue, View viewShade) {
    super(_bindingComponent, _root, _localFieldCount);
    this.Imgview = Imgview;
    this.btnchangemail = btnchangemail;
    this.cardView2 = cardView2;
    this.edtxtpassword = edtxtpassword;
    this.llTitle = llTitle;
    this.rlOtppassword = rlOtppassword;
    this.tick = tick;
    this.tvForgotPassword = tvForgotPassword;
    this.tvForgotYourPassword = tvForgotYourPassword;
    this.tvLoginviaotp = tvLoginviaotp;
    this.tvPleaseupdatetocontinue = tvPleaseupdatetocontinue;
    this.viewShade = viewShade;
  }

  @NonNull
  public static ItemEnterforgotpasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_enterforgotpassword, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemEnterforgotpasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemEnterforgotpasswordBinding>inflateInternal(inflater, R.layout.item_enterforgotpassword, root, attachToRoot, component);
  }

  @NonNull
  public static ItemEnterforgotpasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_enterforgotpassword, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemEnterforgotpasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemEnterforgotpasswordBinding>inflateInternal(inflater, R.layout.item_enterforgotpassword, null, false, component);
  }

  public static ItemEnterforgotpasswordBinding bind(@NonNull View view) {
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
  public static ItemEnterforgotpasswordBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ItemEnterforgotpasswordBinding)bind(component, view, R.layout.item_enterforgotpassword);
  }
}
