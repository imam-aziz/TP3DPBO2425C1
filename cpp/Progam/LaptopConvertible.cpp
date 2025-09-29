#pragma once

#include <bits/stdc++.h>
#include "Laptop.cpp"

using namespace std;

// Class LaptopConvertible - Child Class (Inheritance dari Laptop)
// Relasi: IS-A (LaptopConvertible adalah Laptop)
class LaptopConvertible : public Laptop{
    private:
        // Atribut tambahan khusus untuk laptop convertible
        int sudutLipat;           // Sudut lipat maksimal (derajat)
        bool supportStylusPen;    // Dukungan stylus pen (true/false)
    
    public:
        // Konstruktor default
        LaptopConvertible(){
        }
        
        // Konstruktor dengan parameter
        // Memanggil konstruktor parent (Laptop) menggunakan initialization list
        LaptopConvertible(string merk, string nama, int harga, int ram, int storage, Baterai baterai, Chipset chipset, Layar layar, int sudutLipat, bool supportStylusPen) 
        : Laptop(merk, nama, harga, ram, storage, baterai, chipset, layar){
            // Inisialisasi atribut khusus LaptopConvertible
            this->sudutLipat = sudutLipat;
            this->supportStylusPen = supportStylusPen;
        }
        
        // Setter untuk mengubah nilai sudut lipat
        void setSudutLipat(int sudutLipat){
            this->sudutLipat = sudutLipat;
        }
        
        // Setter untuk mengubah status dukungan stylus
        void setSupportStylusPen(bool supportStylusPen){
            this->supportStylusPen = supportStylusPen;
        }
        
        // Getter untuk mendapatkan sudut lipat
        int getSudutLipat(){
            return this->sudutLipat;
        }
        
        // Getter untuk mendapatkan status dukungan stylus
        bool getSupportStylusPen(){
            return this->supportStylusPen;
        }
        
        // Destruktor untuk membersihkan memori
        ~LaptopConvertible(){
        }
};