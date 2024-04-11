import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the cost of the item for n days");
        int cost = input.nextInt();

        System.out.println("Enter the value of n");
        int n = input.nextInt();

        try {
            if (n == 0) {
                throw new ArithmeticException("/ by zero");
            } else {
                int costPerDay = cost / n;
                System.out.println("Cost per day of the item is " + costPerDay);
            }
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
