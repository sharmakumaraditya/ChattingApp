package com.example.adityakumarsharma.chattingapp.models;

/**
 * Created by Aditya Kumar Sharma on 7/12/2017.
 */
public class User {
    public String uid;
    public String email;
    public String firebaseToken;

    public User(){

    }

    public User(String uid, String email, String firebaseToken){
        this.uid = uid;
        this.email = email;
        this.firebaseToken = firebaseToken;
    }
}
