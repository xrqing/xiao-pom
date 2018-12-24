package com.xiao.xaiosc.scback;

/*
@auther XiaoRuiQing
@Date 2018/12/24
*/


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    /*
    * 后台首页
    * */
    @RequestMapping("/")
    public String Welcome(){
        return "index";
    }
}
