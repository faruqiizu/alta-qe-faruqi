import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static boolean isprimeNumber(int number){
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= number/2; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan angka : ");

        int number = scanner.nextInt();

        if (isprimeNumber(number)) {
            System.out.println(number + " adalah bilangan prima");
        } else {
            System.out.printf(number + " bukan bilangan prima");
        }
    }

}