package DAO;

import DAO.Impl.fabricatorDAOImpl;
import DAO.Impl.providerDAOImpl;
import Logic.provider;
import java.sql.SQLException;
import java.util.List;

public class Factory {

    private static fabricatorDAO fabricatorDAO = null;
    private static providerDAO providerDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();
        }
        return instance;
    }

    public fabricatorDAO getUserDAO() {
        if (fabricatorDAO == null) {
            fabricatorDAO = new fabricatorDAOImpl();
        }
        return fabricatorDAO;
    }

    public providerDAO getproviderDAO() {
        if (providerDAO == null) {
            fabricatorDAO = new fabricatorDAOImpl();
        }
        return providerDAO;
    }
}
