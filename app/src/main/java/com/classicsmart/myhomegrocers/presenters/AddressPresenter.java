package com.classicsmart.myhomegrocers.presenters;


import com.classicsmart.myhomegrocers.models.address.AddAddressResponse;
import com.classicsmart.myhomegrocers.models.address.AddressPayLoad;
import com.classicsmart.myhomegrocers.models.address.AddressResponse;
import com.classicsmart.myhomegrocers.models.dashboard.DashboardResponse;
import com.classicsmart.myhomegrocers.network.ApiClient;
import com.classicsmart.myhomegrocers.network.ApiConstants;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AddressPresenter {
    private final ApiCallBack apiCallBack;
    private final ApiClient apiClient;

    public AddressPresenter(ApiCallBack apiCallBack) {
        this.apiCallBack = apiCallBack;
        apiClient = new ApiClient();
    }

    public void getAddressApi(String auth, final int type) {
        apiClient.getClient().getAddress(auth).enqueue(new Callback<AddressResponse>() {
            @Override
            public void onResponse(Call<AddressResponse> call, Response<AddressResponse> response) {
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
            public void onFailure(Call<AddressResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

    public void addAddressApi(String auth, AddressPayLoad addressPayLoad, final int type) {
        apiClient.getClient().addNewAddress(auth,addressPayLoad).enqueue(new Callback<AddAddressResponse>() {
            @Override
            public void onResponse(Call<AddAddressResponse> call, Response<AddAddressResponse> response) {
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
            public void onFailure(Call<AddAddressResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

}
