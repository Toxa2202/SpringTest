package com.saint.anthony.sprindatajpa.entity;

import javax.persistence.*;

@MappedSuperclass
public class IdHolder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
