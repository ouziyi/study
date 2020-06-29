/*
 * @ClassName RoleDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-28 18:39:52
 */
package com.cmpay.ozy.entity;

import com.cmpay.framework.data.BaseDO;
import com.cmpay.lemon.framework.annotation.DataObject;
import java.time.LocalDateTime;

@DataObject
public class RoleDO extends BaseDO {
    /**
     * @Fields roleId 角色id
     */
    private Integer roleId;
    /**
     * @Fields roleName 角色名称
     */
    private String roleName;
    /**
     * @Fields roleRemark 备注
     */
    private String roleRemark;
    /**
     * @Fields roleTime 创建时间
     */
    private LocalDateTime roleTime;
    /**
     * @Fields roleCreateBy 创建人
     */
    private String roleCreateBy;
    /**
     * @Fields roleUpdateBy 更新人
     */
    private String roleUpdateBy;
    /**
     * @Fields roleUpdateDate 更新时间
     */
    private LocalDateTime roleUpdateDate;
    /**
     * @Fields roleIsUse 是否可用
     */
    private String roleIsUse;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleRemark() {
        return roleRemark;
    }

    public void setRoleRemark(String roleRemark) {
        this.roleRemark = roleRemark;
    }

    public LocalDateTime getRoleTime() {
        return roleTime;
    }

    public void setRoleTime(LocalDateTime roleTime) {
        this.roleTime = roleTime;
    }

    public String getRoleCreateBy() {
        return roleCreateBy;
    }

    public void setRoleCreateBy(String roleCreateBy) {
        this.roleCreateBy = roleCreateBy;
    }

    public String getRoleUpdateBy() {
        return roleUpdateBy;
    }

    public void setRoleUpdateBy(String roleUpdateBy) {
        this.roleUpdateBy = roleUpdateBy;
    }

    public LocalDateTime getRoleUpdateDate() {
        return roleUpdateDate;
    }

    public void setRoleUpdateDate(LocalDateTime roleUpdateDate) {
        this.roleUpdateDate = roleUpdateDate;
    }

    public String getRoleIsUse() {
        return roleIsUse;
    }

    public void setRoleIsUse(String roleIsUse) {
        this.roleIsUse = roleIsUse;
    }
}