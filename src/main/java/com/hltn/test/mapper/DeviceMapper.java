package com.hltn.test.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hltn.test.dto.resp.GetDevicesRespDto;
import com.hltn.test.entity.Device;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface DeviceMapper extends BaseMapper<Device> {

//    List<GetDevicesRespDto> getDevices();

    Page<GetDevicesRespDto> getDevices();
}
