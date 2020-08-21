package guru.springframework.msscbrewery.domain;

import java.util.UUID;

import guru.springframework.msscbrewery.web.model.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {
	
	private UUID id;
	
	private String beerName;
	
	private BeerStyleEnum beerStyleEnum;
	
	private Long upc;

}
