package com.javacourse.project.hibernateAndJpa.repository;

import com.javacourse.project.hibernateAndJpa.entity.Kitaplar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KitapRepository extends JpaRepository<Kitaplar,Long> {

    Kitaplar findKitaplarById(Long id);
}
