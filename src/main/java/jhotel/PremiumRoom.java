package jhotel;

/**
 * Class PremiumRoom untuk tipe room premium.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.05.14
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private static double DISCOUNT = 0.3;
    private static TipeKamar TIPE_KAMAR = TipeKamar.Premium;

    /**
     * Default Constructor for objects of class DoubleRoom
     */
    public PremiumRoom(){}
    
    /**
     * Overloading Constructor for objects of class DoubleRoom
     *
     * @param hotel objek Hotel
     * @param nomor_kamar berisi nomor kamar
     */
    public PremiumRoom(Hotel hotel, String nomor_kamar)//, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
        setDailyTariff(150000);
    }

    /**
     * mendaptkan nilai tipe kamar
     *
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }

    /**
     * mendapatkan nilai diskon
     *
     * @return DISCOUNT
     */
    public double getDiscount()
    {
        return DISCOUNT;
    }

    /**
     * menentukan nilai daily tarif
     *
     * @param dailytariff nilai daily tariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff-(dailytariff*DISCOUNT);
    }
}
