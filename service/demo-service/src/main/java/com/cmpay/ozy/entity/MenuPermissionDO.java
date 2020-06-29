/*
 * @ClassName MenuPermissionDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-28 18:39:52
 */
package com.cmpay.ozy.entity;

import com.cmpay.framework.data.BaseDO;
import com.cmpay.lemon.framework.annotation.DataObject;

@DataObject
public class MenuPermissionDO extends BaseDO {
    /**
     * @Fields menuId 菜单id
     */
    private Integer menuId;
    /**
     * @Fields permissionId 权限id
     */
    private Integer permissionId;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }
}