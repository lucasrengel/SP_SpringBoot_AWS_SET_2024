package heranca.exercicio01.application;

import heranca.exercicio01.entities.Employee;
import heranca.exercicio01.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int N = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n)? ");
            String output = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if(output.equalsIgnoreCase("y")) {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                OutsourcedEmployee outEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                list.add(outEmployee);
            }else{
                Employee employee = new Employee(name, hours, valuePerHour);
                list.add(employee);
            }
        }

        System.out.println("\nPAYMENTS:");
        for (Employee employee : list) {
            System.out.println(employee.getName() + " - $" + employee.payment());
        }

    }
}
