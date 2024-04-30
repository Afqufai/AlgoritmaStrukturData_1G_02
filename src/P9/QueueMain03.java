package P9;
import java.util.Scanner;

public class QueueMain03 {
    static void menu(){
        System.out.println("Masukkan operasi yang di inginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("Angka lain untuk keluar");
        System.out.println("====================================");
    }
    public static void main(String[] args) {
        Scanner sc03 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc03.nextInt();
        Queue03 Q = new Queue03(n);

        int pilih = 1;
        boolean overUnderFlow = false;

        do {
            menu();
            pilih = sc03.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc03.nextInt();
                    overUnderFlow = Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    overUnderFlow = Q.Dequeue();
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    break;
            }
        } while (overUnderFlow == false);

        sc03.close();
    }
}
