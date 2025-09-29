// Class Layar - Component untuk Laptop (Composition)
public class Layar {
    // Atribut private untuk encapsulation
    private String jenis;          // Jenis layar (IPS, OLED, MiniLED, dll)
    private String resolusi;       // Resolusi layar (1920x1080, dll)
    private boolean touchscreen;   // Status touchscreen (true/false)
    
    // Konstruktor default
    public Layar() {
    }
    
    // Konstruktor dengan parameter untuk inisialisasi objek
    public Layar(String jenis, String resolusi, boolean touchscreen) {
        this.jenis = jenis;
        this.resolusi = resolusi;
        this.touchscreen = touchscreen;
    }
    
    // Setter untuk mengubah nilai jenis layar
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    // Setter untuk mengubah nilai resolusi
    public void setResolusi(String resolusi) {
        this.resolusi = resolusi;
    }
    
    // Setter untuk mengubah status touchscreen
    public void setTouchscreen(boolean touchscreen) {
        this.touchscreen = touchscreen;
    }
    
    // Getter untuk mendapatkan jenis layar
    public String getJenis() {
        return this.jenis;
    }
    
    // Getter untuk mendapatkan resolusi layar
    public String getResolusi() {
        return this.resolusi;
    }
    
    // Getter untuk mendapatkan status touchscreen
    public boolean getTouchscreen() {
        return this.touchscreen;
    }
}