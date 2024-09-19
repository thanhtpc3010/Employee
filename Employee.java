package Entity;
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private double salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter và Setter cho các thuộc tính
    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Tính lương hàng năm
    public double getAnnualSalary() {
        return salary * 12;
    }

    // Tăng lương theo phần trăm
    public double raiseSalary(double percent) {
        salary += salary * (percent / 100);
        return salary;
    }

    // Phương thức toString để hiển thị thông tin của nhân viên
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }
}

