# Class Layar - Component untuk Laptop (Composition)
class Layar:
    # Konstruktor untuk inisialisasi objek
    def __init__(self, jenis="", resolusi="", touchscreen=False):
        # Atribut private (convention menggunakan underscore)
        self.__jenis = jenis              # Jenis layar (IPS, OLED, MiniLED, dll)
        self.__resolusi = resolusi        # Resolusi layar (1920x1080, dll)
        self.__touchscreen = touchscreen  # Status touchscreen (True/False)
    
    # Setter untuk mengubah nilai jenis layar
    def setJenis(self, jenis):
        self.__jenis = jenis
    
    # Setter untuk mengubah nilai resolusi
    def setResolusi(self, resolusi):
        self.__resolusi = resolusi
    
    # Setter untuk mengubah status touchscreen
    def setTouchscreen(self, touchscreen):
        self.__touchscreen = touchscreen
    
    # Getter untuk mendapatkan jenis layar
    def getJenis(self):
        return self.__jenis
    
    # Getter untuk mendapatkan resolusi layar
    def getResolusi(self):
        return self.__resolusi
    
    # Getter untuk mendapatkan status touchscreen
    def getTouchscreen(self):
        return self.__touchscreen