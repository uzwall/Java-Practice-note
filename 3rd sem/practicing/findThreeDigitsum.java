package practicing;

public class findThreeDigitsum {

    public static void main(String[] args) {
        int a[] = {10, 1, 2, 7, 6, 1, 5};
        int b = 8;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
//
                if (a[i] + a[j] == b) {
                    System.out.print("[" + a[i] + "," + a[j] + "]");

//
                }
                for (int k = i + 2; k < a.length; k++) {
//
                    if (a[i] + a[j] + a[k] == b) {
                        System.out.print("[" + a[i] + "," + a[j] + "," + a[k] + "]");

//

                    }


                }

            }
        }
    }
}
