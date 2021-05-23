package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class COpyfile {
    public static void main(String[] args) {
        String directoryname = "C:\\dir1";
        FileInputStream in = null;
        FileOutputStream out = null;
        try {

            in = new FileInputStream(directoryname + "\\file2.txt");
            out = new FileOutputStream(directoryname + "\\file4.txt");
            int c;
            byte b[] = {65, 66, 67};
            while ((c=in.read())!=-1){
                System.out.print((char)c);
                out.write(c);
            }
            out.write(b);
            in.close();
            out.close();
        } catch (Exception ex) {
            System.out.print(ex);
        }
    }
}