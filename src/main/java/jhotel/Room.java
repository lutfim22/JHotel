package jhotel;
/**
 * Class Room untuk pendataan ruangan pada JHotel.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.05.14
 */
public abstract class Room
{
    // instance variables
    private Hotel hotel;
    private String nomor_kamar;
    private StatusKamar status_kamar;
    public double dailyTariff;

    /**
     * Default constructor for Class Room
     */
    public Room(){}

    /**
     * Overloading Constructor untuk kelas Room
     *
     * @param hotel objek hotel
     * @param nomor_kamar nilai nomor kamar
     */
    public Room(Hotel hotel, String nomor_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        status_kamar = StatusKamar.Vacant;
    }

    /**
     * untuk mendapatkan nilai hotel.
     * 
     * @return hotel
     */
    public Hotel getHotel()
    {
        return hotel;
    }
    
    /**
     * untuk mendapatkan nilai nomor kamar.
     * 
     * @return nomor_kamar
     */
    public String getNomorKamar()
    {
        return nomor_kamar;
    }

    /**
     * untuk mendapatkan nilai tarif.
     * 
     * @return dailyTariff
     */
    public double getDailyTariff()
    {
        return dailyTariff;
    }
    
    /**
     * untuk mengetahui status kamar.
     * 
     * @return status_kamar
     */
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }

    /**
     * abstract method untuk mendapatkan tipe kamar
     *
     */
    public abstract TipeKamar getTipeKamar();
    
    /**
     * untuk menset nilai hotel.
     * 
     * @param hotel objek hotel
     */
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
    
    /**
     * untuk menset nilai nomor kamar.
     * 
     * @param nomor_kamar nilai nomor kamar
     */
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }

    /**
     * untuk menset nilai tarif.
     * 
     * @param dailytariff nilai daily tariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
    
    /**
     * untuk menset nilai status kamar.
     * 
     * @param status_kamar nilai status kamar
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }

    /**
     * Method untuk mengubah objek menjadi String
     *
     * @return string
     */
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this) == null){
            return "\nRoom\n"+
                   "\nNama Hotel    : "+getHotel().getNama()+
                   "\nTipe Kamar    : "+getTipeKamar()+
                   "\nHarga         : "+getDailyTariff()+
                   "\nStatus Kamar  : "+getStatusKamar();
        }
        else{
            return "\nRoom\n"+
                   "\nNama Hotel    : "+getHotel().getNama()+
                   "\nTipe Kamar    : "+getTipeKamar().toString()+
                   "\nHarga         : "+getDailyTariff()+
                   "\nStatus Kamar  : "+getStatusKamar()+
                   "\nPelanggan     : "+DatabasePesanan.getPesananAktif(this).getPelanggan().getNama();
        }
    }
}
