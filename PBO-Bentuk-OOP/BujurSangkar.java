public class BujurSangkar extends Bentuk {
    private double sisi;

    public BujurSangkar(double sisi, String warna) {
        super("BujurSangkar", warna);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungKeliling() {
        return 4 * sisi;
    }

    public double hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public void printInfo() {
        System.out.println(getNama() + " berwarna " + getWarna()
                + ", sisi = " + sisi
                + ", keliling = " + hitungKeliling()
                + ", luas = " + hitungLuas());
    }
}
