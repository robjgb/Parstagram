package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("4n7UwwOBruNG785PrrTI6ClpreLAhyFKsCx4dk7J")
                .clientKey("NpfWmZxdxwPFFt46XxcjhcyhEeZKFr0qBiM3Kn86")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
