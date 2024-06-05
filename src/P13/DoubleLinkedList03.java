package P13;

public class DoubleLinkedList03 {
    Node03 head;
    int size;

    DoubleLinkedList03(){
        head = null;
        size = 0;
    }

    boolean isEmpty(){
        return head == null;
    }

    void addFirst(int item, int jarak){
        if (isEmpty()) {
            head = new Node03(null, item, jarak, null);
        } else {
            Node03 newNode = new Node03(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    int getJarak(int index) throws Exception{
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks diluar batas!");
        }
        Node03 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    void addLast(int item, int jarak){
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            Node03 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node03 newNode = new Node03(current, item, jarak, null);
            current.next = newNode;
            size++;
        }
    }

    void add(int item, int index, int jarak) throws Exception {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else if (index < 0 || index > size) {
            throw new Exception("Data anda berada di luar indeks!!!");
        } else {
            Node03 current = head;
            int i = 0;
            while (i < index) {
                current = current.next; i++;
            }
            if (current.prev == null) {
                Node03 newNode = new Node03(null, item, jarak, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node03 newNode = new Node03(current.prev, item, jarak, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    int size(){
        return size;
    }

    void clear(){
        head = null; size = 0;
    }

    void print(){
        if (!isEmpty()) {
            Node03 temp = head;
            while (temp != null) {
                System.out.print(temp.data + "\t");
                temp = temp.next;
            }
            System.out.print("\nBerhasil diisi");
            System.out.println();
        } else {
            System.out.println("Linked List Kosong!");
        }
    }

    void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong! Data tidak dapat dihapus!");
        } else if (size == 1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong! Data tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node03 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    void remove(int index){
        Node03 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                break;
            }
            current = current.next;
        }
    }

    int getFirst() throws Exception {
        if (isEmpty()){
            throw new Exception("Linked list kosong...");
        }
        return head.data;
    }

    int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list kosong...");
        } 
        Node03 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp.data;
    }

    int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Linked list kosong...");
        }
        Node03 temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
}
