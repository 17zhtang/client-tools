package com.hltn.test;

import cn.hutool.crypto.SecureUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientToolsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void testController(){
        String str = SecureUtil.md5(SecureUtil.md5(String.format("%s%s", 11439866,6087)));
        System.out.println(str);
    }

}
