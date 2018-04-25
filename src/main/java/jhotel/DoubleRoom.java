package jhotel;
/**
 * Class DoubleRoom untuk tipe room double.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.20
 */
public class DoubleRoom extends Room
{
    // instance variables - replace the example below with your own
    private Customer customer2;
    private static TipeKamar TIPE_KAMAR = TipeKamar.Double;
    
    public DoubleRoom()
    {
        //
    }
    
    /**
     * Constructor for objects of class DoubleRoom
     */
    public DoubleRoom(Hotel hotel, String nomor_kamar)//, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
    }
    
    public Customer getCustomer2()
    {
        return customer2;
    }
    
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }
    
    public void setCustomer2(Customer customer2)
    {
        this.customer2 = customer2;
    }
}