package lk.IJSE.hostel.DAO.daos.impl;

import lk.IJSE.hostel.DAO.daos.roomDaos;
import lk.IJSE.hostel.Entity.Room;
import org.hibernate.Session;

import java.util.List;

public class roomDaosImpl implements roomDaos {

    @Override
    public boolean save(Room entity, Session session) {
        return false;
    }

    @Override
    public boolean update(Room entity, Session session) {
        return false;
    }

    @Override
    public boolean delete(Room entity, Session session) {
        return false;
    }

    @Override
    public Room search(String s, Session session) {
        return null;
    }

    @Override
    public List<Room> getAll(Session session) {
        return null;
    }

    @Override
    public String getLastId(Session session) {
        return null;
    }

    @Override
    public List<Room> roomSearchByText(String text, Session session) {
        return null;
    }

    @Override
    public int getRoomCount(Session session) {
        return 0;
    }
}