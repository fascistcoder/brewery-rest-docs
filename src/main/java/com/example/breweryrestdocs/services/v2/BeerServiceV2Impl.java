package com.example.breweryrestdocs.services.v2;

import com.example.breweryrestdocs.web.model.v2.BeerDtoV2;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author <a href="pulkit.aggarwal@upgrad.com">Pulkit Aggarwal</a>
 * @version 1.0
 * @since 07/03/22
 */
@Service
public class BeerServiceV2Impl implements BeerServiceV2{
    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return null;
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return null;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {

    }

    @Override
    public void deleteById(UUID beerId) {

    }
}
