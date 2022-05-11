package com.javacourse.project.hibernateAndJpa.repository;

import com.javacourse.project.hibernateAndJpa.entity.Ogrenciler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OgrenciRepository extends JpaRepository<Ogrenciler,Long> {

    Ogrenciler findOgrencilerByOgrId(Long ogrId);
}
