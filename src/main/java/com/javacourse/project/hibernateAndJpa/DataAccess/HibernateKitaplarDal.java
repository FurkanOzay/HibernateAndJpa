package com.javacourse.project.hibernateAndJpa.DataAccess;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.Kitaplar;
@Repository
public class HibernateKitaplarDal implements IKitaplarDal{

	private EntityManager entityManager;
	
	
	@Autowired
	public HibernateKitaplarDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Kitaplar> getAll() {
		
		Session session =  entityManager.unwrap(Session.class);
		List<Kitaplar> kitaps = session.createQuery("from Kitaplar", Kitaplar.class).getResultList();
		return kitaps;
		
	}

	@Override
	public void add(Kitaplar kitap) {
		Session session =  entityManager.unwrap(Session.class);
		session.save(kitap);
	}

	@Override
	public void update(Kitaplar kitap) {
		Session session =  entityManager.unwrap(Session.class);
		session.update(kitap);
	}

	@Override
	public void delete(Kitaplar kitap) {
		Session session =  entityManager.unwrap(Session.class);
		Kitaplar kitapToDelete = session.get(Kitaplar.class, kitap.getId());
		session.delete(kitapToDelete);
	}

	@Override
	public Kitaplar getById(int id) {
		Session session =  entityManager.unwrap(Session.class);
		Kitaplar kitap = session.get(Kitaplar.class, id);
		return kitap;
	}


}
