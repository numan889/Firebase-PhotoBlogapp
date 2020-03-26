package com.hossain.zakaria.firebasephotoapp.models;

public class User {

    private String userName,userPhone,userAdd,userBlood, userImageUrl;

    public User() {
        //empty constructor needed for retrieving data from fire-base
    }

    public User(String userName, String userPhone, String userAdd, String userBlood, String userImageUrl) {
        this.userName = userName;
        this.userPhone = userPhone;
        this.userAdd = userAdd;
        this.userBlood = userBlood;
        this.userImageUrl = userImageUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserAdd() {
        return userAdd;
    }

    public void setUserAdd(String userAdd) {
        this.userAdd = userAdd;
    }

    public String getUserBlood() {
        return userBlood;
    }

    public void setUserBlood(String userBlood) {
        this.userBlood = userBlood;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }
}
