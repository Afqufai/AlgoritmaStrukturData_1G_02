package jobsheet6;
import java.util.Scanner;

public class MainHotel {
    public static void main(String[] args) {
        HotelService list = new HotelService();
        Scanner sc03 = new Scanner(System.in);
        Hotel h1 = new Hotel("Hotel Alpha", "Medan", 750000, (byte) 4);
        Hotel h2 = new Hotel("Hotel Beta", "Jakarta", 530000, (byte) 3);
        Hotel h3 = new Hotel("Hotel Delta", "Malang", 673000, (byte) 4);
        Hotel h4 = new Hotel("Hotel Gamma", "Bogor", 1525000, (byte) 2);
        Hotel h5 = new Hotel("Hotel Omega", "Jogjakarta", 1450000, (byte) 5);

        list.tambah(h1);
        list.tambah(h2);
        list.tambah(h3);
        list.tambah(h4);
        list.tambah(h5);

        System.out.println("Program Database Hotel");
        System.out.println("====================================");
        list.tampilAll();
        System.out.println("Filter Pencarian:");
        System.out.println("1. Harga terendah ke tertinggi");
        System.out.println("2. Rating terbaik ke terburuk");

        boolean chosen = false;
        do {
            System.out.print(">> ");
            int selector = sc03.nextInt();
            System.out.println("====================================");
            if (selector == 1) {
                System.out.println("Dengan metode apa?");
                System.out.println("1. Bubble Sorting");
                System.out.println("2. Selection Sort");
                int selectorin = sc03.nextInt();
                if (selectorin == 1) {
                    chosen = true;
                    list.bubbleSortH();
                    list.tampilAll();
                } else if (selectorin == 2){
                    chosen = true;
                    list.selectionSortH();
                    list.tampilAll();
                } else {
                    System.out.println("Input Invalid");
                    System.out.println("====================================");
                }
            } else if (selector == 2) {
                System.out.println("Dengan metode apa?");
                System.out.println("1. Bubble Sorting");
                System.out.println("2. Selection Sort");
                int selectorin = sc03.nextInt();
                if (selectorin == 1) {
                    chosen = true;
                    list.bubbleSortB();
                    list.tampilAll();
                } else if (selectorin == 2){
                    chosen = true;
                    list.selectionSortB();
                    list.tampilAll();
                } else {
                    System.out.println("Input Invalid");
                    System.out.println("====================================");
                }
            } else {
                System.out.println("Input Invalid");
                System.out.println("====================================");
            }
        } while (chosen == false);

        sc03.close();
    }
}
