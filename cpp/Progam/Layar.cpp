#include <bits/stdc++.h>
using namespace std;

// Class Layar - Component untuk Laptop (Composition)
class Layar{
    private:
        // Atribut private untuk encapsulation
        string jenis;          // Jenis layar (IPS, OLED, dll)
        string resolusi;       // Resolusi layar (1920x1080, dll)
        bool touchscreen;      // Status touchscreen (true/false)
    
    public:
        // Konstruktor default
        Layar(){
        }
        
        // Konstruktor dengan parameter untuk inisialisasi objek
        Layar(string jenis, string resolusi, bool touchscreen){
            this->jenis = jenis;
            this->resolusi = resolusi;
            this->touchscreen = touchscreen;
        }
        
        // Setter untuk mengubah nilai jenis layar
        void setJenis(string jenis){
            this->jenis = jenis;
        }
        
        // Setter untuk mengubah nilai resolusi
        void setResolusi(string resolusi){
            this->resolusi = resolusi;
        }
        
        // Setter untuk mengubah status touchscreen
        void setTouchscreen(bool touchscreen){
            this->touchscreen = touchscreen;
        }
        
        // Getter untuk mendapatkan jenis layar
        string getJenis(){
            return this->jenis;
        }
        
        // Getter untuk mendapatkan resolusi layar
        string getResolusi(){
            return this->resolusi;
        }
        
        // Getter untuk mendapatkan status touchscreen
        bool getTouchscreen(){
            return this->touchscreen;
        }
        
        // Destruktor untuk membersihkan memori
        ~Layar(){
        }
};