package com.concesionarioCoches.domain.repository;

import com.concesionarioCoches.domain.dto.PurchaseRequestDto;
import com.concesionarioCoches.domain.dto.PurchaseResponseDto;

import java.util.List;

public interface IPurchaseRepository {

    List<PurchaseResponseDto> getAll();

    List<PurchaseResponseDto> getByIdCustomer(String idCustomer);

    PurchaseResponseDto save(PurchaseRequestDto purchaseRequestDto);
}
