package com.javacourse.project.hibernateAndJpa.service;

import com.javacourse.project.hibernateAndJpa.entity.Kitaplar;

import java.util.List;

public interface KitapService {

	List<Kitaplar> getAll();
	void add(Kitaplar kitap);
	void update(Kitaplar kitap);
	void delete(Kitaplar kitap);
	Kitaplar getById(Long id);
}
