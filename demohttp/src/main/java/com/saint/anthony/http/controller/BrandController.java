package com.saint.anthony.http.controller;

import com.saint.anthony.http.entity.Brand;
import com.saint.anthony.http.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/brand")
public class BrandController {
    @Autowired
    private BrandRepository brandRepository;


    @GetMapping("/all")
    public List<Brand> getBrands() {
        return brandRepository.findAll();
    }
}
