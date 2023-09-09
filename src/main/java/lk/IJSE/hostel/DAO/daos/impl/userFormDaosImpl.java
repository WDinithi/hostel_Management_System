package lk.IJSE.hostel.DAO.daos.impl;

import lk.IJSE.hostel.DAO.daos.userFormDaos;
import lk.IJSE.hostel.Entity.User;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class userFormDaosImpl implements userFormDaos {
    @Override
    public boolean save(User user, Session session) {
        session.save(user);
        return true;
    }

    @Override
    public boolean update(User user, Session session) {
        session.update(user);
        return true;
    }

    @Override
    public boolean delete(User user, Session session) {
        session.delete(user);
        return true;
    }

    @Override
    public User search(String id, Session session) {
        User user = session.get(User.class, id);
        return user;
    }

    @Override
    public List<User> getAll(Session session) {
        String hql = "FROM User u ORDER BY u.UserName DESC";
        Query query = session.createQuery(hql);
        List<User> list= query.list();
        return list;
    }

    @Override
    public String getLastId(Session session) {
        return null;
    }
}
