package com.lys.dao;

import java.util.List;
import java.util.Map;

import com.lys.entity.UserEntity;

public interface UserDao {
    int deleteByPrimaryKey(String userId);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
    
    /**
     * Description:分页检索用户信息
     * @author LIUYANSHUANG
     * @date 2017年9月15日 下午5:22:40
     * @param map
     * @return
     */
    List<UserEntity> selectUserPage(Map<String,Object> map);
}