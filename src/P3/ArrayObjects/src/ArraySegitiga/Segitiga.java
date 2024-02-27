package P3.ArrayObjects.src.ArraySegitiga;
import java.lang.Math;

public class Segitiga {
    public int alas;
    public int tinggi;

    //Default
    public Segitiga(){}

    //Berparameter
    public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }

    public int hitungLuas(){
        return alas * tinggi / 2;
    }

    public int hitungKeliling(){
        int sisiMiring = (int) Math.sqrt((alas * alas) + (tinggi * tinggi));
        return sisiMiring + alas + tinggi;
    }
}
