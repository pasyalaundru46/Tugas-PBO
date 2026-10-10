public class Silinder extends Lingkaran {
    private double tinggi;
    private static final double PHI = 3.14;

    public Silinder(double radius, double tinggi, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return PHI * getRadius() * getRadius() * tinggi;
    }

    public double hitungLuasPermukaan() {
        double luasAlas = hitungLuas();
        double luasSelimut = 2 * PHI * getRadius() * tinggi;
        return (2 * luasAlas) + luasSelimut;
    }

    @Override
    public void printInfo() {
        System.out.println(getNama() + " (Silinder) berwarna " + getWarna()
                + ", tinggi = " + tinggi
                + ", volume = " + hitungVolume()
                + ", luas permukaan = " + hitungLuasPermukaan());
    }
}
