package com.concesionarioCoches.persistance.mapper;

import com.concesionarioCoches.domain.dto.CustomerDto;
import com.concesionarioCoches.domain.dto.PurchaseRequestDto;
import com.concesionarioCoches.persistance.entity.CustomerEntity;
import com.concesionarioCoches.persistance.entity.PurchaseEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper de compras
 */
@Mapper(componentModel = "spring")
public interface IPurchaseMapper {

    PurchaseRequestDto toPurchaseRequestDto(PurchaseEntity purchaseEntity);

    @Mapping(target = "customerEntity", ignore = true)
    PurchaseEntity toPurchaseEntity(PurchaseRequestDto purchaseRequestDto);

    List<PurchaseRequestDto> toPurchasesDto(List<PurchaseEntity> purchaseEntityList);
}
