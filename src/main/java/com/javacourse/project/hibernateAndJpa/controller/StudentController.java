package com.javacourse.project.hibernateAndJpa.controller;

import com.javacourse.project.dto.OgrenciKitap;
import com.javacourse.project.hibernateAndJpa.entity.Ogrenciler;
import com.javacourse.project.hibernateAndJpa.service.OgrenciService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final OgrenciService ogrenciService;

    @GetMapping
    public List<Ogrenciler> get() {
        return ogrenciService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Ogrenciler ogrenci) {
        ogrenciService.add(ogrenci);
    }

    @PutMapping
    public void update(@RequestBody Ogrenciler ogrenci) {
        ogrenciService.update(ogrenci);
    }

    @DeleteMapping
    public void delete(@RequestBody Ogrenciler ogrenci) {
        ogrenciService.delete(ogrenci);
    }

    @GetMapping(path = "{id}")
    public Ogrenciler getById(@PathVariable Long id) {
        return ogrenciService.getById(id);
    }


    @GetMapping(value = "/students-books")
    public ResponseEntity<List<OgrenciKitap>> showAllBookOfStudents() {
        return ResponseEntity.ok(ogrenciService.showAllBookOfStudents());
    }


    @GetMapping("/insert-student-book/{student-id}/{book-id}")
    public HttpStatus addStudentAndBook(@PathVariable("student-id") Long studentId, @PathVariable("book-id") Long bookId) {
        ogrenciService.addStudentAndBook(studentId, bookId);
        return HttpStatus.OK;
    }

}