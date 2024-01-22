package com.zhangyuhan.onlineorder.repository;

import com.zhangyuhan.onlineorder.entity.RestaurantEntity;
import org.springframework.data.repository.ListCrudRepository;


public interface RestaurantRepository extends ListCrudRepository<RestaurantEntity, Long> {
}
