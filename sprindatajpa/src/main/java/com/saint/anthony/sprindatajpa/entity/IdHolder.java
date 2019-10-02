package com.saint.anthony.sprindatajpa.entity;

import javax.persistence.*;

@MappedSuperclass
public class IdHolder {
    // Спільна айдішка для всіх таблиць - нащадків
    // Анотація вказує що це айді, і що вона генерується автоматично
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
