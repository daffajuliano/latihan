package com.company;

public class Main {

    public static void main(String[] args) {
        // Kasus
            /**
            Ayah akan mencat ulang tembok rumah yang berukuran 146m x 64m. Ayah telah membeli
            5 galon cat berwarna biru. Satu galon cat dapat digunakan untuk mengecat tembok maksimal 10m x 7m.
            Berapakah jumlah galon cat yang dibutuhkan serta berapa jumlah galon cat yang harus dibeli
            untuk menambah kekurangan cattersebut. Sekarang cobalah buat Algoritma dan program Pascal untuk Kasus tersebut!
            **/
        // variable list
            // cat
            short jumlahCat,
                catValPanjang,
                catValLebar;
            // tembok
            short wallSizePanjang,
                    wallSizeLebar;

            int luasTembok, luasCat;

            int catSaatIni, catKurang;

        // Logic Start

        jumlahCat = 5;
        catValPanjang = 10;
        catValLebar = 7;

        wallSizePanjang = 146;
        wallSizeLebar = 64;

        // Menghitung luas tembok dan luas tembok yang bisa di cat oleh 1 galon cat
        luasCat = catValPanjang * catValLebar;
        luasTembok = wallSizePanjang * wallSizeLebar;

        // Menghitung jumlah cat yang dihabiskan dikurangi jumlah galon cat yang tersedia
        catKurang = (luasTembok / luasCat) - jumlahCat;


        System.out.println("Cat Kurang : "+catKurang+" galon lagi");


    }
}
