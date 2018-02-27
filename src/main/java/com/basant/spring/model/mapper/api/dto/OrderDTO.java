package com.basant.spring.model.mapper.api.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDTO {
	/*
	 * we need to follow naming convention here based on instance name we
	 * declare in Root class , with same name and with attribute we need to
	 * declare variable in DTO
	 */
	private String customerFirstName;
	private String customerLastName;
	private String addressStreet;
	private String addressCity;
}
