package com.lys.dao;

import com.lys.entity.UserRoleEntity;

public interface UserRoleDao {
    int insert(UserRoleEntity record);

    int insertSelective(UserRoleEntity record);
}