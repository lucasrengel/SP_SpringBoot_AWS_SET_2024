package exercicios02;

import java.util.Scanner;

/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou
"Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números
devem poder ser digitados em ordem crescente ou decrescente.*/

public class Ex3 {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if(a % b == 0 || b % a == 0){
            System.out.println("Sao multilpos");
        }
        else{
            System.out.println("Nao sao multilpos");
        }
    }
}
