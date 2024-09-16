package exercicios04;

/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor.*/

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(i);
            System.out.print(" " + i * i);
            System.out.print(" " + i * i * i);
            System.out.println();
        }
    }
}
