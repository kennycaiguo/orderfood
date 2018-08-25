package com.orderfood.dao;

import com.orderfood.pojo.OrderfoodCargo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 库存管理Dao接口
 */
public interface CargoDao {
    /**
     * 货物入库
     * @param cargo
     * @return
     */
    public Integer InsertCargo(OrderfoodCargo cargo);

    /**
     * 修改库存信息(出库)
     * @param cargo
     * @return
     */
    public Integer UpdateCargo(OrderfoodCargo cargo);

    /**
     * 删除库存信息
     * @param cargoId
     * @return
     */
    public Integer DeleteCuisineCargo(Integer cargoId);

    /**
     * 查询库存信息
     * @param cargo
     * @return
     */
    public List<OrderfoodCargo> SelectCargo(OrderfoodCargo cargo);
}
