package guru.springframework.spring_6_cold_service.service;

import guru.springframework.spring6restmvcapi.BeerOrderLineDto;

public interface DrinkService {

    void prepareDrink(BeerOrderLineDto orderLine);
}
