package guru.springframework.msscbrewery.service;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.BeerDTO;

public interface BeerService {
	
	BeerDTO getBeerById(UUID beerId);

	BeerDTO saveNewBeer(BeerDTO beerDTO);

	void updateBeer(UUID beerId, BeerDTO beerDTO);

	void deleteById(UUID beerId);

}
