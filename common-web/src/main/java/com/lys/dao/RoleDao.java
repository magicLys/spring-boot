package com.lys.dao;

import com.lys.entity.RoleEntity;

public interface RoleDao {
    int deleteByPrimaryKey(String roleId);

    int insert(RoleEntity record);

    int insertSelective(RoleEntity record);

    RoleEntity selectByPrimaryKey(String roleId);

    int updateByPrimaryKeySelective(RoleEntity record);

    int updateByPrimaryKey(RoleEntity record);
}