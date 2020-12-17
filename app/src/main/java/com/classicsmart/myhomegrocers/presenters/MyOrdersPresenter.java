package com.classicsmart.myhomegrocers.presenters;


import com.classicsmart.myhomegrocers.models.CancelOrderPayload;
import com.classicsmart.myhomegrocers.models.FeedBackPayload;
import com.classicsmart.myhomegrocers.models.ReorderProductPayLoad;
import com.classicsmart.myhomegrocers.models.address.AddAddressResponse;
import com.classicsmart.myhomegrocers.models.address.AddressPayLoad;
import com.classicsmart.myhomegrocers.models.address.AddressResponse;
import com.classicsmart.myhomegrocers.models.myOrders.GetMyOrdersResponse;
import com.classicsmart.myhomegrocers.models.myOrders.OrderDetailsResponse;
import com.classicsmart.myhomegrocers.models.wishlist.WishListResponse;
import com.classicsmart.myhomegrocers.network.ApiClient;
import com.classicsmart.myhomegrocers.network.ApiConstants;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MyOrdersPresenter {
    private final ApiCallBack apiCallBack;
    private final ApiClient apiClient;

    public MyOrdersPresenter(ApiCallBack apiCallBack) {
        this.apiCallBack = apiCallBack;
        apiClient = new ApiClient();
    }

    public void getMYOrders(String auth,int i, final int type) {
        apiClient.getClient().getMyOrders(auth,i).enqueue(new Callback<GetMyOrdersResponse>() {
            @Override
            public void onResponse(Call<GetMyOrdersResponse> call, Response<GetMyOrdersResponse> response) {
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
            public void onFailure(Call<GetMyOrdersResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

    public void OrderDetails(String auth,String i, final int type) {
        apiClient.getClient().orderDetails(auth,i).enqueue(new Callback<OrderDetailsResponse>() {
            @Override
            public void onResponse(Call<OrderDetailsResponse> call, Response<OrderDetailsResponse> response) {
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
            public void onFailure(Call<OrderDetailsResponse> call, Throwable t) {
                apiCallBack.onErrorResponse(ApiConstants.Constants.API_DEFAULT_ERROR, type);
            }
        });
    }

    public void reOrderLatOrder(String auth,String i, final int type) {
        apiClient.getClient().reorderLastOrder(auth,i).enqueue(new Callback<WishListResponse>() {
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

    public void calcelOrder(String auth, CancelOrderPayload cancelOrderPayload, final int type) {
        apiClient.getClient().cancelOrder(auth,cancelOrderPayload).enqueue(new Callback<WishListResponse>() {
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

    public void rateOrder(String auth, FeedBackPayload feedBackPayload, final int type) {
        apiClient.getClient().rateOrder(auth,feedBackPayload).enqueue(new Callback<WishListResponse>() {
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

    public void reOrderLastOrderProduct(String auth, ReorderProductPayLoad reorderProductPayLoad, final int type) {
        apiClient.getClient().reorderLastOrderProduct(auth,reorderProductPayLoad).enqueue(new Callback<WishListResponse>() {
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
