public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Mobil mobil = new Mobil("Nissan", 2015, "Silver", 230);
        Mahasiswa mahasiswa = new Mahasiswa("Alman Faluthi", "C202342423", "Teknik Elektro",4);
        Buku buku = new Buku("Belajar Membangun WEB", "Alman", 2030, 300);
        PersegiPanjang persegiPanjang = new PersegiPanjang(5, 2);


        // Inisiasi Class Mobil
        mobil.tampilInformasi();
        mobil.percepat(70);
        mobil.tampilInformasi();

        // Inisiasi Class Mahasiswa
        mahasiswa.tampilInformasi();
        mahasiswa.ubahNama("Randy Azhar");
        mahasiswa.tampilInformasi();

        // Inisiasi Class Buku 
        buku.tampilInformasi();
        buku.tambahHalaman(40);
        buku.tampilInformasi();

        // Inisiasi Class PersegiPanjang
       System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas());
       System.out.println("Keliling Persegi Panjang: " + persegiPanjang.hitungKeliling());
    }

}
