package jhotel;

/**
 * Berisi informasi tentang hotel.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.10
 */
public class Hotel
{
    // instance variables - replace the example below with your own
    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;

    /**
     * Default constructor for objects of class Hotel.
     *
     */
    public Hotel(){}

    /**
     * Overloading constructor for objects of class Hotel.
     * 
     * @param nama menentukan nama hotel
     * @param lokasi menentukan lokasi hotel
     * @param bintang menentukan bintang hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        //instance variable
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        id = DatabaseHotel.getLastHotelID()+1;
    }

    /**
     * mendapatkan nilai id
     *
     * @return id
     */
    public int getID() {
        return id;
    }

    /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai binatang.
     * 
     * @return bintang
     */
    public int getBintang()
    {
        return bintang;
    }
    
    /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai nama.
     * 
     * @return nama
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Accessor for objects of class Hotel
     * untuk mendapatkan nilai lokasi.
     * 
     * @return lokasi
     */
    public Lokasi getLokasi()
    {
        return lokasi;
    }

    /**
     * menentukan nilai id
     *
     * @param id berisi id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai nama.
     * 
     * @param nama set nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai lokasi.
     * 
     * @param lokasi set lokasi
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai bintang.
     * 
     * @param bintang set bintang
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }

    /**
     * untuk mencetak String pada objek Customer
     *
     * @return string
     */
    public String toString()
    {
        return "\nHotel\n"+
               "\nNama Hotel    : "+nama+
               "\nLokasi        : "+lokasi.getDeskripsi()+
               "\nBintang       : "+bintang;
    }
}
