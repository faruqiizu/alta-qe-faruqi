import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //dimensi barang
        System.out.println("masukkan dimensi barang : ");
        int dimensiBarang = input.nextInt();
        DimensiBarang dimensiBarang1 = new DimensiBarang(5,2,4);
        dimensiBarang1.volumeBarang();

        System.out.println("masukkan berat barang (kg) : ");
        double beratBarang = input.nextDouble();

        System.out.println("ongkirnya : " + HargaStandart);
        double hargaStandart(dimensiBarang, beratBarang)



    }
}