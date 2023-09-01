import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //jumlah
        Penjumlahan penjumlahanA = new Penjumlahan(3,4);
        penjumlahanA.hasilPerhitungan();

        //kurang
        Pengurangan penguranganA = new Pengurangan(15,4);
        penguranganA.hasilPerhitungan();

        //kali
        Perkalian perkalianA = new Perkalian(10,10);
        perkalianA.hasilPerhitungan();

        //bagi
        Pembagian pembagianA = new Pembagian(12,3);
        pembagianA.hasilPerhitungan();


    }

}