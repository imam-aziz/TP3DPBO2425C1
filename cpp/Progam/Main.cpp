#include <bits/stdc++.h>
#include "LaptopGaming.cpp"
#include "LaptopConvertible.cpp"

using namespace std;

void tampilkanLaptopGaming(vector<LaptopGaming> &daftarGaming){
    cout << "\n============================================== DAFTAR LAPTOP GAMING ==============================================\n" << endl;
    for(int i = 0; i < daftarGaming.size(); i++){
        cout << "=============== LAPTOP GAMING #" << (i+1) << " ===============" << endl;
        cout << "Merk              : " << daftarGaming[i].getMerk() << endl;
        cout << "Nama              : " << daftarGaming[i].getNama() << endl;
        cout << "Harga             : Rp " << daftarGaming[i].getHarga() << endl;
        cout << "RAM               : " << daftarGaming[i].getRam() << " GB" << endl;
        int storeg = daftarGaming[i].getStorage();
        if(storeg > 1000)
        {
            storeg /= 1024;
            cout << "Storage           : " << storeg << " TB" << endl;
        }
        else
        {
            cout << "Storage           : " << storeg << " GB" << endl;
        }
        cout << "----------------------------------------------" << endl;
        cout << "Baterai           : " << daftarGaming[i].getBaterai().getJenis() << endl;
        cout << "Kapasitas Baterai : " << daftarGaming[i].getBaterai().getKapasitas() << " Wh" << endl;
        cout << "----------------------------------------------" << endl;
        cout << "Chipset           : " << daftarGaming[i].getChipset().getJenis() << endl;
        cout << "Kecepatan         : " << daftarGaming[i].getChipset().getKecepatan() << " GHz" << endl;
        cout << "----------------------------------------------" << endl;
        cout << "Layar             : " << daftarGaming[i].getLayar().getJenis() << endl;
        cout << "Resolusi          : " << daftarGaming[i].getLayar().getResolusi() << endl;
        cout << "Touchscreen       : " << (daftarGaming[i].getLayar().getTouchscreen() ? "Ya" : "Tidak") << endl;
        cout << "----------------------------------------------" << endl;
        cout << "GPU               : " << daftarGaming[i].getDedicatedGPU() << endl;
        cout << "Keyboard RGB      : " << (daftarGaming[i].getKeyboardRGB() ? "Ya" : "Tidak") << endl;
        cout << "Cooling System    : " << daftarGaming[i].getCoolingSystem() << endl;
        cout << "==============================================" << endl;
        cout << endl;
    }
}

void tampilkanLaptopConvertible(vector<LaptopConvertible> &daftarConvertible){
    cout << "\n========================================== DAFTAR LAPTOP CONVERTIBLE =========================================\n" << endl;
    for(int i = 0; i < daftarConvertible.size(); i++){
        cout << "============ LAPTOP CONVERTIBLE #" << (i+1) << " ============" << endl;
        cout << "Merk              : " << daftarConvertible[i].getMerk() << endl;
        cout << "Nama              : " << daftarConvertible[i].getNama() << endl;
        cout << "Harga             : Rp " << daftarConvertible[i].getHarga() << endl;
        cout << "RAM               : " << daftarConvertible[i].getRam() << " GB" << endl;
        int storeg = daftarConvertible[i].getStorage();
        if(storeg > 1000)
        {
            storeg /= 1024;
            cout << "Storage           : " << storeg << " TB" << endl;
        }
        else
        {
            cout << "Storage           : " << storeg << " GB" << endl;
        }
        cout << "----------------------------------------------" << endl;
        cout << "Baterai           : " << daftarConvertible[i].getBaterai().getJenis() << endl;
        cout << "Kapasitas Baterai : " << daftarConvertible[i].getBaterai().getKapasitas() << " Wh" << endl;
        cout << "----------------------------------------------" << endl;
        cout << "Chipset           : " << daftarConvertible[i].getChipset().getJenis() << endl;
        cout << "Kecepatan         : " << daftarConvertible[i].getChipset().getKecepatan() << " GHz" << endl;
        cout << "----------------------------------------------" << endl;
        cout << "Layar             : " << daftarConvertible[i].getLayar().getJenis() << endl;
        cout << "Resolusi          : " << daftarConvertible[i].getLayar().getResolusi() << endl;
        cout << "Touchscreen       : " << (daftarConvertible[i].getLayar().getTouchscreen() ? "Ya" : "Tidak") << endl;
        cout << "----------------------------------------------" << endl;
        cout << "Sudut Lipat       : " << daftarConvertible[i].getSudutLipat() << " derajat" << endl;
        cout << "Support Stylus    : " << (daftarConvertible[i].getSupportStylusPen() ? "Ya" : "Tidak") << endl;
        cout << "==============================================" << endl;
        cout << endl;
    }
}

int main(){
    // Array of Object - Vector LaptopGaming
    vector<LaptopGaming> daftarGaming;
    
    // Array of Object - Vector LaptopConvertible
    vector<LaptopConvertible> daftarConvertible;
    
    // Data awal - 1 Laptop Gaming
    LaptopGaming gaming1("Lenovo", "LEGION PRO 7i", 70598000, 32, 1024, 
                         Baterai("Li-Ion", 80), 
                         Chipset("Intel Core Ultra 9 275HX", 5), 
                         Layar("OLED", "WQXGA (2560x1600) 240Hz", false),
                         "NVIDIA GeForce RTX 5090", true, "Legion ColdFront 3.0");
    
    // Tambahkan ke vector
    daftarGaming.push_back(gaming1);
    
    // Data awal - 1 Laptop Convertible
    LaptopConvertible convertible1("Lenovo", "YOGA 7 OLED 2-in-1", 19789000, 32, 1024,
                                   Baterai("Li-Ion", 70),
                                   Chipset("AMD Ryzen AI 7 350", 5),
                                   Layar("OLED", "2.8K WQXGA+ (2880x1800) 120Hz", true),
                                   360, true);
    
    // Tambahkan ke vector
    daftarConvertible.push_back(convertible1);
    
    // TAMPILKAN DATA AWAL
    cout << "\n############################################## DATA AWAL SEBELUM PENAMBAHAN ##############################################\n" << endl;

    tampilkanLaptopGaming(daftarGaming);
    tampilkanLaptopConvertible(daftarConvertible);
    
    // PENAMBAHAN DATA BARU (STATIS/HARDCODE)
    cout << "\n############################################## SEDANG MENAMBAHKAN DATA BARU! ##############################################\n" << endl;
    
    // Tambah 1 Laptop Gaming baru
    LaptopGaming gaming2("MSI", "Titan 18 HX Dragon Edition Norse Myth", 114999000, 96, 6144,
                         Baterai("Li-Polymer", 99),
                         Chipset("Intel Core Ultra 9 Processor 285HX", 5),
                         Layar("MiniLED", "UHD+ (3840x2400) 120Hz", false),
                         "NVIDIA GeForce RTX 5090", true, "Titan Cooling Vapor Chamber Cooler");
    daftarGaming.push_back(gaming2);
    
    // Tambah 1 Laptop Convertible baru
    LaptopConvertible convertible2("Advan", "360 Stylus Pro", 6189524, 8, 256,
                                   Baterai("Li-Polymer", 51),
                                   Chipset("Intel Core i3-1215U", 4),
                                   Layar("IPS", "FHD (1920x1200)", true),
                                   360, true);
    daftarConvertible.push_back(convertible2);
    
    cout << "\nBerhasil menambahkan 1 Laptop Gaming" << endl;
    cout << "Berhasil menambahkan 1 Laptop Convertible\n" << endl;
    
    // TAMPILKAN DATA SETELAH PENAMBAHAN
    cout << "\n############################################## DATA SETELAH PENAMBAHAN DATA ##############################################\n" << endl;

    tampilkanLaptopGaming(daftarGaming);
    tampilkanLaptopConvertible(daftarConvertible);

    return 0;
}