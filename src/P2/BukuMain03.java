package P2;
import P2.Buku03;

public class BukuMain03 {
    public static void main(String[] args) {
        Buku03 bk1 = new Buku03();
        bk1.judul = "Today End Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku03 bk2 = new Buku03("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku03 bukuAfrizal = new Buku03("Nijisanji: The Black Vtuber Company", "Afrizal Qurratul Faizin", 72, 420, 25000);
        bukuAfrizal.terjual(3);
        bukuAfrizal.gantiHarga(75000);
        bukuAfrizal.tampilInformasi();
    }
}
