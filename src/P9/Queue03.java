package P9;

public class Queue03 {
    int[] data;
    int front, rear, size, max;

    Queue03(int n){
        max = n;
        data = new int[max];
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
            System.out.println("Elemen paling depan: " + data[front]);
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
                System.out.println(data[i] + " ");
                i = (i + 1) % max;
            }
            System.out.println(data[i] + " ");
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

    boolean Enqueue(int dt){
        if (IsFull()) {
            System.out.println("Queue sudah penuh!");
            return true;
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
            return false;
        }
    }

    boolean Dequeue(){
        int dt = 0;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong...");
            return true;
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
            if (dt != 0) {
                System.out.println("Mengeluarkan data " + dt);
            }
        }
        return false;
    }
}
