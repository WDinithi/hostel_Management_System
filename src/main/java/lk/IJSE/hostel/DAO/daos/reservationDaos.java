package lk.IJSE.hostel.DAO.daos;

import lk.IJSE.hostel.DAO.CrudDAO;
import lk.IJSE.hostel.Entity.Reservation;
import org.hibernate.Session;

import java.util.List;

public interface reservationDaos extends CrudDAO<Reservation,String> {
    public List<Reservation> reservationSearchByText(String text, Session session);
    List<Reservation> getNotPaidKeyMoney(Session session);

}
