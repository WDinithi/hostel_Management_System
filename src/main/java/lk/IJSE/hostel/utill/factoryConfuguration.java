package lk.IJSE.hostel.utill;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class factoryConfuguration {
    private static factoryConfuguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private  factoryConfuguration(){
        Configuration configuration= new Configuration().configure();
                //.addAnnotatedClass(Customer.class);
        sessionFactory = configuration.buildSessionFactory();
    }

    public static factoryConfuguration getInstance(){
        return (factoryConfiguration==null)?
                factoryConfiguration=new factoryConfuguration():factoryConfiguration;
    }



    public Session getSession() {
        return sessionFactory.openSession();
    }
}

