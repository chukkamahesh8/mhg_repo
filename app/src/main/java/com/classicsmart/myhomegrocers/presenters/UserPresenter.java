package com.classicsmart.myhomegrocers.presenters;

import com.classicsmart.myhomegrocers.models.ForgotPasswordPayLoad;
import com.classicsmart.myhomegrocers.models.ForgotPasswordResponse;
import com.classicsmart.myhomegrocers.models.LoginEmailPayLoad;
import com.classicsmart.myhomegrocers.models.SetPasswordPayLoad;
import com.classicsmart.myhomegrocers.models.SignUpVerifyOTPPayLoad;
import com.classicsmart.myhomegrocers.models.SignupPayLoad;
import com.classicsmart.myhomegrocers.models.VerifyOtpPayLoad;
import com.classicsmart.myhomegrocers.models.userAuth.ForgotPasswordFinalResponse;
import com.classicsmart.myhomegrocers.models.userAuth.LoginResponse;
import com.classicsmart.myhomegrocers.models.userAuth.SignupOtpResponse;
import com.classicsmart.myhomegrocers.models.userAuth.SignupResponse;
import com.classicsmart.myhomegrocers.network.ApiClient;
import com.classicsmart.myhomegrocers.network.ApiConstants;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserPresenter {
    private ApiCallBack apiCallBack;
    private ApiClient apiClient;

    public UserPresenter(ApiCallBack apiCallBack) {
        this.apiCallBack = apiCallBack;
        apiClient = new ApiClient();
    }

    public void registerUser(SignupPayLoad userRegistrationPayload, final int type) {
        apiClient.getClient().userRegistration(userRegistrationPayload).enqueue(new Callback<SignupResponse>() {
            @Override
            public void onResponse(Call<SignupResponse> call, Response<SignupResponse> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
                    }
                } else if (response.code() == 400) {
                    if (response.errorBody() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
                    }

                } else {
                    apiCallBack.onErrorResponse(response.message(), type);
                }
            }

            @Override
            public void onFailure(Call<SignupResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

    public void registerResendOTP(String authToken, final int type) {
        apiClient.getClient().resendRegistrationOTP(authToken).enqueue(new Callback<SignupResponse>() {
            @Override
            public void onResponse(Call<SignupResponse> call, Response<SignupResponse> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
                    }
                } else if (response.code() == 400) {
                    if (response.errorBody() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
                    }

                } else {
                    apiCallBack.onErrorResponse(response.message(), type);
                }
            }

            @Override
            public void onFailure(Call<SignupResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(t.getLocalizedMessage(), type);
            }
        });
    }

    public void signInResendOTP(String authToken, final int type) {
        apiClient.getClient().resendLoginOTP(authToken).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse("Something went wrong.", type);
                    }
                } else if (response.code() == 400) {
                    if (response.errorBody() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse("Something went wrong.", type);
                    }

                } else {
                    apiCallBack.onErrorResponse(response.message(), type);
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }


    public void loginUser(LoginEmailPayLoad loginPayload, final int type) {
        apiClient.getClient().userLogin(loginPayload).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
                    }
                } else {
                    apiCallBack.onSuccessResponse(response, type);
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

   /* public void googleLogin(SocialLoginPayload loginPayload, final int type) {
        apiClient.getClient().googleLogin(loginPayload).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
                    }
                } else {
                    apiCallBack.onErrorResponse(response.message(), type);
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(t.getLocalizedMessage(), type);
            }
        });
    }

    public void facebookLogin(SocialLoginPayload loginPayload, final int type) {
        apiClient.getClient().facebookLogin(loginPayload).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
                    }
                } else {
                    apiCallBack.onErrorResponse(response.message(), type);
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(t.getLocalizedMessage(), type);
            }
        });
    }*/

    public void loginWithMobileOTP(VerifyOtpPayLoad loginPayload, String auth, final int type) {
        apiClient.getClient().loginWithMobileVerifyOTP(loginPayload, auth).enqueue(new Callback<LoginResponse>() {
            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
                    }
                } else {
                    apiCallBack.onErrorResponse(response.message(), type);
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

    public void verifyOtp(SignUpVerifyOTPPayLoad verifyOtpPayload, String authorization, final int type) {
        apiClient.getClient().userRegOtpVerification(verifyOtpPayload, authorization).enqueue(new Callback<SignupOtpResponse>() {
            @Override
            public void onResponse(Call<SignupOtpResponse> call, Response<SignupOtpResponse> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
                    }
                } else {
                    apiCallBack.onErrorResponse(response.message(), type);
                }
            }

            @Override
            public void onFailure(Call<SignupOtpResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

    public void sendForgotPasswordOtp(ForgotPasswordPayLoad sendOtpPayload, final int type) {
        apiClient.getClient().sendForgotPasswordOTP(sendOtpPayload).enqueue(new Callback<ForgotPasswordResponse>() {
            @Override
            public void onResponse(Call<ForgotPasswordResponse> call, Response<ForgotPasswordResponse> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
                    }
                } else {
                    apiCallBack.onErrorResponse(response.message(), type);
                }
            }

            @Override
            public void onFailure(Call<ForgotPasswordResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

    public void reSendForgotPasswordOtp(String auth, final int type) {
        apiClient.getClient().resendForgotOTP(auth).enqueue(new Callback<ForgotPasswordResponse>() {
            @Override
            public void onResponse(Call<ForgotPasswordResponse> call, Response<ForgotPasswordResponse> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
                    }
                } else {
                    apiCallBack.onErrorResponse(response.message(), type);
                }
            }

            @Override
            public void onFailure(Call<ForgotPasswordResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }


    public void updatePassword(SetPasswordPayLoad updatePasswordPayload, final int type) {
        apiClient.getClient().updatePassword(updatePasswordPayload).enqueue(new Callback<SignupResponse>() {
            @Override
            public void onResponse(Call<SignupResponse> call, Response<SignupResponse> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
                    }
                } else {
                    apiCallBack.onErrorResponse(response.message(), type);
                }
            }

            @Override
            public void onFailure(Call<SignupResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

    public void verifyForgotOtp(VerifyOtpPayLoad updatePasswordPayload, String auth, final int type) {
        apiClient.getClient().verifyForgotOtp(auth, updatePasswordPayload).enqueue(new Callback<ForgotPasswordFinalResponse>() {
            @Override
            public void onResponse(Call<ForgotPasswordFinalResponse> call, Response<ForgotPasswordFinalResponse> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
                    }
                } else {
                    apiCallBack.onErrorResponse(response.message(), type);
                }
            }

            @Override
            public void onFailure(Call<ForgotPasswordFinalResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }


    public void resendForgotOtp(String auth, final int type) {
        apiClient.getClient().resendForgotOTP(auth).enqueue(new Callback<ForgotPasswordResponse>() {
            @Override
            public void onResponse(Call<ForgotPasswordResponse> call, Response<ForgotPasswordResponse> response) {
                if (response.code() == 200) {
                    if (response.body() != null) {
                        apiCallBack.onSuccessResponse(response, type);
                    } else {
                        apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
                    }
                } else {
                    apiCallBack.onErrorResponse(response.message(), type);
                }
            }

            @Override
            public void onFailure(Call<ForgotPasswordResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

}
