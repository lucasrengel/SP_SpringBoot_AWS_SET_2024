package exercicios02;

import java.util.Scanner;

/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o
mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */

public class Ex4 {
    public static void main(String[] args) {
        int x, y, duracao;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        if(x < y){
            duracao = y - x;
        }else{
            duracao = 24 - x + y;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
    }
}
