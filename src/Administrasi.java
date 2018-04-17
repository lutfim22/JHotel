
/**
 * Class Administrasi untuk melakukan kegiatan administrasi JHotel.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.10
 */
public class Administrasi
{
    /**
     * Untuk memproses pemesanan kamar hotel.
     * 
     * @param pesan berisi objek Pesanan
     * @param kamar berisi objek Room
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        kamar.setStatusKamar(StatusKamar.Booked);
        //roomAmbilPesanan(pesan, kamar);
    }

    /*
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Booked);
        //kamar.setPesanan(pesan);
    }
    */

    /*
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
        //kamar.setPesanan(null);
    }
    */
    
    /**
     * untuk melakukan pembatalan pesanan.
     * 
     * @param kamar berisi objek Room
     */
    public static void pesananDibatalkan(Room kamar)
    {
        //Pesanan pesan = kamar.getPesanan();
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        //kamar.setPesanan(null);
        kamar.setStatusKamar(StatusKamar.Vacant);
        //roomLepasPesanan(kamar);
    }
    
    /**
     * untuk menandakan pesanan telah selesai.
     * 
     * @param kamar berisi objek Room
     */
    public static void pesananSelesai(Room kamar)
    {
        //Pesanan pesan = kamar.getPesanan();
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        //kamar.setPesanan(null);
        kamar.setStatusKamar(StatusKamar.Vacant);
        //roomLepasPesanan(kamar);
    }
    
    /**
     * untuk melakukan pembatalan pesanan.
     * 
     * @param pesan berisi objek Pesanan
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        //kamar.setStatusKamar(StatusKamar.Vacant);
        pesan.getRoom().setStatusKamar(StatusKamar.Vacant);
        //roomLepasPesanan(pesan.getRoom());
        
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);  
    }
    
    /**
     * untuk menandakan pesanan telah selesai.
     * 
     * @param pesan berisi objek Pesanan
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        pesan.getRoom().setStatusKamar(StatusKamar.Vacant);
        //roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);
    }
}