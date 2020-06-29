package com.cmpay.ozy.service.impl;

import com.cmpay.ozy.bo.UserFindBO;
import com.cmpay.ozy.dao.IUserDao;
import com.cmpay.ozy.service.FindService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FindServiceImpl implements FindService {

    @Resource
    private IUserDao userDa;

    @Override
    public UserFindBO find(UserFindBO userFindBO) {
        return null;
    }
}
