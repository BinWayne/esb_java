package com.ncbank.esb.esb.dao;

import com.ncbank.esb.esb.domain.Overview;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OverviewDAO {
    @Select("SELECT remarks,big_category, sub_category, svc_code, svc_name, scene_code, scene_name, trade_code, trade_name, consumer, provider, status, id\n" +
            "FROM esb.overview where svc_Code=#{svcCode}")
    @Results({
            @Result(property = "id", 				column = "id"),
            @Result(property = "bigCategory", 		column = "big_category"),
            @Result(property = "subCategory", 		column = "sub_category"),
            @Result(property = "svcCode", 			column = "svc_code"),
            @Result(property = "svcName", 			column = "svc_name"),
            @Result(property = "sceneCode", 		column = "scene_code"),
            @Result(property = "sceneName", 		column = "scene_name"),
            @Result(property = "tradeCode", 		column = "trade_code"),
            @Result(property = "tradeName", 		column = "trade_name"),
            @Result(property = "consumer", 			column = "consumer"),
            @Result(property = "provider", 			column = "provider"),
            @Result(property = "status", 			column = "status"),
            @Result(property = "remarks", 			column = "remarks"),
    })
    List<Overview> findBySvcCode(@Param("svcCode") String svcCode);//通过服务码查询

    @Select("SELECT remarks,big_category, sub_category, svc_code, svc_name, scene_code, scene_name, trade_code, trade_name, consumer, provider, status, id\n" +
            "FROM esb.overview limit #{start},#{size}")
    @Results({
            @Result(property = "id", 				column = "id"),
            @Result(property = "bigCategory", 		column = "big_category"),
            @Result(property = "subCategory", 		column = "sub_category"),
            @Result(property = "svcCode", 			column = "svc_code"),
            @Result(property = "svcName", 			column = "svc_name"),
            @Result(property = "sceneCode", 		column = "scene_code"),
            @Result(property = "sceneName", 		column = "scene_name"),
            @Result(property = "tradeCode", 		column = "trade_code"),
            @Result(property = "tradeName", 		column = "trade_name"),
            @Result(property = "consumer", 			column = "consumer"),
            @Result(property = "provider", 			column = "provider"),
            @Result(property = "status", 			column = "status"),
            @Result(property = "remarks", 			column = "remarks"),
    })
    List<Overview> findAll(@Param("start") Integer start,@Param("size") Integer size);

    @Select("SELECT count(id) as total FROM  esb.overview")
    @Results(id = "totalMap", value = {
            @Result(column = "total", javaType = Integer.class)
    })
    Integer getCount();
    List<Overview> findBytradeCode(@Param("tradeCode") String tradeCode);//通过场景码查询


}
