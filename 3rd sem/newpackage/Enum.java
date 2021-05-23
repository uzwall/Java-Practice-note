package newpackage;


import javax.swing.event.SwingPropertyChangeSupport;
import java.util.Scanner;

import static java.lang.System.exit;

public class Enum {
    public static void main(String[] args) {
        Day arr[] = Day.values();
//        for (Day d : arr) {
//            System.out.print(d);
//        }
        int ch;
        System.out.print("Enter the number");
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        switch (ch) {

            case 1: {
                System.out.print(arr[ch - 1]);
                break;

            }
            case 2: {
                System.out.print(arr[ch - 1]);
                break;
            }
            case 3: {
                System.out.print(arr[ch - 1]);
                break;
            }
            case 4: {
                System.out.print(arr[ch - 1]);
                break;
            }
            case 5: {
                System.out.print(arr[ch - 1]);
                break;
            }
            case 6: {
                System.out.print(arr[ch - 1]);
                break;
            }
            case 7: {
                System.out.print(arr[ch - 1]);
                break;
            }
            default: {
                System.out.println("Entered wrong  number");
                exit(0);
            }


        }

    }


    enum Day {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday;
    }
}
