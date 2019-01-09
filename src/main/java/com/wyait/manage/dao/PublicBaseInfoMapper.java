package com.wyait.manage.dao;

import com.wyait.manage.entity.PublicBaseInfoEntity;
import org.springframework.stereotype.Service;

@Service
public interface PublicBaseInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PublicBaseInfoEntity record);

    int insertSelective(PublicBaseInfoEntity record);

    PublicBaseInfoEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PublicBaseInfoEntity record);

    int updateByPrimaryKey(PublicBaseInfoEntity record);
}