from Baterai import Baterai
from Chipset import Chipset
from Layar import Layar

# Class Laptop - Parent Class (Inheritance & Composition)
# Relasi: HAS-A dengan Baterai, Chipset, Layar (Composition)
class Laptop:
    # Konstruktor untuk inisialisasi objek
    def __init__(self, merk="", nama="", harga=0, ram=0, storage=0, baterai=None, chipset=None, layar=None):
        # Atribut private (convention menggunakan underscore)
        self.__merk = merk          # Merk laptop (ASUS, Lenovo, MSI, dll)
        self.__nama = nama          # Nama model laptop
        self.__harga = harga        # Harga laptop dalam Rupiah
        self.__ram = ram            # Kapasitas RAM dalam GB
        self.__storage = storage    # Kapasitas storage dalam GB
        self.__baterai = baterai if baterai else Baterai()    # Object Baterai (Composition - HAS-A)
        self.__chipset = chipset if chipset else Chipset()    # Object Chipset (Composition - HAS-A)
        self.__layar = layar if layar else Layar()            # Object Layar (Composition - HAS-A)
    
    # Setter untuk mengubah nilai merk
    def setMerk(self, merk):
        self.__merk = merk
    
    # Setter untuk mengubah nilai nama
    def setNama(self, nama):
        self.__nama = nama
    
    # Setter untuk mengubah nilai harga
    def setHarga(self, harga):
        self.__harga = harga
    
    # Setter untuk mengubah nilai RAM
    def setRam(self, ram):
        self.__ram = ram
    
    # Setter untuk mengubah nilai storage
    def setStorage(self, storage):
        self.__storage = storage
    
    # Setter untuk mengubah object baterai
    def setBaterai(self, baterai):
        self.__baterai = baterai
    
    # Setter untuk mengubah object chipset
    def setChipset(self, chipset):
        self.__chipset = chipset
    
    # Setter untuk mengubah object layar
    def setLayar(self, layar):
        self.__layar = layar
    
    # Getter untuk mendapatkan merk laptop
    def getMerk(self):
        return self.__merk
    
    # Getter untuk mendapatkan nama laptop
    def getNama(self):
        return self.__nama
    
    # Getter untuk mendapatkan harga laptop
    def getHarga(self):
        return self.__harga
    
    # Getter untuk mendapatkan RAM laptop
    def getRam(self):
        return self.__ram
    
    # Getter untuk mendapatkan storage laptop
    def getStorage(self):
        return self.__storage
    
    # Getter untuk mendapatkan object baterai
    def getBaterai(self):
        return self.__baterai
    
    # Getter untuk mendapatkan object chipset
    def getChipset(self):
        return self.__chipset
    
    # Getter untuk mendapatkan object layar
    def getLayar(self):
        return self.__layar