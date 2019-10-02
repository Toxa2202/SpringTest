package com.saint.anthony.http.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class IdHolder {
    // Спільна айдішка для всіх таблиць - нащадків
    // Анотація вказує що це айді, і що вона генерується автоматично
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{id=" + id +
                '}';
    }
}
