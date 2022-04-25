package com.javacourse.project.hibernateAndJpa.DataAccess;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javacourse.project.hibernateAndJpa.Entities.Ogrenciler;
@Repository
public class HibernateOgrencilerDal implements IOgrencilerDal{

    private EntityManager entityManager;


    @Autowired
    public HibernateOgrencilerDal(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Ogrenciler> getAll() {

        Session session =  entityManager.unwrap(Session.class);
        List<Ogrenciler> ogrencilers = session.createQuery("from Ogrenciler", Ogrenciler.class).getResultList();
        return ogrencilers;

    }

    @Override
    public void add(Ogrenciler ogrenci) {
        Session session =  entityManager.unwrap(Session.class);
        session.save(ogrenci);
    }

    @Override
    public void update(Ogrenciler ogrenci) {
        Session session =  entityManager.unwrap(Session.class);
        session.update(ogrenci);
    }

    @Override
    public void delete(Ogrenciler ogrenci) {
        Session session =  entityManager.unwrap(Session.class);
        Ogrenciler ogrenciToDelete = session.get(Ogrenciler.class, ogrenci.getOgr_id());
        session.delete(ogrenciToDelete);
    }

    @Override
    public Ogrenciler getById(int id) {
        Session session =  entityManager.unwrap(Session.class);
        Ogrenciler ogrenci = session.get(Ogrenciler.class, id);
        return ogrenci;
    }


}
