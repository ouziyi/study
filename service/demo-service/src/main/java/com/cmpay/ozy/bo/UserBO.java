/*
 * @ClassName UserDO
 * @Description 
 * @version 1.0
 * @Date 2020-06-28 18:39:52
 */
package com.cmpay.ozy.bo;


import lombok.Data;

import java.time.LocalDateTime;

@Data
public class UserBO  {
    /**
     * @Fields userid 用户id
     */
    private Integer userid;
    /**
     * @Fields userName 用户名
     */
    private String userName;
    /**
     * @Fields userPwd 用户密码
     */
    private String userPwd;
    /**
     * @Fields userDepartment 部门
     */
    private String userDepartment;
    /**
     * @Fields userPosition 岗位
     */
    private String userPosition;
    /**
     * @Fields userEmail 邮箱
     */
    private String userEmail;
    /**
     * @Fields userPhone 手机号
     */
    private String userPhone;
    /**
     * @Fields userStatus 状态
     */
    private String userStatus;
    /**
     * @Fields userCreateDate 创建时间
     */
    private LocalDateTime userCreateDate;
    /**
     * @Fields userCreateBy 创建人
     */
    private String userCreateBy;
    /**
     * @Fields userUpdateBy 更新人
     */
    private String userUpdateBy;
    /**
     * @Fields userUpdateDate 更新时间
     */
    private LocalDateTime userUpdateDate;
    /**
     * @Fields userIsUse 是否可用
     */
    private String userIsUse;


}