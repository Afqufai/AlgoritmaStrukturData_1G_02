package P8;

public class Gudang03 {
    Barang03[] tumpukan;
    int size, top;

    Gudang03(int kapasitas){
        this.size = kapasitas;
        tumpukan = new Barang03[size];
        top = -1;
    }

    boolean cekPenuh(){
        if (top == size-1) {
            return true;
        } else {
            return false;
        }
    }

    boolean cekKosong(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    void tambahBarang(Barang03 brg){
        if (!cekPenuh()){
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke gudang!");
        } else {
            System.out.println("Gagal! Tumpukan barang di gudang sudah penuh!");
        }
    }

    void ambilBarang(){
        if (!cekKosong()) {
            Barang03 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " berhasil diambil dari gudang!");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
        } else {
            System.out.println("Gagal! Barang tumpukan kosong!");
        }
    }

    Barang03 lihatBarangTeratas(){
        if (!cekKosong()) {
            Barang03 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan kosong...");
            return null;
        }
    }

    void tampilkanBarang(){
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang dalam gudang: ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d: %s (kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang kosong...");
        }
    }

    String konversiDesimalKeBiner(int kode){
        StackKonversi03 stack = new StackKonversi03();
        while (kode != 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
