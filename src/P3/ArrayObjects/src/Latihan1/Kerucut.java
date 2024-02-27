package P3.ArrayObjects.src.Latihan1;
import java.lang.Math;

public class Kerucut {
    public int radius;
    public int sisiMiring;

    Kerucut(){}

    Kerucut(int r, int sm){
        radius = r;
        sisiMiring = sm;
    }

    public int luasPermukaan(){
        return (int) (3.14 * radius * (radius + sisiMiring));
    }

    public double volume(){
        double tinggi = Math.sqrt((radius * radius) - (sisiMiring * sisiMiring));
        return (1.0 / 3) * (Math.PI * Math.pow(radius, 2)) * tinggi;
    }
}
