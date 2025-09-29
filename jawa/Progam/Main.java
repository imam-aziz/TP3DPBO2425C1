import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;

public class Main {
    // Fungsi untuk menampilkan semua data laptop gaming
    // Parameter: ArrayList berisi array of object LaptopGaming
    public static void tampilkanLaptopGaming(ArrayList<LaptopGaming> daftarGaming) {
        // Format untuk harga dengan separator koma
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        DecimalFormat df = new DecimalFormat("#,###", symbols);
        
        System.out.println("\n============================================== DAFTAR LAPTOP GAMING ==============================================\n");
        // Looping untuk menampilkan setiap object dalam ArrayList
        for (int i = 0; i < daftarGaming.size(); i++) {
            System.out.println("=============== LAPTOP GAMING #" + (i + 1) + " ===============");
            // Mengakses atribut menggunakan getter
            System.out.println("Merk              : " + daftarGaming.get(i).getMerk());
            System.out.println("Nama              : " + daftarGaming.get(i).getNama());
            System.out.println("Harga             : Rp " + df.format(daftarGaming.get(i).getHarga()));
            System.out.println("RAM               : " + daftarGaming.get(i).getRam() + " GB");
            // Konversi storage ke TB jika lebih dari 1000 GB
            int storeg = daftarGaming.get(i).getStorage();
            if (storeg > 1000) {
                storeg /= 1024;
                System.out.println("Storage           : " + storeg + " TB");
            } else {
                System.out.println("Storage           : " + storeg + " GB");
            }
            System.out.println("----------------------------------------------");
            // Mengakses object composition (Baterai)
            System.out.println("Baterai           : " + daftarGaming.get(i).getBaterai().getJenis());
            System.out.println("Kapasitas Baterai : " + daftarGaming.get(i).getBaterai().getKapasitas() + " Wh");
            System.out.println("----------------------------------------------");
            // Mengakses object composition (Chipset)
            System.out.println("Chipset           : " + daftarGaming.get(i).getChipset().getJenis());
            System.out.println("Kecepatan         : " + daftarGaming.get(i).getChipset().getKecepatan() + " GHz");
            System.out.println("----------------------------------------------");
            // Mengakses object composition (Layar)
            System.out.println("Layar             : " + daftarGaming.get(i).getLayar().getJenis());
            System.out.println("Resolusi          : " + daftarGaming.get(i).getLayar().getResolusi());
            System.out.println("Touchscreen       : " + (daftarGaming.get(i).getLayar().getTouchscreen() ? "Ya" : "Tidak"));
            System.out.println("----------------------------------------------");
            // Mengakses atribut khusus LaptopGaming
            System.out.println("GPU               : " + daftarGaming.get(i).getDedicatedGPU());
            System.out.println("Keyboard RGB      : " + (daftarGaming.get(i).getKeyboardRGB() ? "Ya" : "Tidak"));
            System.out.println("Cooling System    : " + daftarGaming.get(i).getCoolingSystem());
            System.out.println("==============================================");
            System.out.println();
        }
    }
    
    // Fungsi untuk menampilkan semua data laptop convertible
    // Parameter: ArrayList berisi array of object LaptopConvertible
    public static void tampilkanLaptopConvertible(ArrayList<LaptopConvertible> daftarConvertible) {
        // Format untuk harga dengan separator koma
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        DecimalFormat df = new DecimalFormat("#,###", symbols);
        
        System.out.println("\n========================================== DAFTAR LAPTOP CONVERTIBLE =========================================\n");
        // Looping untuk menampilkan setiap object dalam ArrayList
        for (int i = 0; i < daftarConvertible.size(); i++) {
            System.out.println("============ LAPTOP CONVERTIBLE #" + (i + 1) + " ============");
            // Mengakses atribut menggunakan getter
            System.out.println("Merk              : " + daftarConvertible.get(i).getMerk());
            System.out.println("Nama              : " + daftarConvertible.get(i).getNama());
            System.out.println("Harga             : Rp " + df.format(daftarConvertible.get(i).getHarga()));
            System.out.println("RAM               : " + daftarConvertible.get(i).getRam() + " GB");
            // Konversi storage ke TB jika lebih dari 1000 GB
            int storeg = daftarConvertible.get(i).getStorage();
            if (storeg > 1000) {
                storeg /= 1024;
                System.out.println("Storage           : " + storeg + " TB");
            } else {
                System.out.println("Storage           : " + storeg + " GB");
            }
            System.out.println("----------------------------------------------");
            // Mengakses object composition (Baterai)
            System.out.println("Baterai           : " + daftarConvertible.get(i).getBaterai().getJenis());
            System.out.println("Kapasitas Baterai : " + daftarConvertible.get(i).getBaterai().getKapasitas() + " Wh");
            System.out.println("----------------------------------------------");
            // Mengakses object composition (Chipset)
            System.out.println("Chipset           : " + daftarConvertible.get(i).getChipset().getJenis());
            System.out.println("Kecepatan         : " + daftarConvertible.get(i).getChipset().getKecepatan() + " GHz");
            System.out.println("----------------------------------------------");
            // Mengakses object composition (Layar)
            System.out.println("Layar             : " + daftarConvertible.get(i).getLayar().getJenis());
            System.out.println("Resolusi          : " + daftarConvertible.get(i).getLayar().getResolusi());
            System.out.println("Touchscreen       : " + (daftarConvertible.get(i).getLayar().getTouchscreen() ? "Ya" : "Tidak"));
            System.out.println("----------------------------------------------");
            // Mengakses atribut khusus LaptopConvertible
            System.out.println("Sudut Lipat       : " + daftarConvertible.get(i).getSudutLipat() + " derajat");
            System.out.println("Support Stylus    : " + (daftarConvertible.get(i).getSupportStylusPen() ? "Ya" : "Tidak"));
            System.out.println("==============================================");
            System.out.println();
        }
    }
    
    // Program utama
    public static void main(String[] args) {
        // Array of Object - ArrayList LaptopGaming
        ArrayList<LaptopGaming> daftarGaming = new ArrayList<>();
        
        // Array of Object - ArrayList LaptopConvertible
        ArrayList<LaptopConvertible> daftarConvertible = new ArrayList<>();
        
        // Data awal - 1 Laptop Gaming
        LaptopGaming gaming1 = new LaptopGaming("Lenovo", "LEGION PRO 7i", 70598000, 32, 1024,
                                                new Baterai("Li-Ion", 80),
                                                new Chipset("Intel Core Ultra 9 275HX", 5),
                                                new Layar("OLED", "WQXGA (2560x1600) 240Hz", false),
                                                "NVIDIA GeForce RTX 5090", true, "Legion ColdFront 3.0");
        
        // Tambahkan ke ArrayList
        daftarGaming.add(gaming1);
        
        // Data awal - 1 Laptop Convertible
        LaptopConvertible convertible1 = new LaptopConvertible("Lenovo", "YOGA 7 OLED 2-in-1", 19789000, 32, 1024,
                                                                new Baterai("Li-Ion", 70),
                                                                new Chipset("AMD Ryzen AI 7 350", 5),
                                                                new Layar("OLED", "2.8K WQXGA+ (2880x1800) 120Hz", true),
                                                                360, true);
        
        // Tambahkan ke ArrayList
        daftarConvertible.add(convertible1);
        
        // TAMPILKAN DATA AWAL
        System.out.println("\n############################################## DATA AWAL SEBELUM PENAMBAHAN ##############################################\n");
        
        tampilkanLaptopGaming(daftarGaming);
        tampilkanLaptopConvertible(daftarConvertible);
        
        // PENAMBAHAN DATA BARU (STATIS/HARDCODE)
        System.out.println("\n############################################## SEDANG MENAMBAHKAN DATA BARU! ##############################################\n");
        
        // Tambah 1 Laptop Gaming baru
        LaptopGaming gaming2 = new LaptopGaming("MSI", "Titan 18 HX Dragon Edition Norse Myth", 114999000, 96, 6144,
                                                new Baterai("Li-Polymer", 99),
                                                new Chipset("Intel Core Ultra 9 Processor 285HX", 5),
                                                new Layar("MiniLED", "UHD+ (3840x2400) 120Hz", false),
                                                "NVIDIA GeForce RTX 5090", true, "Titan Cooling Vapor Chamber Cooler");
        daftarGaming.add(gaming2);
        
        // Tambah 1 Laptop Convertible baru
        LaptopConvertible convertible2 = new LaptopConvertible("Advan", "360 Stylus Pro", 6189524, 8, 256,
                                                                new Baterai("Li-Polymer", 51),
                                                                new Chipset("Intel Core i3-1215U", 4),
                                                                new Layar("IPS", "FHD (1920x1200)", true),
                                                                360, true);
        daftarConvertible.add(convertible2);
        
        System.out.println("\nBerhasil menambahkan 1 Laptop Gaming");
        System.out.println("Berhasil menambahkan 1 Laptop Convertible\n");
        
        // TAMPILKAN DATA SETELAH PENAMBAHAN
        System.out.println("\n############################################## DATA SETELAH PENAMBAHAN DATA ##############################################\n");
        
        tampilkanLaptopGaming(daftarGaming);
        tampilkanLaptopConvertible(daftarConvertible);
    }
}