
/**
 * Class Room untuk pendataan ruangan pada JHotel.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.10
 */
public abstract class Room
{
    // instance variables
    private Hotel hotel;
    private String nomor_kamar;
    private StatusKamar status_kamar;
    //private Pesanan pesan;
    public double dailyTariff;
    //private String string;
    
    public Room()
    {
        //
    }

    public Room(Hotel hotel, String nomor_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        status_kamar = StatusKamar.Vacant;
    }
    /*
    public Room(Hotel hotel, String nomor_kamar, StatusKamar status_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.status_kamar = status_kamar;
    }
    */
    /*
    /**
     * Constructor for objects of class Room.
     * 
     * @param hotel
     * @param nomor_kamar
     * @param isAvailable
     * @param status_kamar
     */
    /*
    public Room(Hotel hotel, String nomor_kamar, boolean isAvailable, StatusKamar status_kamar)
    {
        // initialise instance variables
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvailable = isAvailable;
        this.status_kamar = status_kamar;
    }
    */
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
     * untuk mengetahui status ketersediaan kamar.
     *
     * @return isAvailable
     */

    
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
     * untuk mendapatkan nilai pesanan.
     *
     * @return pesan
     */
    /*
    public Pesanan getPesanan()
    {
        return pesan;
    }*/
    
    public abstract TipeKamar getTipeKamar();
    
    /**
     * untuk menset nilai hotel.
     * 
     * @param hotel
     */
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
    
    /**
     * untuk menset nilai nomor kamar.
     * 
     * @param nomor_kamar
     */
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }

    /**
     * untuk menentukan status ketersediaan kamar.
     *
     * @param isAvailable
     */


    /**
     * untuk menset nilai tarif.
     * 
     * @param dailytariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
    
    /**
     * untuk menset nilai status kamar.
     * 
     * @param status_kamar
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }
    
    /**
     * untuk menset nilai pesanan.
     *
     *
     */
    /*
    public void setPesanan(Pesanan pesan)
    {
        this.pesan = pesan;
    }*/
    
    public String toString()
    {
        //return null;

        if(DatabasePesanan.getPesanan(this) == null){
            return "\nRoom\n"+
                   "\nNama Hotel    : "+hotel.getNama()+
                   "\nTipe Kamar    : "+getTipeKamar()+
                   "\nHarga         : "+dailyTariff+
                   "\nStatus Kamar  : "+status_kamar;
        }
        else{
            return "\nRoom\n"+
                   "\nNama Hotel    : "+hotel.getNama()+
                   "\nTipe Kamar    : "+getTipeKamar().toString()+
                   "\nHarga         : "+dailyTariff+
                   "\nStatus Kamar  : "+status_kamar+
                   "\nPelanggan     : "+ DatabasePesanan.getPesanan(this).getPelanggan().getNama();
        }

    }
}
