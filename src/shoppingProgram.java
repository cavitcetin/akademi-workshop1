import java.util.Scanner;

public class shoppingProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many products do you want to buy? ");
        int numberOfProducts = scanner.nextInt();

        double totalAmount = 0;

        for (int i = 1; i <= numberOfProducts; i++) {
            System.out.print("Enter the price of product " + i + ": ");
            double productPrice = scanner.nextDouble();
            totalAmount += productPrice;
        }

        System.out.println("Total shopping amount: $" + totalAmount);

        scanner.close();
    }
}