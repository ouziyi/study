/*
 * @ClassName MenuDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-28 18:39:52
 */
package com.cmpay.ozy.entity;

import com.cmpay.framework.data.BaseDO;
import com.cmpay.lemon.framework.annotation.DataObject;
import java.time.LocalDateTime;

@DataObject
public class MenuDO extends BaseDO {
    /**
     * @Fields menuId 菜单id
     */
    private Integer menuId;
    /**
     * @Fields menuParentId 父级菜单
     */
    private String menuParentId;
    /**
     * @Fields menuName 菜单名称
     */
    private String menuName;
    /**
     * @Fields menuType 菜单类型
     */
    private String menuType;
    /**
     * @Fields menuSort 排序
     */
    private Integer menuSort;
    /**
     * @Fields menuCreateTime 创建时间
     */
    private LocalDateTime menuCreateTime;
    /**
     * @Fields menuCreateBy 创建人
     */
    private String menuCreateBy;
    /**
     * @Fields menuUpdateBy 更新人
     */
    private String menuUpdateBy;
    /**
     * @Fields menuUpdateDate 更新时间
     */
    private LocalDateTime menuUpdateDate;
    /**
     * @Fields menuIsUse 是否可用
     */
    private String menuIsUse;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(String menuParentId) {
        this.menuParentId = menuParentId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public Integer getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
    }

    public LocalDateTime getMenuCreateTime() {
        return menuCreateTime;
    }

    public void setMenuCreateTime(LocalDateTime menuCreateTime) {
        this.menuCreateTime = menuCreateTime;
    }

    public String getMenuCreateBy() {
        return menuCreateBy;
    }

    public void setMenuCreateBy(String menuCreateBy) {
        this.menuCreateBy = menuCreateBy;
    }

    public String getMenuUpdateBy() {
        return menuUpdateBy;
    }

    public void setMenuUpdateBy(String menuUpdateBy) {
        this.menuUpdateBy = menuUpdateBy;
    }

    public LocalDateTime getMenuUpdateDate() {
        return menuUpdateDate;
    }

    public void setMenuUpdateDate(LocalDateTime menuUpdateDate) {
        this.menuUpdateDate = menuUpdateDate;
    }

    public String getMenuIsUse() {
        return menuIsUse;
    }

    public void setMenuIsUse(String menuIsUse) {
        this.menuIsUse = menuIsUse;
    }
}