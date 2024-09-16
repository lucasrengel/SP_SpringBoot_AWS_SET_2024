package exercicios01;

import java.util.Scanner;

/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que
recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o
salário do funcionário, com duas casas decimais*/

public class Ex4 {
    public static void main(String[] args) {
        int numero, horas;
        double valorHora, salario;

        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        horas = sc.nextInt();
        valorHora = sc.nextDouble();
        salario = horas * valorHora;

        System.out.println("NUMBER = " + numero);
        System.out.printf("SALARY = U$ %.2f", salario);
    }
}
