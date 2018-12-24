package com.xiao.entity;

/*
@auther XiaoRuiQing
@Date 2018/12/24
*/

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;


/*
* 商品的实体类
* */
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class Goods implements Serializable {
    private Integer id;
    private String title;
    private String  ginfo;
    private double gcount;
    private Integer tid;
    private double allprice;
    private double price;
    private String  gimage;
}
