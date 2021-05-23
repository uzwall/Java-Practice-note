package Question;

import java.io.File;
import java.io.FileInputStream;

public class PrintFileConsistTXTextension {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\uzzwal");

            String a[] = f.list();
            for (int i = 0; i < a.length; i++) {
                if (a[i].endsWith(".txt")){
                    FileInputStream f1 = new FileInputStream(f+"//"+a[i]);
                    System.out.print("The content of file "+a[i]+" is:\n");
                    int c;
                    while((c=f1.read())!=-1){
                        System.out.print((char)c);


                    }
                    System.out.println();
                    f1.close();
                }

            }


        } catch (Exception e) {
            System.out.print(e);
        }

    }
}
