package com.feri.mapper;

import com.feri.pojo.GoodsType;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GoodsTypeMapper {

    @Insert(" insert into t_goodstype ( name, level,  parentid, flag) values ( #{name}, #{level},  #{parentid}, 0)")
    @Options(useGeneratedKeys = true)
    int insert(GoodsType record);
    @Select("select * from t_goodstype where level =#{level}")
    @ResultType(GoodsType.class)
    List<GoodsType> selectAll(int level);
}