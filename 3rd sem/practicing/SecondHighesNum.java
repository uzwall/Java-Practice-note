package practicing;

public class SecondHighesNum {
    public static void main(String[] args) {
        int temp;
        int a[] = {2, 2, 9, 8, 7, 9};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                }
            }
        }
//        for (int b : a) {
//            System.out.print(b);
//
//        }
        for (int i = 1; i < a.length; i++) {
            if (a[0] != a[i]) {
                System.out.print("The second hightest value is:" + a[i]);
                break;
            }

        }


    }
}
