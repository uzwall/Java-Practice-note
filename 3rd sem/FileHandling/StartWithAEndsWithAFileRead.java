package FileHandling;

import java.io.File;
import java.io.FileInputStream;

public class StartWithAEndsWithAFileRead {
    public static void main(String[] args) {
        try {
            File f1 = new File("C:\\dir1");
            String path[] = f1.list();
            for (String u : path) {
                if (u.contains("a")) {
                    System.out.println(u);
                }

            }
//
            for (int i = 0; i < path.length; i++) {
//                System.out.println(path[i]);
                if (path[i].startsWith("a") && path[i].endsWith("t")) {
                    FileInputStream in = new FileInputStream(f1 + "\\" + path[i]);
                    int c;
                    while ((c = in.read()) != -1) {
                        System.out.print((char) c);
                    }

                    in.close();
                }

            }

        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
