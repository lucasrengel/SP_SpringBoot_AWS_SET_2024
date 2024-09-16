package exercicios04;

/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel"*/

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        int n, x, y;
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (y == 0) {
                System.out.println("divisao impossivel");
            } else {
                double div = (double) x / y;
                System.out.printf("%.1f%n", div);
            }
        }
    }
}
