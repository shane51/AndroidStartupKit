package com.thoughtworks.startup.data.remote;

import com.thoughtworks.startup.data.model.SignInResponse;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;
import rx.Observable;

public interface SignInService {
    
//    String ENDPOINT = "http://192.168.1.3:3000";
    String ENDPOINT = "http://10.29.2.46:3000";
    int SUCCESS_CODE = 1;

    @FormUrlEncoded
    @POST("api/login")
    Observable<SignInResponse> signIn(@Field("email") String email, @Field("password") String password);

    class Creator {

        public static SignInService newSignInService() {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(ENDPOINT)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
            return retrofit.create(SignInService.class);
        }
    }
}
