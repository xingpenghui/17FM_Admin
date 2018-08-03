package com.feri.mapper;

import com.feri.pojo.Goods;
import com.feri.vo.Query;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public interface GoodsMapper {

    @Insert("  insert into t_goods (name, tid, pubdate, dowdate, createtime, price, star, picurl, flag, uid, info ) values (#{name}, #{tid}, #{pubdate}, #{dowdate}, now(),  #{price}, #{star}, #{picurl}, 0, #{uid}, #{info} )")
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insert(Goods record);
    @Select("select id,name, tid, pubdate, dowdate, createtime, price, star, picurl, flag, uid, info  from t_goods where id=#{id}")
    @ResultType(Goods.class)
    Goods selectById(Integer id);

    @Select("select id,name, tid, pubdate, dowdate, createtime, price, star, picurl, flag, uid, info  from t_goods limit #{index},#{count} ")
    @ResultType(Goods.class)
    List<Goods> selectAll(Query query);
    @Select("select COUNT(*) from t_goods")
    @ResultType(Long.class)
    Long selectCount();

}