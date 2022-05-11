package com.javacourse.project.hibernateAndJpa.service;

import com.javacourse.project.dto.OgrenciKitap;
import com.javacourse.project.hibernateAndJpa.entity.Ogrenciler;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface OgrenciService {
    List<Ogrenciler> getAll();
    void add(Ogrenciler ogrenci);
    void update(Ogrenciler ogrenci);
    void delete(Ogrenciler ogrenci);
    Ogrenciler getById(Long id);
    List<OgrenciKitap> showAllBookOfStudents();
    void addStudentAndBook(Long studentId,Long bookId);
}