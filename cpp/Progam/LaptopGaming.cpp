#pragma once

#include <bits/stdc++.h>
#include "Laptop.cpp"

using namespace std;

// Class LaptopGaming - Child Class (Inheritance dari Laptop)
// Relasi: IS-A (LaptopGaming adalah Laptop)
class LaptopGaming : public Laptop{
    private:
        // Atribut tambahan khusus untuk laptop gaming
        string dedicatedGPU;      // GPU khusus (NVIDIA, AMD)
        bool keyboardRGB;         // Status keyboard RGB (true/false)
        string coolingSystem;     // Sistem pendingin
    
    public:
        // Konstruktor default
        LaptopGaming(){
        }
        
        // Konstruktor dengan parameter
        // Memanggil konstruktor parent (Laptop) menggunakan initialization list
        LaptopGaming(string merk, string nama, int harga, int ram, int storage, Baterai baterai, Chipset chipset, Layar layar, string dedicatedGPU, bool keyboardRGB, string coolingSystem) 
        : Laptop(merk, nama, harga, ram, storage, baterai, chipset, layar){
            // Inisialisasi atribut khusus LaptopGaming
            this->dedicatedGPU = dedicatedGPU;
            this->keyboardRGB = keyboardRGB;
            this->coolingSystem = coolingSystem;
        }
        
        // Setter untuk mengubah nilai GPU
        void setDedicatedGPU(string dedicatedGPU){
            this->dedicatedGPU = dedicatedGPU;
        }
        
        // Setter untuk mengubah status keyboard RGB
        void setKeyboardRGB(bool keyboardRGB){
            this->keyboardRGB = keyboardRGB;
        }
        
        // Setter untuk mengubah sistem pendingin
        void setCoolingSystem(string coolingSystem){
            this->coolingSystem = coolingSystem;
        }
        
        // Getter untuk mendapatkan GPU
        string getDedicatedGPU(){
            return this->dedicatedGPU;
        }
        
        // Getter untuk mendapatkan status keyboard RGB
        bool getKeyboardRGB(){
            return this->keyboardRGB;
        }
        
        // Getter untuk mendapatkan sistem pendingin
        string getCoolingSystem(){
            return this->coolingSystem;
        }
        
        // Destruktor untuk membersihkan memori
        ~LaptopGaming(){
        }
};