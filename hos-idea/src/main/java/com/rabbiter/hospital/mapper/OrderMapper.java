package com.rabbiter.hospital.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.rabbiter.hospital.pojo.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper extends BaseMapper<Orders> {
    /**
     * 统计今天急诊需求人数
     */
    int orderPeople(String oStart);
    /**
     * 统计今天某个医生急诊需求人数
     */
    int orderPeopleByDid(@Param("o_start") String oStart, @Param("d_id") int dId);
    /**
     * 统计急诊需求男女人数
     */
    List<String> orderGender();
    /**
     * 根据急诊需求单号查询急诊需求
     */
    Orders findOrderByOid(int oId);
    /**
     * 增加诊断及医生意见
     */
    Integer updateOrderByAdd(Orders order);
    /**
     * 统计过去20天急诊需求科室人数
     */
    List<String> orderSection(@Param("startTime") String startTime, @Param("endTime") String endTime);
    /**
     * 查看当天急诊需求列表
     */
    List<Orders> findOrderByNull(@Param("dId") int dId, @Param("oStart") String oStart);
    /**
     * 根据pId查询急诊需求
     */
    List<Orders> findOrderByPid(int pId);

}
