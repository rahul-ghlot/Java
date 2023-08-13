package com.gehlot.service;

import com.gehlot.config.AppConfigPop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {


    @Autowired
    private AppConfigPop appConfigPop;
    public String getHello() {
        return appConfigPop.getHello();
    }
}
