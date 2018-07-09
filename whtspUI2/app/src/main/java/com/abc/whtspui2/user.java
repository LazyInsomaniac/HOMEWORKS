package com.abc.whtspui2;

import android.net.Uri;

public class user {

    public user(String name, String message,String userArrayList) {
        this.name = name;
        this.message = message;
        this.userArrayList= userArrayList;
    }

    private String name, message, userArrayList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public String getUserArrayList(int i) {
        return userArrayList;
    }

    public void setUserArrayList(String userArrayList) {
        this.message = userArrayList;
    }

}

