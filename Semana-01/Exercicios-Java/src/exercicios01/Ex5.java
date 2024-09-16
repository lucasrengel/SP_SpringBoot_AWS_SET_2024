package exercicios01;

import java.util.Scanner;

/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor
unitário de cada peça 1, ocódigo de uma peça 2, o número de peças 2 e o valor unitário de
cada peça 2. Calcule e mostre o valor a ser pago.*/

public class Ex5 {
    public static void main(String[] args) {
        int cod1, qt1, cod2, qt2;
        double preco1, preco2, soma;

        Scanner sc = new Scanner(System.in);
        cod1 = sc.nextInt();
        qt1 = sc.nextInt();
        preco1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qt2 = sc.nextInt();
        preco2 = sc.nextDouble();
        soma = (qt1 * preco1) + (qt2 * preco2);

        System.out.printf("VALOR A PAGAR: R$%.2f", soma);
    }
}
