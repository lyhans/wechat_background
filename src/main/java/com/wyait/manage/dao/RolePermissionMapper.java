package com.wyait.manage.dao;

import com.wyait.manage.entity.RolePermissionEntity;
import org.springframework.stereotype.Service;

@Service
public interface RolePermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RolePermissionEntity record);

    int insertSelective(RolePermissionEntity record);

    RolePermissionEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RolePermissionEntity record);

    int updateByPrimaryKey(RolePermissionEntity record);
}