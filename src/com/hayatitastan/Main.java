package com.hayatitastan;

/**
 * Created by Dr. Hayati TASTAN on 3.10.2022
 **/
public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        System.out.println("Mesaj : " + mesaj);

        String yeniMesaj = mesaj.substring(0,2);
        System.out.println("Mesajdaki ilk iki karakter: " + yeniMesaj);

        ekle();
        sil();
        guncelle();

        int x = 5, y= 6;
        int sayi = topla(x, y);
        System.out.println(x + " + " + y + " =  " + sayi);

        String ulke = "Türkiye";
        String baskent = baskentVer(ulke);
        System.out.println(ulke + " başkenti: " + baskent);
    }

    public static void ekle() {
        System.out.println("Kayıt Eklendi");
    }

    public static void sil() {
        System.out.println("Kayıt Silindi");
    }

    public static void guncelle() {
        System.out.println("Kayıt Güncellendi");
    }

    public static int topla(int a, int b) {
        return a + b;
    }

    public static String baskentVer(String ulkeAdi) {
        String ulkeBaskenti = "";
        switch (ulkeAdi) {
            case "Türkiye":
                ulkeBaskenti = "Ankara";
                break;
            case "Yunanistan":
                ulkeBaskenti = "Atina";
                break;
            default:
                ulkeBaskenti = "Belirsiz";
                break;
        }

        return ulkeBaskenti;
    }
}
