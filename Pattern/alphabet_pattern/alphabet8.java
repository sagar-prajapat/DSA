package alphabet_pattern;

public class alphabet8 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i + 1; j++) {
                System.out.print((char) (j + 64));
            }
            System.out.println();
        }
    }
}
