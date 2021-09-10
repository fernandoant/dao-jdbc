package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {

    public static void main(String[] args) {

        SellerDAO sellerDao = DAOFactory.createSellerDAO();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }

}
