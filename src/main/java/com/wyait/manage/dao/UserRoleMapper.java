package com.wyait.manage.dao;

import com.wyait.manage.entity.UserRoleEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserRoleEntity record);

    int insertSelective(UserRoleEntity record);

    UserRoleEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserRoleEntity record);

    int updateByPrimaryKey(UserRoleEntity record);
}