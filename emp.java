

class Employee {
    int empNo;
    String name;
    double basicPay, DA, HRA, grossSalary;

    void acceptDetails() {
        
        System.out.println("Enter employee number:");
        
        System.out.println("Enter employee name:");
       
        System.out.println("Enter basic pay:");
        
    }

    void calculateSalary() {
        DA = 0.20 * basicPay;
        HRA = 0.05 * basicPay;
        grossSalary = basicPay + DA + HRA;
    }

    void displayDetails() {
        System.out.println("Employee Number: " + empNo);
        System.out.println("Employee Name: " + name);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class Main {
    public static void main(String[] args) {
        S
        System.out.println("Enter the number of employees:");
       
        
        Employee[] employees = new Employee[n];
        
        for(int i=0; i<n; i++) {
            employees[i] = new Employee();
            employees[i].acceptDetails();
            employees[i].calculateSalary();
            employees[i].displayDetails();
        }
    }
}
