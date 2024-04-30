package P8;

public class StackKonversi03 {
    int size, top;
    int[] tumpukanBiner;

    StackKonversi03(){
        this.size = 32; //32 Bit...
        tumpukanBiner = new int[size];
        top = -1;
    }

    boolean isEmpty(){
        return top == -1;
    }

    boolean isFull(){
        return top == size - 1;
    }

    void push(int data){
        if (isFull()) {
            System.out.println("Stack penuh!");
        } else {
            top++;
            tumpukanBiner[top] = data;
        }
    }

    int pop(){
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}
