package com.hltn.test.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hltn.test.dto.req.GetDevicesReqDto;
import com.hltn.test.dto.resp.GetDevicesRespDto;
import com.hltn.test.entity.Device;
import com.hltn.test.mapper.DeviceMapper;
import com.hltn.test.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DeviceServiceImpl extends ServiceImpl<DeviceMapper, Device> implements DeviceService {

//    @Override
//    public IPage<GetDevicesRespDto> getDevices(GetDevicesReqDto dto) {
//        return null;
//    }
    @Resource
    private DeviceMapper deviceMapper;

    @Override
    public Page<GetDevicesRespDto> getDevices(GetDevicesReqDto dto) {

//        List<GetDevicesRespDto> list = deviceMapper.getDevices();
//        return list;
        Page<GetDevicesRespDto> pageParam = new Page<>(dto.getCurrentPage(),dto.getPageSize());
        String ownerName = dto.getOwnerName();
        String model = dto.getModel();
        String brand = dto.getBrand();
        int state = dto.getState();
        int systemType = dto.getSystemType();
        String systemVersion = dto.getSystemVersion();
        String userGroup = dto.getUserGroup();
        LambdaQueryWrapper<GetDevicesRespDto> wrapper = new LambdaQueryWrapper<>();
        return null;
    }
}
