package com.example.triviaapp;

import android.content.Context;
import android.content.SharedPreferences;

public class User {

    private SharedPreferences sharedPreferences;

    private final String  NAME = "USER_NAME" , Cricketanswer = "USER_CRICKET", Flaganswer = "USER_FLAG";

    public User(Context context) {
        sharedPreferences = context.getSharedPreferences("Trivia App", Context.MODE_PRIVATE);
    }
    private void edit(String key, String value){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }


    public String getUserName() {
        return sharedPreferences.getString(NAME, "");
    }

    public void setUserName(String name) {
        edit(NAME,name);
    }

    public String getCricketanswer() {
        return sharedPreferences.getString(Cricketanswer, "");
    }

    public void setCricketanswer(String cricketanswer) {
        edit(Cricketanswer,cricketanswer);
    }




}
