package com.abc.viewpagerwhatsappui;

public class user
{
    public user (String name, String message)
    {
        this.name= name;
        this.message=message;

    }
    private String name,message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
