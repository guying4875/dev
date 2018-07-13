package com.base.user.service.Impl;

import com.base.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    DataSource dataSource;

    public DataSource getDataSource(){
        return dataSource;
    }
}
