#pragma once
#include <bits/stdc++.h>
#include "Baterai.cpp"
#include "Chipset.cpp"
#include "Layar.cpp"

using namespace std;

// Class Laptop - Parent Class (Inheritance & Composition)
// Relasi: HAS-A dengan Baterai, Chipset, Layar (Composition)
class Laptop{
    private:
        // Atribut private untuk encapsulation
        string merk;        // Merk laptop (ASUS, HP, dll)
        string nama;        // Nama model laptop
        int harga;          // Harga laptop dalam Rupiah
        int ram;            // Kapasitas RAM dalam GB
        int storage;        // Kapasitas storage dalam GB
        Baterai baterai;    // Object Baterai (Composition - HAS-A)
        Chipset chipset;    // Object Chipset (Composition - HAS-A)
        Layar layar;        // Object Layar (Composition - HAS-A)
    
    public:
        // Konstruktor default
        Laptop(){
        }
        
        // Konstruktor dengan parameter untuk inisialisasi objek
        Laptop(string merk, string nama, int harga, int ram, int storage, Baterai baterai, Chipset chipset, Layar layar){
            this->merk = merk;
            this->nama = nama;
            this->harga = harga;
            this->ram = ram;
            this->storage = storage;
            this->baterai = baterai;    // Composition - Laptop memiliki Baterai
            this->chipset = chipset;    // Composition - Laptop memiliki Chipset
            this->layar = layar;        // Composition - Laptop memiliki Layar
        }
        
        // Setter untuk mengubah nilai merk
        void setMerk(string merk){
            this->merk = merk;
        }
        
        // Setter untuk mengubah nilai nama
        void setNama(string nama){
            this->nama = nama;
        }
        
        // Setter untuk mengubah nilai harga
        void setHarga(int harga){
            this->harga = harga;
        }
        
        // Setter untuk mengubah nilai RAM
        void setRam(int ram){
            this->ram = ram;
        }
        
        // Setter untuk mengubah nilai storage
        void setStorage(int storage){
            this->storage = storage;
        }
        
        // Setter untuk mengubah object baterai
        void setBaterai(Baterai baterai){
            this->baterai = baterai;
        }
        
        // Setter untuk mengubah object chipset
        void setChipset(Chipset chipset){
            this->chipset = chipset;
        }
        
        // Setter untuk mengubah object layar
        void setLayar(Layar layar){
            this->layar = layar;
        }
        
        // Getter untuk mendapatkan merk laptop
        string getMerk(){
            return this->merk;
        }
        
        // Getter untuk mendapatkan nama laptop
        string getNama(){
            return this->nama;
        }
        
        // Getter untuk mendapatkan harga laptop
        int getHarga(){
            return this->harga;
        }
        
        // Getter untuk mendapatkan RAM laptop
        int getRam(){
            return this->ram;
        }
        
        // Getter untuk mendapatkan storage laptop
        int getStorage(){
            return this->storage;
        }
        
        // Getter untuk mendapatkan object baterai
        Baterai getBaterai(){
            return this->baterai;
        }
        
        // Getter untuk mendapatkan object chipset
        Chipset getChipset(){
            return this->chipset;
        }
        
        // Getter untuk mendapatkan object layar
        Layar getLayar(){
            return this->layar;
        }
        
        // Destruktor untuk membersihkan memori
        ~Laptop(){
        }
};