package YeniHavayollari;

import java.util.Scanner;

public class Bilet {

    static double biletBirimFiyat = 0.10;
    static double yolcuBiletFiyati;

    public static void varilacakYerBileti() {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Hangi sehre gitmek istiyorsunuz???\nA--> ISTANBUL\nB--> ANKARA\nC--> IZMIR");
            YolcuBilgileri.varilacakYer = scan.next();

            if (YolcuBilgileri.varilacakYer.equalsIgnoreCase("A")) {
                System.out.println("ISTANBUL BILETI TANIMLANDI...");
                yolcuBiletFiyati = biletBirimFiyat * 500;
                break;
            } else if (YolcuBilgileri.varilacakYer.equalsIgnoreCase("B")) {
                System.out.println("ANKARA BILETI TANIMLANDI...");
                yolcuBiletFiyati = biletBirimFiyat * 700;
                break;
            } else if (YolcuBilgileri.varilacakYer.equalsIgnoreCase("C")) {
                System.out.println("IZMIR BILETI TANIMLANDI...");
                yolcuBiletFiyati = biletBirimFiyat * 900;
                break;
            } else {
                System.out.println("Lutfen dogru giris yapiniz");
            }

        }
    }

    public static void yasBileti() {

        if (YolcuBilgileri.yas <= 12 && YolcuBilgileri.yas > 0) {
            System.out.println("0-12 yas araliginda oldugunuz icin %50 indirim kazandiniz");
            yolcuBiletFiyati /= 2;
        } else if (YolcuBilgileri.yas > 12 && YolcuBilgileri.yas <= 24) {
            System.out.println("12-24 ys araliginda oldugunuz icin %10 indirim uygulandi");
            yolcuBiletFiyati *= 0.10;
        } else if (YolcuBilgileri.yas > 65) {
            System.out.println("65 yas ustu oldugunuz icin biletinize %30 indirim uygulandi");
            yolcuBiletFiyati *= 0.30;
        }

    }

    public static void gidisDonusBileti() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gidis donus almak icin 1'e basiniz\nTek yon icin 2'ye basiniz");
        int secim = scan.nextInt();
        if (secim == 1) {
            System.out.println("Gidis donus bileti aldiniz...");
            YolcuBilgileri.gidisDonusMu = true;
        } else if (secim == 2) {
            YolcuBilgileri.gidisDonusMu = false;
        } else {
            System.out.println("Yanlis secim tekrar giriniz");
            gidisDonusBileti();
        }


        if (YolcuBilgileri.gidisDonusMu == true) {
            System.out.println("Gidis donus bileti alduginiz icin %20 indirim kazandiniz");
            yolcuBiletFiyati *= 0.20;
        } else {
            System.out.println("Malesef tek yone indirimimiz yoktur.");
        }
    }

    public static void biletHesapla() {
        varilacakYerBileti();
        yasBileti();
        gidisDonusBileti();
        System.out.println("Bilet tutariniz : " + yolcuBiletFiyati);
    }
}
