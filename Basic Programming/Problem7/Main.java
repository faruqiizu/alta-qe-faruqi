import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, n;
        float jumlah, x, rata;
        System.out.print ("Masukkan Angka: ");

        n = input.nextInt();
        jumlah = 0;
        i = 1;

        while ( i <= n ){
            System.out.print ("Angka mean-nya : "+i+": ");
            x = input.nextFloat ();
            jumlah += x;
            i++;
        }

        rata = jumlah / n;
        
        System.out.println ("Rata-rata: " + rata);
        System.out.println ("Jumlah: " + jumlah);
    }
}

