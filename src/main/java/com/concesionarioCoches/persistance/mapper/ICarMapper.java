package com.concesionarioCoches.persistance.mapper;

import com.concesionarioCoches.domain.dto.CarDto;
import com.concesionarioCoches.persistance.entity.CarEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICarMapper {

    @Mapping(source = "brandCarEntity.description", target = "brandCarString")
    CarDto toCarDto(CarEntity carEntity);

    @Mapping(target = "brandCarEntity", ignore = true)
    @Mapping(target = "carPurchaseEntity", ignore = true)
    CarEntity toCarEntity(CarDto carDto);

    List<CarDto> toCarsDto(List<CarEntity> carEntityList);
}
