package com.classicsmart.myhomegrocers.utils;

import android.content.Context;
import android.service.autofill.UserData;

import com.classicsmart.myhomegrocers.models.userAuth.UserDetails;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;


public class DataHelper {

    public static boolean isFirstTime(Context context) {
        return Prefs.getSharedPreferencesBoolean(context, keys.IS_FIRST_LOGIN, false);
    }

    public static void setIsFirstTime(Context context, boolean isFirstSelected) {
        Prefs.putSharedPreferencesBoolean(context, keys.IS_FIRST_LOGIN, isFirstSelected);
    }


    public static void clearData(Context context) {
//        setIsFirstTime(context, false);
        setUserEncryptId(context, null);
        Prefs.clearSharedPreferences(context);
        setIsFirstTime(context, true);
        setUserData(context, null);
        setRole(context, 0);
    }

    public static String getUserEncryptId(Context context) {
        return Prefs.getSharedPreferencesString(context, keys.USER_ENCRYPT, null);
    }

    public static void setUserEncryptId(Context context, String encryptId) {
        Prefs.putSharedPreferencesString(context, keys.USER_ENCRYPT, encryptId);
    }

    public static int getRole(Context context) {
        return Prefs.getSharedPreferencesInt(context, keys.USER_TYPE, 0);
    }

    public static void setRole(Context context, int encryptId) {
        Prefs.putSharedPreferencesInt(context, keys.USER_TYPE, encryptId);
    }

    public static UserDetails getUserData(Context context) {
        Gson gson = new Gson();
        try {
            String str = Prefs.getSharedPreferencesString(context, keys.USER_PROFILE, "");
            Type userData = new TypeToken<UserDetails>() {
            }.getType();
            return gson.fromJson(str, userData);
        } catch (Exception e) {
            return null;
        }
    }

    public static void setUserData(Context context, UserDetails userData) {
        Gson gson = new Gson();
        String data = gson.toJson(userData);
        Prefs.putSharedPreferencesString(context, keys.USER_PROFILE, data);
    }


    public static class keys {
        final static String USER_PROFILE = "USER_PROFILE";
        final static String IS_FIRST_LOGIN = "IS_FIRST";
        final static String USER_ENCRYPT = "USER_ENCRYPT";
        final static String USER_TYPE = "USER_TYPE";
        final static String RECENT_SEARCH_DATA = "RECENT_SEARCH_DATA";
        final static String CMS_DATA = "CMS_DATA";
        final static String AUTHTOKEN = "AUTHTOKEN";
    }

    public static String getAuthToken(Context context) {
        if (Prefs.getSharedPreferencesString(context, keys.AUTHTOKEN, null) != null) {
            return "Bearer " + Prefs.getSharedPreferencesString(context, keys.AUTHTOKEN, null);
        }
        return null;
    }

    public static void setAuthToken(Context context, String encryptId) {
        Prefs.putSharedPreferencesString(context, keys.AUTHTOKEN, encryptId);
    }

}
