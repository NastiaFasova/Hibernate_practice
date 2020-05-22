package library.dao.impl;

import library.dao.GenreDao;
import library.entity.Genre;
import library.lib.Dao;
import library.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Dao
public class GenreDaoImpl implements GenreDao {
    @Override
    public Genre add(Genre genre) {
        Transaction transaction = null;
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(genre);
            transaction.commit();
            return genre;
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new RuntimeException("Transaction failed");
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
