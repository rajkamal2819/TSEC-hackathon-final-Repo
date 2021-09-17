package com.Hackthon.botshop.Models;

import com.google.firebase.firestore.auth.User;

public class Users {

    String profilePic,name,emailId,password,number,userId;

    public Users(String profilePic, String name, String emailId, String password, String number, String userId) {
        this.profilePic = profilePic;
        this.name = name;
        this.emailId = emailId;
        this.password = password;
        this.number = number;
        this.userId = userId;
    }
    public Users(String name, String emailId, String password) {
        this.name = name;
        this.emailId = emailId;
        this.password = password;
    }

    public Users(){}

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
