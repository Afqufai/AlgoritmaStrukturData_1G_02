package jobsheet6;

public class HotelService {
    Hotel[] rooms = new Hotel[5];
    int data = 0;

    void tambah(Hotel h){
        if (data < rooms.length) {
            rooms[data] = h;
            data++;
        } else {
            System.out.println("Data Mencapai Limit!!!");
        }
    }

    void tampilAll(){
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Nama Hotel: " + rooms[i].nama);
            System.out.println("Kota: " + rooms[i].kota);
            System.out.println("Harga: " + rooms[i].harga);
            System.out.println("Rating: " + rooms[i].bintang);
            System.out.println("====================================");
        }
    }

    //Bubble Sort untuk Harga (Asending)
    void bubbleSortH(){
        for (int i = 0; i < (rooms.length - 1); i++) {
            for (int j = 1; j < (rooms.length - i); j++) {
                if (rooms[j].harga < rooms[j-1].harga){
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }

    //Bubble Sort untuk Rating (Descending)
    void bubbleSortB(){
        for (int i = 0; i < (rooms.length - 1); i++) {
            for (int j = 1; j < (rooms.length - i); j++) {
                if (rooms[j].bintang > rooms[j-1].bintang){
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j-1];
                    rooms[j-1] = temp;
                }
            }
        }
    }
    
    void selectionSortH(){
        for (int i = 0; i < (rooms.length - 1); i++) {
            int cheapest = i;
            for (int j = (i+1); j < rooms.length; j++) {
                if (rooms[j].harga < rooms[cheapest].harga) {
                    cheapest = j;
                }
            }
            Hotel temp = rooms[cheapest];
            rooms[cheapest] = rooms[i];
            rooms[i] = temp;
        }
    }

    void selectionSortB(){
        for (int i = 0; i < (rooms.length - 1); i++) {
            int highest = i;
            for (int j = (i+1); j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[highest].bintang) {
                    highest = j;
                }
            }
            Hotel temp = rooms[highest];
            rooms[highest] = rooms[i];
            rooms[i] = temp;
        }
    }
}
