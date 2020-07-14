package com.cmpay.ozy.controller;

import com.cmpay.framework.data.request.GenericDTO;
import com.cmpay.framework.data.response.GenericRspDTO;
import com.cmpay.lemon.common.utils.BeanUtils;
import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.data.NoBody;
import com.cmpay.lemon.framework.page.PageInfo;
import com.cmpay.lemon.framework.security.SecurityUtils;
import com.cmpay.lemon.framework.security.UserInfoBase;
import com.cmpay.ozy.bo.UserBO;
import com.cmpay.ozy.dto.UserDTO;
import com.cmpay.ozy.dto.UserPageReqDTO;
import com.cmpay.ozy.dto.UserPageRspDTO;
import com.cmpay.ozy.dto.UserRspDTO;
import com.cmpay.ozy.enums.MsgEnum;
import com.cmpay.ozy.service.UserService;
import com.cmpay.ozy.utils.BeanConvertUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author ouziyi
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/v1/demo/user/info")
    public GenericRspDTO<UserRspDTO> getUserInfo(@QueryBody GenericDTO genericDTO) {
        UserRspDTO userRspDTO = new UserRspDTO();
        UserInfoBase loginUser = SecurityUtils.getLoginUser();
        UserBO userBO = userService.getUserInfo(loginUser.getUserId());
        BeanUtils.copyProperties(userRspDTO,userBO);
        return GenericRspDTO.newInstance(MsgEnum.SUCCESS, userRspDTO);

    }

    //查询
    @GetMapping("/v1/demo/user/list")
    public GenericRspDTO<UserPageRspDTO> getUserList(@QueryBody UserPageReqDTO userPageReqDTO) {
        UserBO userBO = new UserBO();
        PageInfo<UserBO> pageInfo = userService.getUserList(userPageReqDTO.getPageNum(),userPageReqDTO.getPageSize(),userBO);
        UserPageRspDTO userRspDTO = new UserPageRspDTO();
        userRspDTO.setPageNum(pageInfo.getPageNum());
        userRspDTO.setPageSize(pageInfo.getPageSize());
        userRspDTO.setPages(pageInfo.getPages());
        userRspDTO.setTotal(pageInfo.getTotal());
        userRspDTO.setUsers(BeanConvertUtils.convertList(pageInfo.getList(), UserDTO.class));
        return GenericRspDTO.newInstance(MsgEnum.SUCCESS,userRspDTO);
    }





    //新增
    @PostMapping("/v1/demo/user/add")
    public GenericRspDTO<NoBody> addOrUpdateHandle(@RequestBody UserPageReqDTO userPageReqDTO) {
        UserBO userBO = BeanUtils.copyPropertiesReturnDest(new UserBO(),userPageReqDTO.getUser());
        userService.addOrUpdateHandle(userBO);
       return GenericRspDTO.newInstance(MsgEnum.SUCCESS);
    }

    //删除
    @DeleteMapping("/v1/demo/user/delete")
    public GenericRspDTO<NoBody> deleteUserInfo(@Validated String userId){
        userService.deleteUserById(userId);
        return GenericRspDTO.newInstance(MsgEnum.SUCCESS);
    }

    //修改
    @PostMapping("/v1/demo/user/update")
    public GenericRspDTO<NoBody> updateUserInfo(){
        return null;
    }

    //通过用户名查
    @GetMapping("/v1/demo/user/searchuserbyname")
    public GenericRspDTO<UserDTO> searchUserByName(@Validated String userName) {
        UserBO userBO = new UserBO();
        userBO.setUserName(userName);
        UserDTO userDTO = userService.getUserInfoByName(userName);
        return GenericRspDTO.newInstance(MsgEnum.SUCCESS,userDTO);
    }

}
