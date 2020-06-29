package com.cmpay.ozy.service.impl;

import com.cmpay.lemon.common.exception.BusinessException;
import com.cmpay.lemon.common.utils.JudgeUtils;
import com.cmpay.ozy.bo.UserInfoBO;
import com.cmpay.ozy.dao.IUserDao;
import com.cmpay.ozy.entity.UserDO;
import com.cmpay.ozy.enums.MsgEnum;
import com.cmpay.ozy.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private IUserDao userDao;

    @Override
    public UserInfoBO login(UserInfoBO userInfoBO) {
        UserDO userDO=new UserDO();
        userDO.setUserName(userInfoBO.getUsername());
        userDO.setUserPwd(userInfoBO.getPassword());
        List<UserDO> userDOS = userDao.find(userDO);
        if (JudgeUtils.isEmpty(userDOS)){
            BusinessException.throwBusinessException(MsgEnum.FAIL);
        }
        UserDO user = userDOS.get(0);
        userInfoBO.setUserId(String.valueOf(user.getUserid()));
        userInfoBO.setUsername(user.getUserName());
        userInfoBO.setMblNo(user.getUserPhone());
        return userInfoBO;
    }
}
