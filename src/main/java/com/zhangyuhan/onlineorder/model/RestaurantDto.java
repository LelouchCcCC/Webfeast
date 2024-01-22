package com.zhangyuhan.onlineorder.model;


import com.zhangyuhan.onlineorder.entity.RestaurantEntity;

import java.util.List;

public record RestaurantDto(
        Long id,
        String name,
        String address,
        String phone,
        String imageUrl,
        List<MenuItemDto> menuItems
) {


    public RestaurantDto(RestaurantEntity entity, List<MenuItemDto> menuItems) {
        this(entity.id(), entity.name(), entity.address(), entity.phone(), entity.imageUrl(), menuItems);
    }
}
