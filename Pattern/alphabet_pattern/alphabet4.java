package alphabet_pattern;

public class alphabet4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print((char) (i + 64));
            }
            System.out.println();
        }
    }
}
