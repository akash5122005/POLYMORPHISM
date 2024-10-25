import java.util.Scanner;


abstract class Employee {
    
    public abstract void calculateSalary();
}


class FullTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

   
    public FullTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    
    @Override
    public void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("FullTimeEmployee Salary: $" + salary);
    }
}


class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

   
    public PartTimeEmployee(double hourlyRate, int hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    
    @Override
    public void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("PartTimeEmployee Salary: $" + salary);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int numEmployees = 3;  

        
        Employee[] employees = new Employee[numEmployees];

        
        employees[0] = new FullTimeEmployee(25.0, 40);
        employees[1] = new PartTimeEmployee(20.0, 20);
        employees[2] = new FullTimeEmployee(30.0, 45);

        
        for (int i = 0; i < numEmployees; i++) {
            employees[i].calculateSalary();
        }

        scanner.close();
    }
}
