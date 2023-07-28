package com.hltn.test.dto.req;

import lombok.Data;


@Data
public class GetUserGroupsReqDto {
    private String groupName;

    private int currentPage;

    private int pageSize;
}
