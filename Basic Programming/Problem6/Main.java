import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int counter = 0;
        for (int i=1 ; i<=n; i++){
            for (int j=1 ; j<=n; j++){
                System.out.print("x ");
            }
            for (int k=1 ; k<=n; k++){
                if (n % 2 != 0)
                System.out.print("y ");
            }
            for (int l=1 ; l<=n; l++) {
                System.out.print("z ");
            }
            System.out.println();
        }
    }
}