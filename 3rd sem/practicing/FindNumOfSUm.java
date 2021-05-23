package practicing;

public class FindNumOfSUm {
    public static void main(String[] args) {
        int count = 0;
        int a[] = {10, 1, 2, 7, 6, 1, 5};
        int b = 8;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == b) {
                    System.out.print("[" + a[i] + "," + a[j] + "]");
                }
                for (int k = i + 2; k < a.length; k++) {
                    if (a[i] + a[j] + a[k] == b) {
                        System.out.print("[" + a[i] + "," + a[j] + "," + a[k] + "]");
                    }
                    for (int l = i + 3; l < a.length; l++) {
                        if (a[i] + a[j] + a[k] + a[l] == b) {
                            System.out.print("[" + a[i] + "," + a[j] + "," + a[k] + "," + a[l] + "]");
                        }
                        for (int m = i + 4; m < a.length; m++) {
                            if (a[i] + a[j] + a[k] + a[l] + a[m] == b) {
                                System.out.print("[" + a[i] + "," + a[j] + "," + a[k] + "," + a[l] + "," + a[m] + "]");
                            }
                            for (int n = i + 5; n < a.length; n++) {
                                if (a[i] + a[j] + a[k] + a[l] + a[m] + a[n] == b) {
                                    System.out.print("[" + a[i] + "," + a[j] + "," + a[k] + "," + a[l] + "," + a[m] + "," + a[n] + "]");
                                }
                                for (int o = i + 6; o < a.length; o++) {
                                    if (a[i] + a[j] + a[k] + a[l] + a[m] + a[n] + a[o] == b) {

                                        System.out.print("[" + a[i] + "," + a[j] + "," + a[k] + "," + a[l] + "," + a[m] + "," + a[n] + "," + a[o] + "]");
                                    }


                                }


                            }


                        }


                    }


                }

            }

        }


    }
}

