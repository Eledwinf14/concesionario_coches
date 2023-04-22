package com.concesionarioCoches.persistance.repository;

        import com.concesionarioCoches.domain.dto.PurchaseRequestDto;
        import com.concesionarioCoches.domain.dto.PurchaseResponseDto;
        import com.concesionarioCoches.domain.repository.IPurchaseRepository;
        import com.concesionarioCoches.persistance.crud.IPurchaseCrudRepository;
        import com.concesionarioCoches.persistance.entity.PurchaseEntity;
        import com.concesionarioCoches.persistance.mapper.IPurchaseMapper;
        import lombok.RequiredArgsConstructor;
        import org.springframework.stereotype.Repository;

        import java.util.List;

@RequiredArgsConstructor
@Repository
public class PurchaseRepository implements IPurchaseRepository {

    private final IPurchaseCrudRepository iPurchaseCrudRepository;

    private final IPurchaseMapper iPurchaseMapper;

    @Override
    public List<PurchaseResponseDto> getAll() {

        // List<PurchaseEntity> listPurchasesEntity = iPurchaseCrudRepository.findAll();

        // for (PurchaseEntity purchaseEntity: listPurchasesEntity) {
        //    List<>purchaseEntity.getCarsPurchase();
        //}
        return null;
    }

    @Override
    public List<PurchaseResponseDto> getByIdCustomer(String idCustomer) {
        return null;
    }

    @Override
    public PurchaseResponseDto save(PurchaseRequestDto purchaseRequestDto) {
        return null;
    }
}
