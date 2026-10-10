public class Bentuk {
    protected String warna;
    protected String nama;

    public Bentuk(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    public String getNama() {
        return nama;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void printInfo() {
        System.out.println(nama + " berwarna " + warna);
    }
}
