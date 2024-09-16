package exercicios01;

import java.util.Scanner;

/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
valor da área deste círculo com quatro casas decimais conforme exemplos.

Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159*/

public class Ex2 {
    public static void main(String[] args) {
        double pi = 3.14159, raio, area;

        Scanner sc = new Scanner(System.in);
        raio = sc.nextFloat();
        area = (raio * raio) * pi;
        System.out.printf("A=%.4f", area);

    }
}
