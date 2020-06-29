package com.cmpay.ozy.service;

import com.cmpay.ozy.bo.UserInfoBO;

/**
 * @author lihuiquan
 */
public interface LoginService {

    /**
     * @param userInfoBO
     * @return
     */
    UserInfoBO login(UserInfoBO userInfoBO);
}
