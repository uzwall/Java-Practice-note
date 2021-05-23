package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacteStream {
    public static void main(String[] args) {
        try {
            File dir = new File("C:\\uzzwal");
            FileWriter f =new  FileWriter( dir + "\\new.txt");
            f.write("hello world");
            char[]  charr={'f','r','s'};
            f.write(charr);
            f.write(65);
            f.close();
            FileReader f1= new FileReader(dir+"\\new.txt");
                    int c;
            while((c=f1.read())!=-1){
                System.out.print((char)c);
            }

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
