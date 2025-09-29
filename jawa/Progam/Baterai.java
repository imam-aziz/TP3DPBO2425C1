// Class Baterai - Component untuk Laptop (Composition)
public class Baterai {
    // Atribut private untuk encapsulation
    private String jenis;      // Jenis baterai (Li-ion, Li-Polymer, dll)
    private int kapasitas;     // Kapasitas dalam Wh
    
    // Konstruktor default
    public Baterai() {
    }
    
    // Konstruktor dengan parameter untuk inisialisasi objek
    public Baterai(String jenis, int kapasitas) {
        this.jenis = jenis;
        this.kapasitas = kapasitas;
    }
    
    // Setter untuk mengubah nilai jenis baterai
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Setter untuk mengubah nilai kapasitas
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    
    // Getter untuk mendapatkan jenis baterai
    public String getJenis() {
        return this.jenis;
    }
    
    // Getter untuk mendapatkan kapasitas baterai
    public int getKapasitas() {
        return this.kapasitas;
    }
}