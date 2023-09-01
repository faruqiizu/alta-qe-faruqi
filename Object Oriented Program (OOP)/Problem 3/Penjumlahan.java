public class Penjumlahan extends Perhitungan {
    double angka1, angka2;

    //constructor
    public Penjumlahan(double angka1, double angka2) {
        this.angka1 = angka1;
        this.angka2 = angka2;
    }

    @Override
    public void hasilPerhitungan() {
        super.hasilPerhitungan();
        System.out.println("penjumlahan : " + (angka1 + angka2));
    }

}
