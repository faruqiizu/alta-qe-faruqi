public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int hitungLuas() {
        return sisi * sisi;
    }

    public int hitungKeliling(){
        return sisi * 4;
    }
}
