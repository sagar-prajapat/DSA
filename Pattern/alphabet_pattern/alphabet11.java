package alphabet_pattern;

public class alphabet11 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            int k = i;
            for (int j = 1; j <= i; j++, k++) {
                System.out.print((char) (k + 64));
            }
            System.out.println();
        }
    }
}
