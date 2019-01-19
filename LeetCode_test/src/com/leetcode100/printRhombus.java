package leetcode100;

public class printRhombus {
    public static void main(String[] args) {
        int n = 11;// 行数
        for (int i = 0; i < n; i++) {
            if (i <= (n - 1) / 2) {
                for (int j = i; j < (n - 1) / 2; j++) {
                    System.out.print("+");
                }
//                for (int k = 0; k < 2 * i + 1; k++) {
//                    System.out.print("*");
//                }
            }
//           else {
//                for (int j = 0; j < i - (n - 1) / 2; j++) {
//                    System.out.print(" ");
//                }
//                for (int k = 0; k < 2 * (n - i) - 1; k++) {
//                    System.out.print("*");
//                }
//            }
            System.out.println();
        }
    }


}
