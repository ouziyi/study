package com.cmpay.ozy.service;


import com.cmpay.lemon.framework.page.PageInfo;
import com.cmpay.ozy.bo.RoleBO;
import com.cmpay.ozy.entity.RoleDO;

import java.util.List;

public interface RoleService {
    List<RoleDO> selectAdd();


    //查询
    PageInfo<RoleBO> getRoleList(int pageNum, int pageSize, RoleBO roleBO);
}
