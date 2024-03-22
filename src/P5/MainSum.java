package P5;
import java.util.Scanner;

public class MainSum {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung Keuntungan Total");
        System.out.println("(Satuan juta, Misal 5.9)");
        System.out.println("==============================");
        System.out.print("Masukkan Jumlah Perusahaan yang ingin dihitung keuntungan totalnya: ");

        int corpo = input03.nextInt();
        for (int count = 0; count < corpo; count++) {
            System.out.println("Masukkan data perusahaan ke-" + (count + 1));
            System.out.println("==============================");
            System.out.print("Masukkan Jumlah Bulan: ");
            int elm = input03.nextInt();
            Sum sm = new Sum(elm);

            System.out.println("==============================");
            for (int i = 0; i < sm.elemen; i++) {
                System.out.print("Masukkan keuntungan bulan ke-" + (i+1) + ": ");
                sm.keuntungan[i] = input03.nextDouble();
            }

            System.out.println("Algoritma Brute Force:");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah " + sm.totalBF(sm.keuntungan));
            System.out.println("=======================================");
            System.out.println("Algoritma Divide and Conquer:");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah " + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
        }

        input03.close();
    }
}
