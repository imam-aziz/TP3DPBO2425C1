// Class Chipset - Component untuk Laptop (Composition)
public class Chipset {
    // Atribut private untuk encapsulation
    private String jenis;      // Jenis chipset (Intel, AMD, dll)
    private int kecepatan;     // Kecepatan dalam GHz
    
    // Konstruktor default
    public Chipset() {
    }
    
    // Konstruktor dengan parameter untuk inisialisasi objek
    public Chipset(String jenis, int kecepatan) {
        this.jenis = jenis;
        this.kecepatan = kecepatan;
    }
    
    // Setter untuk mengubah nilai jenis chipset
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Setter untuk mengubah nilai kecepatan
    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    // Getter untuk mendapatkan jenis chipset
    public String getJenis() {
        return this.jenis;
    }
    
    // Getter untuk mendapatkan kecepatan chipset
    public int getKecepatan() {
        return this.kecepatan;
    }
}