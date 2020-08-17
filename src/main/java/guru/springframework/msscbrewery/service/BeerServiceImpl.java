package guru.springframework.msscbrewery.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.msscbrewery.web.model.BeerDTO;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDTO getBeerById(UUID beerId) {
		return BeerDTO.builder()
				.id(UUID.randomUUID())
				.beerName("Galaxy Cat")
				.beerStyle("Pale Ale").build();
	}

	@Override
	public BeerDTO saveNewBeer(BeerDTO beerDTO) {
		return BeerDTO.builder().id(UUID.randomUUID()).build();
	}

	@Override
	public void updateBeer(UUID beerId, BeerDTO beerDTO) {
		// TODO Auto-generated method stub
		log.debug("Updating...");
	}

	@Override
	public void deleteById(UUID beerId) {
		// TODO Auto-generated method stub
		log.debug("Deleting a beer...");
	}
	
}
