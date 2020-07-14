package com.cmpay.ozy.dto;

import com.cmpay.framework.data.response.PageableRspDTO;
import lombok.Data;

import java.util.List;

@Data
public class RolePageRspDTO extends PageableRspDTO {

    private List<RoleDTO> roles;
}
