package com.ncbank.esb.esb.dao;

import com.ncbank.esb.esb.domain.Overview;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OverviewDAO {
    List<Overview> findBySvcCode(@Param("svcCode") String svcCode);//通过服务码查询
    List<Overview> findBySceneCode(@Param("sceneCode") String sceneCode);//通过场景码查询
    List<Overview> findBytradeCode(@Param("tradeCode") String tradeCode);//通过场景码查询


}
