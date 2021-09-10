package application;

import model.dao.DAOFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        SellerDAO sellerDao = DAOFactory.createSellerDAO();

        System.out.println("=== Test 1: Seller FindByID ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== Test 2: Seller FindByDepartmentId ===");
        List<Seller> list = sellerDao.findByDepartmentId(2);
        list.forEach(System.out::println);

        System.out.println("\n=== Test 3: Seller FindAll ===");
        list = sellerDao.findAll();
        list.forEach(System.out::println);

    }

}
