package guru.springframework.msscbrewery.web.mappers;

import org.mapstruct.Mapper;

import guru.springframework.msscbrewery.domain.Customer;
import guru.springframework.msscbrewery.web.model.CustomerDTO;

@Mapper
public interface CustomerMapper {
	
	Customer customerDTOToCustomer(CustomerDTO dto);
	
	CustomerDTO customerToCustomerDTO(Customer customer);
	

}
