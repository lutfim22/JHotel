
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
     * @param pesan
     * @param kamar
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        roomAmbilPesanan(pesan, kamar);
    }
    
    /**
     * Untuk menandakan pesanan telah diambil.
     * 
     * @param pesan
     * @param kamar
     */
    public static void roomAmbilPesanan(Pesanan pesan, Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Booked);
        kamar.setPesanan(pesan);
    }
    
    /**
     * untuk menandakan pesanan telah dilepas.
     * 
     * @param kamar
     */
    public static void roomLepasPesanan(Room kamar)
    {
        kamar.setStatusKamar(StatusKamar.Vacant);
        kamar.setPesanan(null);
    }
    
    /**
     * untuk melakukan pembatalan pesanan.
     * 
     * @param kamar
     */
    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan = kamar.getPesanan();
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        kamar.setPesanan(null);
        
        roomLepasPesanan(kamar);
    }
    
    /**
     * untuk menandakan pesanan telah selesai.
     * 
     * @param kamar
     */
    public static void pesananSelesai(Room kamar)
    {
        Pesanan pesan = kamar.getPesanan();
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        kamar.setPesanan(null);
        
        roomLepasPesanan(kamar); 
    }
    
    /**
     * untuk melakukan pembatalan pesanan.
     * 
     * @param pesan
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());
        
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);  
    }
    
    /**
     * untuk menandakan pesanan telah selesai.
     * 
     * @param pesan
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        roomLepasPesanan(pesan.getRoom());

        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setRoom(null);
    }
}