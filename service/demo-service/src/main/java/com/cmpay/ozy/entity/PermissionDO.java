/*
 * @ClassName PermissionDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-28 18:39:52
 */
package com.cmpay.ozy.entity;

import com.cmpay.framework.data.BaseDO;
import com.cmpay.lemon.framework.annotation.DataObject;
import java.time.LocalDateTime;

@DataObject
public class PermissionDO extends BaseDO {
    /**
     * @Fields permissionId 权限id
     */
    private Integer permissionId;
    /**
     * @Fields permissionType 权限类型
     */
    private String permissionType;
    /**
     * @Fields permissionCreateTime 创建时间
     */
    private LocalDateTime permissionCreateTime;
    /**
     * @Fields permissionCreateBy 创建人
     */
    private String permissionCreateBy;
    /**
     * @Fields permissionUpdateBy 更新人
     */
    private String permissionUpdateBy;
    /**
     * @Fields permissionUpdateDate 更新时间
     */
    private LocalDateTime permissionUpdateDate;
    /**
     * @Fields permissionIsUse 是否可用
     */
    private String permissionIsUse;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public LocalDateTime getPermissionCreateTime() {
        return permissionCreateTime;
    }

    public void setPermissionCreateTime(LocalDateTime permissionCreateTime) {
        this.permissionCreateTime = permissionCreateTime;
    }

    public String getPermissionCreateBy() {
        return permissionCreateBy;
    }

    public void setPermissionCreateBy(String permissionCreateBy) {
        this.permissionCreateBy = permissionCreateBy;
    }

    public String getPermissionUpdateBy() {
        return permissionUpdateBy;
    }

    public void setPermissionUpdateBy(String permissionUpdateBy) {
        this.permissionUpdateBy = permissionUpdateBy;
    }

    public LocalDateTime getPermissionUpdateDate() {
        return permissionUpdateDate;
    }

    public void setPermissionUpdateDate(LocalDateTime permissionUpdateDate) {
        this.permissionUpdateDate = permissionUpdateDate;
    }

    public String getPermissionIsUse() {
        return permissionIsUse;
    }

    public void setPermissionIsUse(String permissionIsUse) {
        this.permissionIsUse = permissionIsUse;
    }
}