package enums.fixacao.application;

import enums.fixacao.model.entities.Client;
import enums.fixacao.model.entities.Order;
import enums.fixacao.model.entities.OrderItem;
import enums.fixacao.model.entities.Product;
import enums.fixacao.model.enums.OrderStatus;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date: (DD/MM/YYYY): ");
        String data = sc.nextLine();
        LocalDate birthDate = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Client client = new Client(clientName, clientEmail, birthDate);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String orderStatus = sc.nextLine();
        System.out.print("How many items to this order? ");
        int items = sc.nextInt();

        Order order = new Order(new Date(), OrderStatus.valueOf(orderStatus), client);

        for(int i = 0; i < items; i++){
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(product, quantity, productPrice);

            order.addItem(orderItem);
        }

        System.out.println(order);
    }
}
