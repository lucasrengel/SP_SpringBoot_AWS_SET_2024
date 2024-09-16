package exercicios01;

import java.util.Scanner;

/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão:
A, B e C. Em seguida, calcule e mostre:

a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/

public class Ex6 {
    public static void main(String[] args) {
        float a, b, c, pi = 3.14159f;

        Scanner sc = new Scanner(System.in);
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        System.out.printf("TRIANGULO: %.3f\n", ((a * c) / 2));
        System.out.printf("CIRCULO: %.3f\n", (pi * (c * c)));
        System.out.printf("TRAPEZIO: %.3f\n", ((a + b) * c) / 2);
        System.out.printf("QUADRADO: %.3f\n", (b * b));
        System.out.printf("RETANGULO: %.3f\n", (a * b));

    }
}
