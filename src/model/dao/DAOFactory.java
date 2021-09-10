package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DAOFactory {

    public static SellerDAO createSellerDAO() {
        return new SellerDaoJDBC(DB.getConnection());
    }
    public static DepartmentDAO createDepartmentDAO() { return new DepartmentDaoJDBC(DB.getConnection()); }

}
