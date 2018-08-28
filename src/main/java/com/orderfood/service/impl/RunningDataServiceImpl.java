package com.orderfood.service.impl;

import com.orderfood.mapper.RunningDataMapper;
import com.orderfood.pojo.OrderfoodRunningData;
import com.orderfood.service.RunningDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("runningDataService")
public class RunningDataServiceImpl implements RunningDataService {
    @Autowired
    private RunningDataMapper runningDataMapper;

    /**
     * 新增流水
     * @param runningData
     * @return
     */
    public Integer InsertRunningData(OrderfoodRunningData runningData) {
        return null;
    }

    /**
     * 修改流水
     * @param runningData
     * @return
     */
    public Integer UpdateRunningData(OrderfoodRunningData runningData) {
            return null;
    }

    /**
     * 删除流水
     * @param runningDataId
     * @return
     */
    public Integer DeleteRunningData(Integer runningDataId) {
        return null;
    }

    /**
     * 查询收支
     * @param runningData
     * @return
     */
    public List<OrderfoodRunningData> SelectRunningData(OrderfoodRunningData runningData) {
        return runningDataMapper.SelectRunningData(runningData);
    }
}
