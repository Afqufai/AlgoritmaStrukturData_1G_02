package P1;

public class Fungsi_02{
    static void pendapatan(int[][] RG, int[] price){
        int hasil = 0;
        for (int i = 0; i < RG.length; i++) {
            for (int j = 0; j < RG[i].length; j++) {
                hasil += RG[i][j] * price[j];
            }
            System.out.println("Pendapatan cabang RoyalGarden ke-" + (i + 1) + " jika semua bunga habis terjual sebesar: " + hasil);
        }
    }

    static void stokJikaMati(int[][] cabang, int[] layu){
        int totalStok = 0;
        //Ambil cabang ke 4
        for (int i = 0; i < layu.length; i++) {
            totalStok += (cabang[3][i] - layu[i]);
        }
        System.out.println("Jika ada pengurangan stok pada cabang ke-4, maka jumlah stok yang tersedia adalah: " + totalStok);
    }

    public static void main(String[] args) {
        //Membuat array stok dan harga
        int[][] RoyalGarden = {
            {10, 5, 15, 7}, {6, 11, 9, 12}, {2, 10, 10, 5}, {5, 7, 12, 9}
        };
        int[] harga = {75000, 50000, 60000, 10000};
        //Array untuk bunga yang mati di cabang ke 4
        int[] bungaMati = {1, 2, 0, 5};

        pendapatan(RoyalGarden, harga);
        stokJikaMati(RoyalGarden, bungaMati);
    }
}