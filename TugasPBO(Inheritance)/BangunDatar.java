package tugas_pbo;

public class BangunDatar {
    protected String nama;
 
    // Constructor parent: dipanggil oleh child lewat super
    public BangunDatar(String nama) {
        this.nama = nama;
    }
 
    public String getNama() {
        return nama;
    }
 
    public float luas() {
        return 0;
    }
 
    public float keliling() {
        return 0;
    }
}
 
// Child class Persegi
class Persegi extends BangunDatar {
    private float sisi;
 
    public Persegi(float sisi) {
        super("Persegi");
        this.sisi = sisi;
    }
 
    @Override
    public float luas() {
        return sisi * sisi;
    }
 
    @Override
    public float keliling() {
        return 4 * sisi;
    }
}
 
// Child class Lingkaran
class Lingkaran extends BangunDatar {
    private float r;
 
    public Lingkaran(float r) {
        super("Lingkaran");
        this.r = r;
    }
 
    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }
 
    @Override
    public float keliling() {
        return (float) (2 * Math.PI * r);
    }
}
 
// Child class Persegi panjang
class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;
 
    public PersegiPanjang(float panjang, float lebar) {
        super("Persegi Panjang");
        this.panjang = panjang;
        this.lebar = lebar;
    }
 
    @Override
    public float luas() {
        return panjang * lebar;
    }
 
    @Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}
 
// Child class Segitiga
// Asumsi: segitiga sama kaki (karena hanya ada atribut alas dan tinggi)
class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;
 
    public Segitiga(float alas, float tinggi) {
        super("Segitiga");
        this.alas = alas;
        this.tinggi = tinggi;
    }
 
    @Override
    public float luas() {
        return 0.5f * alas * tinggi;
    }
 
    @Override
    public float keliling() {
        // sisi miring = sqrt((alas/2)^2 + tinggi^2)
        float sisiMiring = (float) Math.sqrt((alas / 2) * (alas / 2) + tinggi * tinggi);
        return alas + 2 * sisiMiring;
    }
    
}
