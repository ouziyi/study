package com.cmpay.ozy.service.impl;

import com.cmpay.lemon.common.exception.BusinessException;
import com.cmpay.lemon.common.utils.BeanUtils;
import com.cmpay.lemon.common.utils.JudgeUtils;
import com.cmpay.ozy.bo.UserBO;
import com.cmpay.ozy.dao.IUserDao;
import com.cmpay.ozy.entity.UserDO;
import com.cmpay.ozy.enums.MsgEnum;
import com.cmpay.ozy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author lihuiquan
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private IUserDao userDao;

    @Override
    public UserBO getUserInfo(String userId) {

        UserDO userDO = userDao.get(Integer.valueOf(userId));
        if (JudgeUtils.isNull(userDO)){
            BusinessException.throwBusinessException(MsgEnum.FAIL);
        }
        UserBO userBO=new UserBO();
        BeanUtils.copyProperties(userBO,userDO);
        return userBO;
    }
}
