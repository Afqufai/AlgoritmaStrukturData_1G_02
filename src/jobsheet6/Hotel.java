package jobsheet6;

public class Hotel {
    String nama, kota;
    int harga;
    byte bintang;

    public Hotel(){
        //Default Kontruktor
    }

    public Hotel(String n, String k, int h, byte b){
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }
}
