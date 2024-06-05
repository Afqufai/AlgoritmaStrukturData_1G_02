package P13;

public class Graph03 {
    int vertex;
    DoubleLinkedList03 list[];
    
    Graph03(int v){
        vertex = v;
        list = new DoubleLinkedList03[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList03();
        }
    }

    void addEdge(int asal, int tujuan, int jarak){
        list[asal].addFirst(tujuan, jarak);
    }

    void degree(int asal) throws Exception{
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex; i++) {
            //INDEGREE
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == asal) {
                    ++totalIn;
                }
            }
            //OUTDEGREE
            for (k = 0; k < list[asal].size(); k++) {
                list[asal].get(k);
            }
            totalOut = k;
        }
        System.out.println("In Degree dari Gedung " + (char) ('A'+asal) + ": " + totalIn);
        System.out.println("Out Degree dari Gedung " + (char) ('A'+asal) + ": " + totalOut);
        System.out.println("Degree dari Gedung " + (char) ('A'+asal) + ": " + (totalIn + totalOut));
    }

    void removeEdge(int asal, int tujuan) throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (i == tujuan) {
                list[asal].remove(tujuan);
            }
        }
    }

    void removeAllEdges(){
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    void printGraph() throws Exception{
        for (int i = 0; i < vertex; i++) {
            if (list[i].size > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println();
    }
}
