package guru.springframework.msscbrewery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.CustomerDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDTO getCustomerById(UUID customerId) {
		return CustomerDTO.builder().id(UUID.randomUUID()).name("Customer").build();
	}

	@Override
	public CustomerDTO saveNewCustomer(CustomerDTO customerDTO) {
		return CustomerDTO.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void updateCustomer(UUID customerId, CustomerDTO beerDTO) {
		// TODO Auto-generated method stub
		log.debug("Updating...");
		
	}

	@Override
	public void deleteById(UUID customerId) {
		log.debug("Deleting...");
	}	

}
