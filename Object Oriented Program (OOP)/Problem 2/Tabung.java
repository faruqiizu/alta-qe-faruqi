public class Tabung {
    double jari2;
    double tinggiTab;

    public Tabung(double jari2, double tinggiTab) {
        this.jari2 = jari2;
        this.tinggiTab = tinggiTab;
    }

//    public double hitVolumeTabung() {
//        return ((3.14) * (jari2 * jari2)) * tinggiTab;
//    }

    public double hitVolumeTabung() {
        return Math.ceil((Math.PI) * (jari2*jari2) * (tinggiTab));
    }
}
