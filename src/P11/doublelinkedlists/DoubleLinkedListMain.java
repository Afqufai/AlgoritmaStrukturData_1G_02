package P11.doublelinkedlists;

public class DoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        //Percobaan 1 + 3
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================================");
        System.out.println("Data awal pada double linked list ini adalah: " + dll.getFirst());
        System.out.println("Data terakhir pada linked list adalah: " + dll.getLast());
        System.out.println("Data pada index ke-1 di linked list adalah: " + dll.get(1));

        //Percobaan 1
        dll.clear();
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================================");

        //Percobaan 2
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size: " + dll.size());
        System.out.println("===========================================");
    }
}
