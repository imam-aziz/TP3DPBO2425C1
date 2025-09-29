// Class LaptopConvertible - Child Class (Inheritance dari Laptop)
// Relasi: IS-A (LaptopConvertible adalah Laptop)
public class LaptopConvertible extends Laptop {
    // Atribut tambahan khusus untuk laptop convertible
    private int sudutLipat;           // Sudut lipat maksimal (derajat)
    private boolean supportStylusPen; // Dukungan stylus pen (true/false)
    
    // Konstruktor default
    public LaptopConvertible() {
    }
    
    // Konstruktor dengan parameter
    // Memanggil konstruktor parent (Laptop) menggunakan super()
    public LaptopConvertible(String merk, String nama, int harga, int ram, int storage, Baterai baterai, Chipset chipset, Layar layar, int sudutLipat, boolean supportStylusPen) {
        super(merk, nama, harga, ram, storage, baterai, chipset, layar);
        // Inisialisasi atribut khusus LaptopConvertible
        this.sudutLipat = sudutLipat;
        this.supportStylusPen = supportStylusPen;
    }
    
    // Setter untuk mengubah nilai sudut lipat
    public void setSudutLipat(int sudutLipat) {
        this.sudutLipat = sudutLipat;
    }
    
    // Setter untuk mengubah status dukungan stylus
    public void setSupportStylusPen(boolean supportStylusPen) {
        this.supportStylusPen = supportStylusPen;
    }
    
    // Getter untuk mendapatkan sudut lipat
    public int getSudutLipat() {
        return this.sudutLipat;
    }
    
    // Getter untuk mendapatkan status dukungan stylus
    public boolean getSupportStylusPen() {
        return this.supportStylusPen;
    }
}