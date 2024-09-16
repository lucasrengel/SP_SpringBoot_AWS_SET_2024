package exercicios04;

/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal.
Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o
primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.*/

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        int n;
        double a, b, c, media = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;
            System.out.printf("%.1f%n", media);
        }

    }
}
