package com.classicsmart.myhomegrocers.network;

import com.classicsmart.myhomegrocers.BuildConfig;

public class ApiConstants<isStage> {

    static String CONSUMER_KEY = "ConsumerKey";
    public static final String ADDRESS_ID = "id";
    public static final String PAGE = "&page";
    public static final String ORDER_ID = "order_id";
    static String CONSUMER_SECRER = "ConsumerSecret";
    static String CONTENT_TYPE = "Content-Type";
    static final String AUTHORIZATION = "Authorization";
    public static final String MAPPING_KEY = "city";

    //Prod Creds
    static boolean isStage = BuildConfig.isStage;

    static String BASE_URL = isStage ? BuildConfig.STAGE_BASE_URL : BuildConfig.BASE_URL;
    static String CONTENT_TYPE_VALUE = "application/json";

    public class EndPoints {

        public class User {
            public static final String ENDPOINT_USER_REGISTRATION = "rest/register/send";
            public static final String ENDPOINT_USER_REGISTRATION_VERIFY_OTP = "rest/register/verify";
            public static final String ENDPOINT_USER_REGISTRATION_RESEND_OTP = "rest/register/resend";
            public static final String ENDPOINT_USER_VALIDATE_MAIL_PHONE = "rest/register/validate";

            public static final String ENDPOINT_USER_LOGIN = "rest/login";
            public static final String ENDPOINT_USER_LOGIN_VERIFY_OTP = "rest/login/verify";
            public static final String ENDPOINT_USER_LOGIN_RESEND_OTP = "rest/login/resend";

            public static final String ENDPOINT_USER_FORGOT_PASSWORD_MAIL_PHONE = "rest/forgotten/send";
            public static final String ENDPOINT_USER_FORGOT_PASSWORD_RESEND = "rest/forgotten/resend";
            public static final String ENDPOINT_USER_FORGOT_PASSWORD_VERIFY_OTP = "rest/forgotten/verify";
            public static final String ENDPOINT_USER_UPDATE_PASSWORD = "rest/forgotten/verifyotp_setpassword";

            public static final String ENDPOINT_GET_HOME_DASHBOARD = "rest/home";

            /*Add address API's*/
            public static final String ENDPOINT_GET_ADDRESS_BY_ID = "rest/account/address";
            public static final String ENDPOINT_DELETE_ADDRESS = "rest/account/address";
            public static final String ENDPOINT_LIST_ADDRESS = "rest/account/address";
            public static final String ENDPOINT_EDIT_ADDRESS = "rest/account/address";
            public static final String ENDPOINT_ADD_NEW_ADDRESS = "rest/account/address";


        }

        /*Wishlist API's*/
        public class WishList{
            public static final String ENDPOINT_ADD_PRODUCT_TO_WISHLIST = "rest/wishlist&id";
            public static final String ENDPOINT_GET_WISHLIST= "rest/wishlist";
            public static final String ENDPOINT_DELETE_PRODUCT = "rest/wishlist&id";

        }

        /*Cart API's*/

        public class Cart{
        public static final String ENDPOINT_GET_CART = "rest/cart";
        public static final String ENDPOINT_ADD_PRODUCT = "rest/cart/addItemCart";
        public static final String ENDPOINT_UPDATE_PRODUCT = "rest/cart/updateCartQuantity";
        public static final String ENDPOINT_DELETE_PRODUCT = "rest/cart/deleteCartItem";
        }
        /*MYOrders API's*/

        public class MYOrders{
            public static final String ENDPOINT_GET_ORDERS = "rest/order";
            public static final String ENDPOINT_ORDER_DETAILS = "rest/order";
            public static final String ENDPOINT_REORDER_LAST_ORDER = "rest/order";
            public static final String ENDPOINT_REORDER_LAST_ORDER_PRODUCT = "rest/order/reorder";
            public static final String ENDPOINT_CANCEL_ORDER= "rest/order/cancelOrder";
            public static final String ENDPOINT_RATE_ORDER = "/rest/order/rateYourOrder";

        }
    }

    public static class Constants {
        public static final String API_DEFAULT_ERROR = "Something went wrong.";
        //User Constants
        public static final int API_USER_REGISTRATION = 101;
        public static final int API_USER_REGISTRATION_OTP_VERFICATION = 102;
        public static final int API_USER_REGISTRATION_RESEND_OTP = 103;

        public static final int API_USER_LOGIN = 104;
        public static final int API_USER_VERIFY_FORGOT_PASSWORD_MAIL = 105;
        public static final int API_USER_VERIFY_FORGOT_PASSWORD_PHONE = 106;
        public static final int API_USER_VALIDATE_MAIL = 107;
        public static final int API_USER_VALIDATE_PHONE = 108;
        public static final int API_USER_UPDATE_PASSWORD = 109;

        public static final int API_USER_LOGIN_RESEND_OTP = 110;
        public static final int API_USER_VERIFY_MOBILE_LOGIN = 111;

        public static final int API_USER_FORGOT_PASSWORD_SEND_OTP = 112;
        public static final int API_USER_FORGOT_PASSWORD_RESEND_OTP = 113;

        public static final int API_DASHBOARD_HOME = 114;
        public static final int API_ADD_NEW_ADDRESS = 115;
        public static final int API_LIST_ADDRESS = 116;

        public static final int API_GET_CART = 122;

        public static final int API_DELETE_CART = 123;
        public static final int API_UPDATE_CART= 117;
        public static final int API_ADD_CART = 118;
        public static final int API_ADD_WISHLIST = 119;
        public static final int API_GET_WISHLIST = 120;
        public static final int API_DELETE_WISHLIST = 121;

        //My orders Constants
        public static final int API_GET_ORDERS = 122;
        public static final int API_ORDER_DETAILS = 123;
        public static final int API_REORDER_LAST_ORDER = 124;
        public static final int API_REORDER_LAST_ORDER_PRODUCT = 125;
        public static final int API_CANCEL_ORDER= 126;
        public static final int API_RATE_ORDER = 127;

    }

    public static class UserConstants {
        public static final int LOGIN_MOBILE_SEND_OTP = 4;
        public static final int LOGIN_EMAIL_SEND_OTP = 2;
        public static final int LOGIN_EMAIL_VERIFY_OTP = 1;
        public static final int LOGIN_MOBILE_VERIFY_OTP = 2;
    }
}
