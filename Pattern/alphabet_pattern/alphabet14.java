package alphabet_pattern;

public class alphabet14 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print((char) (j + 64));
            }
            System.out.println();
        }
    }
}
