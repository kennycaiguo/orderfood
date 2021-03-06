package com.orderfood.mapper;

import com.orderfood.pojo.OrderfoodEmployee;
import com.orderfood.pojo.OrderfoodEmployeeRole;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("employeeRodeMapper")
public interface EmployeeRodeMapper extends CommonMapper<OrderfoodEmployee> {
    /**
     * 查询全部角色
     * @return
     */
    List<OrderfoodEmployeeRole> getAllRo();

    /**
     * 根据id删除角色
     * @param roleid
     * @return
     */
    int delRo(@Param(value = "roleid") int roleid);

    /**
     * 根据id修改关联员工角色为服务员
     * @param roleid
     * @return
     */
    int updEm(@Param(value = "roleid")int roleid);

    /**
     * 删除角色时同时重置属于该角色的角色为服务员
     * @param roleid
     * @return
     */
    int delAndUpd(@Param(value = "roleid")int roleid);

    /**
     * 添加角色
     * @param orderfoodEmployeeRole
     * @return
     */
    int addRo(OrderfoodEmployeeRole orderfoodEmployeeRole);

    /**
     * 修改角色
     * @param orderfoodEmployeeRole
     */
    int updRo(OrderfoodEmployeeRole orderfoodEmployeeRole);

    /**
     * 根据id查询员工信息
     * @param roleid
     * @return
     */
    OrderfoodEmployeeRole selRo(@Param("roleid") Integer roleid);

    /**
     * 查所有角色名称
     * @return
     */
    List<OrderfoodEmployeeRole> selAll();
}
