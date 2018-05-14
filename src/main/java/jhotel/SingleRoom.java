package jhotel;
/**
 * Class SingleRoom untuk tipe room single.
 *
 * @author Luthfi Musthafa_1506673656
 * @version 2018.05.14
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your ow
    private static TipeKamar TIPE_KAMAR = TipeKamar.Single;

    /**
     * Default Constructor for objects of class SingleRoom
     */
    public SingleRoom(){}
    
    /**
     * Overloading Constructor for objects of class SingleRoom
     *
     * @param hotel object hotel
     * @param nomor_kamar berisi nomor kamar
     */
    public SingleRoom(Hotel hotel, String nomor_kamar)//, StatusKamar status_kamar)
    {
        // initialise instance variables
        super(hotel, nomor_kamar);
        setDailyTariff(50000);
    }

    /**
     * mendapatkan nilai tipe kamar
     * \
     * @return TIPE_KAMAR
     */
    public TipeKamar getTipeKamar()
    {
        return TIPE_KAMAR;
    }

    /**
     * menentukan nilai daily tarif
     *
     * @param dailytariff nilai daily tariff
     */
    public void setDailyTariff(double dailytariff)
    {
        dailyTariff = dailytariff;
    }
}
