/*
 * @ClassName IUserRoleDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-28 18:39:52
 */
package com.cmpay.ozy.dao;

import com.cmpay.lemon.framework.dao.BaseDao;
import com.cmpay.ozy.entity.UserRoleDO;
import com.cmpay.ozy.entity.UserRoleDOKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IUserRoleDao extends BaseDao<UserRoleDO, UserRoleDOKey> {
}