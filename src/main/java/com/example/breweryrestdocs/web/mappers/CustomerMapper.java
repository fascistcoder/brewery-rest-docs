package com.example.breweryrestdocs.web.mappers;

import com.example.breweryrestdocs.domain.Customer;
import com.example.breweryrestdocs.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * @author <a href="pulkit.aggarwal@upgrad.com">Pulkit Aggarwal</a>
 * @version 1.0
 * @since 07/03/22
 */
@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
