package P7;
import java.util.Scanner;

public class Bukumain03 {
    public static void main(String[] args) {
        Scanner sc03S = new Scanner(System.in);
        Scanner sc03I = new Scanner(System.in);
    
        PencarianBuku03 data = new PencarianBuku03();
        int jumBuku = 5;

        System.out.println("=======================================");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil:");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("=======================================");
            System.out.print("Masukkan kode buku: ");
            int kode = sc03I.nextInt();
            System.out.print("Masukkan judul buku: ");
            String jud = sc03S.nextLine();
            System.out.print("Masukkan tahun terbit: ");
            int tahun = sc03I.nextInt();
            System.out.print("Masukkan nama pengarang: ");
            String pengarang = sc03S.nextLine();
            System.out.print("Stok: ");
            int stok = sc03I.nextInt();

            Buku03 m = new Buku03(kode, jud, tahun, pengarang, stok);
            data.tambah(m);
        }
        System.out.println("=======================================");
        System.out.println("Data keseluruhan buku: ");
        data.tampil();

        System.out.println("=======================================");
        System.out.println("Pencarian data: ");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode buku: ");
        int cari = sc03I.nextInt();
        System.out.println("Menggunakan sequential searching...");
        //int posisi = data.FindSeqSearch(cari);
        //data.Tampilposisi(cari, posisi);
        Buku03 dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();

        sc03S.close();
        sc03I.close();
    }
}
