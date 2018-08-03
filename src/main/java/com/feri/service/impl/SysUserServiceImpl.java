package com.feri.service.impl;

import com.feri.mapper.SysUserMapper;
import com.feri.pojo.SysUser;
import com.feri.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

/**
 *@Author feri
 *@Date Created in 2018/8/3 12:23
 */
@Service
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper mapper;
    @Override
    public boolean insert(SysUser record) {
        return mapper.insert(record)>0;
    }

    @Override
    public SysUser selectByUsername(String name,String pass) {
        SysUser user= mapper.selectByUsername(name);
        if(user!=null){
            if(Objects.equals(user.getPassword(),pass)){
                return  user;
            }
        }
        return null;
    }

    @Override
    public List<SysUser> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public SysUser selectById(int id) {
        return mapper.selectById(id);
    }
}
