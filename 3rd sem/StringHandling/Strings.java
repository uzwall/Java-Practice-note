package StringHandling;

public class Strings {
    public static void main(String[] args) {
        String s1 = "nepal";
        String s2 = "nepal";
        System.out.print((s1 == s2));
        String s3 = new String("nepal");
        System.out.print((s3 == s2));
        System.out.print(s3.equals(s1));


    }
}
