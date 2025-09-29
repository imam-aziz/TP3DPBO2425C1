from LaptopGaming import LaptopGaming
from LaptopConvertible import LaptopConvertible
from Baterai import Baterai
from Chipset import Chipset
from Layar import Layar

# Fungsi untuk menampilkan semua data laptop gaming
# Parameter: list berisi array of object LaptopGaming
def tampilkanLaptopGaming(daftarGaming):
    print("\n============================================== DAFTAR LAPTOP GAMING ==============================================\n")
    # Looping untuk menampilkan setiap object dalam list
    for i in range(len(daftarGaming)):
        print(f"=============== LAPTOP GAMING #{i+1} ===============")
        # Mengakses atribut menggunakan getter
        print(f"Merk              : {daftarGaming[i].getMerk()}")
        print(f"Nama              : {daftarGaming[i].getNama()}")
        print(f"Harga             : Rp {daftarGaming[i].getHarga():,}")
        print(f"RAM               : {daftarGaming[i].getRam()} GB")
        storeg = daftarGaming[i].getStorage()
        if storeg > 1000:
            storeg //= 1024  # Integer division
            print(f"Storage           : {storeg} TB")
        else:
            print(f"Storage           : {storeg} GB")
        print("----------------------------------------------")
        # Mengakses object composition (Baterai)
        print(f"Baterai           : {daftarGaming[i].getBaterai().getJenis()}")
        print(f"Kapasitas Baterai : {daftarGaming[i].getBaterai().getKapasitas()} Wh")
        print("----------------------------------------------")
        # Mengakses object composition (Chipset)
        print(f"Chipset           : {daftarGaming[i].getChipset().getJenis()}")
        print(f"Kecepatan         : {daftarGaming[i].getChipset().getKecepatan()} GHz")
        print("----------------------------------------------")
        # Mengakses object composition (Layar)
        print(f"Layar             : {daftarGaming[i].getLayar().getJenis()}")
        print(f"Resolusi          : {daftarGaming[i].getLayar().getResolusi()}")
        print(f"Touchscreen       : {'Ya' if daftarGaming[i].getLayar().getTouchscreen() else 'Tidak'}")
        print("----------------------------------------------")
        # Mengakses atribut khusus LaptopGaming
        print(f"GPU               : {daftarGaming[i].getDedicatedGPU()}")
        print(f"Keyboard RGB      : {'Ya' if daftarGaming[i].getKeyboardRGB() else 'Tidak'}")
        print(f"Cooling System    : {daftarGaming[i].getCoolingSystem()}")
        print("==============================================")
        print()

# Fungsi untuk menampilkan semua data laptop convertible
# Parameter: list berisi array of object LaptopConvertible
def tampilkanLaptopConvertible(daftarConvertible):
    print("\n========================================== DAFTAR LAPTOP CONVERTIBLE =========================================\n")
    # Looping untuk menampilkan setiap object dalam list
    for i in range(len(daftarConvertible)):
        print(f"============ LAPTOP CONVERTIBLE #{i+1} ============")
        # Mengakses atribut menggunakan getter
        print(f"Merk              : {daftarConvertible[i].getMerk()}")
        print(f"Nama              : {daftarConvertible[i].getNama()}")
        print(f"Harga             : Rp {daftarConvertible[i].getHarga():,}")
        print(f"RAM               : {daftarConvertible[i].getRam()} GB")
        storeg = daftarConvertible[i].getStorage()
        if storeg > 1000:
            storeg //= 1024  # Integer division
            print(f"Storage           : {storeg} TB")
        else:
            print(f"Storage           : {storeg} GB")
        print("----------------------------------------------")
        # Mengakses object composition (Baterai)
        print(f"Baterai           : {daftarConvertible[i].getBaterai().getJenis()}")
        print(f"Kapasitas Baterai : {daftarConvertible[i].getBaterai().getKapasitas()} Wh")
        print("----------------------------------------------")
        # Mengakses object composition (Chipset)
        print(f"Chipset           : {daftarConvertible[i].getChipset().getJenis()}")
        print(f"Kecepatan         : {daftarConvertible[i].getChipset().getKecepatan()} GHz")
        print("----------------------------------------------")
        # Mengakses object composition (Layar)
        print(f"Layar             : {daftarConvertible[i].getLayar().getJenis()}")
        print(f"Resolusi          : {daftarConvertible[i].getLayar().getResolusi()}")
        print(f"Touchscreen       : {'Ya' if daftarConvertible[i].getLayar().getTouchscreen() else 'Tidak'}")
        print("----------------------------------------------")
        # Mengakses atribut khusus LaptopConvertible
        print(f"Sudut Lipat       : {daftarConvertible[i].getSudutLipat()} derajat")
        print(f"Support Stylus    : {'Ya' if daftarConvertible[i].getSupportStylusPen() else 'Tidak'}")
        print("==============================================")
        print()

# Program utama
if __name__ == "__main__":
    # Array of Object - List LaptopGaming
    daftarGaming = []
    
    # Array of Object - List LaptopConvertible
    daftarConvertible = []
    
    # Data awal - 1 Laptop Gaming
    gaming1 = LaptopGaming("Lenovo", "LEGION PRO 7i", 70598000, 32, 1024, 
                          Baterai("Li-Ion", 80), 
                          Chipset("Intel Core Ultra 9 275HX", 5), 
                          Layar("OLED", "WQXGA (2560x1600) 240Hz", False),
                          "NVIDIA GeForce RTX 5090", True, "Legion ColdFront 3.0")
    
    # Tambahkan ke list
    daftarGaming.append(gaming1)
    
    # Data awal - 1 Laptop Convertible
    convertible1 = LaptopConvertible("Lenovo", "YOGA 7 OLED 2-in-1", 19789000, 32, 1024,
                                    Baterai("Li-Ion", 70),
                                    Chipset("AMD Ryzen AI 7 350", 5),
                                    Layar("OLED", "2.8K WQXGA+ (2880x1800) 120Hz", True),
                                    360, True)
    
    # Tambahkan ke list
    daftarConvertible.append(convertible1)
    
    # TAMPILKAN DATA AWAL
    print("\n############################################## DATA AWAL SEBELUM PENAMBAHAN ##############################################\n")

    tampilkanLaptopGaming(daftarGaming)
    tampilkanLaptopConvertible(daftarConvertible)
    
    # PENAMBAHAN DATA BARU (STATIS/HARDCODE)
    print("\n############################################## SEDANG MENAMBAHKAN DATA BARU! ##############################################\n")
    
    # Tambah 1 Laptop Gaming baru
    gaming2 = LaptopGaming("MSI", "Titan 18 HX Dragon Edition Norse Myth", 114999000, 96, 6144,
                          Baterai("Li-Polymer", 99),
                          Chipset("Intel Core Ultra 9 Processor 285HX", 5),
                          Layar("MiniLED", "UHD+ (3840x2400) 120Hz", False),
                          "NVIDIA GeForce RTX 5090", True, "Titan Cooling Vapor Chamber Cooler")
    daftarGaming.append(gaming2)
    
    # Tambah 1 Laptop Convertible baru
    convertible2 = LaptopConvertible("Advan", "360 Stylus Pro", 6189524, 8, 256,
                                    Baterai("Li-Polymer", 51),
                                    Chipset("Intel Core i3-1215U", 4),
                                    Layar("IPS", "FHD (1920x1200)", True),
                                    360, True)
    daftarConvertible.append(convertible2)
    
    print("\nBerhasil menambahkan 1 Laptop Gaming")
    print("Berhasil menambahkan 1 Laptop Convertible\n")
    
    # TAMPILKAN DATA SETELAH PENAMBAHAN
    print("\n############################################## DATA SETELAH PENAMBAHAN DATA ##############################################\n")

    tampilkanLaptopGaming(daftarGaming)
    tampilkanLaptopConvertible(daftarConvertible)