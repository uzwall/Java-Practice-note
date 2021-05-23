package StringHandling;

import java.util.Scanner;

public class StartAndEndWithA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[] = new String[10];
        for (int i = 0; i < name.length; i++) {
            System.out.println("Enter the name of  Countries No: " + (i + 1));
            name[i] = sc.next();
        }
        for (int i = 0; i < name.length; i++) {
            if (name[i].startsWith("a") && name[i].endsWith("a")) {
                System.out.println(name[i]);
            }
        }
    }
}
