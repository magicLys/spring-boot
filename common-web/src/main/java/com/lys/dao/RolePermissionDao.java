package com.lys.dao;

import com.lys.entity.RolePermissionEntity;

public interface RolePermissionDao {
    int insert(RolePermissionEntity record);

    int insertSelective(RolePermissionEntity record);
}