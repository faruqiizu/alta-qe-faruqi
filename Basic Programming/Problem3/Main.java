import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //input 6, output (1,2,3,6)
        //input 20, output (1,2,4,5,10,20)

        Scanner input = new Scanner(System.in);
        System.out.println("Bilangan Faktor : ");

        int nilai = input.nextInt ();
        System.out.println("bilangannya : ");

        int tambah = 0;
        for (int i=0; i<= nilai; i++){
            tambah++;
            if (nilai % tambah == 0)  {
                System.out.println(tambah + "  ");
            }
        }
    }
}