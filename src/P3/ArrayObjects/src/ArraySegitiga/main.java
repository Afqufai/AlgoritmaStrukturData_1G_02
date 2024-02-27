package P3.ArrayObjects.src.ArraySegitiga;
import P3.ArrayObjects.src.ArraySegitiga.Segitiga;

public class main {
    public static void main(String[] args) {
        Segitiga sgArray[] = new Segitiga[4];
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);

        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Segitiga ke-" + i + " dengan luas " + sgArray[i].hitungLuas() + " dan keliling " + sgArray[i].hitungKeliling());
        }
    }
}
