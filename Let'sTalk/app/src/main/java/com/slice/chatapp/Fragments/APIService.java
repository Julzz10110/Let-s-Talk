package com.slice.chatapp.Fragments;

import com.slice.chatapp.Notifications.MyResponse;
import com.slice.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAf3guzuQ:APA91bF5kAEJuSIuFd7A98f1FKmUyrkCu1W3xDp4a4Gle9VAUT6lTODvoq_Hc1J-dXL__2yfIYRP54yvCR5ZeHkzdqXv0ouGWIQNXAQwfnVVq8AaAZ1eftQeJa7FLxslDI1R-vFnXMvw"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
