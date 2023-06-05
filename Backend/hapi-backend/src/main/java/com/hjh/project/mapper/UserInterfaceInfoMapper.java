package com.hjh.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjh.hapicommon.model.entity.UserInterfaceInfo;

import java.util.List;


/**
* @author hjh
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Mapper
* @createDate 2023-03-30 11:00:36
* @Entity generator.domain.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {


    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);



    boolean interfaceCount(int count);

    int selectInterfaceLeftCount(Long userId, Long interfaceId );

    int selectUserInterfaceStatus(Long userId, Long interfaceId );


    int selectFollow(Long userId, Long interfaceId);


    int buyInterface(Long userId, Long interfaceId, int count);

}




