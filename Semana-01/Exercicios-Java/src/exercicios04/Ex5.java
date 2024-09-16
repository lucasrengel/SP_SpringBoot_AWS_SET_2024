package exercicios04;

/*Ler um valor N. Calcular e escrever seu respectivo fatorial.
Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial de 0 é 1.*/

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int n, fatorial = 1;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = n; i > 1; i--) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);
    }
}
