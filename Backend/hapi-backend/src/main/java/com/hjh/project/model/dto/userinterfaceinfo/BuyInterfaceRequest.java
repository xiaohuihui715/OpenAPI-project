package com.hjh.project.model.dto.userinterfaceinfo;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用请求(封装id)
 *
 * @author hjh
 */
@Data
public class BuyInterfaceRequest implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     *
     * 购买次数
     */

    private int count;

    private static final long serialVersionUID = 1L;
}