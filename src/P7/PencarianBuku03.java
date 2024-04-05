package P7;

public class PencarianBuku03 {
    Buku03[] listBk = new Buku03[5];
    int idx = 0;

    void tambah(Buku03 m){
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!!");
        }
    }
    
    void tampil(){
        for (Buku03 m : listBk) {
            m.tampilDataBuku();
        }
    }

    int FindSeqSearch(int cari){
        int posisi = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                posisi = i;
                break;
            } else {
                posisi = -1;
            }
        }
        return posisi;
    }

    int FindBinarySearch(int cari, int left, int right){
        int mid = (left + right) / 2;
        if (cari == listBk[mid].kodeBuku){
            return mid;
        } else if (cari < listBk[mid].kodeBuku){
            return FindBinarySearch(cari, left, mid - 1);
        } else if (cari > listBk[mid].kodeBuku){
            return FindBinarySearch(cari, mid + 1, right);
        } else {
            return -1;
        }
    }
    
    Buku03 FindBuku(int cari){
        int pos = 0;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku == cari) {
                pos = i;
                break;
            }
        }
        return listBk[pos];
    }

    void Tampilposisi(int x, int pos){
        if (pos != -1) {
            System.out.println("===================================");
            System.out.println("Data" + x +" ditemukan pada index " + pos + "!");
        } else {
            System.out.println("Data " + x + " tidak ditemukan!");
        }
    }

    void TampilData(int x, int pos){
        if (pos != -1) {
            System.out.println("Kode Buku: " + x);
            System.out.println("Judul Buku: " + listBk[pos].judulBuku);
            System.out.println("Tahun Terbit: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang: " + listBk[pos].pengarang);
            System.out.println("Stock: " + listBk[pos].stock);
        } else {
            System.out.println("Data " + x + " tidak ditemukan!");
        }
    }
}
