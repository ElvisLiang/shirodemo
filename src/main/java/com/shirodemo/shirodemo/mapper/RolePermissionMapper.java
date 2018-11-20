package com.shirodemo.shirodemo.mapper;

import com.shirodemo.shirodemo.entity.RolePermissionKey;

import java.util.List;

public interface RolePermissionMapper {
    int deleteByPrimaryKey(RolePermissionKey key);

    int insert(RolePermissionKey record);

    int insertSelective(RolePermissionKey record);

}