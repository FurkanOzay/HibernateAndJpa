package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.Kitaplar;


public interface IKitaplarService {
	List<Kitaplar> getAll();
	void add(Kitaplar kitap);
	void update(Kitaplar kitap);
	void delete(Kitaplar kitap);
	Kitaplar getById(int id);
}
