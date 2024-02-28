package P3.ArrayObjects.src.Latihan2;
import P3.ArrayObjects.src.Latihan2.InfoMahasiswa;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        InfoMahasiswa[] students = new InfoMahasiswa[3];
        Scanner sc03 = new Scanner(System.in);
        Scanner sc03line = new Scanner(System.in);
        double[] arrIPK = new double[3];

        for (int i = 0; i < students.length; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("Masukkan Nama: ");
            String nama = sc03line.nextLine();
            System.out.print("Masukkan NIM: ");
            long nim = sc03.nextLong();
            System.out.print("Masukkan Jenis Kelamin: ");
            String gender = sc03line.nextLine();
            System.out.print("Masukkan IPK: ");
            double ip = sc03.nextDouble();
            students[i] = new InfoMahasiswa(nama, nim, gender, ip);
        }

        for (int i = 0; i < students.length; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            students[i].tampilInfo();
        }

        for (int i = 0; i < students.length; i++) {
            arrIPK[i] = students[i].ipk;
        }

        InfoMahasiswa info = new InfoMahasiswa();
        System.out.println("Nilai IPK Rata-rata: " + info.averageIP(arrIPK));
        System.out.println("Nilai IPK Tertinggi: " + info.ipkTertinggi(arrIPK));

        sc03.close();
        sc03line.close();
    }
}
