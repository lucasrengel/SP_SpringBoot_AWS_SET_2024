package exercicios04;

/*Ler um número inteiro N e calcular todos os seus divisores*/

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                System.out.println(i);
            }
        }
    }
}
