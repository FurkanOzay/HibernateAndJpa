package com.javacourse.project.hibernateAndJpa.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.javacourse.project.hibernateAndJpa.Business.IKitaplarService;
import com.javacourse.project.hibernateAndJpa.Entities.Kitaplar;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/api")
public class KitaplarController {
	
	private IKitaplarService kitaplarService;

	@Autowired
	public KitaplarController(IKitaplarService kitaplarService) {

		this.kitaplarService = kitaplarService;

	}

	@GetMapping("/kitaps")
	public List<Kitaplar> get(){
		return kitaplarService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody Kitaplar kitap){

		kitap.setMevcut_kitap(kitap.getKitap_adeti());
		kitaplarService.add(kitap);
	}

	@PutMapping("/update")
	public void update(@RequestBody Kitaplar kitap){
		kitaplarService.update(kitap);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestBody Kitaplar kitap){
		kitaplarService.delete(kitap);
	}

	@GetMapping("/kitaps/{id}")
	public Kitaplar getById(@PathVariable int id){
		return kitaplarService.getById(id);
	}
}
