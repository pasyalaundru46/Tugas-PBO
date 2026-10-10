public class Lingkaran extends Bentuk {
    private double radius;
    private static final double PHI = 3.14;

    public Lingkaran(double radius, String warna) {
        super("Lingkaran", warna);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double hitungKeliling() {
        return 2 * PHI * radius;
    }

    public double hitungLuas() {
        double diameter = 2 * radius;
        return (PHI * diameter * diameter) / 4;
    }

    @Override
    public void printInfo() {
        System.out.println(getNama() + " berwarna " + getWarna()
                + ", radius = " + radius
                + ", keliling = " + hitungKeliling()
                + ", luas = " + hitungLuas());
    }
}
