package com.wyait.manage.dao;

import com.wyait.manage.entity.UserEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserEntity record);

    int insertSelective(UserEntity record);

    UserEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserEntity record);

    int updateByPrimaryKey(UserEntity record);
}