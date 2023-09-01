public class Perkalian extends Perhitungan {
    double angka1;
    double angka2;

    public Perkalian(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    @Override
    public void hasilPerhitungan() {
        super.hasilPerhitungan();
        System.out.println("perkalian : " + (angka1 * angka2));
    }
}
