package com.orderfood.service;


import com.orderfood.pojo.CargoPage;
import com.orderfood.pojo.OrderfoodRunningData;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * 数据管理Service接口
 */
public interface RunningDataService {
    /**
     * 新增收支流水信息
     */
    public Integer InsertRunningData(OrderfoodRunningData runningData);

    /**
     * 修改收支流水信息
     * @param runningData
     * @return
     */
    public Integer UpdateRunningData(OrderfoodRunningData runningData);

    /**
     * 删除收支流水记录
     * @param runningDataId
     * @return
     */
    public Integer DeleteRunningData(Integer runningDataId);

    /**
     * 查询收支流水信息
     * @param runningData
     * @return
     */
    public List<OrderfoodRunningData> SelectRunningData(OrderfoodRunningData runningData);

    /**
     * 分页查询收支流水
     * @param runningData
     * @param page
     * @return
     */
    public List<OrderfoodRunningData> SelectRunningDataPages(OrderfoodRunningData runningData, CargoPage page);

    /**
     * 查询收支流水总页数
     * @return
     */
    public Integer RunningDataCount(OrderfoodRunningData runningData);
}
