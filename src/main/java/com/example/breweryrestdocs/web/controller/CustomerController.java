package com.example.breweryrestdocs.web.controller;

import com.example.breweryrestdocs.services.CustomerService;
import com.example.breweryrestdocs.web.model.CustomerDto;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author <a href="pulkit.aggarwal@upgrad.com">Pulkit Aggarwal</a>
 * @version 1.0
 * @since 08/03/22
 */
@RequestMapping("api/v1/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId") UUID customerId){

        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity handlePost(@RequestBody @Validated CustomerDto customerDto){
        CustomerDto savedDto = customerService.saveNewCustomer(customerDto);

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Location", "/api/v1/customer/" + savedDto.getId().toString());

        return new ResponseEntity(httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void handleUpdate(@PathVariable("customerId") UUID customerId, @Validated @RequestBody CustomerDto customerDto){
        customerService.updateCustomer(customerId, customerDto);
    }

    @DeleteMapping("/{customerId}")
    public void deleteById(@PathVariable("customerId")  UUID customerId){
        customerService.deleteById(customerId);
    }

}

