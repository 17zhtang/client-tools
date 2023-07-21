package com.hltn.test.entity;

import lombok.Data;

@Data
public class TestAccount extends BaseEntity {
    private String type;

    private String account;

    private String password;

    private String verificationCode;

    private String comments;


}
