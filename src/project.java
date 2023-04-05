import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        a = input.nextInt();
        for (int i = a - 1; i >= 0; i--) {
            for (int j = (a - i); j >= 1; j--) {
                System.out.print(" ");
            }
            for (int k = (2 * i - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
