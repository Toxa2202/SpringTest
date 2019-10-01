package com.saint.anthony.sprindatajpa.repository;

import com.saint.anthony.sprindatajpa.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository // @repository -> deprecated to use
public interface BrandRepository extends JpaRepository<Brand, Long> {
    // First(newer)
    List<Brand> findAllByName(String name);

    //Second(older)
    @Query("select b from Brand b where b.name = :name")
    List<Brand> findByName(@Param("name") String name);

}
