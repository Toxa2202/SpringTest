package com.saint.anthony.http.repository;

import com.saint.anthony.http.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


// клас містить методи для роботи з даними таблиці Машина
@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findAllByPriceGreaterThanOrderByPriceAsc(Long price);
}
