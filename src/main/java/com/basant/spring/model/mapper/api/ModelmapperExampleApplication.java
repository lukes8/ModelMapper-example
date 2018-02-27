package com.basant.spring.model.mapper.api;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.basant.spring.model.mapper.api.dto.OrderDTO;
import com.basant.spring.model.mapper.api.entity.Address;
import com.basant.spring.model.mapper.api.entity.Customer;
import com.basant.spring.model.mapper.api.entity.Order;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class ModelmapperExampleApplication {

	public OrderDTO mapEntity2DTO() throws JsonProcessingException {
		Address address = new Address();
		address.setCity("Bbsr");
		address.setStreet("Rasulgarha");

		Customer customer = new Customer();
		customer.setFirstName("Basanta");
		customer.setLastName("Hota");

		Order order = new Order();
		order.setCustomer(customer);
		order.setAddress(address);
		
		ModelMapper modelMapper = new ModelMapper();
		System.out.println(new ObjectMapper().writeValueAsString(order));
		OrderDTO dto = modelMapper.map(order, OrderDTO.class);
		return dto;
	}

	public static void main(String[] args) throws JsonProcessingException {
		SpringApplication.run(ModelmapperExampleApplication.class, args);

		ModelmapperExampleApplication app = new ModelmapperExampleApplication();
		System.out.println(app.mapEntity2DTO());
	}
}
