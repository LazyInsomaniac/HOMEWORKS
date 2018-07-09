package com.abc.whatsapp;

public class Chat {
    private String name;
    private String message;
    private int photo;


    public Chat() {
    }

    public Chat(String name, String message, int photo) {
        this.name = name;
        this.message = message;
        this.photo = photo;
    }


    //Getter

    public String getName() {
        return name;
    }

    public int getPhoto() {
        return photo;
    }

    public String getMessage() {
        return message;

    }
    //Setter

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
