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

        System.out.println("\n=== TEST 2: Find All Departments ===");
        List<Department> list = departmentDao.findAll();
        list.forEach(System.out::println);

        System.out.println("\n=== TEST 3: Insert Department ===");
        Department newDepartment = new Department(null, "Games");
        departmentDao.insert(newDepartment);
        System.out.println("Inserted! New Id: " + newDepartment.getId());

        System.out.println("\n=== TEST 4: Update Department ===");
        Department dep2 = departmentDao.findById(8);
        dep2.setName("Food");
        departmentDao.update(dep2);
        System.out.println("Update Completed!");

        System.out.println("\n=== TEST 5: Delete Department ===");
        departmentDao.deleteById(9);

    }

}
