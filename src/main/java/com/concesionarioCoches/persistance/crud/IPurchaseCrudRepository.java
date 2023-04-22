package com.concesionarioCoches.persistance.crud;

import com.concesionarioCoches.persistance.entity.PurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IPurchaseCrudRepository extends JpaRepository<PurchaseEntity, Integer> {

}
