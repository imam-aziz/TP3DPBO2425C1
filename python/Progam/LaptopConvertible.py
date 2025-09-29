from Laptop import Laptop

# Class LaptopConvertible - Child Class (Inheritance dari Laptop)
# Relasi: IS-A (LaptopConvertible adalah Laptop)
class LaptopConvertible(Laptop):
    # Konstruktor untuk inisialisasi objek
    def __init__(self, merk="", nama="", harga=0, ram=0, storage=0, baterai=None, chipset=None, layar=None, sudutLipat=0, supportStylusPen=False):
        # Memanggil konstruktor parent (Laptop) menggunakan super()
        super().__init__(merk, nama, harga, ram, storage, baterai, chipset, layar)
        
        # Atribut tambahan khusus untuk laptop convertible
        self.__sudutLipat = sudutLipat              # Sudut lipat maksimal (derajat)
        self.__supportStylusPen = supportStylusPen  # Dukungan stylus pen (True/False)
    
    # Setter untuk mengubah nilai sudut lipat
    def setSudutLipat(self, sudutLipat):
        self.__sudutLipat = sudutLipat
    
    # Setter untuk mengubah status dukungan stylus
    def setSupportStylusPen(self, supportStylusPen):
        self.__supportStylusPen = supportStylusPen
    
    # Getter untuk mendapatkan sudut lipat
    def getSudutLipat(self):
        return self.__sudutLipat
    
    # Getter untuk mendapatkan status dukungan stylus
    def getSupportStylusPen(self):
        return self.__supportStylusPen