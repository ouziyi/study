/*
 * @ClassName IRolePermissionDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-28 18:39:52
 */
package com.cmpay.ozy.dao;

import com.cmpay.lemon.framework.dao.BaseDao;
import com.cmpay.ozy.entity.RolePermissionDO;
import com.cmpay.ozy.entity.RolePermissionDOKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IRolePermissionDao extends BaseDao<RolePermissionDO, RolePermissionDOKey> {
}