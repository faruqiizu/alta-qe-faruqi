public class PersegiPanjang {
    int panjang;
    int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int luasPp() {
        return panjang * lebar;
    }

    public int kelilingPp() {
        return (panjang * lebar) * 2;
    }
}
