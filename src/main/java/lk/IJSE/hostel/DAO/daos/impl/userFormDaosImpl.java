package lk.IJSE.hostel.DAO.daos.impl;

import lk.IJSE.hostel.DAO.daos.userFormDaos;
import lk.IJSE.hostel.Entity.User;
import org.hibernate.Session;

import java.util.List;

public class userFormDaosImpl implements userFormDaos {
    @Override
    public boolean save(User entity, Session session) {
        return false;
    }

    @Override
    public boolean update(User entity, Session session) {
        return false;
    }

    @Override
    public boolean delete(User entity, Session session) {
        return false;
    }

    @Override
    public User search(String s, Session session) {
        return null;
    }

    @Override
    public List<User> getAll(Session session) {
        return null;
    }

    @Override
    public String getLastId(Session session) {
        return null;
    }
}
