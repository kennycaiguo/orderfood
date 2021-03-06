package com.orderfood.mapper;

import com.orderfood.pojo.OrderfoodCuisineClassify;
import com.orderfood.pojo.OrderfoodIndent;
import com.orderfood.pojo.OrderfoodIndentDetails;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;


/**
 * 继承自己的MyMapper
 */
@Repository
public interface IndentDetailsMapper extends CommonMapper<OrderfoodIndentDetails> {

    /**
     *根据tableId获得所有的在此桌的订单，并根据日期拿到最新的订单详情
     * @param tableId
     * @return
     */
    List<OrderfoodIndentDetails> getDetail(@Param("tableId") String tableId);

    /**
     * 根据所传入的OrderfoodIndentDetails对象对其进行更新
     * @param orderfoodIndentDetails
     * @return
     */
    int updateDetails(OrderfoodIndentDetails orderfoodIndentDetails);

    /**
     * 更新已经存在的详情的数量
     * @param orderfoodIndentDetails
     * @return
     */
    int updateDetailsByDetail(OrderfoodIndentDetails orderfoodIndentDetails);

    /**
     * 根据所传入的id删除订单详情表中的id
     * @param orderfoodIndentDetails
     * @return
     */
    int deleteDetaiils(OrderfoodIndentDetails orderfoodIndentDetails);

    /**
     * 添加订单详情
     * @param orderfoodIndentDetails
     * @return
     */
    int addDetails(OrderfoodIndentDetails orderfoodIndentDetails);

    /**
     * 通过订单编号，获得订单的信息
     * @return
     */
    OrderfoodIndent getDetailByTableId(@Param("indentId") String indentId);

    /**
     * 下单时生成一个订单
     * @param orderfoodIndent
     * @return
     */
    int addIndent(OrderfoodIndent orderfoodIndent);

    /**
     * 查询该订单号的订单编号
     * @param indentCode
     * @return
     */
    int getDetailsIdByIndentCode(@Param("indentCode") String indentCode);

    /**
     * 通过菜品id为条件让配方表与库存表进行映射，进行删减
     * @param orderfoodIndentDetails
     * @return
     */
    int updateStockByRecipeid(OrderfoodIndentDetails orderfoodIndentDetails);

    /**
     * 通过订单id 和 菜品id 判断该菜品是否存在,存在则返回详情id,并更新菜品数量，否则则添加该菜品
     * @param orderfoodIndentDetails
     * @return
     */
    String ExistDetail(OrderfoodIndentDetails orderfoodIndentDetails);

    /**
     * 当订单为空时删除该订单
     * @param indentid
     * @return
     */
    int deleteIndent(@Param("indentid") int indentid);

    /**
     * 拿到所有的菜品
     * @return
     */
    List<OrderfoodCuisineClassify> getAllClassify(@Param("classifyId") Integer classifyId);

    /**
     * 通过用户手机号获得其所有的订单
     * @param phone
     * @return
     */
    List<OrderfoodIndent> getAllIndentsByPhone(@Param("phone") String phone);

    /**
     * 通过手机号查询用户编号
     * @param phone
     * @return
     */
    Integer getUserIdByPhone(@Param("phone") String phone);
}
