package P3.ArrayObjects.src.Latihan1;

public class LimasSegitempat {
    public int sisi;
    public int tinggi;

    LimasSegitempat(){}

    LimasSegitempat(int s, int t){
        sisi = s;
        tinggi = t;
    }

    public int luasPermukaan(){
        return ((sisi * sisi) + (4 * (1/2 * sisi * tinggi)));
    }

    public double volume() {
        double luasAlas = Math.pow(sisi, 2);
        return (1.0 / 3) * luasAlas * tinggi;
    }    
}
