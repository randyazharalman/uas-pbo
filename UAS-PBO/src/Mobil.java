public class Mobil {
    private String merek;
    private int tahunProduksi;
    private String warna;
    private int kecepatan;

    public Mobil(String merek, int tahunProduksi, String warna, int kecepatan) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    public void percepat(int nilaiKecepatan) {
        kecepatan += nilaiKecepatan;
    }


    public void tampilInformasi() {
        System.out.println("\n==========================");
        System.out.println("Informasi Mobil:");
        System.out.println("Merek: " + merek);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan + " km/h");
        System.out.println("==========================\n");
    }

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Honda", 2018, "Putih", 250);
        

        mobil1.tampilInformasi();
        mobil1.percepat(50);
        mobil1.tampilInformasi();

    }
}
