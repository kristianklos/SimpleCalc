package se.lexicon.kristian;

import java.util.Scanner;

//asking for two numbers
public class App {
    public static void main(String[] args) {
        System.out.println("Enter first and second number:");
        //checking input
        Scanner inp = new Scanner(System.in);
        int num1;
        num1 = inp.nextInt();
        int num2 = inp.nextInt();
        int ans;
        if (num1 < 1) {
            num1 = 1;
        }
        //choose arithmetic
        System.out.println("Enter your arithmetic:   \n[1] Addition " +
                                                    "\n[2] Substraction " +
                                                    "\n[3] Multiplication " +
                                                    "\n[4] Division");

        //checking which arithmetic you picked
        int choose;
        choose = inp.nextInt();

        //array for arithmetic with println
        switch (choose) {
            case 1:
                System.out.println("Answer:" + add(num1, num2));
                break;
            case 2:
                System.out.println("Answer:" + sub(num1, num2));
                break;
            case 3:
                System.out.println("Answer:" + mult(num1, num2));
                break;
            case 4:
                System.out.println("Answer:" + div(num1, num2));
                break;
            default:
                System.out.println("Error!");
        }
    }

    //doing the calculations
    private static int add(int x, int y) {
        return x + y;
    }

    private static int sub(int x, int y) {
        return x - y;
    }

    private static int mult(int x, int y) {
        return x * y;
    }

    private static int div(int x, int y) {
        //fixing the div by 0 crash
        if (x == 0 || y == 0) {
            System.out.println("I'm afraid i can't let you do that");
          return 0;

        }
        else {
            return x / y;
        }
    }
}

//Kristian