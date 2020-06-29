package com.cmpay.ozy.dto;

import java.time.LocalDateTime;

/**
 * @author lihuiquan
 */
public class UserRspDTO {

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

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public LocalDateTime getUserCreateDate() {
        return userCreateDate;
    }

    public void setUserCreateDate(LocalDateTime userCreateDate) {
        this.userCreateDate = userCreateDate;
    }

    public String getUserCreateBy() {
        return userCreateBy;
    }

    public void setUserCreateBy(String userCreateBy) {
        this.userCreateBy = userCreateBy;
    }

    public String getUserUpdateBy() {
        return userUpdateBy;
    }

    public void setUserUpdateBy(String userUpdateBy) {
        this.userUpdateBy = userUpdateBy;
    }

    public LocalDateTime getUserUpdateDate() {
        return userUpdateDate;
    }

    public void setUserUpdateDate(LocalDateTime userUpdateDate) {
        this.userUpdateDate = userUpdateDate;
    }

    public String getUserIsUse() {
        return userIsUse;
    }

    public void setUserIsUse(String userIsUse) {
        this.userIsUse = userIsUse;
    }
}
