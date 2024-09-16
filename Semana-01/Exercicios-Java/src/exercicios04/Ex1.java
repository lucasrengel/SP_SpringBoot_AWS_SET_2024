package exercicios04;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int x;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        for(int i = 0; i <= x; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
