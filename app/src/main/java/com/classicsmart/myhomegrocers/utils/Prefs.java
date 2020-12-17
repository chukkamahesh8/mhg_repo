package com.classicsmart.myhomegrocers.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


import com.classicsmart.myhomegrocers.App;
import com.classicsmart.myhomegrocers.R;

import java.util.HashSet;
import java.util.Set;


public class Prefs {
    final static String KEY = App.getContext().getString(R.string.app_name);
    private static Prefs prefs;
    private SharedPreferences sharedPreferences;
    private static final String ACCESS_TOKEN = "ACCESS_TOKEN";
    private String profilePicture;
    private int userTypeId = 5;

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public double getTotalDepositInDollar() {
        return totalDepositInDollar;
    }

    public void setTotalDepositInDollar(double totalDepositInDollar) {
        this.totalDepositInDollar = totalDepositInDollar;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    private double totalDepositInDollar;

    private Prefs() {
        Context ctx = App.getContext();
        sharedPreferences = ctx.getSharedPreferences(ctx.getPackageName(), Context.MODE_PRIVATE);
    }

    public static synchronized Prefs getInstance() {

        if (prefs == null) {
            prefs = new Prefs();
        }
        return prefs;

    }


    public String getAccessToken() {

        return sharedPreferences.getString(ACCESS_TOKEN, "");
    }

    public void setAccessToken(String value) {
        sharedPreferences.edit().putString(ACCESS_TOKEN, value).apply();
    }

    public static void putSharedPreferencesInt(Context context, String key, int value) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putInt(key, value);
        edit.apply();
    }

    public static void putSharedPreferencesBoolean(Context context, String key,
                                                   boolean val) {
        SharedPreferences preferences = context.getSharedPreferences(KEY, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putBoolean(key, val);
        edit.apply();
    }


    public static void putSharedPreferencesString(Context context, String key,
                                                  String val) {
        SharedPreferences preferences = context.getSharedPreferences(KEY, Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putString(key, val);
        edit.apply();
    }

    public static void putSharedPreferencesFloat(Context context, String key,
                                                 float val) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putFloat(key, val);
        edit.apply();
    }

    public static void putSharedPreferencesLong(Context context, String key,
                                                long val) {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putLong(key, val);
        edit.apply();
    }


    public static void putSharedPreferencesStringArray(Context context,
                                                       String key, String[] val, String separator) {

        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(context);

        SharedPreferences.Editor edit = preferences.edit();


        String value = new String();

        for (int i = 0; i < val.length; i++) {
            value = value + val[i] + separator;
        }

        edit.putString(key, value);
        edit.apply();

    }


    public static String[] getSharedPreferencesStringArray(Context context,
                                                           String key, String _default) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(context);

        String value = preferences.getString(key, _default);
        String separator = null;

        if (value != _default) {
            separator = value.substring(value.length() - 1);
            value = value.substring(0, value.length() - 1);
            String result[] = value.trim().split(separator.trim());
            return result;
        }

        return null;
    }


    public static long getSharedPreferencesLong(Context context, String key,
                                                long _default) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        return preferences.getLong(key, _default);
    }

    public static float getSharedPreferencesFloat(Context context, String key,
                                                  float _default) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        return preferences.getFloat(key, _default);
    }

    public static String getSharedPreferencesString(Context context,
                                                    String key, String _default) {
        SharedPreferences preferences = context.getSharedPreferences(KEY, Context.MODE_PRIVATE);
        return preferences.getString(key, _default);
    }

    public static int getSharedPreferencesInt(Context context, String key,
                                              int _default) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        return preferences.getInt(key, _default);
    }

    public static boolean getSharedPreferencesBoolean(Context context,
                                                      String key, boolean _default) {
        SharedPreferences preferences = context.getSharedPreferences(KEY, Context.MODE_PRIVATE);
        return preferences.getBoolean(key, _default);
    }

    public static boolean checkIsLogin(Context c, String key) {

        if (getSharedPreferencesString(c, key, null) == null
                || getSharedPreferencesString(c, key, null).equals(""))
            return false;

        return true;
    }

    public static void putSharedPreferencesSet(Context context, String key, String val) {

        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = preferences.edit();

        Set<String> stringSet = preferences.getStringSet(key, null);

        if (stringSet != null) {

            if (!stringSet.contains(val))
                stringSet.add(val);

        } else {

            stringSet = new HashSet<String>();
            stringSet.add(val);

        }

        edit.putStringSet(key, stringSet);
        edit.apply();

    }

    public static Set<String> getSharedPreferencesSet(Context context, String key) {

        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor edit = preferences.edit();

        Set<String> stringSet = preferences.getStringSet(key, null);

        return stringSet;
    }


    public static void clearSharedPreferences(Context context) {
        SharedPreferences settings = context.getSharedPreferences(KEY, Context.MODE_PRIVATE);
        settings.getAll().clear();
        settings.edit().clear().apply();
    }

    public static void putAppSharedPreferencesString(Context context, String key,
                                                     String val) {
        SharedPreferences preferences = context.getSharedPreferences("AppInfo", Context.MODE_PRIVATE);
        SharedPreferences.Editor edit = preferences.edit();
        edit.putString(key, val);
        edit.apply();
    }


    public static String getAppSharedPreferencesString(Context context,
                                                       String key, String _default) {
        SharedPreferences preferences = context.getSharedPreferences("AppInfo", Context.MODE_PRIVATE);
        return preferences.getString(key, _default);
    }

}
