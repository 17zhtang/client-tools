package com.hltn.test.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hltn.test.dto.req.GetDevicesReqDto;
import com.hltn.test.dto.resp.GetDevicesRespDto;
import com.hltn.test.entity.Device;
import com.hltn.test.mapper.DeviceMapper;
import com.hltn.test.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeviceServiceImpl extends ServiceImpl<DeviceMapper, Device> implements DeviceService {

    @Override
    public IPage<GetDevicesRespDto> getDevices(GetDevicesReqDto dto) {
        return null;
    }
}
