# Class Chipset - Component untuk Laptop (Composition)
class Chipset:
    # Konstruktor untuk inisialisasi objek
    def __init__(self, jenis="", kecepatan=0):
        # Atribut private (convention menggunakan underscore)
        self.__jenis = jenis          # Jenis chipset (Intel, AMD, dll)
        self.__kecepatan = kecepatan  # Kecepatan dalam GHz
    
    # Setter untuk mengubah nilai jenis chipset
    def setJenis(self, jenis):
        self.__jenis = jenis
    
    # Setter untuk mengubah nilai kecepatan
    def setKecepatan(self, kecepatan):
        self.__kecepatan = kecepatan
    
    # Getter untuk mendapatkan jenis chipset
    def getJenis(self):
        return self.__jenis
    
    # Getter untuk mendapatkan kecepatan chipset
    def getKecepatan(self):
        return self.__kecepatan