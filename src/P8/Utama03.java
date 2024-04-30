package P8;
import java.util.Scanner;

public class Utama03 {
    public static void main(String[] args) {
        Scanner sc03 = new Scanner(System.in);
        boolean quit = false;

        System.out.print("Masukkan kapasitas barang: ");
        int cap = sc03.nextInt();
        Gudang03 gudang = new Gudang03(cap);

        while (!quit) {
            System.out.println("\nMenu");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tampil barang teratas");
            System.out.println("5. Keluar");
            System.out.print("Pilih Operasi: ");
            int menu = sc03.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan kode barang: ");
                    int kode = sc03.nextInt();
                    sc03.nextLine();
                    System.out.print("Masukkan nama barang: ");
                    String nama = sc03.nextLine();
                    System.out.print("Masukkan kategori barang: ");
                    String kategori = sc03.nextLine();
                    Barang03 barangBaru = new Barang03(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    gudang.lihatBarangTeratas();
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silahkan coba lagi");
            }
        }
    }
}
