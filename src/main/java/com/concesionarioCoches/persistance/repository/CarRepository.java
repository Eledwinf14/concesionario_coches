package com.concesionarioCoches.persistance.repository;

import com.concesionarioCoches.domain.dto.CarDto;
import com.concesionarioCoches.domain.repository.ICarRepository;
import com.concesionarioCoches.persistance.crud.ICarCrudRepository;
import com.concesionarioCoches.persistance.mapper.ICarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class CarRepository implements ICarRepository {


    private final ICarCrudRepository iCarCrudRepository;

    private final ICarMapper iCarMapper;


    @Override
    public List<CarDto> getAll() {
        return iCarMapper.toCarsDto(iCarCrudRepository.findAll());
    }

    @Override
    public List<CarDto> getByIdBrandCar(Integer idBrandCar) {
        return iCarMapper.toCarsDto(iCarCrudRepository.findAllByBrandCarId(idBrandCar));
    }

    @Override
    public List<CarDto> getCarsByPriceLessThan(Double price) {
        return iCarMapper.toCarsDto(iCarCrudRepository.findAllByPriceLessThanEqualOrderByPriceAsc(price));
    }

    @Override
    public Optional<CarDto> getCar(Integer idCar) {
        System.out.println(iCarCrudRepository.findById(idCar).get().getBrandCarEntity().toString());
        return iCarCrudRepository.findById(idCar)
                .map(iCarMapper::toCarDto);
    }

    @Override
    public CarDto save(CarDto newCar) {
        return iCarMapper
                .toCarDto(iCarCrudRepository
                        .save(iCarMapper
                                .toCarEntity(newCar)));
    }

    @Override
    public void delete(Integer idCar) {
        iCarCrudRepository.deleteById(idCar);
    }
}
