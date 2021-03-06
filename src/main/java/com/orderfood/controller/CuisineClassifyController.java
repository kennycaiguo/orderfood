package com.orderfood.controller;

import com.alibaba.fastjson.JSON;
import com.orderfood.pojo.*;
import com.orderfood.service.CargoService;
import com.orderfood.service.CuisineClassifyService;
import com.orderfood.service.EmployeeService;
import com.orderfood.service.StockService;
import org.apache.ibatis.binding.MapperMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;


@Controller
public class CuisineClassifyController {

   //页面中转 不要删
    @Autowired
    private CuisineClassifyService cuisineClassifyService;
    @RequestMapping("cuisineClassifyAll")
    public ModelAndView SelectStock(OrderfoodCuisineClassify orderfoodCuisineClassify) {
       // List<OrderfoodCuisineClassify> list = cuisineClassifyService.SelectCuisineClassify(null);
        ModelAndView model = new ModelAndView("knowledge/KnowLedgeClass");
        model.addObject("list",cuisineClassifyService.SelectCuisineClassify(null));
        return model;
    }

  //通过名称查询
    @ResponseBody
    @RequestMapping(value = "SelectCuisineClassifyById/{classifyName}",produces = "text/plain;charset=utf-8")
    public String SelectCuisineClassifyById(@PathVariable( value = "classifyName") String classifyName) {
        return JSON.toJSONString(cuisineClassifyService.SelectCuisineClassifyById(classifyName));
    }

    //更具Id查询
    @ResponseBody
    @RequestMapping(value = "getAllbyId/{id}",produces = "text/plain;charset=utf-8")
    public String getAllbyId(@PathVariable( value = "id") Integer id) {
        return JSON.toJSONString(cuisineClassifyService.getAllbyId(id));
    }

    //删除
    @ResponseBody
    @RequestMapping(value = "delss/{classifyid}")
    public String delss(@PathVariable(value= "classifyid") Integer classifyid) {
            return JSON.toJSONString(cuisineClassifyService.delss(classifyid));
    }



    //批量删除
    @ResponseBody
    @RequestMapping(value = "delpiliang/{classifyid}")
    public String delpiliang(@PathVariable(value= "classifyid") Integer [] classifyid) {
        int count=0;
        for (Integer i : classifyid) {
           cuisineClassifyService.delpiliang(i);
           count++;
        }
        if(count==classifyid.length) {
            return JSON.toJSONString('1');
        }
        return JSON.toJSONString('0');
    }


    @RequestMapping("go")
    public  String go(){
        return  "knowledge/biaoganxiangmuList1";
    }

    @RequestMapping("fanhui")
    public  String fanhui(){
        return  "knowledge/KnowLedgeClass";
    }

    @RequestMapping("biaoganxiangmuList2")
    public  String biaoganxiangmuList2(){
        return  "knowledge/biaoganxiangmuList2";
    }


 //添加
    @ResponseBody
    @RequestMapping(value = "add")
    public String add(OrderfoodCuisineClassify orderfoodCuisineClassify) {
        return JSON.toJSONString(cuisineClassifyService.add(orderfoodCuisineClassify));
    }

    //查询
    @ResponseBody
    @RequestMapping(value = "getAlls/{pageIndexss}",produces = "text/plain;charset=utf-8")
    public String getAlls(@PathVariable(value= "pageIndexss") Integer pageIndexss) {
     CuisineClassifyPage ccp = new CuisineClassifyPage();
     ccp.setPageIndexss(pageIndexss);
     ccp.setStudentCount(cuisineClassifyService.getAllCount());
     ccp.setStuss(cuisineClassifyService.getTiao((ccp.getPageIndexss()-1)*ccp.getPageSizess(),ccp.getPageSizess()));
     List<OrderfoodCuisineClassify> cuisineClassifies = ccp.getStuss();
     return JSON.toJSONString(ccp);
    }


//更新
    @ResponseBody
    @RequestMapping(value = "upds",produces = "text/plain;charset=utf-8")
    public String upd(OrderfoodCuisineClassify orderfoodCuisineClassify) {
        return JSON.toJSONString(cuisineClassifyService.upd(orderfoodCuisineClassify));
    }



    //更新
    @ResponseBody
    @RequestMapping(value = "getcaibyfen/{names}",produces = "text/plain;charset=utf-8")
    public String getcaibyfen(@PathVariable(value = "names") String names) {
        return JSON.toJSONString(cuisineClassifyService.getcaibyfen(names));
    }




}
