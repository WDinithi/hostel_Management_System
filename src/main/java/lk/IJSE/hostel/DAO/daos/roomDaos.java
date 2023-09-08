package lk.IJSE.hostel.DAO.daos;

import lk.IJSE.hostel.DAO.CrudDAO;
import lk.IJSE.hostel.Entity.Room;
import org.hibernate.Session;

import java.util.List;

public interface roomDaos extends CrudDAO<Room,String> {

    List<Room> roomSearchByText(String text, Session session);

    int getRoomCount(Session session);
}
