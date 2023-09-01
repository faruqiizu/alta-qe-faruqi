public class HargaStandart extends DimensiBarang{
    float beratBarang, hargaStandart;

    public HargaStandart(float p, float l, float t, float beratBarang, float hargaStandart) {
        super(p, l, t);
        this.beratBarang = beratBarang;
        this.hargaStandart = hargaStandart;
    }

    final double dimensiRate = 5000;
    final double beratRate = 5000;

    @Override
    public void volumeBarang() {
        super.volumeBarang();
        System.out.println("ongkos kirimnya : " + (p * l * t));
    }
}
