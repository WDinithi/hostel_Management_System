package lk.IJSE.hostel.DAO.daos.impl;


import lk.IJSE.hostel.DAO.daos.reservationDaos;
import lk.IJSE.hostel.Entity.Reservation;
import lk.IJSE.hostel.utill.factoryConfuguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class reservationDaosImpl implements reservationDaos {
    @Override
    public boolean save(Reservation reservation, Session session) {
    session.save(reservation);
       return true;
    }

    @Override
    public boolean update(Reservation reservation, Session session) {
        session.update(reservation);
        return true;
    }

    @Override
    public boolean delete(Reservation reservation, Session session) {
        session.delete(reservation);
        return true;
    }

    @Override
    public Reservation search(String id
            , Session session) {
        Reservation reservation = session.get(Reservation.class, id);
        return reservation;
    }

    @Override
    public List<Reservation> getAll(Session session) {
        String hql = "FROM Reservation r ORDER BY r.res_id DESC";
        Query query = session.createQuery(hql);
        List<Reservation> list= query.list();
        return list;
    }

    @Override
    public String getLastId(Session session) {
        String hql = "SELECT res_id FROM Reservation ORDER BY res_id DESC";
        Query query = session.createQuery(hql);
        List<String> list = query.list();
        return list.get(0);
    }

    @Override
    public List<Reservation> reservationSearchByText(String text, Session session) {
        String hql = "FROM Reservation WHERE res_id LIKE '"+text+"%' OR  id LIKE '"+text+"%' OR  id LIKE '"+text+"%' OR  status LIKE '"+text+"%'";
        Query query = session.createQuery(hql);
        List<Reservation> list = query.list();
        return list;
    }

    @Override
    public List<Reservation> getNotPaidKeyMoney(Session session) {
        String hql = "FROM Reservation WHERE status='Not Paid'";
        Query query = session.createQuery(hql);
        List<Reservation> list = query.list();
        return list;
    }
}