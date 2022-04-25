package com.javacourse.project.hibernateAndJpa.DataAccess;
import java.util.List;

import com.javacourse.project.hibernateAndJpa.Entities.Kitaplar;


public interface IKitaplarDal {
	List<Kitaplar> getAll();
	void add(Kitaplar kitap);
	void update(Kitaplar kitap);
	void delete(Kitaplar kitap);
	Kitaplar getById(int id);
}
