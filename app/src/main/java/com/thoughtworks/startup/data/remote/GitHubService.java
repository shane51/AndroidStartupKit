package com.thoughtworks.startup.data.remote;

import com.thoughtworks.startup.data.model.GitHubUserList;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;
import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface GitHubService {

//    String ENDPOINT = "http://192.168.1.3:3000";
    String ENDPOINT = "http://10.29.2.46:3000";

    @GET("/proxy")
    Observable<GitHubUserList> getGitHubUserList(@Query("q") String q);

    class Creator {

        public static GitHubService newGitHubService() {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(ENDPOINT)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
            return retrofit.create(GitHubService.class);
        }
    }
}
