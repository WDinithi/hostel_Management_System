package lk.IJSE.hostel.DAO.daos.impl;

import lk.IJSE.hostel.DAO.SuperDAO;
import lk.IJSE.hostel.DAO.daos.studentDaos;
import lk.IJSE.hostel.Entity.Student;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class studentDaosImpl implements studentDaos {

    @Override
    public boolean save(Student student, Session session) {
        session.save(student);
        return true;
    }

    @Override
    public boolean update(Student student, Session session) {
        session.update(student);
        return true;
    }

    @Override
    public boolean delete(Student student, Session session) {
        session.delete(student);
        return true;
    }

    @Override
    public Student search(String id, Session session) {
        Student student = session.get(Student.class, id);
        return student;
    }

    @Override
    public List<Student> getAll(Session session) {
        String hql = "FROM Student s ORDER BY s.student_id DESC";
        Query query = session.createQuery(hql);
        List<Student> list= query.list();
        return list;
    }

    @Override
    public String getLastId(Session session) {
        String hql = "SELECT student_id FROM Student ORDER BY student_id DESC";
        Query query = session.createQuery(hql);
        List<String> list = query.list();
        return list.get(0);
    }

    @Override
    public List<Student> studentSearchByText(String text, Session session) {
        String hql = "FROM Student WHERE student_id LIKE '"+text+"%' OR  name LIKE '"+text+"%' OR address LIKE '"+text+"%' OR contact LIKE '"+text+"%'";
        Query query = session.createQuery(hql);
        List<Student> list = query.list();
        return list;
    }

    @Override
    public int getStudentCount(Session session) {
        String hql = "FROM Student ";
        Query query = session.createQuery(hql);
        List list = query.list();
        return list.size();
    }
}
