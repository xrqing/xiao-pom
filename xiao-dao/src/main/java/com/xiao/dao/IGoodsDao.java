package com.xiao.dao;
/*
@auther XiaoRuiQing
@Date 2018/12/24
*/

import com.xiao.entity.Goods;

import java.util.List;

public interface IGoodsDao {
    List<Goods> queryAll();
}
