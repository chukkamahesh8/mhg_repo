package com.classicsmart.myhomegrocers.presenters;


import com.classicsmart.myhomegrocers.models.dashboard.DashboardResponse;
import com.classicsmart.myhomegrocers.models.wishlist.GetWishListResponse;
import com.classicsmart.myhomegrocers.models.wishlist.WishListResponse;
import com.classicsmart.myhomegrocers.network.ApiClient;
import com.classicsmart.myhomegrocers.network.ApiConstants;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WishListPresenter {
    private final ApiCallBack apiCallBack;
    private final ApiClient apiClient;

    public WishListPresenter(ApiCallBack apiCallBack) {
        this.apiCallBack = apiCallBack;
        apiClient = new ApiClient();
    }

    public void getWishList(String auth, final int type) {
        apiClient.getClient().getWishList(auth).enqueue(new Callback<GetWishListResponse>() {
            @Override
            public void onResponse(Call<GetWishListResponse> call, Response<GetWishListResponse> response) {
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
            public void onFailure(Call<GetWishListResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

    public void deleteWishList(String auth,String id, final int type) {
        apiClient.getClient().deleteWishList(auth,id).enqueue(new Callback<WishListResponse>() {
            @Override
            public void onResponse(Call<WishListResponse> call, Response<WishListResponse> response) {
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
            public void onFailure(Call<WishListResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

    public void addProductToWishList(String auth,String id, final int type) {
        apiClient.getClient().addToWishList(auth,id).enqueue(new Callback<WishListResponse>() {
            @Override
            public void onResponse(Call<WishListResponse> call, Response<WishListResponse> response) {
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
            public void onFailure(Call<WishListResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }
}
