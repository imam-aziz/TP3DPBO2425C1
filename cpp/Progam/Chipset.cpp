#include <bits/stdc++.h>
using namespace std;

// Class Chipset - Component untuk Laptop (Composition)
class Chipset{
    private:
        // Atribut private untuk encapsulation
        string jenis;      // Jenis chipset (Intel, AMD, dll)
        int kecepatan;     // Kecepatan dalam GHz
    
    public:
        // Konstruktor default
        Chipset(){
        }
        
        // Konstruktor dengan parameter untuk inisialisasi objek
        Chipset(string jenis, int kecepatan){
            this->jenis = jenis;
            this->kecepatan = kecepatan;
        }
        
        // Setter untuk mengubah nilai jenis chipset
        void setJenis(string jenis){
            this->jenis = jenis;
        }
        
        // Setter untuk mengubah nilai kecepatan
        void setKecepatan(int kecepatan){
            this->kecepatan = kecepatan;
        }
        
        // Getter untuk mendapatkan jenis chipset
        string getJenis(){
            return this->jenis;
        }
        
        // Getter untuk mendapatkan kecepatan chipset
        int getKecepatan(){
            return this->kecepatan;
        }
        
        // Destruktor untuk membersihkan memori
        ~Chipset(){
        }
};