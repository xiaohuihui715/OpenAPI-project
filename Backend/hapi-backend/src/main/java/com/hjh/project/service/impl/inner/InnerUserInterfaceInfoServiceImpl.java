package com.hjh.project.service.impl.inner;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hjh.hapicommon.model.entity.UserInterfaceInfo;
import com.hjh.hapicommon.service.InnerUserInterfaceInfoService;
import com.hjh.project.common.ErrorCode;
import com.hjh.project.exception.BusinessException;
import com.hjh.project.service.UserInterfaceInfoService;
import org.apache.dubbo.config.annotation.DubboService;

import javax.annotation.Resource;
import java.util.List;

@DubboService
public class InnerUserInterfaceInfoServiceImpl implements InnerUserInterfaceInfoService {

    @Resource
    private UserInterfaceInfoService userInterfaceInfoService;

    @Override
    public boolean invokeCount(long interfaceInfoId, long userId) {
        return userInterfaceInfoService.invokeCount(interfaceInfoId, userId);
    }

    @Override
    public boolean checkCount(long interfaceInfoId, long userId) {

        QueryWrapper<UserInterfaceInfo> queryWrapper = new QueryWrapper<>();

        queryWrapper.select("leftNum").eq("userId", userId)
                .eq("interfaceInfoId", interfaceInfoId);

        List<UserInterfaceInfo> list = userInterfaceInfoService.list(queryWrapper);

        //判断是否还有剩余次数
        int leftNum = list.get(0).getLeftNum();
        if (leftNum <= 0 ){

           throw  new BusinessException(ErrorCode.FORBIDDEN_ERROR, "调用此接口次数为0！");
        }


        return true;
    }


}
