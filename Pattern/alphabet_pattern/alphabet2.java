package alphabet_pattern;

public class alphabet2 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i + 64));
            }
            System.out.println();
        }
    }
}
