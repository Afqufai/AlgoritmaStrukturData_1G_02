package P8;
import java.util.Scanner;

public class PostfixMain03 {
    public static void main(String[] args) {
        Scanner sc03 = new Scanner(System.in);
        String P, Q;
        System.out.print("Masukkan ekspresi matematika (Infix): ");
        Q = sc03.nextLine();
        Q = Q.trim();
        Q = Q + ")";

        int total = Q.length();
        Postfix03 post = new Postfix03(total);
        P = post.konversi(Q);
        System.out.println("Postfix: " + P);

        sc03.close();
    }
}
