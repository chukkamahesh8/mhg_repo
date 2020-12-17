// Generated by view binder compiler. Do not edit!
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
import androidx.viewbinding.ViewBinding;
import com.classicsmart.myhomegrocers.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityChangePasswordBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView Imgview;

  @NonNull
  public final Button btnUpdatePassword;

  @NonNull
  public final EditText edtxtConfirmNewPassword;

  @NonNull
  public final EditText edtxtCurrentPassword;

  @NonNull
  public final EditText edtxtNewPassword;

  @NonNull
  public final RelativeLayout rlTop;

  @NonNull
  public final TextView tvChangepassword;

  @NonNull
  public final TextView txtAtleast1number;

  @NonNull
  public final TextView txtAtleast1uppercaseletter;

  @NonNull
  public final TextView txtAtleast8characters;

  @NonNull
  public final TextView txtPasswordmustcontain;

  private ActivityChangePasswordBinding(@NonNull LinearLayout rootView, @NonNull ImageView Imgview,
      @NonNull Button btnUpdatePassword, @NonNull EditText edtxtConfirmNewPassword,
      @NonNull EditText edtxtCurrentPassword, @NonNull EditText edtxtNewPassword,
      @NonNull RelativeLayout rlTop, @NonNull TextView tvChangepassword,
      @NonNull TextView txtAtleast1number, @NonNull TextView txtAtleast1uppercaseletter,
      @NonNull TextView txtAtleast8characters, @NonNull TextView txtPasswordmustcontain) {
    this.rootView = rootView;
    this.Imgview = Imgview;
    this.btnUpdatePassword = btnUpdatePassword;
    this.edtxtConfirmNewPassword = edtxtConfirmNewPassword;
    this.edtxtCurrentPassword = edtxtCurrentPassword;
    this.edtxtNewPassword = edtxtNewPassword;
    this.rlTop = rlTop;
    this.tvChangepassword = tvChangepassword;
    this.txtAtleast1number = txtAtleast1number;
    this.txtAtleast1uppercaseletter = txtAtleast1uppercaseletter;
    this.txtAtleast8characters = txtAtleast8characters;
    this.txtPasswordmustcontain = txtPasswordmustcontain;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityChangePasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityChangePasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_change__password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityChangePasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Imgview;
      ImageView Imgview = rootView.findViewById(id);
      if (Imgview == null) {
        break missingId;
      }

      id = R.id.btnUpdatePassword;
      Button btnUpdatePassword = rootView.findViewById(id);
      if (btnUpdatePassword == null) {
        break missingId;
      }

      id = R.id.edtxtConfirmNewPassword;
      EditText edtxtConfirmNewPassword = rootView.findViewById(id);
      if (edtxtConfirmNewPassword == null) {
        break missingId;
      }

      id = R.id.edtxtCurrentPassword;
      EditText edtxtCurrentPassword = rootView.findViewById(id);
      if (edtxtCurrentPassword == null) {
        break missingId;
      }

      id = R.id.edtxtNewPassword;
      EditText edtxtNewPassword = rootView.findViewById(id);
      if (edtxtNewPassword == null) {
        break missingId;
      }

      id = R.id.rl_top;
      RelativeLayout rlTop = rootView.findViewById(id);
      if (rlTop == null) {
        break missingId;
      }

      id = R.id.tv_changepassword;
      TextView tvChangepassword = rootView.findViewById(id);
      if (tvChangepassword == null) {
        break missingId;
      }

      id = R.id.txtAtleast1number;
      TextView txtAtleast1number = rootView.findViewById(id);
      if (txtAtleast1number == null) {
        break missingId;
      }

      id = R.id.txtAtleast1uppercaseletter;
      TextView txtAtleast1uppercaseletter = rootView.findViewById(id);
      if (txtAtleast1uppercaseletter == null) {
        break missingId;
      }

      id = R.id.txtAtleast8characters;
      TextView txtAtleast8characters = rootView.findViewById(id);
      if (txtAtleast8characters == null) {
        break missingId;
      }

      id = R.id.txtPasswordmustcontain;
      TextView txtPasswordmustcontain = rootView.findViewById(id);
      if (txtPasswordmustcontain == null) {
        break missingId;
      }

      return new ActivityChangePasswordBinding((LinearLayout) rootView, Imgview, btnUpdatePassword,
          edtxtConfirmNewPassword, edtxtCurrentPassword, edtxtNewPassword, rlTop, tvChangepassword,
          txtAtleast1number, txtAtleast1uppercaseletter, txtAtleast8characters,
          txtPasswordmustcontain);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
