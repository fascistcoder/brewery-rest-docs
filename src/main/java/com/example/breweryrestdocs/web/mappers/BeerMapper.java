package com.example.breweryrestdocs.web.mappers;

import com.example.breweryrestdocs.domain.Beer;
import com.example.breweryrestdocs.web.model.BeerDto;
import org.mapstruct.Mapper;

/**
 * @author <a href="pulkit.aggarwal@upgrad.com">Pulkit Aggarwal</a>
 * @version 1.0
 * @since 07/03/22
 */
@Mapper(componentModel = "spring", uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}
