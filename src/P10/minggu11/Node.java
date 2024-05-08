package P10.minggu11;

public class Node {
    int data;
    Node next;

    Node(){} //default constructor

    Node(int nilai, Node berikutnya){
        data = nilai;
        next = berikutnya;
    }
}
