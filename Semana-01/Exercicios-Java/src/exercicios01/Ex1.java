package exercicios01;

import java.util.Scanner;

/*Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos*/

public class Ex1 {
    public static void main(String[] args) {
        int x, y, soma;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        soma = x + y;
        System.out.println("SOMA = " + soma);


    }
}
