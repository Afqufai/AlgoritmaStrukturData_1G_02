package P1;
import java.util.Scanner;

public class Perulangan1 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);

        //Minta input
        System.out.print("Masukkan NIM: ");
        long nim = sc02.nextLong();

        //Cari 2 digit akhir dengan dimodulo 100
        long n = nim % 100;
        if (n < 0) {
            //pencegahan angka negatif, dijadikan positif, lalu ditambah 10 jika n < 10
            n = -n;
            if (n < 10){
                n += 10;
            }
        } else if (n < 10){
            //n ditambah 10 jika n < 10
            n += 10;
        }

        System.out.println("-----------------------------------");
        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; //untuk 6 atau 10
            }
            if (i % 2 == 0) {
                System.out.print(i + " "); //Genap
            } else {
                System.out.print("* "); //Ganjil
            }
        }
        sc02.close();
    }
}
