import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input nilai alas : ");
        float alasInput = input.nextInt();
        System.out.println("Input nilai tinggi : ");
        float tinggiInput = input.nextInt();

        double luasSegitiga = (alasInput * tinggiInput) / 0.5;

        System.out.println("Hasil luas segitiga input user = " + luasSegitiga);

    }
}