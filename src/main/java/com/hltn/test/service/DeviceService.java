package com.hltn.test.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hltn.test.dto.req.GetDevicesReqDto;
import com.hltn.test.dto.resp.GetDevicesRespDto;
import com.hltn.test.entity.Device;

import java.util.List;

public interface DeviceService extends IService<Device> {
//    public IPage<GetDevicesRespDto> getDevices(GetDevicesReqDto getDevicesReqDto);

//    public List<GetDevicesRespDto> getDevices();

    public Page<GetDevicesRespDto> getDevices(GetDevicesReqDto dto);
}
