class Employee {
    String company;

    Employee(String company) {
        this.company = company;
    }

    void displayCompany() {
        System.out.println("Company: " + company);
    }
}

class Manager extends Employee {
    String department;

    Manager(String company, String department) {
        super(company);
        this.department = department;
    }

    void display() {
        super.displayCompany();
        System.out.println("Department: " + department);
    }
}

public class EmployeeManager {
    public static void main(String[] args) {
        Manager m = new Manager("ABC Corp", "Engineering");
        m.display();
    }
}