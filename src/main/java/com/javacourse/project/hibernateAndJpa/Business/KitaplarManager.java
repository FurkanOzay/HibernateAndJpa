package com.javacourse.project.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.DataAccess.IKitaplarDal;
import com.javacourse.project.hibernateAndJpa.Entities.Kitaplar;


@Service
public class KitaplarManager implements IKitaplarService{

	public void Kitaplar(){

	}

	private IKitaplarDal kitaplarDal;
	
	@Autowired
	public KitaplarManager(IKitaplarDal kitaplarDal) {
		this.kitaplarDal = kitaplarDal;
	}

	@Override
	@Transactional
	public List<Kitaplar> getAll() {
		
		return this.kitaplarDal.getAll();
	}

	@Override
	@Transactional
	public void add(Kitaplar kitap) {
		this.kitaplarDal.add(kitap);
	}

	@Override
	@Transactional
	public void update(Kitaplar kitap) {
		this.kitaplarDal.update(kitap);
	}

	@Override
	@Transactional
	public void delete(Kitaplar kitap) {
		this.kitaplarDal.delete(kitap);
	}

	@Override
	@Transactional
	public Kitaplar getById(int id) {
		return this.kitaplarDal.getById(id);
	}
}
