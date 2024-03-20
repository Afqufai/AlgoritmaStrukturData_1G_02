package P5;
import P5.Pangkat;
import java.util.Scanner;

public class MainPangkat{
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah Elemen: ");
        int elemen = input03.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = input03.nextInt();
            System.out.print("Masukkan nilai pangkat: ");
            int pangkat = input03.nextInt();
            png[i] = new Pangkat(nilai, pangkat);
        }

        System.out.println("Dengan metode apa anda ingin melakukan perpengkatan?");
        System.out.println("================================");
        System.out.println("[1] - BRUTE FORCE");
        System.out.println("[2] - DIVIDE AND CONQUER");
        System.out.println("================================");
        System.out.print(">> ");
        int menuSel = input03.nextInt();

        switch (menuSel) {
            case 1:
            System.out.println("HASIL PANGKAT - BRUTE FORCE: ");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            }
                break;
            case 2:
            System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER: ");
            for (int i = 0; i < elemen; i++) {
                System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            }
                break;
            default:
            System.out.println("INVALID INPUT");
                break;
        }
        
        input03.close();
    }
}