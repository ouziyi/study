package com.cmpay.ozy.service.impl;

import com.cmpay.lemon.common.exception.BusinessException;
import com.cmpay.lemon.common.utils.BeanUtils;
import com.cmpay.lemon.common.utils.JudgeUtils;
import com.cmpay.lemon.framework.page.PageInfo;
import com.cmpay.lemon.framework.utils.PageUtils;
import com.cmpay.ozy.bo.UserBO;
import com.cmpay.ozy.dao.IUserDao;
import com.cmpay.ozy.dto.UserDTO;
import com.cmpay.ozy.entity.UserDO;
import com.cmpay.ozy.enums.MsgEnum;
import com.cmpay.ozy.service.UserService;
import com.cmpay.ozy.utils.BeanConvertUtils;
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


    //查询
    @Override
    public PageInfo<UserBO> getUserList(int pageNum,int pageSize,UserBO userBO) {
        PageInfo<UserBO> pageInfo=null;
        UserDO userDO=new UserDO();
        BeanUtils.copyProperties(userDO,userBO);
        if (pageNum==0||pageSize==0){
            pageInfo=new PageInfo<>(BeanConvertUtils.convertList(userDao.find(userDO),UserBO.class));

        }else {
            pageInfo = PageUtils.pageQueryWithCount(pageNum, pageSize, () -> (BeanConvertUtils.convertList(userDao.find(userDO),UserBO.class)));
        }
        return pageInfo;
    }

    //新增
    @Override
    public void addOrUpdateHandle(UserBO userBO) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(userDO,userBO);
        int insert = userDao.insert(userDO);
        if(insert <= 0){
            BusinessException.throwBusinessException(MsgEnum.FAIL);
        }
    }

    //通过用户名查
    @Override
    public UserDTO getUserInfoByName(String userName) {
        UserBO userBO = new UserBO();
        userBO.setUserName(userName);
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(userBO,userDO);
       List<UserDO> usersDO = userDao.find(userDO);
       UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(usersDO.get(0),userDTO);
        return userDTO;
    }

    //删除
    @Override
    public void deleteUserById(String userId) {
        String[] userIds = userId.split(",");
        for (int i = 0;i < userIds.length;i++){
            userDao.delete(Integer.valueOf(userIds[i]));
        }
    }


}
