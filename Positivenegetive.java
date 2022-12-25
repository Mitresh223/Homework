package homework;


import java.util.Scanner;

public class Positivenegetive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a<0){
            System.out.println("Given Number is Negative");
        }else {
            System.out.println("Given Number is Positive");
        }
    }
}
