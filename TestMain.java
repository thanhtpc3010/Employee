package Entity;

import Entity.Employee;  // Import lớp Employee từ package Entity

public class TestMain {
    public static void main(String[] args) {
        // Test constructor và toString()
        Employee e1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(e1); // toString();

        // Test Setters và Getters
        e1.setSalary(999);
        System.out.println(e1); // toString();
        System.out.println("id is: " + e1.getID());
        System.out.println("firstname is: " + e1.getFirstName());
        System.out.println("lastname is: " + e1.getLastName());
        System.out.println("salary is: " + e1.getSalary());
        System.out.println("name is: " + e1.getName());
        System.out.println("annual salary is: " + e1.getAnnualSalary());

        // Test raiseSalary()
        System.out.println("After raise: " + e1.raiseSalary(10)); // Tăng 10%
        System.out.println(e1);

        // Tạo mảng 3 nhân viên và hiển thị danh sách
        Employee[] employees = new Employee[3];
        employees[0] = new Employee(1, "John", "Doe", 3000);
        employees[1] = new Employee(2, "Jane", "Smith", 3500);
        employees[2] = new Employee(3, "Mark", "Lee", 4000);

        System.out.println("\nDanh sách nhân viên:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        // Tìm nhân viên có lương hàng năm cao nhất
        Employee maxSalaryEmployee = employees[0];
        for (Employee emp : employees) {
            if (emp.getAnnualSalary() > maxSalaryEmployee.getAnnualSalary()) {
                maxSalaryEmployee = emp;
            }
        }

        System.out.println("\nNhân viên có lương hàng năm cao nhất: ");
        System.out.println(maxSalaryEmployee);
    }
}

