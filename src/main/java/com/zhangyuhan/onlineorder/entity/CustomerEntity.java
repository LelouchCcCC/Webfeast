package com.zhangyuhan.onlineorder.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

// @Table demonstrates the table column in database
@Table("customers")
public record CustomerEntity(
        // @Id means the primary key
        @Id Long id,
        String email,
        String password,
        boolean enabled,
        String firstName,
        String lastName
) {
}
