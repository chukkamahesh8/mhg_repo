package com.classicsmart.myhomegrocers.network;


import com.classicsmart.myhomegrocers.models.CancelOrderPayload;
import com.classicsmart.myhomegrocers.models.FeedBackPayload;
import com.classicsmart.myhomegrocers.models.ForgotPasswordPayLoad;
import com.classicsmart.myhomegrocers.models.ForgotPasswordResponse;
import com.classicsmart.myhomegrocers.models.LoginEmailPayLoad;
import com.classicsmart.myhomegrocers.models.ReorderProductPayLoad;
import com.classicsmart.myhomegrocers.models.SetPasswordPayLoad;
import com.classicsmart.myhomegrocers.models.SignUpVerifyOTPPayLoad;
import com.classicsmart.myhomegrocers.models.SignupPayLoad;
import com.classicsmart.myhomegrocers.models.ValidateMailOrPhonePayload;
import com.classicsmart.myhomegrocers.models.VerifyOtpPayLoad;
import com.classicsmart.myhomegrocers.models.address.AddAddressResponse;
import com.classicsmart.myhomegrocers.models.address.AddressPayLoad;
import com.classicsmart.myhomegrocers.models.address.AddressResponse;
import com.classicsmart.myhomegrocers.models.cart.AddCartResponse;
import com.classicsmart.myhomegrocers.models.cart.DeleteCartResponse;
import com.classicsmart.myhomegrocers.models.cart.GetCartResponse;
import com.classicsmart.myhomegrocers.models.cart.UpdateCartResponse;
import com.classicsmart.myhomegrocers.models.dashboard.DashboardResponse;
import com.classicsmart.myhomegrocers.models.myOrders.GetMyOrdersResponse;
import com.classicsmart.myhomegrocers.models.myOrders.OrderDetailsResponse;
import com.classicsmart.myhomegrocers.models.userAuth.EmailOrPhoneValidationResponse;
import com.classicsmart.myhomegrocers.models.userAuth.ForgotPasswordFinalResponse;
import com.classicsmart.myhomegrocers.models.userAuth.LoginResponse;
import com.classicsmart.myhomegrocers.models.userAuth.SignupOtpResponse;
import com.classicsmart.myhomegrocers.models.userAuth.SignupResponse;
import com.classicsmart.myhomegrocers.models.wishlist.GetWishListResponse;
import com.classicsmart.myhomegrocers.models.wishlist.WishListResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface ApiInterface {

    @POST(ApiConstants.EndPoints.User.ENDPOINT_USER_LOGIN)
    Call<LoginResponse> userLogin(@Body LoginEmailPayLoad loginPayLoad);

    @GET(ApiConstants.EndPoints.User.ENDPOINT_USER_LOGIN_RESEND_OTP)
    Call<LoginResponse> resendLoginOTP(@Header(ApiConstants.AUTHORIZATION) String auth);

    @GET(ApiConstants.EndPoints.User.ENDPOINT_USER_REGISTRATION_RESEND_OTP)
    Call<SignupResponse> resendRegistrationOTP(@Header(ApiConstants.AUTHORIZATION) String auth);

    @POST(ApiConstants.EndPoints.User.ENDPOINT_USER_REGISTRATION)
    Call<SignupResponse> userRegistration(@Body SignupPayLoad loginPayLoad);

    @POST(ApiConstants.EndPoints.User.ENDPOINT_USER_REGISTRATION_VERIFY_OTP)
    Call<SignupOtpResponse> userRegOtpVerification(@Body SignUpVerifyOTPPayLoad signUpVerifyOTPPayLoad, @Header(ApiConstants.AUTHORIZATION) String auth);

    @POST(ApiConstants.EndPoints.User.ENDPOINT_USER_VALIDATE_MAIL_PHONE)
    Call<EmailOrPhoneValidationResponse> validateMailOrPhone(@Body ValidateMailOrPhonePayload validateMailOrPhonePayload);

    @POST(ApiConstants.EndPoints.User.ENDPOINT_USER_FORGOT_PASSWORD_MAIL_PHONE)
    Call<ForgotPasswordResponse> sendForgotPasswordOTP(@Body ForgotPasswordPayLoad forgotPasswordPayLoad);

    @POST(ApiConstants.EndPoints.User.ENDPOINT_USER_UPDATE_PASSWORD)
    Call<ForgotPasswordFinalResponse> verifyForgotOtp(@Header(ApiConstants.AUTHORIZATION) String auth, @Body VerifyOtpPayLoad verifyOtpPayLoad);

    @POST(ApiConstants.EndPoints.User.ENDPOINT_USER_FORGOT_PASSWORD_RESEND)
    Call<SignupResponse> updatePassword(@Body SetPasswordPayLoad setPasswordPayLoad);

    @POST(ApiConstants.EndPoints.User.ENDPOINT_USER_LOGIN_VERIFY_OTP)
    Call<LoginResponse> loginWithMobileVerifyOTP(@Body VerifyOtpPayLoad verifyOtpPayLoad, @Header(ApiConstants.AUTHORIZATION) String auth);

    @GET(ApiConstants.EndPoints.User.ENDPOINT_USER_FORGOT_PASSWORD_RESEND)
    Call<ForgotPasswordResponse> resendForgotOTP(@Header(ApiConstants.AUTHORIZATION) String auth);

    @GET(ApiConstants.EndPoints.User.ENDPOINT_GET_HOME_DASHBOARD)
    Call<DashboardResponse> getHomeDashboard(@Header(ApiConstants.AUTHORIZATION) String auth);

    @GET(ApiConstants.EndPoints.User.ENDPOINT_GET_ADDRESS_BY_ID)
    Call<AddAddressResponse> getAddressById(@Header(ApiConstants.AUTHORIZATION) String auth, @Query(ApiConstants.ADDRESS_ID) String id);

    @DELETE(ApiConstants.EndPoints.User.ENDPOINT_DELETE_ADDRESS)
    Call<AddAddressResponse> DeleteAddress(@Header(ApiConstants.AUTHORIZATION) String auth, @Query(ApiConstants.ADDRESS_ID) String id);

    @GET(ApiConstants.EndPoints.User.ENDPOINT_LIST_ADDRESS)
    Call<AddressResponse> getAddress(@Header(ApiConstants.AUTHORIZATION) String auth);

    @PUT(ApiConstants.EndPoints.User.ENDPOINT_EDIT_ADDRESS)
    Call<AddAddressResponse> editAddress(@Header(ApiConstants.AUTHORIZATION) String auth, @Query(ApiConstants.ADDRESS_ID) String id);

    @POST(ApiConstants.EndPoints.User.ENDPOINT_ADD_NEW_ADDRESS)
    Call<AddAddressResponse> addNewAddress(@Header(ApiConstants.AUTHORIZATION) String auth, @Body AddressPayLoad addressPayLoad);

    @GET(ApiConstants.EndPoints.WishList.ENDPOINT_GET_WISHLIST)
    Call<GetWishListResponse> getWishList(@Header(ApiConstants.AUTHORIZATION) String auth);

    @DELETE(ApiConstants.EndPoints.WishList.ENDPOINT_DELETE_PRODUCT)
    Call<WishListResponse> deleteWishList(@Header(ApiConstants.AUTHORIZATION) String auth,@Query(ApiConstants.ADDRESS_ID) String id);

    @POST(ApiConstants.EndPoints.WishList.ENDPOINT_ADD_PRODUCT_TO_WISHLIST)
    Call<WishListResponse> addToWishList(@Header(ApiConstants.AUTHORIZATION) String auth,@Query(ApiConstants.ADDRESS_ID) String id);

    @GET(ApiConstants.EndPoints.Cart.ENDPOINT_GET_CART)
    Call<GetCartResponse> getCart(@Header(ApiConstants.AUTHORIZATION) String auth);

    @DELETE(ApiConstants.EndPoints.Cart.ENDPOINT_DELETE_PRODUCT)
    Call<DeleteCartResponse> deleteCartItem(@Header(ApiConstants.AUTHORIZATION) String auth);

    @POST(ApiConstants.EndPoints.Cart.ENDPOINT_UPDATE_PRODUCT)
    Call<UpdateCartResponse> updateCartResponse(@Header(ApiConstants.AUTHORIZATION) String auth);

    @POST(ApiConstants.EndPoints.Cart.ENDPOINT_ADD_PRODUCT)
    Call<AddCartResponse> addProductToCart(@Header(ApiConstants.AUTHORIZATION) String auth);


    //MyOrders API
    @GET(ApiConstants.EndPoints.MYOrders.ENDPOINT_GET_ORDERS)
    Call<GetMyOrdersResponse> getMyOrders(@Header(ApiConstants.AUTHORIZATION) String auth, @Query(ApiConstants.PAGE) int id);

    @GET(ApiConstants.EndPoints.MYOrders.ENDPOINT_ORDER_DETAILS)
    Call<OrderDetailsResponse> orderDetails(@Header(ApiConstants.AUTHORIZATION) String auth, @Query(ApiConstants.PAGE) String id);


    @POST(ApiConstants.EndPoints.MYOrders.ENDPOINT_REORDER_LAST_ORDER)
    Call<WishListResponse> reorderLastOrder(@Header(ApiConstants.AUTHORIZATION) String auth, @Query(ApiConstants.ORDER_ID) String id);

    @POST(ApiConstants.EndPoints.MYOrders.ENDPOINT_REORDER_LAST_ORDER_PRODUCT)
    Call<WishListResponse> reorderLastOrderProduct(@Header(ApiConstants.AUTHORIZATION) String auth, @Body ReorderProductPayLoad reorderProductPayLoad);


    @POST(ApiConstants.EndPoints.MYOrders.ENDPOINT_CANCEL_ORDER)
    Call<WishListResponse> cancelOrder(@Header(ApiConstants.AUTHORIZATION) String auth, @Body CancelOrderPayload cancelOrderPayload);


    @POST(ApiConstants.EndPoints.MYOrders.ENDPOINT_RATE_ORDER)
    Call<WishListResponse> rateOrder(@Header(ApiConstants.AUTHORIZATION) String auth, @Body FeedBackPayload feedBackPayload);






}
