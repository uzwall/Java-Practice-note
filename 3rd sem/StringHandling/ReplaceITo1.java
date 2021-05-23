package StringHandling;

import java.util.Scanner;

public class ReplaceITo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name[] = new String[10];
        for (int i = 0; i < name.length; i++) {
            System.out.println("Enter name no: " + (i + 1));
            name[i] = sc.next();
            name[i] = name[i].replace('i', '!');
        }
        for (String u:name){
            System.out.println(u);
        }

    }
}
