package homework;

import java.util.Scanner;

public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 0) {
            System.out.println("Given Number is Negative");
        } else if (a == 0) {
            System.out.println("Number is zero");
        } else {
            System.out.println("Number is Positive");
        }
    }
}

