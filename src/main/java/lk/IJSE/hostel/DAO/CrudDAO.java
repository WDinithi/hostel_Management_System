package lk.IJSE.hostel.DAO;

import lk.IJSE.hostel.Entity.SuperEntity;
import org.hibernate.Session;

import java.io.Serializable;
import java.util.List;

public interface CrudDAO <T extends SuperEntity, ID extends Serializable> extends SuperDAO{
    boolean save(T entity, Session session);
    boolean update(T entity, Session session);
    boolean delete(T entity, Session session);
    T search(ID id, Session session);
    List<T> getAll(Session session);
    ID getLastId(Session session);
}
