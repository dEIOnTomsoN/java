class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Officer extends Employee {
    String specialization;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Specialization: " + specialization);
        printSalary();
    }
}

class Manager extends Employee {
    String department;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        printSalary();
    }
}

public class Main {
    public static void main(String[] args) {
        Officer officer = new Officer();
        officer.name = "John";
        officer.age = 30;
        officer.phoneNumber = "1234567890";
        officer.address = "123 Street";
        officer.salary = 50000.0;
        officer.specialization = "Marketing";
        
        Manager manager = new Manager();
        manager.name = "Jane";
        manager.age = 35;
        manager.phoneNumber = "0987654321";
        manager.address = "456 Avenue";
        manager.salary = 70000.0;
        manager.department = "Sales";

        System.out.println("Officer Details:");
        officer.display();

        System.out.println("\nManager Details:");
        manager.display();
    }
}
