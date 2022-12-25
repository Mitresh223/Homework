package homework;

import java.util.Scanner;

public class Votingage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a<18){
            System.out.println("Age is Minor");
        }else {
            System.out.println("Eligible for voting");
        }
    }
}
