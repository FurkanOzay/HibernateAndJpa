package com.javacourse.project.hibernateAndJpa.service.impl;

import com.javacourse.project.hibernateAndJpa.entity.Kitaplar;
import com.javacourse.project.hibernateAndJpa.repository.KitapRepository;
import com.javacourse.project.hibernateAndJpa.service.KitapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@RequiredArgsConstructor
public class KitapServiceImpl implements KitapService {

    private final KitapRepository kitapRepository;

    @Transactional
    @Override
    public List<Kitaplar> getAll() {
        return this.kitapRepository.findAll();
    }

    @Override
    @Transactional
    public void add(Kitaplar kitap) {
        this.kitapRepository.save(kitap);
    }

    @Override
    @Transactional
    public void update(Kitaplar kitap) {
        this.kitapRepository.save(kitap);
    }

    @Override
    @Transactional
    public void delete(Kitaplar kitap) {
        this.kitapRepository.delete(kitap);
    }

    @Override
    @Transactional
    public Kitaplar getById(Long id) {
        return this.kitapRepository.findById(id).get();
    }
}
