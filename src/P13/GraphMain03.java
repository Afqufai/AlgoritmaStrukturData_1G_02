package P13;
import java.util.Scanner;

public class GraphMain03 {
    public static void main(String[] args) throws Exception {
        Graph03 gedung = new Graph03(6);
        Scanner sc03 = new Scanner(System.in);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        gedung.removeEdge(1, 3);
        gedung.printGraph();

        //PERCOBAAN 1 - PERTANYAAN 5
        for (int i = 0; i < 2; i++) {
            System.out.print("Masukkan gedung asal: ");
            int asal = sc03.nextInt();
            System.out.print("Masukkan gedung tujuan: ");
            int tujuan = sc03.nextInt();
            gedung.cekTetangga(asal, tujuan);
            System.out.println();
        }

        sc03.close();
    }
}
