package P9.Praktikum2;

public class Queue03 {
    Nasabah03[] data;
    int front, rear, size, max;

    Queue03(int n){
        max = n;
        data = new Nasabah03[max];
        size = 0;
        front = rear = -1;
    }

    boolean IsEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean IsFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    void peek(){
        if (!IsEmpty()) {
            System.out.println("Elemen paling depan: " + data[front].norek + " " + data[front].nama + " " + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
        } else {
            System.out.println("Queue masih kosong!");
        }
    }

    void peekRear(){
        if (!IsEmpty()) {
            System.out.println("Elemen paling belakang: " + data[rear].norek + " " + data[rear].nama + " " + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
        } else {
            System.out.println("Queue masih kosong!");
        }
    }

    void print(){
        if (IsEmpty()) {
            System.out.println("Queue masih kosong!");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
                i = (i + 1) % max;
            }
            System.out.println(data[i].norek + " " + data[i].nama + " " + data[i].alamat + " " + data[i].umur + " " + data[i].saldo);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    void clear(){
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue telah dikosongkan!");
        } else {
            System.out.println("Queue masih kosong...");
        }
    }

    void Enqueue(Nasabah03 dt){
        if (IsFull()) {
            System.out.println("Queue sudah penuh!");
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    Nasabah03 Dequeue(){
        Nasabah03 dt = new Nasabah03();
        if (IsEmpty()) {
            System.out.println("Queue masih kosong...");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return dt;
    }
}
