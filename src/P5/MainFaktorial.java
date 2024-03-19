package P5;
import P5.Faktorial;
import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc03 = new Scanner(System.in);
        System.out.println("--------------------------");
        System.out.print("Masukkan Jumlah Elemen: ");
        int iJml = sc03.nextInt();

        Faktorial[] fk = new Faktorial[10];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial();
            System.out.println("Masukkan nilai ke-" + (i+1) + ": ");
            fk[i].nilai = sc03.nextInt();
        }

        System.out.println("HASIL - BRUTE FORCE: ");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Nilai penghitungan faktorial menggunakan BRUTE FORCE adalah: " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("HASIL - DIVIDE AND CONQUER: ");
        for (int i = 0; i < iJml; i++) {
            System.out.println("Nilai penghitungan faktorial menggunakan DIVIDE AND CONQUER adalah: " + fk[i].faktorialDC(fk[i].nilai));
        }

        sc03.close();
    }
}
