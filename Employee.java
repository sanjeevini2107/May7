public class Employee {
    String name;
    int id;
    double salary;
    String lastname;

    // Constructor updated to accept four parameters
    public Employee(String name, int id, double salary, String lastname) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.lastname = lastname;
    }

    // Fixed method name typo and corrected the print statement
    public void displayInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee LastName: " + lastname);
    }

    public static void main(String[] args) {
        // Now passing all four arguments: id, name, salary, lastname
        Employee emp1 = new Employee("xyz", 101, 50000.0, "abc");
        emp1.displayInfo(); // Calling the displayInfo method
    }
}
