package functions_and_methods;

public class call_by_value {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Inside function a= " + a + " b= " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
    }

}
// in java all function are call by value
// so when we pass a and b to swap function it creates a copy of a and b
