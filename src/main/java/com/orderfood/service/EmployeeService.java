package com.orderfood.service;

import com.orderfood.pojo.OrderfoodEmployee;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 员工管理Service接口
 */
@Repository
public interface EmployeeService {
    /**
     * 查询全部的员工信息
     * @return
     */
    List<OrderfoodEmployee> getAllEm();

    /**
     * 添加员工
     * @param orderfoodEmployee
     * @return
     */
    int addEm(OrderfoodEmployee orderfoodEmployee);

    /**
     * 修改员工信息
     * @param orderfoodEmployee
     */
    int updEm(OrderfoodEmployee orderfoodEmployee);

    /**
     * 根据id查询员工信息
     * @param employeeid
     * @return
     */
    OrderfoodEmployee selEm(int employeeid);

    /**
     * 根据姓名条件查
     * @param employeename
     * @return
     */
    List<OrderfoodEmployee> selTwo(String employeename);

    /**
     * 批量删除
     * @param objects
     * @return
     */
    int delesc(List<Object> objects);

    /**
     * 删除角色关联员工
     * @param eRoleid
     * @return
     */
    int del(int eRoleid);
}
