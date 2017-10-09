package com.lys.dao;

import com.lys.entity.PermissionEntity;

public interface PermissionDao {
    int deleteByPrimaryKey(String permsId);

    int insert(PermissionEntity record);

    int insertSelective(PermissionEntity record);

    PermissionEntity selectByPrimaryKey(String permsId);

    int updateByPrimaryKeySelective(PermissionEntity record);

    int updateByPrimaryKey(PermissionEntity record);
}