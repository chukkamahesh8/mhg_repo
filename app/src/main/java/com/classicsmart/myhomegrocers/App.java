package com.classicsmart.myhomegrocers;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.lifecycle.ProcessLifecycleOwner;

public class App extends Application implements LifecycleObserver {
    private static App app;
    private static final String TAG = "App";
    public boolean inBackground = false;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        ProcessLifecycleOwner.get().getLifecycle().addObserver(this);
       // FirebaseApp.initializeApp(this);
    }
    public static synchronized App getInstance() {
        return app;
    }

    public static Context getContext() {
        return app.getBaseContext();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onAppBackgrounded() {
        Log.d(TAG, "onAppBackgrounded: ");
        inBackground = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onAppForegrounded() {
        Log.d(TAG, "onAppForegrounded: ");
        inBackground = false;

    }
}
