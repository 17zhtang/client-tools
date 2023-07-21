package com.hltn.test.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.hltn.test.dto.req.GetDevicesReqDto;
import com.hltn.test.dto.resp.GetDevicesRespDto;
import com.hltn.test.entity.Device;

public interface DeviceService extends IService<Device> {
    public IPage<GetDevicesRespDto> getDevices(GetDevicesReqDto getDevicesReqDto);
}
