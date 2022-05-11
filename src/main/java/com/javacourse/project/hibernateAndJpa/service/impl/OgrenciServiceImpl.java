package com.javacourse.project.hibernateAndJpa.service.impl;

import com.javacourse.project.dto.OgrenciKitap;
import com.javacourse.project.hibernateAndJpa.entity.Kitaplar;
import com.javacourse.project.hibernateAndJpa.entity.Ogrenciler;
import com.javacourse.project.hibernateAndJpa.repository.KitapRepository;
import com.javacourse.project.hibernateAndJpa.repository.OgrenciRepository;
import com.javacourse.project.hibernateAndJpa.service.OgrenciService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;


@Service
@RequiredArgsConstructor
public class OgrenciServiceImpl implements OgrenciService {

    private final OgrenciRepository ogrenciRepository;
    private final KitapRepository kitapRepository;

    @Override
    @Transactional
    public List<Ogrenciler> getAll() {

        return this.ogrenciRepository.findAll();
    }

    @Override
    @Transactional
    public void add(Ogrenciler ogrenci) {
        this.ogrenciRepository.save(ogrenci);
    }

    @Override
    @Transactional
    public void update(Ogrenciler ogrenci) {
        this.ogrenciRepository.save(ogrenci);
    }

    @Override
    @Transactional
    public void delete(Ogrenciler ogrenci) {
        this.ogrenciRepository.delete(ogrenci);
    }

    @Override
    @Transactional
    public Ogrenciler getById(Long id) {
        return this.ogrenciRepository.findById(id).get();
    }

    @Transactional
    @Override
    public List<OgrenciKitap> showAllBookOfStudents() {
        List<OgrenciKitap> respone = new ArrayList<>();
        List<Ogrenciler> ogrenciler = ogrenciRepository.findAll();
        for (Ogrenciler ogrenci : ogrenciler) {
            OgrenciKitap ogrenciKitap = new OgrenciKitap();
            ogrenciKitap.setOgrenciName(ogrenci.getOgrAdSoyad());
            Set<Kitaplar> kitablar = ogrenci.getKitaplars();
            for (Kitaplar kitab : kitablar) {
                ogrenciKitap.setBookNames(Collections.singletonList(kitab.getKitapAdi()));
            }
            respone.add(ogrenciKitap);
        }

        return respone;
    }

    @Transactional
    @Override
    public void addStudentAndBook(Long studentId, Long bookId) {
        Ogrenciler ogrenci = ogrenciRepository.findOgrencilerByOgrId(studentId);
        Kitaplar kitap = kitapRepository.findKitaplarById(bookId);
        kitap.getOgrencilers().add(ogrenci);
        int kitapAdeti = kitap.getKitapAdeti();
        kitapAdeti--;
        kitap.setKitapAdeti(kitapAdeti);
        Kitaplar savedBook = kitapRepository.save(kitap);
    }
}
