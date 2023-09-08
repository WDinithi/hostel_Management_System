package lk.IJSE.hostel.DAO.daos.impl;

import lk.IJSE.hostel.DAO.SuperDAO;
import lk.IJSE.hostel.DAO.daos.studentDaos;
import lk.IJSE.hostel.Entity.Student;
import org.hibernate.Session;

import java.util.List;

public class studentDaosImpl implements studentDaos {

    @Override
    public boolean save(Student entity, Session session) {
        return false;
    }

    @Override
    public boolean update(Student entity, Session session) {
        return false;
    }

    @Override
    public boolean delete(Student entity, Session session) {
        return false;
    }

    @Override
    public Student search(String s, Session session) {
        return null;
    }

    @Override
    public List<Student> getAll(Session session) {
        return null;
    }

    @Override
    public String getLastId(Session session) {
        return null;
    }

    @Override
    public List<Student> studentSearchByText(String text, Session session) {
        return null;
    }

    @Override
    public int getStudentCount(Session session) {
        return 0;
    }
}
