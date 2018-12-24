package com.xiao.xaiosc.scback;/*
@auther XiaoRuiQing
@Date 2018/12/24
*/

import com.xiao.entity.Goods;
import com.xiao.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    private IGoodsService goodsService;
    @RequestMapping("goodslist")
    public String goodManage() {
        List<Goods> goods = goodsService.queryAll();
        System.out.println("查询的所有商品:"+goods);
        return "goodslist";
    }
}
