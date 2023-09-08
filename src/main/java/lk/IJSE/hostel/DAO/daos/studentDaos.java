package lk.IJSE.hostel.DAO.daos;

import lk.IJSE.hostel.DAO.CrudDAO;
import lk.IJSE.hostel.Entity.Student;
import org.hibernate.Session;

import java.util.List;

public interface studentDaos extends CrudDAO<Student,String> {
    List<Student> studentSearchByText(String text, Session session);
    int getStudentCount(Session session);
}
