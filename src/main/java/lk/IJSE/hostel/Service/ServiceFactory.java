package lk.IJSE.hostel.Service;

import lk.IJSE.hostel.DAO.DAOFactory;
import lk.IJSE.hostel.DAO.DAOType;
import lk.IJSE.hostel.DAO.SuperDAO;
import lk.IJSE.hostel.DAO.daos.impl.reservationDaosImpl;
import lk.IJSE.hostel.DAO.daos.impl.roomDaosImpl;
import lk.IJSE.hostel.DAO.daos.impl.studentDaosImpl;
import lk.IJSE.hostel.DAO.daos.impl.userFormDaosImpl;
import lk.IJSE.hostel.Service.custom.impl.ReservationServiceImpl;
import lk.IJSE.hostel.Service.custom.impl.RoomServiceImpl;
import lk.IJSE.hostel.Service.custom.impl.StudentServiceImpl;
import lk.IJSE.hostel.Service.custom.impl.UserServiceImpl;

public class ServiceFactory {
    private static ServiceFactory serviceFactory;

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return serviceFactory==null?(serviceFactory=new ServiceFactory()):serviceFactory;
    }

    public enum DAOTypes{Student_DAO,Room_DAO,Reservation_DAO,User_DAO};

    public <T extends SuperDAO> T getDao(ServiceType serviceType) {
        switch (serviceType) {
            case STUDENT_SERVICE:
                return (T) new StudentServiceImpl();

            case ROOM_SERVICE:
                return (T) new RoomServiceImpl();

            case RESERVATION_SERVICE:
                return (T) new ReservationServiceImpl();

            case USER_SERVICE:
                return (T) new UserServiceImpl();

            default:
                return null;
        }
    }

}
