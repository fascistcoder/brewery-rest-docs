package com.example.breweryrestdocs.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * @author <a href="pulkit.aggarwal@upgrad.com">Pulkit Aggarwal</a>
 * @version 1.0
 * @since 07/03/22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    private UUID id;
    private String name;
}
