package com.hjh.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjh.hapicommon.model.entity.User;

/**
 * @Entity com.hjh.project.model.model.entity.User
 */
public interface UserMapper extends BaseMapper<User> {


    long selectUserIdByPhone(String userPhone);




}




