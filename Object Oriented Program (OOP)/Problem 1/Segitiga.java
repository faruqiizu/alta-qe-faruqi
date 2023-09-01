import java.security.PublicKey;

public class Segitiga {
      double sisi1;
      double sisi2;

    public Segitiga(double sisi1, double sisi2) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
    }

    public double angkaSisi1() {
        return sisi1;
    }

    public double angkaSisi2() {
        return sisi2;
    }

    public double hitungSisiMiring() {
        return Math.sqrt( (Math.pow(sisi1, 2) + Math.pow(sisi2, 2) ) );
    }

}
