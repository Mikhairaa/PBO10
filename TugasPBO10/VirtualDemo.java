package latihan;

public class VirtualDemo {
    public static void main(String[] args) {

        //mmebuat objek
        Gaji s = new Gaji ("Wahyu", "KUBAR", 3, 5000.00);

        //polymorphic
        Pegawai e = new Gaji ("Prima", "Samarinda",2, 2500.00);

        //memanggil override method mailcheck()
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji--");
        s.mailCheck();
        e.mailCheck();

        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
        s.mailCheck();
    }
    
}
