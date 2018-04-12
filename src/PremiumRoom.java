
/**
 * Class PremiumRoom untuk tipe room premium.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.03.20
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private static double DISCOUNT = 0.3;
    private static TipeKamar TIPE_KAMAR = TipeKamar.Premium;
    
    public PremiumRoom()
    {
        //
    }
    
    /**
     * Constructor for objects of class DoubleRoom
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar, status_kamar);
    }
    
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }
    
    public double getDiscount()
    {
        return DISCOUNT;
    }
    
    public void setDailyTariff(double dailytariff)
    {
        //super.setDailyTariff(double dailytariff);
        dailyTariff = dailytariff*DISCOUNT;
    }
}
