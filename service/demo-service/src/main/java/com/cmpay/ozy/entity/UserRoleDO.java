/*
 * @ClassName UserRoleDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-28 18:39:52
 */
package com.cmpay.ozy.entity;

import com.cmpay.framework.data.BaseDO;
import com.cmpay.lemon.framework.annotation.DataObject;

@DataObject
public class UserRoleDO extends BaseDO {
    /**
     * @Fields userid 用户id
     */
    private Integer userid;
    /**
     * @Fields roleId 角色id
     */
    private Integer roleId;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}