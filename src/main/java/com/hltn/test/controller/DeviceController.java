package com.hltn.test.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hltn.test.common.result.Result;
import com.hltn.test.dto.req.GetDevicesReqDto;
import com.hltn.test.dto.resp.GetDevicesRespDto;
import com.hltn.test.entity.Device;
import com.hltn.test.service.DeviceService;
import com.hltn.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/device")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @Autowired
    private UserService userService;

    @GetMapping("/get/{id}")
    public Result getDeviceInfo(@PathVariable int id){
        Device device = deviceService.getById(id);
        return Result.ok(device);
    }

    @PostMapping("/page")
    public Result getDevices(@RequestBody GetDevicesReqDto devicesReqDto){


        return null;
    }
}
