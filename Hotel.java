
/**
 * Berisi informasi tentang hotel.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.10
 */
public class Hotel
{
    // instance variables - replace the example below with your own
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    private String string;

    /**
     * Constructor for objects of class Hotel.
     * 
     * @param nama
     * @param lokasi
     * @param bintang
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        //instance variable
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
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
     * Mutator for objects of class Hotel
     * untuk menentukan nilai nama.
     * 
     * @param nama
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai lokasi.
     * 
     * @param lokasi
     */
    public void setLokasi(Lokasi lokasi)
    {
        this.lokasi = lokasi;
    }
    
    /**
     * Mutator for objects of class Hotel
     * untuk menentukan nilai bintang.
     * 
     * @param bintang
     */
    public void setBintang(int bintang)
    {
        this.bintang = bintang;
    }
    
    public String toString()
    {
        return"\nNama Hotel: "+nama+
              "\nLokasi: "+lokasi.getDeskripsi()+
              "\nBintang: "+bintang;
    }
    
    /**
     * untuk menampilkan data pada class Hotel.
     */
    public void printData()
    {
        System.out.printf("\nHotel\n");
        System.out.println("Nama Hotel: " +nama);
        System.out.println("Lokasi: " +lokasi.getDeskripsi());
        System.out.println("Bintang: " +bintang);
    }
}
