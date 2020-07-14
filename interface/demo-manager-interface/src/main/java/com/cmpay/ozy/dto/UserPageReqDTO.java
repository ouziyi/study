package com.cmpay.ozy.dto;

import com.cmpay.framework.data.response.PageableRspDTO;

import java.util.List;

public class UserPageReqDTO extends PageableRspDTO {

    private UserRspDTO user;

    private List<Long> userIds;

    public UserRspDTO getUser() {
        return user;
    }

    public void setUser(UserRspDTO user) {
        this.user = user;
    }

    public List<Long> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<Long> userIds) {
        this.userIds = userIds;
    }
}
