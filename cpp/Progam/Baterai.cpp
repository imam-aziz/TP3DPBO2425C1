#include <bits/stdc++.h>
using namespace std;

// Class Baterai - Component untuk Laptop (Composition)
class Baterai{
    private:
        // Atribut private untuk encapsulation
        string jenis;      // Jenis baterai (Li-ion, Li-Polymer, dll)
        int kapasitas;     // Kapasitas dalam mAh
    
    public:
        // Konstruktor default
        Baterai(){
        }
        
        // Konstruktor dengan parameter untuk inisialisasi objek
        Baterai(string jenis, int kapasitas){
            this->jenis = jenis;
            this->kapasitas = kapasitas;
        }
        
        // Setter untuk mengubah nilai jenis baterai
        void setJenis(string jenis){
            this->jenis = jenis;
        }
        
        // Setter untuk mengubah nilai kapasitas
        void setKapasitas(int kapasitas){
            this->kapasitas = kapasitas;
        }
        
        // Getter untuk mendapatkan jenis baterai
        string getJenis(){
            return this->jenis;
        }
        
        // Getter untuk mendapatkan kapasitas baterai
        int getKapasitas(){
            return this->kapasitas;
        }
        
        // Destruktor untuk membersihkan memori
        ~Baterai(){
        }
};