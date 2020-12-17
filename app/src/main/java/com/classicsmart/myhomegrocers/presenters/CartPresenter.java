package com.classicsmart.myhomegrocers.presenters;


import com.classicsmart.myhomegrocers.models.cart.AddCartResponse;
import com.classicsmart.myhomegrocers.models.cart.DeleteCartResponse;
import com.classicsmart.myhomegrocers.models.cart.GetCartResponse;
import com.classicsmart.myhomegrocers.models.cart.UpdateCartResponse;
import com.classicsmart.myhomegrocers.models.dashboard.DashboardResponse;
import com.classicsmart.myhomegrocers.models.wishlist.GetWishListResponse;
import com.classicsmart.myhomegrocers.models.wishlist.WishListResponse;
import com.classicsmart.myhomegrocers.network.ApiClient;
import com.classicsmart.myhomegrocers.network.ApiConstants;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CartPresenter {
    private final ApiCallBack apiCallBack;
    private final ApiClient apiClient;

    public CartPresenter(ApiCallBack apiCallBack) {
        this.apiCallBack = apiCallBack;
        apiClient = new ApiClient();
    }

    public void getCartList(String auth, final int type) {
        apiClient.getClient().getCart(auth).enqueue(new Callback<GetCartResponse>() {
            @Override
            public void onResponse(Call<GetCartResponse> call, Response<GetCartResponse> response) {
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
            public void onFailure(Call<GetCartResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

    public void deleteCartItem(String auth, final int type) {
        apiClient.getClient().deleteCartItem(auth).enqueue(new Callback<DeleteCartResponse>() {
            @Override
            public void onResponse(Call<DeleteCartResponse> call, Response<DeleteCartResponse> response) {
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
            public void onFailure(Call<DeleteCartResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

    public void addProductToCart(String auth, final int type) {
        apiClient.getClient().addProductToCart(auth).enqueue(new Callback<AddCartResponse>() {
            @Override
            public void onResponse(Call<AddCartResponse> call, Response<AddCartResponse> response) {
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
            public void onFailure(Call<AddCartResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

    public void addUpdateProductInCart(String auth, final int type) {
        apiClient.getClient().updateCartResponse(auth).enqueue(new Callback<UpdateCartResponse>() {
            @Override
            public void onResponse(Call<UpdateCartResponse> call, Response<UpdateCartResponse> response) {
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
            public void onFailure(Call<UpdateCartResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }
}
