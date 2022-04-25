package com.javacourse.project.hibernateAndJpa.DataAccess;
import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.Ogrenciler;

public interface IOgrencilerDal {
    List<Ogrenciler> getAll();
    void add(Ogrenciler ogrenci);
    void update(Ogrenciler ogrenci);
    void delete(Ogrenciler ogrenci);
    Ogrenciler getById(int ogr_id);
}
