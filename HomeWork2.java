package homeWork;

import java.util.Scanner;

public class HomeWork2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
                try {
                    int value = sc.nextInt();
                    System.out.println(
                            String.format(
                                    "decimal=%d, oktal=%o, Hex=%x, binar=%s",
                                    value,
                                    value,
                                    value,
                                    Integer.toBinaryString(value)));
                } catch (Exception e) {
                    System.out.println("Falsche Eingabe");
                }
            }
    }
}