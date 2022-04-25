package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.DataAccess.IOgrencilerDal;
import com.javacourse.project.hibernateAndJpa.Entities.Ogrenciler;


@Service
public class OgrencilerManager implements IOgrencilerService{



    private IOgrencilerDal ogrencilerDal;

    @Autowired
    public OgrencilerManager(IOgrencilerDal ogrencilerDal) {
        this.ogrencilerDal = ogrencilerDal;
    }

    @Override
    @Transactional
    public List<Ogrenciler> getAll() {

        return this.ogrencilerDal.getAll();
    }

    @Override
    @Transactional
    public void add(Ogrenciler ogrenci) {
        this.ogrencilerDal.add(ogrenci);
    }

    @Override
    @Transactional
    public void update(Ogrenciler ogrenci) {
        this.ogrencilerDal.update(ogrenci);
    }

    @Override
    @Transactional
    public void delete(Ogrenciler ogrenci) {
        this.ogrencilerDal.delete(ogrenci);
    }

    @Override
    @Transactional
    public Ogrenciler getById(int id) {
        return this.ogrencilerDal.getById(id);
    }
}
