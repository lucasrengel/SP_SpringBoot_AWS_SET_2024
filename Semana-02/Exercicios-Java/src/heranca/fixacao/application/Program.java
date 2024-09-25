package heranca.fixacao.application;

import heranca.fixacao.entities.ImportedProduct;
import heranca.fixacao.entities.Product;
import heranca.fixacao.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        List<Product> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            String type = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            switch (type) {
                case "c":
                    Product product = new Product(name, price);
                    list.add(product);
                    break;
                case "i":
                    System.out.print("Custom fee: ");
                    double fee = sc.nextDouble();
                    ImportedProduct importedProduct = new ImportedProduct(name, price, fee);
                    list.add(importedProduct);
                    break;
                case "u":
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String data = sc.next();
                    LocalDate moment = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    UsedProduct usedProduct = new UsedProduct(name, price, moment);
                    list.add(usedProduct);
                    break;
                default:
                    System.out.println("Uknown character");
                    break;
            }
        }

        System.out.println("\nPRICE TAGS:");
        for (Product p : list) {
            System.out.println(p.priceTag());
        }
    }
}
