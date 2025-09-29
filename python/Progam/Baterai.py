# Class Baterai - Component untuk Laptop (Composition)
class Baterai:
    # Konstruktor untuk inisialisasi objek
    def __init__(self, jenis="", kapasitas=0):
        # Atribut private (convention menggunakan underscore)
        self.__jenis = jenis          # Jenis baterai (Li-ion, Li-Polymer, dll)
        self.__kapasitas = kapasitas  # Kapasitas dalam Wh
    
    # Setter untuk mengubah nilai jenis baterai
    def setJenis(self, jenis):
        self.__jenis = jenis
    
    # Setter untuk mengubah nilai kapasitas
    def setKapasitas(self, kapasitas):
        self.__kapasitas = kapasitas
    
    # Getter untuk mendapatkan jenis baterai
    def getJenis(self):
        return self.__jenis
    
    # Getter untuk mendapatkan kapasitas baterai
    def getKapasitas(self):
        return self.__kapasitas