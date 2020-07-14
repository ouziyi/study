package com.cmpay.ozy.controller;


import com.cmpay.framework.data.response.GenericRspDTO;
import com.cmpay.lemon.framework.annotation.QueryBody;
import com.cmpay.lemon.framework.page.PageInfo;
import com.cmpay.ozy.bo.RoleBO;
import com.cmpay.ozy.dto.RoleDTO;
import com.cmpay.ozy.dto.RolePageReqDTO;
import com.cmpay.ozy.dto.RolePageRspDTO;
import com.cmpay.ozy.enums.MsgEnum;
import com.cmpay.ozy.service.RoleService;
import com.cmpay.ozy.utils.BeanConvertUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoleController {
    RoleService roleService;

    //查询
    @GetMapping("/v1/demo/role/list")
    public GenericRspDTO<RolePageRspDTO> getRoleList(@QueryBody RolePageReqDTO rolePageReqDTO) {
        RoleBO roleBO = new RoleBO();
        PageInfo<RoleBO> pageInfo = roleService.getRoleList(rolePageReqDTO.getPageNum(),rolePageReqDTO.getPageSize(),roleBO);
        RolePageRspDTO rolePageRspDTO = new RolePageRspDTO();
        rolePageReqDTO.setPageNum(pageInfo.getPageNum());
        rolePageRspDTO.setPageSize(pageInfo.getPageSize());
        rolePageRspDTO.setPages(pageInfo.getPages());
        rolePageRspDTO.setTotal(pageInfo.getTotal());

        rolePageRspDTO.setRoles(BeanConvertUtils.convertList(pageInfo.getList(), RoleDTO.class));
        return GenericRspDTO.newInstance(MsgEnum.SUCCESS,rolePageRspDTO);
    }

}
