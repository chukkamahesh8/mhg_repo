package com.classicsmart.myhomegrocers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import androidx.databinding.DataBindingUtil;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.databinding.ActivityMainSignupBinding;
import com.classicsmart.myhomegrocers.models.SignUpVerifyOTPPayLoad;
import com.classicsmart.myhomegrocers.models.SignupPayLoad;
import com.classicsmart.myhomegrocers.models.userAuth.SignupOtpResponse;
import com.classicsmart.myhomegrocers.models.userAuth.SignupResponse;
import com.classicsmart.myhomegrocers.network.ApiConstants;
import com.classicsmart.myhomegrocers.presenters.ApiCallBack;
import com.classicsmart.myhomegrocers.presenters.UserPresenter;

import retrofit2.Response;

public class SignupActivity extends BaseActivity implements ApiCallBack, View.OnClickListener {
    private ActivityMainSignupBinding signUpBinding;
    private UserPresenter userPresenter;
    private String strOtp, token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        signUpBinding = DataBindingUtil.setContentView(this, R.layout.activity_main_signup);
        userPresenter = new UserPresenter(this);
        signUpBinding.signupVerifymobileno.btnChangeNumber.setVisibility(View.GONE);
        initOtp();
        signUpBinding.signupVerifymobileno.viewOtpLayout.txtResendOtp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txtResendOtp:
                resendOTP();
                break;
        }
    }

    private void initOtp() {
        //Otp Data
        signUpBinding.signupVerifymobileno.viewOtpLayout.otpFirst.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (signUpBinding.signupVerifymobileno.viewOtpLayout.otpFirst.getText().toString().length() == 1) {
                    signUpBinding.signupVerifymobileno.viewOtpLayout.otpSecond.requestFocus();
                    apiOtp(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        signUpBinding.signupVerifymobileno.viewOtpLayout.otpSecond.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (signUpBinding.signupVerifymobileno.viewOtpLayout.otpSecond.getText().toString().length() == 1) {
//                    otpNo.add(signUpBinding.signupVerifymobileno.viewOtpLayout.otpSecond.getText().toString().trim());
                    signUpBinding.signupVerifymobileno.viewOtpLayout.otpThird.requestFocus();
                    apiOtp(false);
                } else if (signUpBinding.signupVerifymobileno.viewOtpLayout.otpSecond.getText().toString().length() == 0) {
//                    otpNo.remove(1);
                    signUpBinding.signupVerifymobileno.viewOtpLayout.otpFirst.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        signUpBinding.signupVerifymobileno.viewOtpLayout.otpThird.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (signUpBinding.signupVerifymobileno.viewOtpLayout.otpThird.getText().toString().length() == 1) {
//                    otpNo.add(signUpBinding.signupVerifymobileno.viewOtpLayout.otpThird.getText().toString().trim());
                    signUpBinding.signupVerifymobileno.viewOtpLayout.otpFour.requestFocus();
                    apiOtp(false);
                } else if (signUpBinding.signupVerifymobileno.viewOtpLayout.otpThird.getText().toString().length() == 0) {
//                    otpNo.remove(2);
                    signUpBinding.signupVerifymobileno.viewOtpLayout.otpSecond.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        signUpBinding.signupVerifymobileno.viewOtpLayout.otpFour.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (signUpBinding.signupVerifymobileno.viewOtpLayout.otpFour.getText().toString().length() == 1) {
//                    otpNo.add(signUpBinding.signupVerifymobileno.viewOtpLayout.otpFour.getText().toString().trim());
                    signUpBinding.signupVerifymobileno.viewOtpLayout.otpFive.requestFocus();
                    apiOtp(false);
                } else if (signUpBinding.signupVerifymobileno.viewOtpLayout.otpFour.getText().toString().length() == 0) {
//                    otpNo.remove(3);
                    signUpBinding.signupVerifymobileno.viewOtpLayout.otpThird.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        signUpBinding.signupVerifymobileno.viewOtpLayout.otpFive.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (signUpBinding.signupVerifymobileno.viewOtpLayout.otpFive.getText().toString().length() == 1) {
//                    otpNo.add(signUpBinding.signupVerifymobileno.viewOtpLayout.otpFour.getText().toString().trim());
                    signUpBinding.signupVerifymobileno.viewOtpLayout.otpSix.requestFocus();
                    apiOtp(false);
                } else if (signUpBinding.signupVerifymobileno.viewOtpLayout.otpFive.getText().toString().length() == 0) {
//                    otpNo.remove(3);
                    signUpBinding.signupVerifymobileno.viewOtpLayout.otpFour.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        signUpBinding.signupVerifymobileno.viewOtpLayout.otpSix.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (signUpBinding.signupVerifymobileno.viewOtpLayout.otpSix.getText().toString().length() == 1) {
//                    otpNo.add(signUpBinding.signupVerifymobileno.viewOtpLayout.otpFour.getText().toString().trim());
                    apiOtp(true);
                } else if (signUpBinding.signupVerifymobileno.viewOtpLayout.otpSix.getText().toString().length() == 0) {
//                    otpNo.remove(3);
                    signUpBinding.signupVerifymobileno.viewOtpLayout.otpFive.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    private void apiOtp(boolean showErr) {
        strOtp = signUpBinding.signupVerifymobileno.viewOtpLayout.otpFirst.getText().toString().trim() +
                signUpBinding.signupVerifymobileno.viewOtpLayout.otpSecond.getText().toString().trim() +
                signUpBinding.signupVerifymobileno.viewOtpLayout.otpThird.getText().toString().trim() +
                signUpBinding.signupVerifymobileno.viewOtpLayout.otpFour.getText().toString().trim() +
                signUpBinding.signupVerifymobileno.viewOtpLayout.otpFive.getText().toString().trim() +
                signUpBinding.signupVerifymobileno.viewOtpLayout.otpSix.getText().toString().trim();
        if (strOtp.length() == 6) {
            showDialog();
            SignUpVerifyOTPPayLoad verifyOtpPayLoad = new SignUpVerifyOTPPayLoad();
            verifyOtpPayLoad.setTelephoneOtp(String.valueOf(strOtp));
            String authorization = "Bearer " + token;
            userPresenter.verifyOtp(verifyOtpPayLoad, authorization, ApiConstants.Constants.API_USER_REGISTRATION_OTP_VERFICATION);
        } else {
            if (showErr) {
                Toast.makeText(SignupActivity.this, "Enter Valid OTP", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void signupLogin(View view) {
        finish();
    }

    public void resendOTP() {
        showDialog();
        userPresenter.registerResendOTP("Bearer " + token, ApiConstants.Constants.API_USER_REGISTRATION_RESEND_OTP);
    }

    //API_USER_REGISTRATION_RESEND_OTP
    @Override
    public void onSuccessResponse(Response response, int requestType) {
        dismissDialog();
        switch (requestType) {
            case ApiConstants.Constants.API_USER_REGISTRATION:
                SignupResponse signupResponse = (SignupResponse) response.body();
                if (signupResponse != null && signupResponse.getData() != null) {
                    if (signupResponse.getStatus().getCode() == 1) {
                        //Todo navigate to otp verification for mobile and email OTP screen
//                        DataHelper.setAuthToken(this, signupResponse.getData().getAccessToken());
                        token = signupResponse.getData().getAccessToken();
                        Toast.makeText(this, signupResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
//                        //Todo  UI for signup verification otp not completed remove below Line and Un Comment the Line
                        signUpBinding.llViewsignupotpVerfication.setVisibility(View.VISIBLE);
                        signUpBinding.llSignupp.setVisibility(View.GONE);
                        signUpBinding.signupVerifymobileno.txtShowPhoneNumber
                                .setText(signUpBinding.signupVerifymobileno.txtShowPhoneNumber
                                        .getText().toString().replace("_",
                                                signUpBinding.edMobileNumber.getText().toString()));

                    } else {
                        Toast.makeText(this, signupResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(this, getString(R.string.mail_phone_exists), Toast.LENGTH_SHORT).show();
                }
                break;

            case ApiConstants.Constants.API_USER_REGISTRATION_OTP_VERFICATION:
                SignupOtpResponse otpResponse = (SignupOtpResponse) response.body();
                if (otpResponse != null) {
                    if (otpResponse.getStatus().getCode() == 1) {
                        //Todo navigate to otp verification for mobile and email OTP screen
                        Toast.makeText(this, otpResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
//                        //Todo  UI for signup verification otp not completed remove below Line and Un Comment the Line
                        Intent intent = new Intent(this, LoginActivity.class);
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        startActivity(intent);
                    } else {
                        Toast.makeText(this, otpResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(this, getString(R.string.mail_phone_exists), Toast.LENGTH_SHORT).show();
                }
            case ApiConstants.Constants.API_USER_REGISTRATION_RESEND_OTP:
                SignupOtpResponse response1 = (SignupOtpResponse) response.body();
                if (response1 != null) {
                    Toast.makeText(this, response1.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, getString(R.string.cmn_something_wrong), Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

    @Override
    public void onErrorResponse(String message, int requestType) {
        dismissDialog();
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

    }

    public void otpBackArrow(View view) {
        signUpBinding.llViewsignupotpVerfication.setVisibility(View.GONE);
        signUpBinding.llSignupp.setVisibility(View.VISIBLE);
        resetOtpFields();
    }

    private void resetOtpFields() {
        signUpBinding.signupVerifymobileno.viewOtpLayout.otpFirst.setText("");
        signUpBinding.signupVerifymobileno.viewOtpLayout.otpSecond.setText("");
        signUpBinding.signupVerifymobileno.viewOtpLayout.otpThird.setText("");
        signUpBinding.signupVerifymobileno.viewOtpLayout.otpFour.setText("");
        signUpBinding.signupVerifymobileno.viewOtpLayout.otpFive.setText("");
        signUpBinding.signupVerifymobileno.viewOtpLayout.otpSix.setText("");
    }

    public void changeNumber(View view) {
        signUpBinding.llViewsignupotpVerfication.setVisibility(View.GONE);
        signUpBinding.llSignupp.setVisibility(View.VISIBLE);
    }

    public void btnsignup(View view) {
        if (signUpBinding.edFirstName.getText().toString().isEmpty()) {

            Toast.makeText(getApplicationContext(), R.string.firstname, Toast.LENGTH_SHORT).show();

        } else if (signUpBinding.edLastName.getText().toString().isEmpty()) {

            Toast.makeText(getApplicationContext(), R.string.lastname, Toast.LENGTH_SHORT).show();

        } else if (signUpBinding.edMobileNumber.getText().toString().isEmpty()) {

            Toast.makeText(getApplicationContext(), R.string.txt_mobilenumber, Toast.LENGTH_SHORT).show();

        } else if (signUpBinding.edEmailId.getText().toString().isEmpty()
                && !Patterns.EMAIL_ADDRESS.matcher(signUpBinding.edEmailId.getText().toString()).matches()) {

            Toast.makeText(getApplicationContext(), R.string.txt_email, Toast.LENGTH_SHORT).show();

        } else if (signUpBinding.edPassword.getText().toString().isEmpty()) {
            Toast.makeText(getApplicationContext(), R.string.txt_password, Toast.LENGTH_SHORT).show();
        } else if (!signUpBinding.cbAcceptTerms.isChecked()) {
            Toast.makeText(getApplicationContext(), R.string.accept_terms, Toast.LENGTH_SHORT).show();
        } else {
            validateSignup();
        }
    }

    private void validateSignup() {
        showDialog();
        SignupPayLoad signupPayLoad = new SignupPayLoad();
        signupPayLoad.setFirstname(signUpBinding.edFirstName.getText().toString());
        signupPayLoad.setLastname(signUpBinding.edLastName.getText().toString());
        signupPayLoad.setTelephone(signUpBinding.edMobileNumber.getText().toString());
        signupPayLoad.setEmail(signUpBinding.edEmailId.getText().toString());
        signupPayLoad.setPassword(signUpBinding.edPassword.getText().toString());
        signupPayLoad.setConfirm(signUpBinding.edPassword.getText().toString());
        userPresenter.registerUser(signupPayLoad, ApiConstants.Constants.API_USER_REGISTRATION);
    }
}