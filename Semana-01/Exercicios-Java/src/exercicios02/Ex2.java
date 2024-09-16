package exercicios02;

import java.util.Scanner;

/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar*/

public class Ex2 {
    public static void main(String[] args) {
        int n;

        Scanner leitor = new Scanner(System.in);
        n = leitor.nextInt();

        if(n % 2 == 0){
            System.out.println("PAR");
        }
        if(!(n % 2 == 0)){
            System.out.println("IMPAR");
        }
    }
}
