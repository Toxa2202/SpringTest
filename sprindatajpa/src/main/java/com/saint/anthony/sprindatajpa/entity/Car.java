package com.saint.anthony.sprindatajpa.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

// таблиця Машина
@Entity
public class Car extends IdHolder{

    // Багато машин - один бренд
    @ManyToOne(cascade = CascadeType.ALL)
    private Brand brand;

    private  String modelName;
    private Integer power;
    private Long price;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", price=" + price +
                '}';
    }
}
