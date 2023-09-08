package lk.IJSE.hostel.DAO;
import lk.IJSE.hostel.DAO.daos.impl.reservationDaosImpl;
import lk.IJSE.hostel.DAO.daos.impl.roomDaosImpl;
import lk.IJSE.hostel.DAO.daos.impl.studentDaosImpl;
import lk.IJSE.hostel.DAO.daos.impl.userFormDaosImpl;

public class DAOFactory  {
    private static DAOFactory daoFactory;

    private DAOFactory(){}

    public static DAOFactory getInstance(){
        return daoFactory==null?(daoFactory=new DAOFactory()):daoFactory;
    }

    public enum DAOTypes{Student_DAO,Room_DAO,Reservation_DAO,User_DAO};

    public <T extends SuperDAO> T getDao(DAOType daoType) {
        switch (daoType) {
            case Student_DAO:
                return (T) new studentDaosImpl();

            case Room_DAO:
                return (T) new roomDaosImpl();

            case Reservation_DAO:
                return (T) new reservationDaosImpl();

            case User_DAO:
                return (T) new userFormDaosImpl();

            default:
                return null;
        }
    }

}