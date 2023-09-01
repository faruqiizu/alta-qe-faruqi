public class Balok {

    int panjang, lebar, tinggiBal;

    public Balok(int panjang, int lebar, int tinggiBal) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggiBal = tinggiBal;
    }

    public int hitVolumeBalok() {
        return panjang * lebar * tinggiBal;
        }
}
