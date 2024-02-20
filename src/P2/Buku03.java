package P2;

public class Buku03 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku03(){

    }

    public Buku03(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    
    void tampilInformasi(){
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml){
        if (stok >= jml) {
            stok -= jml;   
        }
    }

    void restock(int jml){
        stok += jml;
    }

    int gantiHarga(int hrg){
        harga = hrg;
        return harga;
    }

    int hitungHargaTotal(int sold){
        int hargaTotal = harga * sold;
        return hargaTotal;
    }

    int hitungDiskon(int sold){
        int hargaTotal = hitungHargaTotal(sold);
        if (hargaTotal > 150000) {
            return 12;
        } else if (hargaTotal > 75000) {
            return 5;
        } else {
            return 0;
        }
    }

    int hitungHargaBayar(int sold){
        int harga = hitungHargaTotal(sold);
        int diskon = hitungDiskon(sold);

        int hargaFinal = harga - (harga * diskon / 100);
        return hargaFinal;
    }
}