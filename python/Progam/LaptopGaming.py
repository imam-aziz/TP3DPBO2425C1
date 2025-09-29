from Laptop import Laptop

# Class LaptopGaming - Child Class (Inheritance dari Laptop)
# Relasi: IS-A (LaptopGaming adalah Laptop)
class LaptopGaming(Laptop):
    # Konstruktor untuk inisialisasi objek
    def __init__(self, merk="", nama="", harga=0, ram=0, storage=0, baterai=None, chipset=None, layar=None, dedicatedGPU="", keyboardRGB=False, coolingSystem=""):
        # Memanggil konstruktor parent (Laptop) menggunakan super()
        super().__init__(merk, nama, harga, ram, storage, baterai, chipset, layar)
        
        # Atribut tambahan khusus untuk laptop gaming
        self.__dedicatedGPU = dedicatedGPU        # GPU khusus (NVIDIA, AMD)
        self.__keyboardRGB = keyboardRGB          # Status keyboard RGB (True/False)
        self.__coolingSystem = coolingSystem      # Sistem pendingin
    
    # Setter untuk mengubah nilai GPU
    def setDedicatedGPU(self, dedicatedGPU):
        self.__dedicatedGPU = dedicatedGPU
    
    # Setter untuk mengubah status keyboard RGB
    def setKeyboardRGB(self, keyboardRGB):
        self.__keyboardRGB = keyboardRGB
    
    # Setter untuk mengubah sistem pendingin
    def setCoolingSystem(self, coolingSystem):
        self.__coolingSystem = coolingSystem
    
    # Getter untuk mendapatkan GPU
    def getDedicatedGPU(self):
        return self.__dedicatedGPU
    
    # Getter untuk mendapatkan status keyboard RGB
    def getKeyboardRGB(self):
        return self.__keyboardRGB
    
    # Getter untuk mendapatkan sistem pendingin
    def getCoolingSystem(self):
        return self.__coolingSystem