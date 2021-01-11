package com.hongdroid.recyclerviewsample.model;

public class UserInfo {
    private String userName;
    private String userAge;
    private String userHobby;

    public UserInfo() {
    }

    public UserInfo(String userName, String userAge, String userHobby) {
        this.userName = userName;
        this.userAge = userAge;
        this.userHobby = userHobby;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserHobby() {
        return userHobby;
    }

    public void setUserHobby(String userHobby) {
        this.userHobby = userHobby;
    }
}
