package com.classicsmart.myhomegrocers.activities;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Handler;
import android.util.Base64;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.utils.DataHelper;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class SplashScreenActivity extends AppCompatActivity {
    private static final int SPLASH_DISPLAY_TIME = 3000;
    private static final String TAG = SplashScreenActivity.class.getName();

    View Splash, splash1, splash2, splash3, splash4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_activity);
        Splash = findViewById(R.id.ImgSplash);
        splash1 = findViewById(R.id.view_splash1);
        splash2 = findViewById(R.id.view_splash2);
        splash3 = findViewById(R.id.view_splash3);
        splash4 = findViewById(R.id.view_splash4);
        printHashKey(this);
        new Handler().postDelayed(new Runnable() {
            public void run() {
                if (!DataHelper.isFirstTime(SplashScreenActivity.this)) {
                    Intent intent = new Intent();
                    intent.setClass(SplashScreenActivity.this,
                            WelcomeActivity.class);

                    startActivity(intent);
                    finish();
                } else {
                    if (DataHelper.getUserData(SplashScreenActivity.this) != null) {
                        Intent intent = new Intent();
                        intent.setClass(SplashScreenActivity.this,
                                DashBoardActivity.class);

                        startActivity(intent);
                        finish();
                    } else {
                        Intent intent = new Intent();
                        intent.setClass(SplashScreenActivity.this,
                                LoginActivity.class);

                        startActivity(intent);
                        finish();
                    }
                }


            }
        }, SPLASH_DISPLAY_TIME);
    }


    public static void printHashKey(Context pContext) {
        try {
            PackageInfo info = pContext.getPackageManager().getPackageInfo(pContext.getPackageName(), PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                String hashKey = new String(Base64.encode(md.digest(), 0));
                Log.i(TAG, "printHashKey() Hash Key: " + hashKey);
            }
        } catch (NoSuchAlgorithmException e) {
            Log.e(TAG, "printHashKey()", e);
        } catch (Exception e) {
            Log.e(TAG, "printHashKey()", e);
        }
    }

    public void Splash(View view) {

    }


}