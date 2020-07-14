package com.cmpay.ozy.dto;

import com.cmpay.framework.data.response.PageableRspDTO;

import java.util.List;

public class UserPageRspDTO extends PageableRspDTO {

    private List<UserDTO> users;

    public List<UserDTO> getUsers() {
        return users;
    }

    public void setUsers(List<UserDTO> users) {
        this.users = users;
    }
}
