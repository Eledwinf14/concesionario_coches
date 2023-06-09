package com.concesionarioCoches.persistance.mapper;

import com.concesionarioCoches.domain.dto.CustomerDto;
import com.concesionarioCoches.persistance.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper de cliente
 */
@Mapper(componentModel = "spring")
public interface ICustomerMapper {

    CustomerDto toCustomerDto(CustomerEntity customerEntity);


    @Mapping(target = "purchaseEntity", ignore = true)
    CustomerEntity toCustomerEntity(CustomerDto customerDto);


    List<CustomerDto> toCustomersDto(List<CustomerEntity> customerEntityList);
}
