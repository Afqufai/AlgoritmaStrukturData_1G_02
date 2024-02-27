package P3.ArrayObjects.src.Latihan1;
import P3.ArrayObjects.src.Latihan1.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc03 = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Kerucut: ");
        int jumKer = sc03.nextInt();
        Kerucut[] arrKerucuts = new Kerucut[jumKer];
        System.out.print("Masukkan Jumlah Limas Segiempat: ");
        int jumLim = sc03.nextInt();
        LimasSegitempat[] arrLimas = new LimasSegitempat[jumLim];
        System.out.print("Masukkan Jumlah Bola: ");
        int jumBola = sc03.nextInt();
        Bola[] arrBola = new Bola[jumBola];

        for (int i = 0; i < arrKerucuts.length; i++) {
            System.out.println("Kerucut ke-" + i);
            System.out.print("Masukkan Ukuran Radius Kerucut: ");
            int rad = sc03.nextInt();
            System.out.print("Masukkan Ukuran Sisi Miring: ");
            int sm = sc03.nextInt();
            arrKerucuts[i] = new Kerucut(rad, sm);
        }

        for (int i = 0; i < arrLimas.length; i++) {
            System.out.println("Limas ke-" + i);
            System.out.print("Masukkan Panjang Sisi: ");
            int sisi = sc03.nextInt();
            System.out.print("Masukkan Ukuran Tinggi: ");
            int tinggi = sc03.nextInt();
            arrLimas[i] = new LimasSegitempat(sisi, tinggi);
        }

        for (int i = 0; i < arrBola.length; i++) {
            System.out.println("Bola ke-" + i);
            System.out.print("Masukkan Radius: ");
            int rad = sc03.nextInt();
            arrBola[i] = new Bola(rad);
        }

        //Display
        for (int i = 0; i < arrKerucuts.length; i++) {
            System.out.println("Kerucut ke-" + i + " dengan luas " + arrKerucuts[i].luasPermukaan() + " dan volume " + arrKerucuts[i].volume());
        }
        for (int i = 0; i < arrLimas.length; i++) {
            System.out.println("Limas ke-" + i + " dengan luas " + arrLimas[i].luasPermukaan() + " dan volume " + arrLimas[i].volume());
        }
        for (int i = 0; i < arrBola.length; i++) {
            System.out.println("Bola ke-" + i + " dengan luas " + arrBola[i].luasPermukaan() + " dan volume " + arrBola[i].volume());
        }

        sc03.close();
    }
}
