package com.basant.spring.model.mapper.api.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
private Customer customer;
private Address address;
}
