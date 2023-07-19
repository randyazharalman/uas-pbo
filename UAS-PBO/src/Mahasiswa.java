public class Mahasiswa {
  String nama, NIM, jurusan;
  float IPK;

  public Mahasiswa(String nama, String NIM, String jurusan, float IPK) {
    this.nama = nama;
    this.NIM = NIM;
    this.jurusan = jurusan;
    this.IPK = IPK;
  }

  public void ubahNama(String namaBaru) {
    this.nama = namaBaru;
  }
  public void ubahNIM(String nimBaru) {
    this.NIM = nimBaru;
  }
  public void ubahJurusan(String jurusanBaru) {
    this.jurusan = jurusanBaru;
  }

  public void tampilInformasi() {
    System.out.println("\n==========================");
    System.out.println("Informasi Mahasiswa:");
    System.out.println("Nama Mahasiswa: " + nama);
    System.out.println("NIM: " + NIM);
    System.out.println("Jurusan: " + jurusan);
    System.out.println("IPK: " + IPK);
    System.out.println("==========================\n");
  }

  public static void main(String[] args) {
    Mahasiswa mahasiswa1 = new Mahasiswa("Randy", "C2083207014", "PTI",3);

    mahasiswa1.tampilInformasi();
    mahasiswa1.ubahNama("Azhar");
    mahasiswa1.ubahNIM("C2083207000");
    mahasiswa1.ubahJurusan("Teknik Informatika");
    mahasiswa1.tampilInformasi();
  }
}
