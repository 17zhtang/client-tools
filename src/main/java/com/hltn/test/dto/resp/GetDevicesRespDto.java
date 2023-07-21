package com.hltn.test.dto.resp;

import lombok.Data;

@Data
public class GetDevicesRespDto {

    private Long deviceId;

    private String model;

    private String brand;

    private String systemType;

    private String systemVersion;

    private Long ownerId;

    private String currentUser;

    private String state;

    private String comments;

    private Long userGroupId;

    private String GroupName;
}
