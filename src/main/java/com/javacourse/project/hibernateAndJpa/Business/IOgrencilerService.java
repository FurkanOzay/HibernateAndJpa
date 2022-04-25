package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.Ogrenciler;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


@Service
public interface IOgrencilerService {
    List<Ogrenciler> getAll();
    void add(Ogrenciler ogrenci);
    void update(Ogrenciler ogrenci);
    void delete(Ogrenciler ogrenci);
    Ogrenciler getById(int ogr_id);
}