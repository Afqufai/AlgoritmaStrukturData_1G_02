package P3.ArrayObjects.src.Latihan2;

public class InfoMahasiswa {
    public String nama;
    public long nim;
    public String gender;
    public double ipk;

    InfoMahasiswa(){}

    InfoMahasiswa(String nama, long nim, String jk, double ip){
        this.nama = nama;
        this.nim = nim;
        gender = jk;
        ipk = ip;
    }

    public void tampilInfo(){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jenis Kelamin: " + gender);
        System.out.println("Nilai IPK: " + ipk);
    }
}
