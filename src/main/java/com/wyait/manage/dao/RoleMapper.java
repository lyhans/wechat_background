package com.wyait.manage.dao;

import com.wyait.manage.entity.RoleEntity;
import org.springframework.stereotype.Service;

@Service
public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RoleEntity record);

    int insertSelective(RoleEntity record);

    RoleEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoleEntity record);

    int updateByPrimaryKey(RoleEntity record);
}