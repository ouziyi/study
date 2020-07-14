package com.cmpay.ozy.service;

import com.cmpay.lemon.framework.page.PageInfo;
import com.cmpay.ozy.bo.UserBO;
import com.cmpay.ozy.dto.UserDTO;

/**
 * @author lihuiquan
 */
public interface UserService {

    UserBO getUserInfo(String userId);

    //查询
    PageInfo<UserBO> getUserList(int pageNum,int pagaSize,UserBO userBO);

    //新增
    void addOrUpdateHandle(UserBO userBO);

    UserDTO getUserInfoByName(String userName);


    void deleteUserById(String userId);
}
