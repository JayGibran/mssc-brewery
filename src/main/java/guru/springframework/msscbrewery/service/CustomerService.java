package guru.springframework.msscbrewery.service;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.CustomerDTO;

public interface CustomerService {
	
	CustomerDTO getCustomerById(UUID customerId);

	CustomerDTO saveNewCustomer(CustomerDTO customerDTO);

	void updateCustomer(UUID customerId, CustomerDTO beerDTO);

	void deleteById(UUID customerId);

}
