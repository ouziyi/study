package com.cmpay.ozy.service.impl;

import com.cmpay.lemon.common.utils.BeanUtils;
import com.cmpay.lemon.framework.page.PageInfo;
import com.cmpay.lemon.framework.utils.PageUtils;
import com.cmpay.ozy.bo.RoleBO;
import com.cmpay.ozy.dao.IRoleDao;
import com.cmpay.ozy.entity.RoleDO;
import com.cmpay.ozy.service.RoleService;
import com.cmpay.ozy.utils.BeanConvertUtils;

import java.util.List;

public class RoleServiceImpl implements RoleService {

    private IRoleDao roleDao;

    @Override
    public List<RoleDO> selectAdd() {

        return null;
    }

    @Override
    public PageInfo<RoleBO> getRoleList(int pageNum, int pageSize, RoleBO roleBO) {
        PageInfo<RoleBO> pageInfo = null;
        RoleDO roleDO = new RoleDO();
        BeanUtils.copyProperties(roleDO,roleBO);
        if (pageNum==0||pageSize==0){
            pageInfo=new PageInfo<>(BeanConvertUtils.convertList(roleDao.find(roleDO),RoleBO.class));
        }else {
            pageInfo = PageUtils.pageQueryWithCount(pageNum, pageSize, () -> (BeanConvertUtils.convertList(roleDao.find(roleDO),RoleBO.class)));
        }
        return pageInfo;
    }


}
