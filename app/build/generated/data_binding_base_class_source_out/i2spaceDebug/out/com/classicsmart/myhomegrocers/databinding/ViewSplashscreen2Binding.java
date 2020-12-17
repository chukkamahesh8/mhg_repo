// Generated by view binder compiler. Do not edit!
package com.classicsmart.myhomegrocers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.classicsmart.myhomegrocers.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewSplashscreen2Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView imgSplashscreen1;

  @NonNull
  public final TextView tvDeliveryavailability;

  @NonNull
  public final TextView tvExplore;

  private ViewSplashscreen2Binding(@NonNull LinearLayout rootView,
      @NonNull ImageView imgSplashscreen1, @NonNull TextView tvDeliveryavailability,
      @NonNull TextView tvExplore) {
    this.rootView = rootView;
    this.imgSplashscreen1 = imgSplashscreen1;
    this.tvDeliveryavailability = tvDeliveryavailability;
    this.tvExplore = tvExplore;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewSplashscreen2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewSplashscreen2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.view_splashscreen2, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewSplashscreen2Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_splashscreen1;
      ImageView imgSplashscreen1 = rootView.findViewById(id);
      if (imgSplashscreen1 == null) {
        break missingId;
      }

      id = R.id.tv_deliveryavailability;
      TextView tvDeliveryavailability = rootView.findViewById(id);
      if (tvDeliveryavailability == null) {
        break missingId;
      }

      id = R.id.tv_explore;
      TextView tvExplore = rootView.findViewById(id);
      if (tvExplore == null) {
        break missingId;
      }

      return new ViewSplashscreen2Binding((LinearLayout) rootView, imgSplashscreen1,
          tvDeliveryavailability, tvExplore);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
