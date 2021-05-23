package practicing;


public class ReverseSentences {
    public static void main(String[] args) {


        String name = " prabesh is my name";
        String a = "";

        int count = name.length();
        for (int i = name.length() - 1; i >= 0; i--) {
            if (name.charAt(i) == ' ') {
                String n = name.substring(i, count);
                System.out.print(n + " ");
                count = i;
            }

        }


    }
}
