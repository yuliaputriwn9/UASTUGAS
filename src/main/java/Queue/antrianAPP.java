package Queue;
public class antrianAPP {
    public static void main(String[] args){
        antrian antrian = new antrian(19);
        antrian.masuk(19);
        antrian.lihat();
        System.out.println(" ");
        antrian.masuk(19);
        antrian.lihat();
        System.out.println(" ");
        antrian.masuk(19);
        antrian.lihat();
        System.out.println(" ");
        System.out.println("yang diambil dari antrian = "+antrian.keluar());
        antrian.lihat();
        System.out.println(" ");
        System.out.println("yang diambil dari antrian = "+antrian.keluar());
        antrian.lihat();
    }
}
