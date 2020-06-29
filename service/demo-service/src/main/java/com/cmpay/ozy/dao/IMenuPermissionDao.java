/*
 * @ClassName IMenuPermissionDao
 * @Description 
 * @version 1.0
 * @Date 2020-06-28 18:39:52
 */
package com.cmpay.ozy.dao;

import com.cmpay.lemon.framework.dao.BaseDao;
import com.cmpay.ozy.entity.MenuPermissionDO;
import com.cmpay.ozy.entity.MenuPermissionDOKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IMenuPermissionDao extends BaseDao<MenuPermissionDO, MenuPermissionDOKey> {
}