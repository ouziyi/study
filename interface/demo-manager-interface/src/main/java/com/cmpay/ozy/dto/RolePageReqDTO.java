package com.cmpay.ozy.dto;

import com.cmpay.framework.data.response.PageableRspDTO;
import lombok.Data;

import java.util.List;

@Data
public class RolePageReqDTO extends PageableRspDTO {

    private RoleRspDTO role;

    private List<Long> roleIDs;

}
