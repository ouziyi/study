package com.cmpay.ozy.controller;

import com.cmpay.framework.data.request.GenericDTO;
import com.cmpay.framework.data.response.GenericRspDTO;
import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.security.SecurityUtils;
import com.cmpay.lemon.framework.security.UserInfoBase;
import com.cmpay.ozy.bo.UserBO;
import com.cmpay.ozy.dto.UserRspDTO;
import com.cmpay.ozy.enums.MsgEnum;
import com.cmpay.ozy.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lihuiquan
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
}
