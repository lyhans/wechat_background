package com.wyait.manage.dao;

import com.wyait.manage.entity.PermissionEntity;
import org.springframework.stereotype.Service;

@Service
public interface PermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PermissionEntity record);

    int insertSelective(PermissionEntity record);

    PermissionEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PermissionEntity record);

    int updateByPrimaryKey(PermissionEntity record);
}