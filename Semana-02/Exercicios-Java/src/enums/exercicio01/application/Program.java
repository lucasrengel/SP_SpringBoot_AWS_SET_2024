package enums.exercicio01.application;

import enums.exercicio01.model.entities.Department;
import enums.exercicio01.model.entities.HourContract;
import enums.exercicio01.model.entities.Worker;
import enums.exercicio01.model.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.println("Enter contracr #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String data = sc.next();
            LocalDate contractDate = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String data = sc.next();
        int month = Integer.parseInt(data.substring(0, 2));
        int year = Integer.parseInt(data.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + data + ": " + String.format("%.2f", worker.income(year, month)) );

    }
}
