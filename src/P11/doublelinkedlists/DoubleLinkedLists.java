package P11.doublelinkedlists;

public class DoubleLinkedLists {
    Node head;
    int size;

    DoubleLinkedLists(){
        head = null;
        size = 0;
    }

    boolean isEmpty(){
        return head == null;
    }

    void addFirst(int item){
        if (isEmpty()) {
            head = new Node(null, item, null);
        } else {
            Node newNode = new Node(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(int item){
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
            throw new Exception("Data anda berada di luar indeks!!!");
        } else {
            Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next; i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev, item, current);
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
            Node temp = head;
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


}
