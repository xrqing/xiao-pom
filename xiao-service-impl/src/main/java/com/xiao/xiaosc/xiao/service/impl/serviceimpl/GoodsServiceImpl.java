package com.xiao.xiaosc.xiao.service.impl.serviceimpl;

/*
@auther XiaoRuiQing
@Date 2018/12/24
*/

import com.xiao.dao.IGoodsDao;
import com.xiao.entity.Goods;
import com.xiao.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class GoodsServiceImpl implements IGoodsService {

    @Autowired
    private IGoodsDao goodsDao;
    @Override
    public List<Goods> queryAll() {
        System.out.println("调用service实现类");
        return goodsDao.queryAll();
    }
}
