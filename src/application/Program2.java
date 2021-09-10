package application;

import model.dao.DAOFactory;
import model.dao.DepartmentDAO;
import model.entities.Department;

import java.util.List;

public class Program2 {

    public static void main(String[] args) {

        DepartmentDAO departmentDao = DAOFactory.createDepartmentDAO();

        System.out.println("=== TEST 1: Find Department by ID ===");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println("=== TEST 2: Find All Departments ===");
        List<Department> list = departmentDao.findAll();
        list.forEach(System.out::println);

        /*System.out.println("\n=== TEST 3: Insert Department ===");
        Department newDepartment = new Department(null, "Music");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New Id: " + newDepartment.getId());*/


    }

}
