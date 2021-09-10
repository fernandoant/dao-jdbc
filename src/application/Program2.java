package application;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDAO departmentDao = DAOFactory.createDepartmentDAO();

        System.out.println("\n=== TEST 1: Insert Department ===");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New Id: " + newDepartment.getId());

    }

}
