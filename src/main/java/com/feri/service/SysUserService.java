package com.feri.service;

import com.feri.pojo.SysUser;

import java.util.List;

/**
 *@Author feri
 *@Date Created in 2018/8/3 12:22
 */
public interface SysUserService {
    //

    boolean insert(SysUser record);


    SysUser selectByUsername(String name,String pass);

    List<SysUser> selectAll();

    SysUser selectById(int id);
}
