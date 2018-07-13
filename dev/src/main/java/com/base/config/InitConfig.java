package com.base.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

//将配置文件(init.properties)内容与类进行绑定
@ConfigurationProperties(prefix="init.config")
public class InitConfig {
    private String msg;
    private String date;

    public String getMsg() {
        return msg;
    }

    public String getDate() {
        return date;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
