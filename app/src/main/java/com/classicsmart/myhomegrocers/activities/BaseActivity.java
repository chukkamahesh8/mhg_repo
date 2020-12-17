package com.classicsmart.myhomegrocers.activities;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.classicsmart.myhomegrocers.R;
import com.google.gson.Gson;


public abstract class BaseActivity extends AppCompatActivity {

    /*variable declaration*/
  //  public CustomToast mToast;
    private Dialog progressDialog, textDialog;
    protected final String UserPref = "trusGoPref";
    protected final String sessionCheckingString = "trusGoCheck";
    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public static void setStatusBarGradiant(Activity activity) {
       /* if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = activity.getWindow();
            Drawable background = activity.getResources().getDrawable(R.drawable.c);
            window.addFlags(FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(activity.getResources().getColor(android.R.color.transparent));
            window.setBackgroundDrawable(background);
        }*/
    }


    /*load fragment*/
    public void loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_container, fragment)
                    .commitNow();
//            fadeOutIn(findViewById(R.id.frame_container));
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  mToast = new CustomToast(this);
        setStatusBarGradiant(this);
        initDialog();
        initWithTextDialog();
    }



    /*set type face*/
    public void setTypeFace(EditText tv) {
        Typeface face = Typeface.createFromAsset(getAssets(), "font/googlesansregular.ttf");
        tv.setTypeface(face);
    }

    /* *//*load fragment*//*
    public void loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frame_container, fragment)
                    .commit();
            fadeOutIn(findViewById(R.id.frame_container));
        }
    }*/

    /*Animation*/
 /*   public void RunLayoutAnimation(RecyclerView recyclerView) {
        final LayoutAnimationController controller = AnimationUtils.loadLayoutAnimation(this, R.anim.anim_up_to_down);
        recyclerView.setLayoutAnimation(controller);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }
*/
    /*Fade out in*/
    public void fadeOutIn(View view) {
        view.setAlpha(0);
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator animatorAlpha = ObjectAnimator.ofFloat(view, "alpha", 0f, 0.5f, 1f);
        ObjectAnimator.ofFloat(view, "alpha", 0f).start();
        animatorAlpha.setDuration(300);
        animatorSet.play(animatorAlpha);
        animatorSet.start();
    }

    /*intent*/
    public void startActivity(Class aClass) {
        startActivity(new Intent(this, aClass));
    }

    /*intent*/
    public void startActivityWithOutStack(Class aClass) {
        Intent intent = (new Intent(this, aClass));
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    /*show view*/
    public void showView(View view) {
        view.setVisibility(View.VISIBLE);
    }

    /*hide view*/
    public void hideView(View view) {
        view.setVisibility(View.GONE);
    }

    /*invisible view*/
    public void invisibleView(View view) {
        view.setVisibility(View.INVISIBLE);
    }

    /* set notification *//*
    public void SetNotificationImage(ImageView view) {
        Glide.with(this).load(R.raw.gif_bell).into(view);
    }*/

    /* load image */
   /* public void setImage(int i, ImageView imageView) {
        Glide.with(this).load(i).into(imageView);
    }
*/
    public void initDialog() {
        progressDialog = new Dialog(this);
        progressDialog.setContentView(R.layout.progress);
//        ImageView iv = dialog.findViewById(R.id.progress);
        progressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        progressDialog.setCancelable(true);
//        Glide.with(this).load(R.drawable.pleasewait).into(iv);
    }

    public void showDialog() {
        if (progressDialog != null && !progressDialog.isShowing()) {
            progressDialog.show();
        }
    }

    public void dismissDialog() {
        if (progressDialog != null && progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
    }

    /*This method is used to  check the internet connectivity  whether net is connected or not*/
    public boolean isConnectedToInternet() {

        ConnectivityManager connectivityManager
                = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void initWithTextDialog() {
        textDialog = new Dialog(this);
        textDialog.setContentView(R.layout.progressbar_please_wait);
        textDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        progressDialog.setCancelable(false);
//        Glide.with(this).load(R.drawable.pleasewait).into(iv);
    }

    public void showTextDialog() {
        if (textDialog != null) {
            textDialog.show();
        }
    }

    public void initWithTextDialogParam(String message) {
        textDialog = new Dialog(this);
        textDialog.setContentView(R.layout.progressbar_please_wait);
        textDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        TextView tv = textDialog.findViewById(R.id.tv_pb);
        if (message != null) {
            tv.setText(message);
        }else {
            tv.setText(null);
        }
        textDialog.setCancelable(false);
//        Glide.with(this).load(R.drawable.pleasewait).into(iv);
    }

    /*show custom toast*/
    /*public void showToast(String aContent) {
        mToast.setCustomView(aContent);
        mToast.setDuration(Toast.LENGTH_SHORT);
//        mToast.setGravity(Gravity.CENTER, 0, 0);
        mToast.show();
    }
*/
    public void dismissTextDialog() {
        if (textDialog != null && textDialog.isShowing()) {
            textDialog.dismiss();
        }
    }

/*    public void showCustomAlert(
            String message, boolean showNegative) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.text_confirmation)).setMessage(message);
        builder.setPositiveButton(getString(R.string.text_yes),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        alertCallBack();
                    }
                });
        if (showNegative) {
            builder.setNegativeButton(getString(R.string.text_no),
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.cancel();
                        }
                    });
        }
        AlertDialog alert1 = builder.create();
        alert1.show();
    }

    protected abstract void alertCallBack();*/
}
