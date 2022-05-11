package com.javacourse.project.hibernateAndJpa.controller;

import com.javacourse.project.hibernateAndJpa.entity.Kitaplar;
import com.javacourse.project.hibernateAndJpa.service.KitapService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api/v1/books")
@RequiredArgsConstructor
public class BookController {

    private final KitapService kitapService;

    @GetMapping
    public List<Kitaplar> get() {
        return kitapService.getAll();
    }

    @PostMapping
    public void add(@RequestBody Kitaplar kitap) {
        kitapService.add(kitap);
    }

    @PutMapping
    public void update(@RequestBody Kitaplar kitap) {
        kitapService.update(kitap);
    }

    @DeleteMapping
    public void delete(@RequestBody Kitaplar kitap) {
        kitapService.delete(kitap);
    }

    @GetMapping(path = "{id}")
    public Kitaplar getById(@PathVariable Long id) {
        return kitapService.getById(id);
    }
}
