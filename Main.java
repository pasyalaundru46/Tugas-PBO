public class Main {
    public static void main(String[] args) {

        Bentuk bentuk = new Bentuk("Bentuk Dasar", "Merah");
        bentuk.printInfo();

        System.out.println();

        BujurSangkar bujurSangkar = new BujurSangkar(5, "Biru");
        bujurSangkar.printInfo();

        System.out.println();

        Lingkaran lingkaran = new Lingkaran(7, "Hijau");
        lingkaran.printInfo();

        System.out.println();

        Silinder silinder = new Silinder(7, 10, "Kuning");
        silinder.printInfo();
    }
}
