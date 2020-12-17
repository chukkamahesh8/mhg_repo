package com.classicsmart.myhomegrocers.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;
import androidx.databinding.DataBindingUtil;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.databinding.ActivityForgotpasswordBinding;
import com.classicsmart.myhomegrocers.models.ForgotPasswordPayLoad;
import com.classicsmart.myhomegrocers.models.ForgotPasswordResponse;
import com.classicsmart.myhomegrocers.models.SetPasswordPayLoad;
import com.classicsmart.myhomegrocers.models.VerifyOtpPayLoad;
import com.classicsmart.myhomegrocers.models.userAuth.ForgotPasswordFinalResponse;
import com.classicsmart.myhomegrocers.models.userAuth.LoginResponse;
import com.classicsmart.myhomegrocers.models.userAuth.SignupResponse;
import com.classicsmart.myhomegrocers.network.ApiConstants;
import com.classicsmart.myhomegrocers.presenters.ApiCallBack;
import com.classicsmart.myhomegrocers.presenters.UserPresenter;

import retrofit2.Response;


public class ForgotPasswordActivity extends BaseActivity implements ApiCallBack, View.OnClickListener {
    ActivityForgotpasswordBinding binding;
    private UserPresenter userPresenter;
    private String strOtp;
    private String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_forgotpassword);
        userPresenter = new UserPresenter(this);
        initViews();
    }

    private void initViews() {
        binding.btnLogin.setOnClickListener(this);
        binding.btnBack.setOnClickListener(this);
        binding.btnSubmit.setOnClickListener(this);
        binding.viewOtpId.btnChangeNumber.setOnClickListener(this);
        binding.viewOtpId.btnUpdatePassword.setOnClickListener(this);
        otpData();
    }

    private void showOtpView() {
        binding.rlForgotscreen.setVisibility(View.GONE);
        binding.viewRootOtp.setVisibility(View.VISIBLE);
        binding.viewOtpId.otpEntry.setVisibility(View.VISIBLE);
        binding.viewOtpId.viewChangePassword.setVisibility(View.GONE);
        binding.viewOtpId.viewOtpLayout.txtResendOtp.setOnClickListener(this);
        binding.viewOtpId.txtShowPhoneNumber.setText("Please enter the verification code sent to " + binding.edTxtNumber.getText().toString().trim());
    }

    private boolean validate() {
        if (!binding.edTxtNumber.getText().toString().trim().isEmpty() &&
                binding.edTxtNumber.getText().toString().trim().length() == 10) {
            return true;
        }
        return false;
    }

    public void clickforgotarrow(View view) {
        binding.llForgotmobileno.setVisibility(View.GONE);
        binding.viewRootOtp.setVisibility(View.VISIBLE);
    }

    @Override
    public void onSuccessResponse(Response response, int requestType) {
        dismissDialog();
        if (requestType == ApiConstants.Constants.API_USER_VERIFY_FORGOT_PASSWORD_PHONE) {
            ForgotPasswordFinalResponse updatePasswordResponse = (ForgotPasswordFinalResponse) response.body();
            if (updatePasswordResponse != null && updatePasswordResponse.getStatus() != null) {
                if (updatePasswordResponse.getStatus().getCode() == 1) {
                    //Todo navigate to Login Screen
                    Toast.makeText(this, updatePasswordResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(ForgotPasswordActivity.this, LoginActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(this, updatePasswordResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        } else if (requestType == ApiConstants.Constants.API_USER_FORGOT_PASSWORD_SEND_OTP) {
            ForgotPasswordResponse updatePasswordResponse = (ForgotPasswordResponse) response.body();
            if (updatePasswordResponse != null && updatePasswordResponse.getData() != null) {
                if (updatePasswordResponse.getStatus().getCode() == 1) {
                    //Todo navigate to Login Screen
                    if (updatePasswordResponse.getData() != null && updatePasswordResponse.getData().getAccessToken() != null) {
                        token = updatePasswordResponse.getData().getAccessToken();
                    }
                    showOtpView();
                } else {
                    Toast.makeText(this, updatePasswordResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        } else if (requestType == ApiConstants.Constants.API_USER_FORGOT_PASSWORD_RESEND_OTP) {
            ForgotPasswordResponse updatePasswordResponse = (ForgotPasswordResponse) response.body();
            if (updatePasswordResponse != null && updatePasswordResponse.getData() != null) {
                if (updatePasswordResponse.getStatus().getCode() == 1) {
                    //Todo navigate to Login Screen
                    if (updatePasswordResponse.getData() != null && updatePasswordResponse.getData().getAccessToken() != null) {
                        token = "Bearer " + updatePasswordResponse.getData().getAccessToken();
                    }
                }
                {
                    Toast.makeText(this, updatePasswordResponse.getStatus().getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        }

    }

    @Override
    public void onErrorResponse(String message, int requestType) {
        dismissDialog();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_back:
                if (binding.viewOtpId.viewChangePassword.getVisibility() == View.VISIBLE) {
                    binding.viewOtpId.viewChangePassword.setVisibility(View.GONE);
                    binding.viewRootOtp.setVisibility(View.VISIBLE);
                    binding.viewOtpId.otpEntry.setVisibility(View.VISIBLE);
                } else if (binding.viewRootOtp.getVisibility() == View.VISIBLE) {
                    binding.rlForgotscreen.setVisibility(View.VISIBLE);
                    binding.viewRootOtp.setVisibility(View.GONE);
                    binding.viewOtpId.otpEntry.setVisibility(View.GONE);
                } else {
                    finish();
                }
                break;
            case R.id.btn_Login:
                finish();
                break;
            case R.id.btn_submit:
                sendOtpAPI();
                break;
            case R.id.txtResendOtp:
                resendOTP();
                break;
            case R.id.btnChangeNumber:
                hideOtpView();
                break;
            case R.id.btnUpdatePassword:
                changePassword();
                break;
        }
    }

    private void hideOtpView() {
        binding.viewOtpId.viewOtpLayout.otpFirst.setText("");
        binding.viewOtpId.viewOtpLayout.otpSecond.setText("");
        binding.viewOtpId.viewOtpLayout.otpThird.setText("");
        binding.viewOtpId.viewOtpLayout.otpFour.setText("");
        binding.viewOtpId.viewOtpLayout.otpFive.setText("");
        binding.viewOtpId.viewOtpLayout.otpSix.setText("");
        binding.rlForgotscreen.setVisibility(View.VISIBLE);
        binding.viewRootOtp.setVisibility(View.GONE);
    }

    private void resendOTP() {
        showDialog();
        userPresenter.resendForgotOtp("Bearer " + token, ApiConstants.Constants.API_USER_FORGOT_PASSWORD_RESEND_OTP);
    }

    private void sendOtpAPI() {
        if (validate()) {
            showDialog();
            ForgotPasswordPayLoad forgotPasswordPayLoad = new ForgotPasswordPayLoad();
            forgotPasswordPayLoad.setTelephone(binding.edTxtNumber.getText().toString());
            forgotPasswordPayLoad.setType("telephone");
            userPresenter.sendForgotPasswordOtp(forgotPasswordPayLoad, ApiConstants.Constants.API_USER_FORGOT_PASSWORD_SEND_OTP);
            showOtpView();
        } else {
            Toast.makeText(this, "Please enter valid Mobile Number", Toast.LENGTH_SHORT).show();
        }
    }

    private void otpData() {
        binding.viewOtpId.viewOtpLayout.otpFirst.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (binding.viewOtpId.viewOtpLayout.otpFirst.getText().toString().length() == 1) {
                    binding.viewOtpId.viewOtpLayout.otpSecond.requestFocus();
                    apiVerifyOtp(false);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        binding.viewOtpId.viewOtpLayout.otpSecond.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (binding.viewOtpId.viewOtpLayout.otpSecond.getText().toString().length() == 1) {
//                    otpNo.add(binding.viewOtpId.viewOtpLayout.otpSecond.getText().toString().trim());
                    binding.viewOtpId.viewOtpLayout.otpThird.requestFocus();
                    apiVerifyOtp(false);
                } else if (binding.viewOtpId.viewOtpLayout.otpSecond.getText().toString().length() == 0) {
//                    otpNo.remove(1);
                    binding.viewOtpId.viewOtpLayout.otpFirst.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        binding.viewOtpId.viewOtpLayout.otpThird.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (binding.viewOtpId.viewOtpLayout.otpThird.getText().toString().length() == 1) {
//                    otpNo.add(binding.viewOtpId.viewOtpLayout.otpThird.getText().toString().trim());
                    binding.viewOtpId.viewOtpLayout.otpFour.requestFocus();
                    apiVerifyOtp(false);
                } else if (binding.viewOtpId.viewOtpLayout.otpThird.getText().toString().length() == 0) {
//                    otpNo.remove(2);
                    binding.viewOtpId.viewOtpLayout.otpSecond.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        binding.viewOtpId.viewOtpLayout.otpFour.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (binding.viewOtpId.viewOtpLayout.otpFour.getText().toString().length() == 1) {
//                    otpNo.add(binding.viewOtpId.viewOtpLayout.otpFour.getText().toString().trim());
                    binding.viewOtpId.viewOtpLayout.otpFive.requestFocus();
                    apiVerifyOtp(false);
                } else if (binding.viewOtpId.viewOtpLayout.otpFour.getText().toString().length() == 0) {
//                    otpNo.remove(3);
                    binding.viewOtpId.viewOtpLayout.otpThird.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        binding.viewOtpId.viewOtpLayout.otpFive.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (binding.viewOtpId.viewOtpLayout.otpFive.getText().toString().length() == 1) {
//                    otpNo.add(binding.viewOtpId.viewOtpLayout.otpFour.getText().toString().trim());
                    binding.viewOtpId.viewOtpLayout.otpSix.requestFocus();
                    apiVerifyOtp(false);
                } else if (binding.viewOtpId.viewOtpLayout.otpFive.getText().toString().length() == 0) {
//                    otpNo.remove(3);
                    binding.viewOtpId.viewOtpLayout.otpFour.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        binding.viewOtpId.viewOtpLayout.otpSix.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (binding.viewOtpId.viewOtpLayout.otpSix.getText().toString().length() == 1) {
//                    otpNo.add(binding.viewOtpId.viewOtpLayout.otpFour.getText().toString().trim());
                    apiVerifyOtp(true);
                } else if (binding.viewOtpId.viewOtpLayout.otpSix.getText().toString().length() == 0) {
//                    otpNo.remove(3);
                    binding.viewOtpId.viewOtpLayout.otpFive.requestFocus();
                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    boolean isPhoneNumber = true;

    private void showChangePassword() {
        binding.viewOtpId.otpEntry.setVisibility(View.GONE);
        binding.viewOtpId.viewChangePassword.setVisibility(View.VISIBLE);
    }

    private void apiVerifyOtp(boolean b) {
        strOtp = binding.viewOtpId.viewOtpLayout.otpFirst.getText().toString().trim() +
                binding.viewOtpId.viewOtpLayout.otpSecond.getText().toString().trim() +
                binding.viewOtpId.viewOtpLayout.otpThird.getText().toString().trim() +
                binding.viewOtpId.viewOtpLayout.otpFour.getText().toString().trim() +
                binding.viewOtpId.viewOtpLayout.otpFive.getText().toString().trim() +
                binding.viewOtpId.viewOtpLayout.otpSix.getText().toString().trim();
        if (strOtp.length() == 6) {
            showChangePassword();
        } else {
            if (b) {
                Toast.makeText(this, "Enter Valid OTP", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void changePassword() {
        if (validatePassword()) {
            strOtp = binding.viewOtpId.viewOtpLayout.otpFirst.getText().toString().trim() +
                    binding.viewOtpId.viewOtpLayout.otpSecond.getText().toString().trim() +
                    binding.viewOtpId.viewOtpLayout.otpThird.getText().toString().trim() +
                    binding.viewOtpId.viewOtpLayout.otpFour.getText().toString().trim() +
                    binding.viewOtpId.viewOtpLayout.otpFive.getText().toString().trim() +
                    binding.viewOtpId.viewOtpLayout.otpSix.getText().toString().trim();
            showDialog();
            VerifyOtpPayLoad verifyOtpPayLoad = new VerifyOtpPayLoad();
            verifyOtpPayLoad.setOtp(String.valueOf(strOtp));
            verifyOtpPayLoad.setConfirm(binding.viewOtpId.edtxtNewPassword.getText().toString());
            verifyOtpPayLoad.setPassword(binding.viewOtpId.edtxtNewPassword.getText().toString());
           /* if (isPhoneNumber) {
                verifyOtpPayLoad.setType(ApiConstants.UserConstants.Login_MOBILE_Verify_OTP);
            } else {
                verifyOtpPayLoad.setType(ApiConstants.UserConstants.Login_EMAIL_Verify_OTP);
            }*/
            String authorization = "Bearer " + token;
            userPresenter.verifyForgotOtp(verifyOtpPayLoad, authorization, ApiConstants.Constants.API_USER_VERIFY_FORGOT_PASSWORD_PHONE);
        }
    }

    private boolean validatePassword() {
        if (binding.viewOtpId.edtxtNewPassword.getText().toString().trim().isEmpty() || binding.viewOtpId.edtxtNewPassword.getText().toString().trim().length() < 6) {
            Toast.makeText(getApplicationContext(), "Enter valid password", Toast.LENGTH_SHORT).show();
            return false;
        } else if (binding.viewOtpId.edtxtConfirmPassword.getText().toString().trim().isEmpty() || binding.viewOtpId.edtxtNewPassword.getText().toString().trim().length() < 6) {
            Toast.makeText(getApplicationContext(), "Enter valid confirm password", Toast.LENGTH_SHORT).show();
            return false;
        } else if (!binding.viewOtpId.edtxtConfirmPassword.getText().toString().trim().equals(binding.viewOtpId.edtxtNewPassword.getText().toString().trim())) {
            Toast.makeText(getApplicationContext(), "Password mismatch ", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        if (binding.viewOtpId.viewChangePassword.getVisibility() == View.VISIBLE) {
            binding.viewOtpId.viewChangePassword.setVisibility(View.GONE);
            binding.viewRootOtp.setVisibility(View.VISIBLE);
            binding.viewOtpId.otpEntry.setVisibility(View.VISIBLE);
        } else if (binding.viewRootOtp.getVisibility() == View.VISIBLE) {
            binding.rlForgotscreen.setVisibility(View.VISIBLE);
            binding.viewRootOtp.setVisibility(View.GONE);
            binding.viewOtpId.otpEntry.setVisibility(View.GONE);
        } else {
            finish();
        }
    }
}
