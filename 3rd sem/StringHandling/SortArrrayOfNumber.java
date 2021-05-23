package StringHandling;

public class SortArrrayOfNumber {
    public static void main(String[] args) {
        String phonelist[] = {"+9841555555", "97719849333333", "+977-9818777777", "+9771-9803000000"};

        for (int i = 0; i < phonelist.length; i++) {
            if (phonelist[i].length() != 10) {
                String temp = "phonelist[i]";
                int v = phonelist[i].length() - 10;
                phonelist[i] = phonelist[i].substring(v);

            }
        }

        for (int i =0;i< phonelist.length; i++){
            for (int j=i+1;j<phonelist.length;j++){
                int v= phonelist[i].compareTo(phonelist[j]);
                if (v > 0){
                    String temp = phonelist[i];
                    phonelist[i]=phonelist[j];
                    phonelist[j]=temp;
                }
            }
        }
        for (String y : phonelist) {
            System.out.println(y);
        }

    }
}

