import java.util.Scanner;

public class perfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a numberdqwdqwdqwdqwdqwdwq: ");
        int number = scanner.nextInt();

        int sumOfDivisors = 0;

        // Sayının bölenlerini bulup toplamını hesapla
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        // Sayının mükemmel olup olmadığını kontrol et
        if (sumOfDivisors == number) {
            System.out.println(number + " is a perfect number.");
        } else {
            System.out.println(number + " is not a perfect number.");
        }

        scanner.close();
    }
}