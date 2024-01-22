package com.zhangyuhan.onlineorder.repository;

import com.zhangyuhan.onlineorder.entity.MenuItemEntity;
import org.springframework.data.repository.ListCrudRepository;


import java.util.List;


public interface MenuItemRepository extends ListCrudRepository<MenuItemEntity, Long> {


    List<MenuItemEntity> getByRestaurantId(Long restaurantId);
}
