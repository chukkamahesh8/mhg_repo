package com.classicsmart.myhomegrocers.activities;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import androidx.core.content.res.ResourcesCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingUtil;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.databinding.ActivityLoginBinding;
import com.classicsmart.myhomegrocers.models.LoginEmailPayLoad;
import com.classicsmart.myhomegrocers.models.VerifyOtpPayLoad;
import com.classicsmart.myhomegrocers.models.userAuth.LoginResponse;
import com.classicsmart.myhomegrocers.models.userAuth.SignupResponse;
import com.classicsmart.myhomegrocers.network.ApiConstants;
import com.classicsmart.myhomegrocers.presenters.ApiCallBack;
import com.classicsmart.myhomegrocers.presenters.UserPresenter;
import com.classicsmart.myhomegrocers.utils.DataHelper;

import java.util.regex.Pattern;

import retrofit2.Response;


public class LoginActivity extends BaseActivity implements View.OnClickListener, ApiCallBack {
    ActivityLoginBinding activityLoginBinding;
    NestedScrollView nestedScrollView;
    boolean isBakToLogin = false;
    private UserPresenter userPresenter;
    private String strOtp;
    private boolean isPhoneNumber = false;
    private String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        activityLoginBinding.setLifecycleOwner(this);
        userPresenter = new UserPresenter(this);
        nestedScrollView = findViewById(R.id.loginscroll);

        activityLoginBinding.viewLogin.tvskip.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, DashBoardActivity.class);
            startActivity(intent);
            finish();
        });
        activityLoginBinding.viewpassword.tick.setOnClickListener(v -> {
            if (activityLoginBinding.viewpassword.edtxtpassword.getText().toString().isEmpty()) {
                activityLoginBinding.viewpassword.edtxtpassword.requestFocus();
                Toast.makeText(getApplicationContext(), R.string.txt_password, Toast.LENGTH_SHORT).show();
            } else {
                hideKeyboard();
                showDialog();
                LoginEmailPayLoad loginEmailPayLoad = new LoginEmailPayLoad();
                loginEmailPayLoad.setEmail(activityLoginBinding.viewLogin.edtxtEmailId.getText().toString());
                loginEmailPayLoad.setPassword(activityLoginBinding.viewpassword.edtxtpassword.getText().toString());
                loginEmailPayLoad.setType(1);
                userPresenter.loginUser(loginEmailPayLoad, ApiConstants.Constants.API_USER_LOGIN);
            }
        });

        termsAndConditionsView();
    /*    activityLoginBinding.viewLogin.edtxtEmailId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (activityLoginBinding.viewLogin.edtxtEmailId.getText().toString().isEmpty()
                        && !Patterns.EMAIL_ADDRESS.matcher(activityLoginBinding.viewSignup.edEmailId.getText().toString()).matches()) {
                    Toast.makeText(getApplicationContext(), R.string.txt_emptyfields, Toast.LENGTH_SHORT).show();
                } else {
                    activityLoginBinding.llViewsignUp.setVisibility(view.GONE);
                    activityLoginBinding.llViewLogin.setVisibility(view.GONE);
                    activityLoginBinding.llViewloginotp.setVisibility(view.VISIBLE);
                    activityLoginBinding.llViewpassword.setVisibility(View.GONE);
                }
            }

        });*/

        //forgotPassword
        activityLoginBinding.viewpassword.tvForgotYourPassword.setOnClickListener(view -> {
            // todo Add forgot password Ui and Functinality here
         /*   showDialog();
            ForgotPasswordPayLoad loginEmailPayLoad = new ForgotPasswordPayLoad();
            loginEmailPayLoad.setEmail(activityLoginBinding.viewLogin.edtxtEmailId.getText().toString());
            loginEmailPayLoad.setType("email");
            userPresenter.sendForgotPasswordOtp(loginEmailPayLoad, ApiConstants.Constants.API_USER_VERIFY_FORGOT_PASSWORD_MAIL);
       */
            Intent intent = new Intent(this, ForgotPasswordActivity.class);
            startActivity(intent);
        });

        //login via otp for email
        activityLoginBinding.viewpassword.tvLoginviaotp.setOnClickListener(view -> {
            sendEmailOtpAPI();
        });

        //Otp Data
        otpData();

    }

    private void sendEmailOtpAPI() {
        isPhoneNumber = false;
        showDialog();
        LoginEmailPayLoad loginEmailPayLoad = new LoginEmailPayLoad();
        loginEmailPayLoad.setEmail(activityLoginBinding.viewLogin.edtxtEmailId.getText().toString());
        loginEmailPayLoad.setType(2);
        userPresenter.loginUser(loginEmailPayLoad, ApiConstants.Constants.API_USER_LOGIN);
    }

    private void termsAndConditionsView() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(activityLoginBinding.viewLogin.Termsofservices.getText());
        spannableStringBuilder.setSpan(new StyleSpan(Typeface.BOLD), 54, 71, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.setSpan(new StyleSpan(Typeface.BOLD), 76, 90, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        activityLoginBinding.viewLogin.Termsofservices.setText(spannableStringBuilder);
    }

    public void txtSignUp(View view) {
        Intent intent = new Intent(this, SignupActivity.class);
        startActivity(intent);
    }

    private void otpData() {
        activityLoginBinding.viewloginotp.viewOtpLayout.txtResendOtp.setOnClickListener(this);
        activityLoginBinding.viewloginotp.viewOtpLayout.otpFirst.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (activityLoginBinding.viewloginotp.viewOtpLayout.otpFirst.getText().toString().length() == 1) {
                    activityLoginBinding.viewloginotp.viewOtpLayout.otpSecond.requestFocus();
                    apiVerifyOtp(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        activityLoginBinding.viewloginotp.viewOtpLayout.otpSecond.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (activityLoginBinding.viewloginotp.viewOtpLayout.otpSecond.getText().toString().length() == 1) {
//                    otpNo.add(activityLoginBinding.viewloginotp.viewOtpLayout.otpSecond.getText().toString().trim());
                    activityLoginBinding.viewloginotp.viewOtpLayout.otpThird.requestFocus();
                    apiVerifyOtp(false);
                } else if (activityLoginBinding.viewloginotp.viewOtpLayout.otpSecond.getText().toString().length() == 0) {
//                    otpNo.remove(1);
                    activityLoginBinding.viewloginotp.viewOtpLayout.otpFirst.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        activityLoginBinding.viewloginotp.viewOtpLayout.otpThird.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (activityLoginBinding.viewloginotp.viewOtpLayout.otpThird.getText().toString().length() == 1) {
//                    otpNo.add(activityLoginBinding.viewloginotp.viewOtpLayout.otpThird.getText().toString().trim());
                    activityLoginBinding.viewloginotp.viewOtpLayout.otpFour.requestFocus();
                    apiVerifyOtp(false);
                } else if (activityLoginBinding.viewloginotp.viewOtpLayout.otpThird.getText().toString().length() == 0) {
//                    otpNo.remove(2);
                    activityLoginBinding.viewloginotp.viewOtpLayout.otpSecond.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        activityLoginBinding.viewloginotp.viewOtpLayout.otpFour.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (activityLoginBinding.viewloginotp.viewOtpLayout.otpFour.getText().toString().length() == 1) {
//                    otpNo.add(activityLoginBinding.viewloginotp.viewOtpLayout.otpFour.getText().toString().trim());
                    activityLoginBinding.viewloginotp.viewOtpLayout.otpFive.requestFocus();
                    apiVerifyOtp(false);
                } else if (activityLoginBinding.viewloginotp.viewOtpLayout.otpFour.getText().toString().length() == 0) {
//                    otpNo.remove(3);
                    activityLoginBinding.viewloginotp.viewOtpLayout.otpThird.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        activityLoginBinding.viewloginotp.viewOtpLayout.otpFive.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (activityLoginBinding.viewloginotp.viewOtpLayout.otpFive.getText().toString().length() == 1) {
//                    otpNo.add(activityLoginBinding.viewloginotp.viewOtpLayout.otpFour.getText().toString().trim());
                    activityLoginBinding.viewloginotp.viewOtpLayout.otpSix.requestFocus();
                    apiVerifyOtp(false);
                } else if (activityLoginBinding.viewloginotp.viewOtpLayout.otpFive.getText().toString().length() == 0) {
//                    otpNo.remove(3);
                    activityLoginBinding.viewloginotp.viewOtpLayout.otpFour.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        activityLoginBinding.viewloginotp.viewOtpLayout.otpSix.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (activityLoginBinding.viewloginotp.viewOtpLayout.otpSix.getText().toString().length() == 1) {
//                    otpNo.add(activityLoginBinding.viewloginotp.viewOtpLayout.otpFour.getText().toString().trim());
                    apiVerifyOtp(true);
                } else if (activityLoginBinding.viewloginotp.viewOtpLayout.otpSix.getText().toString().length() == 0) {
//                    otpNo.remove(3);
                    activityLoginBinding.viewloginotp.viewOtpLayout.otpFive.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void resetOtpData() {
        activityLoginBinding.viewloginotp.viewOtpLayout.otpFirst.setText("");
        activityLoginBinding.viewloginotp.viewOtpLayout.otpSecond.setText("");
        activityLoginBinding.viewloginotp.viewOtpLayout.otpThird.setText("");
        activityLoginBinding.viewloginotp.viewOtpLayout.otpFour.setText("");
        activityLoginBinding.viewloginotp.viewOtpLayout.otpFive.setText("");
        activityLoginBinding.viewloginotp.viewOtpLayout.otpSix.setText("");
    }

    private void apiVerifyOtp(boolean showErr) {
        strOtp = activityLoginBinding.viewloginotp.viewOtpLayout.otpFirst.getText().toString().trim() +
                activityLoginBinding.viewloginotp.viewOtpLayout.otpSecond.getText().toString().trim() +
                activityLoginBinding.viewloginotp.viewOtpLayout.otpThird.getText().toString().trim() +
                activityLoginBinding.viewloginotp.viewOtpLayout.otpFour.getText().toString().trim() +
                activityLoginBinding.viewloginotp.viewOtpLayout.otpFive.getText().toString().trim() +
                activityLoginBinding.viewloginotp.viewOtpLayout.otpSix.getText().toString().trim();
        if (strOtp.length() == 6) {
            showDialog();
            VerifyOtpPayLoad verifyOtpPayLoad = new VerifyOtpPayLoad();
            verifyOtpPayLoad.setOtp(String.valueOf(strOtp));
            if (isPhoneNumber) {
                verifyOtpPayLoad.setType(ApiConstants.UserConstants.LOGIN_MOBILE_VERIFY_OTP);
            } else {
                verifyOtpPayLoad.setType(ApiConstants.UserConstants.LOGIN_EMAIL_VERIFY_OTP);
            }
            String authorization = "Bearer " + token;
            userPresenter.loginWithMobileOTP(verifyOtpPayLoad, authorization, ApiConstants.Constants.API_USER_VERIFY_MOBILE_LOGIN);
        } else {
            if (showErr) {
                Toast.makeText(LoginActivity.this, "Enter Valid OTP", Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.txtResendOtp:
                resendOTP();
                break;
        }
    }

    private void resendOTP() {
        showDialog();
        userPresenter.signInResendOTP("Bearer " + token, ApiConstants.Constants.API_USER_LOGIN_RESEND_OTP);
    }

    public void forwardArrow(View view) {
        if (activityLoginBinding.viewLogin.edtxtEmailId.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), R.string.txt_email, Toast.LENGTH_SHORT).show();
        } else if (!Pattern.matches("[a-zA-Z]+", activityLoginBinding.viewLogin.edtxtEmailId.getText().toString())
                && activityLoginBinding.viewLogin.edtxtEmailId.getText().toString().length() == 10) {
            hideKeyboard();
            showDialog();
            sendOtpMobile();
        } else if (!Patterns.EMAIL_ADDRESS.matcher(activityLoginBinding.viewLogin.edtxtEmailId.getText().toString()).matches()) {
            Toast.makeText(getApplicationContext(), R.string.txt_email, Toast.LENGTH_SHORT).show();
        } else {
            activityLoginBinding.llViewsignUp.setVisibility(View.GONE);
            activityLoginBinding.llViewLogin.setVisibility(View.GONE);
            activityLoginBinding.llViewpassword.setVisibility(View.VISIBLE);
            activityLoginBinding.llViewloginotp.setVisibility(View.GONE);
            activityLoginBinding.viewpassword.edtxtpassword.requestFocus();
           /* showDialog();
            isMobileLogin = false;
            LoginEmailPayLoad loginEmailPayLoad = new LoginEmailPayLoad();
            loginEmailPayLoad.setEmail(activityLoginBinding.viewLogin.edtxtEmailId.getText().toString());
            loginEmailPayLoad.setType(2);
            userPresenter.loginUser(loginEmailPayLoad, ApiConstants.Constants.API_USER_LOGIN);*/

        }

    }

    private void sendOtpMobile() {
        showPhoneOtpView();
        LoginEmailPayLoad loginEmailPayLoad = new LoginEmailPayLoad();
        loginEmailPayLoad.setTelephone(activityLoginBinding.viewLogin.edtxtEmailId.getText().toString());
        isPhoneNumber = true;
        loginEmailPayLoad.setType(ApiConstants.UserConstants.LOGIN_MOBILE_SEND_OTP);
        userPresenter.loginUser(loginEmailPayLoad, ApiConstants.Constants.API_USER_LOGIN);
    }

    private void showPhoneOtpView() {
        resetOtpData();
        activityLoginBinding.llViewsignUp.setVisibility(View.GONE);
        activityLoginBinding.llViewLogin.setVisibility(View.GONE);
        activityLoginBinding.llViewpassword.setVisibility(View.GONE);
        activityLoginBinding.llViewloginotp.setVisibility(View.VISIBLE);
    }

/*
    public void forgotPassword(View view) {
        Intent intent = new Intent(this, ForgotPasswordActivity.class);
        startActivity(intent);
    }
*/


    public void mobileLoginForgotPassword(View view) {
        Intent intent = new Intent(this, ForgotPasswordActivity.class);
        startActivity(intent);
    }


    public void otpBackArrow(View view) {
        activityLoginBinding.llViewsignUp.setVisibility(View.GONE);
        activityLoginBinding.llViewLogin.setVisibility(View.VISIBLE);
        activityLoginBinding.llViewloginotp.setVisibility(View.GONE);
        activityLoginBinding.viewLogin.edtxtEmailId.requestFocus();
    }

    public void changeEmail(View view) {
        activityLoginBinding.llViewsignUp.setVisibility(View.GONE);
        activityLoginBinding.llViewLogin.setVisibility(View.VISIBLE);
        activityLoginBinding.llViewpassword.setVisibility(View.GONE);
        activityLoginBinding.viewLogin.edtxtEmailId.requestFocus();
    }

    public void changeNumber(View view) {
        activityLoginBinding.llViewLogin.setVisibility(View.VISIBLE);
        activityLoginBinding.llViewpassword.setVisibility(View.GONE);
        activityLoginBinding.llViewsignUp.setVisibility(View.GONE);
        activityLoginBinding.llViewloginotp.setVisibility(View.GONE);
        activityLoginBinding.viewLogin.edtxtEmailId.requestFocus();
    }


    public void profileNavigation(View view) {
        activityLoginBinding.llViewsignUp.setVisibility(View.GONE);
        // activityLoginBinding.llViewloginOtp.setVisibility(View.GONE);
        activityLoginBinding.llViewLogin.setVisibility(View.VISIBLE);
        activityLoginBinding.llViewpassword.setVisibility(View.GONE);
        activityLoginBinding.viewLogin.edtxtEmailId.requestFocus();
    }

    public void ed_otp(View view) {
        activityLoginBinding.llViewsignUp.setVisibility(View.GONE);
        activityLoginBinding.llViewloginotp.setVisibility(View.VISIBLE);
        activityLoginBinding.llViewLogin.setVisibility(View.GONE);
        activityLoginBinding.llViewpassword.setVisibility(View.GONE);
    }

    public void txtLoginClick(View view) {
        activityLoginBinding.txtSignup.setTextSize(13);
        activityLoginBinding.tvLogin.setTextSize(20);
        activityLoginBinding.llViewsignUp.setVisibility(View.GONE);
        activityLoginBinding.llViewLogin.setVisibility(View.VISIBLE);
        // activityLoginBinding.llViewpassword.setVisibility(View.GONE);
        // activityLoginBinding.llViewloginotp.setVisibility(View.GONE);
        // activityLoginBinding.tvLogin.setPaintFlags(activityLoginBinding.tvLogin.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        activityLoginBinding.underlineViewSignup.setVisibility(View.INVISIBLE);
        activityLoginBinding.underlineView.setVisibility(View.VISIBLE);
        Typeface typeface = ResourcesCompat.getFont(this, R.font.poppins_bold);
        activityLoginBinding.tvLogin.setTypeface(typeface);
        isBakToLogin = false;
/*
        activityLoginBinding.description.setText("Login to Continue");
        activityLoginBinding.title.setText("Welcome Back");
*/
    }

    @Override
    public void onBackPressed() {
        if (isBakToLogin) {
            isBakToLogin = false;
            activityLoginBinding.llViewsignUp.setVisibility(View.GONE);
            activityLoginBinding.llViewLogin.setVisibility(View.VISIBLE);
            activityLoginBinding.llViewpassword.setVisibility(View.GONE);
            activityLoginBinding.llViewloginotp.setVisibility(View.GONE);

        } else {
            super.onBackPressed();
            finish();
        }
    }

    //Facebook login
    public void googleLogin() {

    }

    @Override
    public void onSuccessResponse(Response response, int requestType) {
        dismissDialog();
        switch (requestType) {
            case ApiConstants.Constants.API_USER_LOGIN:
                LoginResponse loginResponse = (LoginResponse) response.body();
                if (loginResponse != null) {
                    if (loginResponse.getStatus().getCode() == 1) {

                        if (loginResponse.getStatus().getMessage().equalsIgnoreCase("Otp sent to email")) {
                            token = loginResponse.getData().getAccessToken();
                            showOtpView(true);
                        } else if (loginResponse.getStatus().getMessage().equalsIgnoreCase("Otp sent to mobile")) {
                            token = loginResponse.getData().getAccessToken();
                            DataHelper.setAuthToken(this, loginResponse.getData().getAccessToken());
                            //Todo Show VerifyOTP Screen
                            showOtpView(false);

                        } else {
                            //Todo navigate to Home Screen
                            token = loginResponse.getData().getAccessToken();
                            DataHelper.setAuthToken(this, loginResponse.getData().getAccessToken());
                            DataHelper.setUserData(this, loginResponse.getData());
                            Toast.makeText(this, loginResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(LoginActivity.this, DashBoardActivity.class);
                            startActivity(intent);
                            finish();
                        }

                    } else {
                        Toast.makeText(this, loginResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case ApiConstants.Constants.API_USER_VERIFY_MOBILE_LOGIN:
                LoginResponse mobileLoginResponse = (LoginResponse) response.body();
                if (mobileLoginResponse != null && mobileLoginResponse.getData() != null) {
                    if (mobileLoginResponse.getStatus().getCode() == 1) {
                        //Todo navigate to Home Screen
                        DataHelper.setAuthToken(this, mobileLoginResponse.getData().getAccessToken());
                        DataHelper.setUserData(this, mobileLoginResponse.getData());
                        Toast.makeText(this, mobileLoginResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, DashBoardActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(this, mobileLoginResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case ApiConstants.Constants.API_USER_VERIFY_FORGOT_PASSWORD_MAIL:
                SignupResponse emailForgotResponse = (SignupResponse) response.body();
                if (emailForgotResponse != null && emailForgotResponse.getData() != null) {
                    if (emailForgotResponse.getStatus().getCode() == 1) {
                        //Todo navigate to otp verification for forgot password otp screen
                        DataHelper.setAuthToken(this, emailForgotResponse.getData().getAccessToken());
                        Toast.makeText(this, emailForgotResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, emailForgotResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case ApiConstants.Constants.API_USER_VERIFY_FORGOT_PASSWORD_PHONE:
                SignupResponse phoneForgotResponse = (SignupResponse) response.body();
                if (phoneForgotResponse != null && phoneForgotResponse.getData() != null) {
                    if (phoneForgotResponse.getStatus().getCode() == 1) {
                        DataHelper.setAuthToken(this, phoneForgotResponse.getData().getAccessToken());

                        //Todo navigate to otp verification for forgot password otp screen
                        Toast.makeText(this, phoneForgotResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, phoneForgotResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case ApiConstants.Constants.API_USER_VALIDATE_MAIL:
                SignupResponse validateEmailResponse = (SignupResponse) response.body();
                if (validateEmailResponse != null && validateEmailResponse.getData() != null) {
                    if (validateEmailResponse.getStatus().getCode() == 1) {
                        //Todo Email Number validation for new User
                        Toast.makeText(this, validateEmailResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, validateEmailResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case ApiConstants.Constants.API_USER_VALIDATE_PHONE:
                SignupResponse validatePhoneResponse = (SignupResponse) response.body();
                if (validatePhoneResponse != null && validatePhoneResponse.getData() != null) {
                    if (validatePhoneResponse.getStatus().getCode() == 1) {
                        //Todo Phone Number validation for new User
                        Toast.makeText(this, validatePhoneResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, validatePhoneResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case ApiConstants.Constants.API_USER_UPDATE_PASSWORD:
                SignupResponse updatePasswordResponse = (SignupResponse) response.body();
                if (updatePasswordResponse != null && updatePasswordResponse.getData() != null) {
                    if (updatePasswordResponse.getStatus().getCode() == 1) {
                        //Todo navigate to Login Screen
                        Toast.makeText(this, updatePasswordResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, updatePasswordResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
                break;
            case ApiConstants.Constants.API_USER_LOGIN_RESEND_OTP:
                LoginResponse resendOtpResponse = (LoginResponse) response.body();
                if (resendOtpResponse != null && resendOtpResponse.getData() != null) {
                    if (resendOtpResponse.getStatus().getCode() == 1) {
                        Toast.makeText(this, resendOtpResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }
                break;
        }
    }

    private void showOtpView(boolean isEmail) {
        activityLoginBinding.llViewsignUp.setVisibility(View.GONE);
        activityLoginBinding.llViewLogin.setVisibility(View.GONE);
        activityLoginBinding.llViewpassword.setVisibility(View.GONE);
        activityLoginBinding.llViewloginotp.setVisibility(View.VISIBLE);
        activityLoginBinding.viewloginotp.tvVerificationTitle.setText("Please enter the verification code sent to " + activityLoginBinding.viewLogin.edtxtEmailId.getText().toString());
        activityLoginBinding.viewloginotp.viewOtpLayout.otpFirst.requestFocus();
        activityLoginBinding.viewloginotp.btnChangeNumber.setText(isEmail ? "CHANGE EMAIL" : "CHANGE NUMBER");
    }

    @Override
    public void onErrorResponse(String message, int requestType) {
        dismissDialog();
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    private void hideKeyboard() {
        InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
    }
}
