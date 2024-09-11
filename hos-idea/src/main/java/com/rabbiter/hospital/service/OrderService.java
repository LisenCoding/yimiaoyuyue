package com.rabbiter.hospital.service;

import com.rabbiter.hospital.pojo.Orders;

import java.util.HashMap;
import java.util.List;

public interface OrderService {
    /**
     * 分页模糊查询所有急诊需求信息
     */
    HashMap<String, Object> findAllOrders(int pageNumber, int size, String query);
    /**
     * 真正删除急诊需求信息
     */
    Boolean deleteOrder(int oId);
    /**
     * 增加急诊需求信息
     */
    Boolean addOrder(Orders order, String arId);
    /**
     * 根据pId查询急诊需求
     */
    List<Orders> findOrderByPid(int pId) ;
    /**
     * 查看当天急诊需求列表
     */
    List<Orders> findOrderByNull(int dId, String oStart) ;
    /**
     * 根据id更新急诊需求信息
     */
    Boolean updateOrder(Orders orders);
    /**
     * 根据id设置缴费状态
     */
    Boolean updatePrice(int oId);
    /**
     * 查找医生已完成的急诊需求单
     */
    HashMap<String, Object> findOrderFinish(int pageNumber, int size, String query, int dId) ;
    /**
     * 根据dId查询急诊需求
     */
    HashMap<String, Object> findOrderByDid(int pageNumber, int size, String query, int dId) ;
    /**
     * 统计今天急诊需求人数
     */
    int orderPeople(String oStart);
    /**
     * 统计今天某个医生急诊需求人数
     */
    int orderPeopleByDid(String oStart, int dId);
    /**
     * 统计急诊需求男女人数
     */
    List<String> orderGender();
    /**
     * 增加诊断及医生意见
     */
    Boolean updateOrderByAdd(Orders order);
    /**
     * 判断诊断之后再次购买药物是否已缴费
     */
    Boolean findTotalPrice(int oId);
    /**
     * 请求急诊需求时间段
     */
    HashMap<String, String> findOrderTime(String arId);
    /**
     * 统计过去20天急诊需求科室人数
     */
    List<String> orderSection();

}
