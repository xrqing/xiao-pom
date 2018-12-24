package com.xiao.xiaosc.xiao.service.impl;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:provider.xml")
@MapperScan("com.xiao.dao")
public class XiaoServiceImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoServiceImplApplication.class, args);
    }

}

