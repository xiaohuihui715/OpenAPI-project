package com.hjh.project.model.vo;

import com.hjh.hapicommon.model.entity.InterfaceInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 接口信息封装视图
 *
 * @author yupi
 * @TableName product
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserInterfaceInfoPageVO extends InterfaceInfo {

    private Long userId;
    private Long interfaceInfoId;
    private Integer leftNum;
    private Integer status;
    private Integer follow;


    private static final long serialVersionUID = 1L;
}