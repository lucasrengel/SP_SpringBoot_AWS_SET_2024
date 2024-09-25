package heranca.fixacao02.application;

import heranca.fixacao02.model.entities.Company;
import heranca.fixacao02.model.entities.Individual;
import heranca.fixacao02.model.entities.Tax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        List<Tax> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            System.out.println("Tax payer #" + (i+1) + " data:");
            System.out.print("Individual or Company (i/c)?");
            String type = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if(type.equals("i")){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            if(type.equals("c")){
                System.out.print("Numer of employees: ");
                int numOfEmployees = sc.nextInt();

                list.add(new Company(name, anualIncome, numOfEmployees));

            }
        }

        System.out.println("\nTAXES PAID:");
        double sum = 0;
        for (Tax tax : list) {
            System.out.printf("%s: $%.2f%n",tax.getName(), tax.tax());
            sum += tax.tax();
        }
        System.out.printf("\nTOTAL TAXES: $%.2f", sum);

    }
}
