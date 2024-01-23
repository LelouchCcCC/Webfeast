package com.zhangyuhan.onlineorder;

import com.zhangyuhan.onlineorder.entity.*;
import com.zhangyuhan.onlineorder.model.RestaurantDto;
import com.zhangyuhan.onlineorder.repository.*;
import com.zhangyuhan.onlineorder.service.CartService;
import com.zhangyuhan.onlineorder.service.CustomerService;
import com.zhangyuhan.onlineorder.service.MenuItemService;
import com.zhangyuhan.onlineorder.service.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class DevRunner implements ApplicationRunner {


    private static final Logger logger = LoggerFactory.getLogger(DevRunner.class);


    private final CustomerService customerService;


    public DevRunner(
            CustomerService customerService) {
        this.customerService = customerService;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        customerService.signUp("foo@mail.com", "123456", "Foo", "Bar");
    }
}
