package guru.springframework.msscbrewery.web.mappers;

import org.mapstruct.Mapper;

import guru.springframework.msscbrewery.domain.Beer;
import guru.springframework.msscbrewery.web.model.BeerDTO;

@Mapper
public interface BeerMapper {
	
	BeerDTO beerToBeerDTO(Beer beer);
	
	Beer beerDTOToBeer(BeerDTO beerDTO);

}
