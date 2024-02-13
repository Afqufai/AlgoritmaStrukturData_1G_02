package P1;
import java.util.Scanner;

public class Array_02 {
    public static void main(String[] args) {
        Scanner sc02 = new Scanner(System.in);
        String[] matKul = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        String[] nilaiHuruf = new String[8];
        double[][] nilai = new double[8][2];
        int[] SKS = {2, 2, 2, 3, 2, 2, 3, 2};
        double ipSemester = 0, totalbobot = 0;
        int totalSKS = 0;

        System.out.println("==============================================");
        System.out.println("Program Penghitung IP Semester");
        System.out.println("==============================================");

        //Input masing-masing MK
        for (int i = 0; i < matKul.length; i++) {
            System.out.print("Masukkan Nilai untuk MK " + matKul[i] + " : ");
            nilai[i][0] = sc02.nextDouble();

            //Konsidi nilai dan set nilai setara
            if (80 < nilai[i][0] && nilai[i][0] <= 100) {
                nilaiHuruf[i] = "A";
                nilai[i][1] = 4.0;
            } else if (73 < nilai[i][0] && nilai[i][0] <= 80) {
                nilaiHuruf[i] = "B+";
                nilai[i][1] = 3.5;
            } else if (65 < nilai[i][0] && nilai[i][0] <= 73) {
                nilaiHuruf[i] = "B";
                nilai[i][1] = 3.0;
            } else if (60 < nilai[i][0] && nilai[i][0] <= 65) {
                nilaiHuruf[i] = "C+";
                nilai[i][1] = 2.5;
            } else if (50 < nilai[i][0] && nilai[i][0] <= 60) {
                nilaiHuruf[i] = "C";
                nilai[i][1] = 2.0;
            } else if (39 < nilai[i][0] && nilai[i][0] <= 50) {
                nilaiHuruf[i] = "D";
                nilai[i][1] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                nilai[i][1] = 0.0;
            }
        }

        //Keluarkan tabel
        System.out.println("==============================================");
        System.out.println("HASIL KONVERSI NILAI");
        System.out.println("==============================================");
        System.out.println("Mata Kuliah \t\t\t\t\tNilai Angka\tNilai Huruf\tBobot Nilai");
        for (int i = 0; i < matKul.length; i++) {
            System.out.printf("%-40s \t%.2f \t\t%s \t\t%.2f\n", matKul[i], nilai[i][0], nilaiHuruf[i], nilai[i][1]);
        }
        System.out.println("==============================================");

        //hitung IP Semester
        for (int i = 0; i < SKS.length; i++) {
            totalSKS += SKS[i];
            totalbobot += nilai[i][1] * SKS[i];
        }
        ipSemester = totalbobot / totalSKS;
        System.out.printf("%-2s %-2.2f", "IP Semester : ", ipSemester);
        
        System.out.println("==============================================");
        sc02.close();
    }
}
