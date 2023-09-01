import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //persegi
        System.out.println("tentukan sisinya : ");
        int sisi = input.nextInt();

        Persegi persegiA = new Persegi(sisi);
        System.out.println("luas persegi : " + persegiA.hitungLuas());
        System.out.println("keliling persegi : " + persegiA.hitungKeliling());



        //persegi panjang
        System.out.println("masukkan panjang : ");
        int panjang = input.nextInt();

        System.out.println("masukkan lebar : ");
        int lebar = input.nextInt();

        PersegiPanjang persegipanjangA = new PersegiPanjang(panjang, lebar);
        System.out.println("luas persegi panjangnya : " + persegipanjangA.luasPp());
        System.out.println("keliling persegi panjangnya : " + persegipanjangA.kelilingPp());



        //segitiga
        System.out.println("masukkan angka sisi1 : ");
        double sisi1 = input.nextDouble();

        System.out.println("masukkan angka sisi2 : ");
        double sisi2 = input.nextDouble();

        Segitiga segitigapythagoras = new Segitiga(sisi1, sisi2);
        System.out.println("jadi sisi miring yang didapatkan : " + segitigapythagoras.hitungSisiMiring());

    }
}