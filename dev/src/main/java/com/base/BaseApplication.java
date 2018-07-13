package com.base;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication()
@PropertySource({"init.properties","jdbc.properties"})    //引入属性文件
public class BaseApplication {
    public static void main(String[] args){
        SpringApplication application = new SpringApplication(BaseApplication.class);
        application.setBannerMode(Banner.Mode.OFF);    //关闭banner
        application.run();
    }
}
