package com.feri.mapper;

import com.feri.pojo.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysUserMapper {
    //
    @Insert(" insert into t_sysuser (username, password,  flag) values (#{username}, #{password}, 0)")
    @Options(useGeneratedKeys = true)
    int insert(SysUser record);

    //
    @Select("select * from t_sysuser where username=#{name}")
    @ResultType(SysUser.class)
    SysUser selectByUsername(String name);
    @Select("select * from t_sysuser")
    @ResultType(SysUser.class)
    List<SysUser> selectAll();
    @Select("select * from t_sysuser where id=#{id}")
    @ResultType(SysUser.class)
    SysUser selectById(int id);


}