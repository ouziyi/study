package com.cmpay.ozy.bo;

import lombok.Data;

@Data
public class UserInfoBO {

    private String userId;

    private String username;

    private String mblNo;

    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMblNo() {
        return mblNo;
    }

    public void setMblNo(String mblNo) {
        this.mblNo = mblNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
