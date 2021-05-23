package FileHandling;

/**
 * @author UZWAL
 */

import java.io.File;

class FileDemo {


    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        try {
            File f1 = new File("C:\\uzzwal");
            if (!f1.exists()) {
                f1.mkdir();
            }
            File f2 = new File(f1, "Nishat.txt");
            if (!f2.exists()) {
                f2.createNewFile();
            }

            p("File name:" + f1.getName());
            p("path:" + f1.getPath());
            p("Parent" + f2.getParent());
            p(f2.exists() ? "exists" : "does not exit");
            p(f2.canWrite() ? "is writable" : "not writable");
            p(f2.canRead() ? "is readable" : "no readable");
            p(f1.isDirectory() ? " yes a directory" :  "  not a DIrectory");
            p("file last modified:" + f2.lastModified());
            p("file size" + f1.length() + "Bytes");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class FileName {

}
