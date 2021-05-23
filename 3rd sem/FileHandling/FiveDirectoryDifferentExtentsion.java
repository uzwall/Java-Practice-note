package FileHandling;

import java.io.File;

public class FiveDirectoryDifferentExtentsion {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:\\uzzwal");
            if (!f1.exists()) {
                f1.mkdir();
            }
            File f2 = new File(f1, "A");
            if (!f2.exists()) {
                f2.mkdir();
            }
            File e1 = new File(f2, "A.txt");
            if (!e1.exists()) {
                e1.createNewFile();
                File f3 = new File(f1, "B");
                if (!f3.exists()) {
                    f3.mkdir();
                }
                File e2 = new File(f3, "B.html");
                if (!e2.exists()) {
                    e2.createNewFile();
                }

            }
            File f4 = new File(f1, "C");
            if (!f4.exists()) {
                f4.mkdir();
            }
            File e3 = new File(f4, "C.tar");
            if (!e3.exists()) {
                e3.createNewFile();
            }

            File f5 = new File(f1, "D");
            if (!f5.exists()) {
                f5.mkdir();
            }
            File e4 = new File(f5, "D.zip");
            if (!e4.exists()) {
                e4.createNewFile();
            }
            File f6 = new File(f1, "E");
            if (!f6.exists()) {
                f6.mkdir();
            }
            File e5 = new File(f6, "E.rar");
            if (!e5.exists()) {
                e5.createNewFile();
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
