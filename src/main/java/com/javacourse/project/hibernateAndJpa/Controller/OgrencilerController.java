package com.javacourse.project.hibernateAndJpa.Controller;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.Ogrenciler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.javacourse.project.hibernateAndJpa.Business.IOgrencilerService;


@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/apio")
public class OgrencilerController {

    private IOgrencilerService ogrencilerService;

    @Autowired
    public OgrencilerController(IOgrencilerService ogrencilerService) {
        this.ogrencilerService = ogrencilerService;
    }

    @GetMapping("/ogrencis")
    public List<Ogrenciler> get(){
        return ogrencilerService.getAll();
    }


    @PostMapping("/add")
    public void add(@RequestBody Ogrenciler ogrenci){
        ogrencilerService.add(ogrenci);
    }

    @PutMapping("/update")
    public void update(@RequestBody Ogrenciler ogrenci){
        ogrencilerService.update(ogrenci);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Ogrenciler ogrenci){
        ogrencilerService.delete(ogrenci);
    }

    @GetMapping("/kitaps/{ogr_id}")
    public Ogrenciler getById(@PathVariable int ogr_id){
        return ogrencilerService.getById(ogr_id);
    }

}