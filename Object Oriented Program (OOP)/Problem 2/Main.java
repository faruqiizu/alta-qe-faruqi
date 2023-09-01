import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        //kubus
//        System.out.println("tentukan sisinya : ");
//        int sisi = input.nextInt();
//
//        Kubus kubusA = new Kubus(sisi);
//        System.out.println("volume kubus : " + kubusA.hitVolumeKubus());
//
//        //balok
//        System.out.println("tentukan panjang : ");
//        int panjang = input.nextInt();
//
//        System.out.println("tentukan lebar : ");
//        int lebar = input.nextInt();
//
//        System.out.println("tentukan tinggi : ");
//        int tinggiBal = input.nextInt();
//
//        Balok balokA = new Balok(panjang, lebar, tinggiBal);
//        System.out.println("volume balok : " + balokA.hitVolumeBalok());

        //tabung
        System.out.println("tentukan jari2 : ");
        int jari2 = input.nextInt();

        System.out.println("tentukan tinggi : ");
        int tinggiTab = input.nextInt();

        Tabung tabungA = new Tabung(jari2, tinggiTab);
        System.out.println("volume tabung : " + tabungA.hitVolumeTabung());

    }
}