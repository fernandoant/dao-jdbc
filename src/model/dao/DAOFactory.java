package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DAOFactory {

    public static SellerDAO createSellerDAO() {
        return new SellerDaoJDBC();
    }

}
