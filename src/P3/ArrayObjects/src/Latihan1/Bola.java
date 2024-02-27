package P3.ArrayObjects.src.Latihan1;

public class Bola {
    public int radius;

    public Bola(){}

    public Bola(int r){
        radius = r;
    }

    public int luasPermukaan(){
        return (int) (4 * 3.14 * (radius * radius));
    }

    public int volume(){
        return (int) ((4/3) * 3.14 * (radius * radius * radius));
    }
}
