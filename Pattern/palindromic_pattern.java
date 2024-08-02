public class palindromic_pattern {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 2; k--) {
                System.out.print(k);
            }
            for (int m = 1; m <= i; m++) {
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
