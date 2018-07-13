package com.base.user.controller;

import com.base.config.InitConfig;
import com.base.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.SQLException;


@RestController
@RequestMapping("/user")
@EnableConfigurationProperties({InitConfig.class})  //引入配置文件绑定的类
public class UserController {


//    @Value("${book.author}")
//    private String name ;
//    @Value("${book.date}")
//    private String date ;

    @Autowired
    private InitConfig config;
    @Autowired
    private UserService userService;
    @RequestMapping("/index")
    public String index(){
        try {
            System.out.print(userService.getDataSource().getConnection().toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "msg:"+config.getMsg()+" date:"+config.getDate();
    }

}
