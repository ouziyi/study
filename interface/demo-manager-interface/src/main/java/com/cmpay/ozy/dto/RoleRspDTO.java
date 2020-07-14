package com.cmpay.ozy.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author lihuiquan
 */
@Data
public class RoleRspDTO {

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
}
