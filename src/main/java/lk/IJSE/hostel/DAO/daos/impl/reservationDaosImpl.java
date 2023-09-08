package lk.IJSE.hostel.DAO.daos.impl;


import jakarta.persistence.Query;
import lk.IJSE.hostel.DAO.daos.reservationDaos;
import lk.IJSE.hostel.Entity.Reservation;
import org.hibernate.Session;

import java.util.List;

public class reservationDaosImpl implements reservationDaos {
    @Override
    public boolean save(Reservation entity, Session session) {
        return false;
    }

    @Override
    public boolean update(Reservation entity, Session session) {
        return false;
    }

    @Override
    public boolean delete(Reservation entity, Session session) {
        return false;
    }

    @Override
    public Reservation search(String s, Session session) {
        return null;
    }

    @Override
    public List<Reservation> getAll(Session session) {
        return null;
    }

    @Override
    public String getLastId(Session session) {
        return null;
    }

    @Override
    public List<Reservation> reservationSearchByText(String text, Session session) {
        return null;
    }

    @Override
    public List<Reservation> getNotPaidKeyMoney(Session session) {
        return null;
    }
}