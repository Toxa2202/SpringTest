package com.saint.anthony.sprindatajpa;

import com.saint.anthony.sprindatajpa.entity.Brand;
import com.saint.anthony.sprindatajpa.entity.Car;
import com.saint.anthony.sprindatajpa.repository.BrandRepository;
import com.saint.anthony.sprindatajpa.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.Comparator;

@SpringBootApplication
public class SprindatajpaApplication {

    @Autowired
    private BrandRepository brandRepository;

    @Autowired
    private CarRepository carRepository;

    // MAIN
    public static void main(String[] args) {
        SpringApplication.run(SprindatajpaApplication.class, args);

    }

    @PostConstruct
    public void postCons() {
        Brand brand1 = new Brand();
        brand1.setName("BMW");
        brandRepository.save(brand1);

        Brand brand2 = new Brand();
        brand2.setName("AUDI");
        brandRepository.save(brand2);

        Car car1 = new Car();
        car1.setPrice(10000L);
        carRepository.save(car1);

        Car car2 = new Car();
        car2.setPrice(11000L);
        carRepository.save(car2);

        Car car3 = new Car();
        car3.setPrice(9000L);
        carRepository.save(car3);

        Car car4 = new Car();
        car4.setPrice(8000L);
        carRepository.save(car4);

        carRepository.findAllByPriceGreaterThanOrderByPriceAsc(9000L).forEach(System.out::println);


//        brandRepository.findAllByName("BMW").forEach(System.out::println);
//        brandRepository.findByName("BMW").forEach(System.out::println);

    }
}

// за допомогою дженеріків спрінг формує код і методи, з якими ми працюємо
// spring data jpa site - to use
// 4.2 spring query -- must read

// Create lot of Cars and show findAll in some order