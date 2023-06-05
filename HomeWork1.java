package homeWork;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
    Scanner gr = new Scanner(System.in);
    try {
        System.out.println("ввидите первое число: ");
        double a = gr.nextDouble();
        System.out.println("ввидите второе число: ");
        double b = gr.nextDouble();
        int c = (int) (a * b);

        System.out.println(c);
    } finally {
        gr.close();
    }


    }




}
