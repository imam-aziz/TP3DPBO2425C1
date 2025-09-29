// Class Laptop - Parent Class (Inheritance & Composition)
// Relasi: HAS-A dengan Baterai, Chipset, Layar (Composition)
public class Laptop {
    // Atribut private untuk encapsulation
    private String merk;        // Merk laptop (ASUS, Lenovo, MSI, dll)
    private String nama;        // Nama model laptop
    private int harga;          // Harga laptop dalam Rupiah
    private int ram;            // Kapasitas RAM dalam GB
    private int storage;        // Kapasitas storage dalam GB
    private Baterai baterai;    // Object Baterai (Composition - HAS-A)
    private Chipset chipset;    // Object Chipset (Composition - HAS-A)
    private Layar layar;        // Object Layar (Composition - HAS-A)
    
    // Konstruktor default
    public Laptop() {
    }
    
    // Konstruktor dengan parameter untuk inisialisasi objek
    public Laptop(String merk, String nama, int harga, int ram, int storage, Baterai baterai, Chipset chipset, Layar layar) {
        this.merk = merk;
        this.nama = nama;
        this.harga = harga;
        this.ram = ram;
        this.storage = storage;
        this.baterai = baterai;    // Composition - Laptop memiliki Baterai
        this.chipset = chipset;    // Composition - Laptop memiliki Chipset
        this.layar = layar;        // Composition - Laptop memiliki Layar
    }
    
    // Setter untuk mengubah nilai merk
    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    // Setter untuk mengubah nilai nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Setter untuk mengubah nilai harga
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    // Setter untuk mengubah nilai RAM
    public void setRam(int ram) {
        this.ram = ram;
    }
    
    // Setter untuk mengubah nilai storage
    public void setStorage(int storage) {
        this.storage = storage;
    }
    
    // Setter untuk mengubah object baterai
    public void setBaterai(Baterai baterai) {
        this.baterai = baterai;
    }
    
    // Setter untuk mengubah object chipset
    public void setChipset(Chipset chipset) {
        this.chipset = chipset;
    }
    
    // Setter untuk mengubah object layar
    public void setLayar(Layar layar) {
        this.layar = layar;
    }
    
    // Getter untuk mendapatkan merk laptop
    public String getMerk() {
        return this.merk;
    }
    
    // Getter untuk mendapatkan nama laptop
    public String getNama() {
        return this.nama;
    }
    
    // Getter untuk mendapatkan harga laptop
    public int getHarga() {
        return this.harga;
    }
    
    // Getter untuk mendapatkan RAM laptop
    public int getRam() {
        return this.ram;
    }
    
    // Getter untuk mendapatkan storage laptop
    public int getStorage() {
        return this.storage;
    }
    
    // Getter untuk mendapatkan object baterai
    public Baterai getBaterai() {
        return this.baterai;
    }
    
    // Getter untuk mendapatkan object chipset
    public Chipset getChipset() {
        return this.chipset;
    }
    
    // Getter untuk mendapatkan object layar
    public Layar getLayar() {
        return this.layar;
    }
}