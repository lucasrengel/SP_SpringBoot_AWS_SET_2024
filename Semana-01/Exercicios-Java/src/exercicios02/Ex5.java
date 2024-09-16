package exercicios02;

import java.util.Scanner;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar */


public class Ex5 {
    public static void main(String[] args) {
        int numero, quantidade;
        double total;

//      1 - Cachorro Quente R$4,00"
//      2 - X-Salada R$4,50
//      3 - X-Bacon R$5,00
//      4 - Torrada Simples R$2,00
//      5 - Refrigerante R$1,50

        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        quantidade = sc.nextInt();

        if (numero < 1 || numero > 5) {
            System.out.println("numero invalido");
        } else {
            if (numero == 1) {
                total = 4.00 * quantidade;
            } else if (numero == 2) {
                total = 4.50 * quantidade;
            } else if (numero == 3) {
                total = 5.00 * quantidade;
            } else if (numero == 4) {
                total = 2.00 * quantidade;
            } else {
                total = 1.50 * quantidade;
            }

            System.out.printf("Total: R$ %.2f%n", total);
        }
    }
}