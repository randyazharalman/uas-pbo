public class PersegiPanjang {
  float panjang, lebar;

  public PersegiPanjang(float panjang, float lebar){
    this.panjang = panjang;
    this.lebar = lebar;
  }

  public float hitungLuas(){
    return panjang * lebar;
  }

  public float hitungKeliling(){
    return 2 * (panjang+lebar);
  }

  public static void main(String[] args) {
    PersegiPanjang persegiPanjang = new PersegiPanjang(5.0f, 3.0f);
    float luas = persegiPanjang.hitungLuas();
    float keliling = persegiPanjang.hitungKeliling();

    System.out.println("Luas Persegi Panjang: " + luas);
    System.out.println("Keliling Persegi Panjang: " + keliling);
}

}
