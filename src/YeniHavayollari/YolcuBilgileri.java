package YeniHavayollari;

import java.util.Scanner;

public class YolcuBilgileri {

    static String isim = "Isim soyisimbelirtilmedi";
    static int yas;
    static String varilacakYer = "Varilacak yer belirtilmedi";
    static boolean gidisDonusMu;

    public YolcuBilgileri(String isim,int yas,String varilacakYer,boolean gidisDonusMu) {
        this.isim=isim;
        this.yas=yas;
        this.varilacakYer=varilacakYer;
        this.gidisDonusMu=gidisDonusMu;
    }

    public static void yolcuGirisKaydi() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isim ve soyisim  giriniz");
        isim = scan.nextLine();
        System.out.println("Lutfen yas giriniz");
        yas=scan.nextInt();

    }

}
