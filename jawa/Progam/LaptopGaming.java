// Class LaptopGaming - Child Class (Inheritance dari Laptop)
// Relasi: IS-A (LaptopGaming adalah Laptop)
public class LaptopGaming extends Laptop {
    // Atribut tambahan khusus untuk laptop gaming
    private String dedicatedGPU;      // GPU khusus (NVIDIA, AMD)
    private boolean keyboardRGB;      // Status keyboard RGB (true/false)
    private String coolingSystem;     // Sistem pendingin
    
    // Konstruktor default
    public LaptopGaming() {
    }
    
    // Konstruktor dengan parameter
    // Memanggil konstruktor parent (Laptop) menggunakan super()
    public LaptopGaming(String merk, String nama, int harga, int ram, int storage, Baterai baterai, Chipset chipset, Layar layar, String dedicatedGPU, boolean keyboardRGB, String coolingSystem) {
        super(merk, nama, harga, ram, storage, baterai, chipset, layar);
        // Inisialisasi atribut khusus LaptopGaming
        this.dedicatedGPU = dedicatedGPU;
        this.keyboardRGB = keyboardRGB;
        this.coolingSystem = coolingSystem;
    }
    
    // Setter untuk mengubah nilai GPU
    public void setDedicatedGPU(String dedicatedGPU) {
        this.dedicatedGPU = dedicatedGPU;
    }
    
    // Setter untuk mengubah status keyboard RGB
    public void setKeyboardRGB(boolean keyboardRGB) {
        this.keyboardRGB = keyboardRGB;
    }
    
    // Setter untuk mengubah sistem pendingin
    public void setCoolingSystem(String coolingSystem) {
        this.coolingSystem = coolingSystem;
    }
    
    // Getter untuk mendapatkan GPU
    public String getDedicatedGPU() {
        return this.dedicatedGPU;
    }
    
    // Getter untuk mendapatkan status keyboard RGB
    public boolean getKeyboardRGB() {
        return this.keyboardRGB;
    }
    
    // Getter untuk mendapatkan sistem pendingin
    public String getCoolingSystem() {
        return this.coolingSystem;
    }
}