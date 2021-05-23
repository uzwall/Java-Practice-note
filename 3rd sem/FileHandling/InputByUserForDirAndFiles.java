package FileHandling;

import java.io.File;
import java.util.Scanner;

public class InputByUserForDirAndFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File f1 = new File("C:\\uzzwal");
            if (!f1.exists()) {
                f1.mkdir();
            }
            System.out.println("Do you want create:");
            System.out.println("1.folder");
            System.out.println("2.file");
            int ch = sc.nextInt();
            switch (ch) {
                case 1: {
                    System.out.println("Enter the name of folder");
                    String folder = sc.next();
                    File fold = new File(f1,"\\" + folder);
                    fold.mkdir();
                    break;
                }
                case 2: {
                    System.out.println("Enter the name of the file");
                    String file=sc.next();
                    File fil=new File(f1,file+".txt");
                    fil.createNewFile();
                    break;
                }
            }
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
