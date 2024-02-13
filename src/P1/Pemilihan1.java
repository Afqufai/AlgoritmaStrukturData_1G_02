package P1;
import java.util.Scanner;

public class Pemilihan1 {
    public static void main(String[] args) {
        //Inisialisasi
        Scanner sc02 = new Scanner(System.in) ;
        int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;
        double finalGrade;

        //Meminta Input
        System.out.println("PROGRAM PENGHITUNG NILAI AKHIR MAHASISWA");
        System.out.println("----------------------------------------");
        System.out.print("Input Nilai Tugas: ");
        nilaiTugas = sc02.nextInt();
        System.out.print("Input Nilai Kuis: ");
        nilaiKuis = sc02.nextInt();
        System.out.print("Input Nilai UTS: ");
        nilaiUTS = sc02.nextInt();
        System.out.print("Input Nilai UAS: ");
        nilaiUAS = sc02.nextInt();
        System.out.println("----------------------------------------");

        //Kondisi Nilai Invalid.
        if (nilaiTugas > 100 || nilaiKuis > 100 || nilaiUTS > 100 || nilaiUAS > 100 ||
            nilaiTugas < 0 || nilaiKuis < 0 || nilaiUTS < 0 || nilaiUAS < 0){
            System.out.println("[WARNING] NILAI TIDAK VALID");
            System.out.println("Menutup program...");
            System.out.println("----------------------------------------");
        } else {
            finalGrade = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);
            System.out.println("Nilai Akhir: " + finalGrade);

            //Kondisi Nilai Akhir untuk Nilai Huruf
            if (80 < finalGrade && finalGrade <= 100) {
                System.out.println("Nilai Huruf: A");
                System.out.println("Selamat, anda lulus!");
            } else if (73 < finalGrade && finalGrade <= 80) {
                System.out.println("Nilai Huruf: B+");
                System.out.println("Selamat, anda lulus!");
            } else if (65 < finalGrade && finalGrade <= 73) {
                System.out.println("Nilai Huruf: B");
                System.out.println("Selamat, anda lulus!");
            } else if (60 < finalGrade && finalGrade <= 65) {
                System.out.println("Nilai Huruf: C+");
                System.out.println("Selamat, anda lulus!");
            } else if (50 < finalGrade && finalGrade <= 60) {
                System.out.println("Nilai Huruf: C");
                System.out.println("Selamat, anda lulus!");
            } else if (39 < finalGrade && finalGrade <= 50) {
                System.out.println("Nilai Huruf: D");
                System.out.println("ANDA TIDAK LULUS!");
            } else {
                System.out.println("Nilai Huruf: E");
                System.out.println("ANDA TIDAK LULUS!");
            }
            System.out.println("----------------------------------------");
        }

        sc02.close();
    }
}
